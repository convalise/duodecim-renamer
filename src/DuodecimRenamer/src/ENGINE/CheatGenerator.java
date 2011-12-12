package ENGINE;

public abstract class CheatGenerator {

	private static final int REG_USA = 0;
	private static final int REG_EUR = 1;
	private static final int REG_JPN = 2;

	public static String ParseHeader(int Regiao) {

		StringBuffer Cabecalho;

		Cabecalho = new StringBuffer("_S ");

		switch(Regiao) {
			case REG_USA: Cabecalho.append("ULUS-10566" + '\n'); break;
			case REG_EUR: Cabecalho.append("ULES-01505" + '\n'); break;
			case REG_JPN: Cabecalho.append("NPJH-50377" + '\n'); break;
		}

		Cabecalho.append("_G Dissidia 012 [duodecim]: Final Fantasy ");
		switch(Regiao) {
			case REG_USA: Cabecalho.append("(USA)" + '\n'); break;
			case REG_EUR: Cabecalho.append("(EUR)" + '\n'); break;
			case REG_JPN: Cabecalho.append("(JPN)" + '\n'); break;
		}

		return Cabecalho.toString();

	}

	public static String ParseTitle(String Offset, String NomeOriginal, String NomeNovo, boolean AutoAtivar) {

		int Index;
		int Paridade;
		int BGMOffset;
		char LesserBit;
		String BGMNomeOriginal;
		StringBuffer BGMNomeNovo;
		StringBuffer BGMCheat;

		BGMOffset = Integer.parseInt(Offset, 16);
		BGMNomeNovo = new StringBuffer(NomeNovo);
		BGMNomeOriginal = ParseNomeOriginal(NomeOriginal);

		BGMCheat = new StringBuffer((AutoAtivar)? "_C1 " : "_C0 ");
		BGMCheat.append("NEW_")
				.append(BGMNomeOriginal)
				.append('\n');

		LesserBit = Offset.charAt(7);
		if(LesserBit == '2' || LesserBit == '6' || LesserBit == 'A' || LesserBit == 'E') {
			BGMCheat.append("_L 0x1")
					.append(Integer.toHexString(BGMOffset).toUpperCase())
					.append(" 0x00")
					.append(Integer.toHexString(BGMNomeNovo.charAt(0)).toUpperCase())
					.append('\n');
			BGMNomeNovo.deleteCharAt(0);
			BGMOffset += 2;
		}

		Paridade = BGMNomeNovo.length()%2;

		Index = 0;
		for(int i=0; i<(BGMNomeNovo.length()/2)+Paridade; i++) {
			BGMCheat.append("_L 0x2")
					.append(Integer.toHexString(BGMOffset).toUpperCase())
					.append(" 0x00")
					.append((Paridade==1 && i==(BGMNomeNovo.length()/2)+Paridade-1)? "00" : Integer.toHexString(BGMNomeNovo.charAt(Index+1)).toUpperCase())
					.append("00")
					.append(Integer.toHexString(BGMNomeNovo.charAt(Index)).toUpperCase())
					.append('\n');
			BGMOffset += 4;
			Index += 2;
		}

		if(Paridade==0)
			BGMCheat.append("_L 0x1")
					.append(Integer.toHexString(BGMOffset).toUpperCase())
					.append(" 0x0000" + '\n');

		return BGMCheat.toString();

	}

	private static String ParseNomeOriginal(String NomeOriginal) {

		char TempChar;
		StringBuffer NomeOriginalMod;

		NomeOriginalMod = new StringBuffer(NomeOriginal);

		for(int i=0; i<NomeOriginalMod.length()-1; i++)
			if(NomeOriginalMod.charAt(i)==' ')
				NomeOriginalMod.setCharAt(i+1, Character.toUpperCase(NomeOriginalMod.charAt(i+1)));

		if(NomeOriginal.startsWith("FF"))
			NomeOriginalMod.delete(0, NomeOriginal.indexOf(" - ")+3);

		for(int i=0; i<NomeOriginalMod.length(); i++) {
			TempChar = NomeOriginalMod.charAt(i);
			if(TempChar==' ' || TempChar=='\'' || TempChar=='\"' || TempChar=='#' || TempChar=='&' || TempChar==':' || TempChar==',' || TempChar=='.' || TempChar=='-' || TempChar=='!')
				NomeOriginalMod.deleteCharAt(i--);
		}

		return NomeOriginalMod.toString();

	}

}
