
package com.convalise.duodecimrenamer.engine;

public abstract class CheatGenerator {

	public enum Region {
		USA, EUR, JPN;
	}
	
	public static String parseHeader(Region region) {

		StringBuilder header = new StringBuilder();

		header.append("_S ");
		
		switch(region) {
			case USA: header.append("ULUS-10566"); break;
			case EUR: header.append("ULES-01505"); break;
			case JPN: header.append("NPJH-50377"); break;
		}

		header.append('\n');
		header.append("_G Dissidia 012 [duodecim]: Final Fantasy ");
		
		switch(region) {
			case USA: header.append("(USA)"); break;
			case EUR: header.append("(EUR)"); break;
			case JPN: header.append("(JPN)"); break;
		}
		
		header.append('\n');

		return header.toString();

	}

	public static String parseTitle(String memoryOffset, String originalTitle, String newTitle, boolean autoActivate) {

		long longOffset = Long.parseLong(memoryOffset, 16);
		
		String originalTitleParsed = parseTitle(originalTitle);
		String newTitleParsed = parseTitle(newTitle);
		
		StringBuilder cheatCode = new StringBuilder();
		
		cheatCode.append((autoActivate) ? "_C1 " : "_C0 ");
		cheatCode.append(originalTitleParsed);
		cheatCode.append("-");
		cheatCode.append(newTitleParsed);
		cheatCode.append('\n');

		char lesserBit = memoryOffset.charAt(7);
		
		if(lesserBit == '2' || lesserBit == '6' || lesserBit == 'A' || lesserBit == 'E') {
			
			cheatCode.append("_L 0x1");
			cheatCode.append(Long.toHexString(longOffset).toUpperCase());
			cheatCode.append(" 0x00");
			cheatCode.append(Integer.toHexString(newTitle.charAt(0)).toUpperCase());
			cheatCode.append('\n');
			
			newTitle = newTitle.substring(1);
			longOffset += 2;
		}

		int index = 0;
		int parity = (newTitle.length() % 2);

		for(int i = 0; i < (newTitle.length() / 2) + parity; i++) {
			
			cheatCode.append("_L 0x2");
			cheatCode.append(Long.toHexString(longOffset).toUpperCase());
			cheatCode.append(" 0x00");
			cheatCode.append(((parity == 1) && (i == (newTitle.length() / 2) + parity - 1)) ? "00" : Integer.toHexString(newTitle.charAt(index + 1)).toUpperCase());
			cheatCode.append("00");
			cheatCode.append(Integer.toHexString(newTitle.charAt(index)).toUpperCase());
			cheatCode.append('\n');
			
			longOffset += 4;
			index += 2;
		}

		if(parity == 0) {
			cheatCode.append("_L 0x1");
			cheatCode.append(Long.toHexString(longOffset).toUpperCase());
			cheatCode.append(" 0x0000");
			cheatCode.append('\n');
		}

		return cheatCode.toString();

	}

	private static String parseTitle(String originalTitle) {

		StringBuilder titleMod = new StringBuilder(originalTitle);
		
		for(int i = 0; i < titleMod.length() - 1; i++) {
			if(titleMod.charAt(i) == ' ') {
				titleMod.setCharAt(i + 1, Character.toUpperCase(titleMod.charAt(i + 1)));
			}
		}

		if(originalTitle.startsWith("FF")) {
			titleMod.delete(0, originalTitle.indexOf(" - ") + 3);
		}

		for(int i = 0; i < titleMod.length(); i++) {
			if(!Character.isLetter(titleMod.charAt(i))) {
				titleMod.deleteCharAt(i--);
			}
		}

		return titleMod.toString();

	}

}
