package ENGINE;

import DATABASE.*;

import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import net.java.balloontip.*;

public abstract class ResourceManager {

	private static final byte[] SerialCode = {
		-112,  103, -117,   87, -120,  -96, -113,  -91,   71,  -24,
		 -94,  -86,  -59, -116,   83,   85,   36,  -99,  -11,  -27,
		  -3,  -27,  124,   72,   79,  -16,  105,  -63, -103,  -35,
		  -4,   59, -116,   -7,   54,   86, -117,    7,  -33,  -51,
		  33,  -96, -121,   63,  118,   46,   78,  111,   21,   99,
		 -49,   -8,  -55,  -13,  -60,    3,  -58,   22,  -33,  -85,
		  96,  -87,  -12,  -70,  -77,  106,  -86,   60,   96,  -95,
		 -16,  -12,  -84,  -56,  -63,   41,  102,  102,  116,   72,
		 -55,  -90,  -94,  -24,   73,   39,  -57,  -63,  -51,  -57,
		 -40,   38,  -10,  -10, -115,    4,  -18,  -79, -127,   -2,
		  98, -128,  -28,  103,   16,  -22, -105, -101,  109,  -98,
		 -32, -105,  -13,  -47,   58,   85,   93,  -37,  -47,  -48,
		 -17,  113,   82,   35,  -18,  111,    0,    0
	};

	private static ArrayList<String> FileNameAL;
	private static ArrayList<Integer> FileSizeAL;

	public static void GeneratePackFile() {

		File Pack;
		File Pic;
		RandomAccessFile RandomPack;
		RandomAccessFile RandomPic;
		byte[] byteArray;

		initFileArrays();

		try {

			Pack = new File("RESOURCEPACK.BIN");

			if(Pack.exists()) {
				Pack.delete();
				Pack.createNewFile();
			}

			RandomPack = new RandomAccessFile(Pack, "rw");

			if(Pack.canWrite())
				RandomPack.write(SerialCode);

			for(int i=0; i<FileNameAL.size(); i++) {
				Pic = new File(FileNameAL.get(i));
				RandomPic = new RandomAccessFile(Pic, "r");

				byteArray = new byte[FileSizeAL.get(i)];

				if(Pic.canRead())
					RandomPic.read(byteArray);
				if(Pack.canWrite())
					RandomPack.write(byteArray);

				RandomPic.close();

			}

			RandomPack.close();

		}
		catch(FileNotFoundException e) {
			System.out.println("GeneratePack() -> " + e.getMessage());
		}
		catch(IOException e) {
			System.out.println("GeneratePack() -> " + e.getMessage());
		}

	}

	public static boolean ValidatePackFile() {

		File Pack;
		RandomAccessFile RandomPack;
		byte[] byteArray;

		try {

			Pack = new File("RESOURCEPACK.BIN");

			if(!Pack.exists())
				return false;

			RandomPack = new RandomAccessFile(Pack, "rw");

			byteArray = new byte[128];

			if(Pack.canRead())
				RandomPack.read(byteArray);

			RandomPack.close();

			return Arrays.equals(byteArray, SerialCode);

		}
		catch(FileNotFoundException e) {
			System.out.println("ValidatePack() -> " + e.getMessage());
		}
		catch(IOException e) {
			System.out.println("ValidatePack() -> " + e.getMessage());
		}

		return false;

	}

	private static String ExtractFromPackFile(long Offset, int Size) {

		File Pack;
		File Pic;
		RandomAccessFile RandomPack;
		RandomAccessFile RandomPic;
		byte[] byteArray;

		byteArray = new byte[Size];

		Pack = new File("RESOURCEPACK.BIN");

		if(!Pack.exists())
			return null;

		try {
			RandomPack = new RandomAccessFile(Pack, "r");

			RandomPack.seek(Offset);
			if(Pack.canRead())
				RandomPack.read(byteArray);

			RandomPack.close();

			Pic = File.createTempFile("tempfile", ".dr");
			Pic.deleteOnExit();

			RandomPic = new RandomAccessFile(Pic, "rw");

			if(Pic.canWrite())
				RandomPic.write(byteArray);

			RandomPic.close();

			return Pic.getAbsolutePath();
		}
		catch(Exception e) {
			return null;
		}

	}

	public static File GetImgFile(int Index) {

		int Size;
		long Offset;
		File ImgFile;

		Size = 0;
		Offset = 0;
		ImgFile = null;
		switch(Index) {
			case ResourceDB.INDEX_PIC_FF1:
				ImgFile = ResourcePack.PIC_FF1;
				Offset = ResourceDB.OFFSET_PIC_FF1;
				Size = ResourceDB.SIZE_PIC_FF1;
				break;
			case ResourceDB.INDEX_PIC_FF1_2:
				ImgFile = ResourcePack.PIC_FF1_2;
				Offset = ResourceDB.OFFSET_PIC_FF1_2;
				Size = ResourceDB.SIZE_PIC_FF1_2;
				break;
			case ResourceDB.INDEX_PIC_FF1_3:
				ImgFile = ResourcePack.PIC_FF1_3;
				Offset = ResourceDB.OFFSET_PIC_FF1_3;
				Size = ResourceDB.SIZE_PIC_FF1_3;
				break;
			case ResourceDB.INDEX_PIC_FF2:
				ImgFile = ResourcePack.PIC_FF2;
				Offset = ResourceDB.OFFSET_PIC_FF2;
				Size = ResourceDB.SIZE_PIC_FF2;
				break;
			case ResourceDB.INDEX_PIC_FF2_2:
				ImgFile = ResourcePack.PIC_FF2_2;
				Offset = ResourceDB.OFFSET_PIC_FF2_2;
				Size = ResourceDB.SIZE_PIC_FF2_2;
				break;
			case ResourceDB.INDEX_PIC_FF3:
				ImgFile = ResourcePack.PIC_FF3;
				Offset = ResourceDB.OFFSET_PIC_FF3;
				Size = ResourceDB.SIZE_PIC_FF3;
				break;
			case ResourceDB.INDEX_PIC_FF4:
				ImgFile = ResourcePack.PIC_FF4;
				Offset = ResourceDB.OFFSET_PIC_FF4;
				Size = ResourceDB.SIZE_PIC_FF4;
				break;
			case ResourceDB.INDEX_PIC_FF4_2:
				ImgFile = ResourcePack.PIC_FF4_2;
				Offset = ResourceDB.OFFSET_PIC_FF4_2;
				Size = ResourceDB.SIZE_PIC_FF4_2;
				break;
			case ResourceDB.INDEX_PIC_FF4_3:
				ImgFile = ResourcePack.PIC_FF4_3;
				Offset = ResourceDB.OFFSET_PIC_FF4_3;
				Size = ResourceDB.SIZE_PIC_FF4_3;
				break;
			case ResourceDB.INDEX_PIC_FF5:
				ImgFile = ResourcePack.PIC_FF5;
				Offset = ResourceDB.OFFSET_PIC_FF5;
				Size = ResourceDB.SIZE_PIC_FF5;
				break;
			case ResourceDB.INDEX_PIC_FF6:
				ImgFile = ResourcePack.PIC_FF6;
				Offset = ResourceDB.OFFSET_PIC_FF6;
				Size = ResourceDB.SIZE_PIC_FF6;
				break;
			case ResourceDB.INDEX_PIC_FF7:
				ImgFile = ResourcePack.PIC_FF7;
				Offset = ResourceDB.OFFSET_PIC_FF7;
				Size = ResourceDB.SIZE_PIC_FF7;
				break;
			case ResourceDB.INDEX_PIC_FF7_2:
				ImgFile = ResourcePack.PIC_FF7_2;
				Offset = ResourceDB.OFFSET_PIC_FF7_2;
				Size = ResourceDB.SIZE_PIC_FF7_2;
				break;
			case ResourceDB.INDEX_PIC_FF8:
				ImgFile = ResourcePack.PIC_FF8;
				Offset = ResourceDB.OFFSET_PIC_FF8;
				Size = ResourceDB.SIZE_PIC_FF8;
				break;
			case ResourceDB.INDEX_PIC_FF9:
				ImgFile = ResourcePack.PIC_FF9;
				Offset = ResourceDB.OFFSET_PIC_FF9;
				Size = ResourceDB.SIZE_PIC_FF9;
				break;
			case ResourceDB.INDEX_PIC_FF10:
				ImgFile = ResourcePack.PIC_FF10;
				Offset = ResourceDB.OFFSET_PIC_FF10;
				Size = ResourceDB.SIZE_PIC_FF10;
				break;
			case ResourceDB.INDEX_PIC_FF10_2:
				ImgFile = ResourcePack.PIC_FF10_2;
				Offset = ResourceDB.OFFSET_PIC_FF10_2;
				Size = ResourceDB.SIZE_PIC_FF10_2;
				break;
			case ResourceDB.INDEX_PIC_FF11:
				ImgFile = ResourcePack.PIC_FF11;
				Offset = ResourceDB.OFFSET_PIC_FF11;
				Size = ResourceDB.SIZE_PIC_FF11;
				break;
			case ResourceDB.INDEX_PIC_FF12:
				ImgFile = ResourcePack.PIC_FF12;
				Offset = ResourceDB.OFFSET_PIC_FF12;
				Size = ResourceDB.SIZE_PIC_FF12;
				break;
			case ResourceDB.INDEX_PIC_FF12_2:
				ImgFile = ResourcePack.PIC_FF12_2;
				Offset = ResourceDB.OFFSET_PIC_FF12_2;
				Size = ResourceDB.SIZE_PIC_FF12_2;
				break;
			case ResourceDB.INDEX_PIC_FF13:
				ImgFile = ResourcePack.PIC_FF13;
				Offset = ResourceDB.OFFSET_PIC_FF13;
				Size = ResourceDB.SIZE_PIC_FF13;
				break;
			case ResourceDB.INDEX_PIC_FF13_2:
				ImgFile = ResourcePack.PIC_FF13_2;
				Offset = ResourceDB.OFFSET_PIC_FF13_2;
				Size = ResourceDB.SIZE_PIC_FF13_2;
				break;
			case ResourceDB.INDEX_PIC_FF13_3:
				ImgFile = ResourcePack.PIC_FF13_3;
				Offset = ResourceDB.OFFSET_PIC_FF13_3;
				Size = ResourceDB.SIZE_PIC_FF13_3;
				break;
			case ResourceDB.INDEX_PIC_DDFF:
				ImgFile = ResourcePack.PIC_DDFF;
				Offset = ResourceDB.OFFSET_PIC_DDFF;
				Size = ResourceDB.SIZE_PIC_DDFF;
				break;
			case ResourceDB.INDEX_PIC_DDFF_2:
				ImgFile = ResourcePack.PIC_DDFF_2;
				Offset = ResourceDB.OFFSET_PIC_DDFF_2;
				Size = ResourceDB.SIZE_PIC_DDFF_2;
				break;
			case ResourceDB.INDEX_PIC_DDFF_3:
				ImgFile = ResourcePack.PIC_DDFF_3;
				Offset = ResourceDB.OFFSET_PIC_DDFF_3;
				Size = ResourceDB.SIZE_PIC_DDFF_3;
				break;
			case ResourceDB.INDEX_PIC_DDFF_4:
				ImgFile = ResourcePack.PIC_DDFF_4;
				Offset = ResourceDB.OFFSET_PIC_DDFF_4;
				Size = ResourceDB.SIZE_PIC_DDFF_4;
				break;
			case ResourceDB.INDEX_PIC_SPLASH:
				ImgFile = ResourcePack.PIC_SPLASH;
				Offset = ResourceDB.OFFSET_PIC_SPLASH;
				Size = ResourceDB.SIZE_PIC_SPLASH;
				break;
			case ResourceDB.INDEX_PIC_INICIO_pt:
				ImgFile = ResourcePack.PIC_INICIO_pt;
				Offset = ResourceDB.OFFSET_PIC_INICIO_pt;
				Size = ResourceDB.SIZE_PIC_INICIO_pt;
				break;
			case ResourceDB.INDEX_PIC_INICIO_en:
				ImgFile = ResourcePack.PIC_INICIO_en;
				Offset = ResourceDB.OFFSET_PIC_INICIO_en;
				Size = ResourceDB.SIZE_PIC_INICIO_en;
				break;
			case ResourceDB.INDEX_PIC_INICIO_de:
				ImgFile = ResourcePack.PIC_INICIO_de;
				Offset = ResourceDB.OFFSET_PIC_INICIO_de;
				Size = ResourceDB.SIZE_PIC_INICIO_de;
				break;
			case ResourceDB.INDEX_PIC_INICIO_es:
				ImgFile = ResourcePack.PIC_INICIO_es;
				Offset = ResourceDB.OFFSET_PIC_INICIO_es;
				Size = ResourceDB.SIZE_PIC_INICIO_es;
				break;
			case ResourceDB.INDEX_PIC_INICIO_fr:
				ImgFile = ResourcePack.PIC_INICIO_fr;
				Offset = ResourceDB.OFFSET_PIC_INICIO_fr;
				Size = ResourceDB.SIZE_PIC_INICIO_fr;
				break;
			case ResourceDB.INDEX_PIC_INICIO_it:
				ImgFile = ResourcePack.PIC_INICIO_it;
				Offset = ResourceDB.OFFSET_PIC_INICIO_it;
				Size = ResourceDB.SIZE_PIC_INICIO_it;
				break;
			case ResourceDB.INDEX_PIC_INICIO_0A:
				ImgFile = ResourcePack.PIC_INICIO_0A;
				Offset = ResourceDB.OFFSET_PIC_INICIO_0A;
				Size = ResourceDB.SIZE_PIC_INICIO_0A;
				break;
			case ResourceDB.INDEX_PIC_INICIO_0B:
				ImgFile = ResourcePack.PIC_INICIO_0B;
				Offset = ResourceDB.OFFSET_PIC_INICIO_0B;
				Size = ResourceDB.SIZE_PIC_INICIO_0B;
				break;
			case ResourceDB.INDEX_PIC_INICIO_0C:
				ImgFile = ResourcePack.PIC_INICIO_0C;
				Offset = ResourceDB.OFFSET_PIC_INICIO_0C;
				Size = ResourceDB.SIZE_PIC_INICIO_0C;
				break;
			case ResourceDB.INDEX_PIC_INICIO_0D:
				ImgFile = ResourcePack.PIC_INICIO_0D;
				Offset = ResourceDB.OFFSET_PIC_INICIO_0D;
				Size = ResourceDB.SIZE_PIC_INICIO_0D;
				break;
			case ResourceDB.INDEX_PIC_INICIO_01:
				ImgFile = ResourcePack.PIC_INICIO_01;
				Offset = ResourceDB.OFFSET_PIC_INICIO_01;
				Size = ResourceDB.SIZE_PIC_INICIO_01;
				break;
			case ResourceDB.INDEX_PIC_INICIO_02:
				ImgFile = ResourcePack.PIC_INICIO_02;
				Offset = ResourceDB.OFFSET_PIC_INICIO_02;
				Size = ResourceDB.SIZE_PIC_INICIO_02;
				break;
			case ResourceDB.INDEX_PIC_INICIO_03:
				ImgFile = ResourcePack.PIC_INICIO_03;
				Offset = ResourceDB.OFFSET_PIC_INICIO_03;
				Size = ResourceDB.SIZE_PIC_INICIO_03;
				break;
			case ResourceDB.INDEX_PIC_INICIO_04:
				ImgFile = ResourcePack.PIC_INICIO_04;
				Offset = ResourceDB.OFFSET_PIC_INICIO_04;
				Size = ResourceDB.SIZE_PIC_INICIO_04;
				break;
			case ResourceDB.INDEX_PIC_INICIO_05:
				ImgFile = ResourcePack.PIC_INICIO_05;
				Offset = ResourceDB.OFFSET_PIC_INICIO_05;
				Size = ResourceDB.SIZE_PIC_INICIO_05;
				break;
			case ResourceDB.INDEX_PIC_INICIO_06:
				ImgFile = ResourcePack.PIC_INICIO_06;
				Offset = ResourceDB.OFFSET_PIC_INICIO_06;
				Size = ResourceDB.SIZE_PIC_INICIO_06;
				break;
			case ResourceDB.INDEX_PIC_INICIO_07:
				ImgFile = ResourcePack.PIC_INICIO_07;
				Offset = ResourceDB.OFFSET_PIC_INICIO_07;
				Size = ResourceDB.SIZE_PIC_INICIO_07;
				break;
			case ResourceDB.INDEX_PIC_INICIO_08:
				ImgFile = ResourcePack.PIC_INICIO_08;
				Offset = ResourceDB.OFFSET_PIC_INICIO_08;
				Size = ResourceDB.SIZE_PIC_INICIO_08;
				break;
			case ResourceDB.INDEX_PIC_INICIO_09:
				ImgFile = ResourcePack.PIC_INICIO_09;
				Offset = ResourceDB.OFFSET_PIC_INICIO_09;
				Size = ResourceDB.SIZE_PIC_INICIO_09;
				break;
			case ResourceDB.INDEX_PIC_INICIO_10:
				ImgFile = ResourcePack.PIC_INICIO_10;
				Offset = ResourceDB.OFFSET_PIC_INICIO_10;
				Size = ResourceDB.SIZE_PIC_INICIO_10;
				break;
			case ResourceDB.INDEX_PIC_INICIO_11:
				ImgFile = ResourcePack.PIC_INICIO_11;
				Offset = ResourceDB.OFFSET_PIC_INICIO_11;
				Size = ResourceDB.SIZE_PIC_INICIO_11;
				break;
			case ResourceDB.INDEX_PIC_INICIO_12:
				ImgFile = ResourcePack.PIC_INICIO_12;
				Offset = ResourceDB.OFFSET_PIC_INICIO_12;
				Size = ResourceDB.SIZE_PIC_INICIO_12;
				break;
			case ResourceDB.INDEX_PIC_INICIO_13:
				ImgFile = ResourcePack.PIC_INICIO_13;
				Offset = ResourceDB.OFFSET_PIC_INICIO_13;
				Size = ResourceDB.SIZE_PIC_INICIO_13;
				break;
			case ResourceDB.INDEX_PIC_INICIO_14:
				ImgFile = ResourcePack.PIC_INICIO_14;
				Offset = ResourceDB.OFFSET_PIC_INICIO_14;
				Size = ResourceDB.SIZE_PIC_INICIO_14;
				break;
			case ResourceDB.INDEX_PIC_INICIO_15:
				ImgFile = ResourcePack.PIC_INICIO_15;
				Offset = ResourceDB.OFFSET_PIC_INICIO_15;
				Size = ResourceDB.SIZE_PIC_INICIO_15;
				break;
			case ResourceDB.INDEX_PIC_INICIO_16:
				ImgFile = ResourcePack.PIC_INICIO_16;
				Offset = ResourceDB.OFFSET_PIC_INICIO_16;
				Size = ResourceDB.SIZE_PIC_INICIO_16;
				break;
			case ResourceDB.INDEX_PIC_INICIO_17:
				ImgFile = ResourcePack.PIC_INICIO_17;
				Offset = ResourceDB.OFFSET_PIC_INICIO_17;
				Size = ResourceDB.SIZE_PIC_INICIO_17;
				break;
			case ResourceDB.INDEX_PIC_INICIO_18:
				ImgFile = ResourcePack.PIC_INICIO_18;
				Offset = ResourceDB.OFFSET_PIC_INICIO_18;
				Size = ResourceDB.SIZE_PIC_INICIO_18;
				break;
			case ResourceDB.INDEX_PIC_INICIO_19:
				ImgFile = ResourcePack.PIC_INICIO_19;
				Offset = ResourceDB.OFFSET_PIC_INICIO_19;
				Size = ResourceDB.SIZE_PIC_INICIO_19;
				break;
			case ResourceDB.INDEX_PIC_INICIO_20:
				ImgFile = ResourcePack.PIC_INICIO_20;
				Offset = ResourceDB.OFFSET_PIC_INICIO_20;
				Size = ResourceDB.SIZE_PIC_INICIO_20;
				break;
			case ResourceDB.INDEX_PIC_INICIO_21:
				ImgFile = ResourcePack.PIC_INICIO_21;
				Offset = ResourceDB.OFFSET_PIC_INICIO_21;
				Size = ResourceDB.SIZE_PIC_INICIO_21;
				break;
			case ResourceDB.INDEX_PIC_INICIO_22:
				ImgFile = ResourcePack.PIC_INICIO_22;
				Offset = ResourceDB.OFFSET_PIC_INICIO_22;
				Size = ResourceDB.SIZE_PIC_INICIO_22;
				break;
			case ResourceDB.INDEX_PIC_INICIO_23:
				ImgFile = ResourcePack.PIC_INICIO_23;
				Offset = ResourceDB.OFFSET_PIC_INICIO_23;
				Size = ResourceDB.SIZE_PIC_INICIO_23;
				break;
			case ResourceDB.INDEX_PIC_INICIO_24:
				ImgFile = ResourcePack.PIC_INICIO_24;
				Offset = ResourceDB.OFFSET_PIC_INICIO_24;
				Size = ResourceDB.SIZE_PIC_INICIO_24;
				break;
			case ResourceDB.INDEX_PIC_INICIO_25:
				ImgFile = ResourcePack.PIC_INICIO_25;
				Offset = ResourceDB.OFFSET_PIC_INICIO_25;
				Size = ResourceDB.SIZE_PIC_INICIO_25;
				break;
			case ResourceDB.INDEX_PIC_INICIO_26:
				ImgFile = ResourcePack.PIC_INICIO_26;
				Offset = ResourceDB.OFFSET_PIC_INICIO_26;
				Size = ResourceDB.SIZE_PIC_INICIO_26;
				break;
			case ResourceDB.INDEX_PIC_INICIO_27:
				ImgFile = ResourcePack.PIC_INICIO_27;
				Offset = ResourceDB.OFFSET_PIC_INICIO_27;
				Size = ResourceDB.SIZE_PIC_INICIO_27;
				break;
			case ResourceDB.INDEX_PIC_INICIO_28:
				ImgFile = ResourcePack.PIC_INICIO_28;
				Offset = ResourceDB.OFFSET_PIC_INICIO_28;
				Size = ResourceDB.SIZE_PIC_INICIO_28;
				break;
			case ResourceDB.INDEX_PIC_INICIO_29:
				ImgFile = ResourcePack.PIC_INICIO_29;
				Offset = ResourceDB.OFFSET_PIC_INICIO_29;
				Size = ResourceDB.SIZE_PIC_INICIO_29;
				break;
			case ResourceDB.INDEX_PIC_INICIO_30:
				ImgFile = ResourcePack.PIC_INICIO_30;
				Offset = ResourceDB.OFFSET_PIC_INICIO_30;
				Size = ResourceDB.SIZE_PIC_INICIO_30;
				break;
			case ResourceDB.INDEX_PIC_INICIO_31:
				ImgFile = ResourcePack.PIC_INICIO_31;
				Offset = ResourceDB.OFFSET_PIC_INICIO_31;
				Size = ResourceDB.SIZE_PIC_INICIO_31;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_pt:
				ImgFile = ResourcePack.PIC_ABOUT_pt;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_pt;
				Size = ResourceDB.SIZE_PIC_ABOUT_pt;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_en:
				ImgFile = ResourcePack.PIC_ABOUT_en;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_en;
				Size = ResourceDB.SIZE_PIC_ABOUT_en;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_de:
				ImgFile = ResourcePack.PIC_ABOUT_de;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_de;
				Size = ResourceDB.SIZE_PIC_ABOUT_de;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_es:
				ImgFile = ResourcePack.PIC_ABOUT_es;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_es;
				Size = ResourceDB.SIZE_PIC_ABOUT_es;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_fr:
				ImgFile = ResourcePack.PIC_ABOUT_fr;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_fr;
				Size = ResourceDB.SIZE_PIC_ABOUT_fr;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_it:
				ImgFile = ResourcePack.PIC_ABOUT_it;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_it;
				Size = ResourceDB.SIZE_PIC_ABOUT_it;
				break;
			case ResourceDB.INDEX_PIC_ABOUT_01:
				ImgFile = ResourcePack.PIC_ABOUT_01;
				Offset = ResourceDB.OFFSET_PIC_ABOUT_01;
				Size = ResourceDB.SIZE_PIC_ABOUT_01;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_pt:
				ImgFile = ResourcePack.PIC_AJUDA_pt;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_pt;
				Size = ResourceDB.SIZE_PIC_AJUDA_pt;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_en:
				ImgFile = ResourcePack.PIC_AJUDA_en;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_en;
				Size = ResourceDB.SIZE_PIC_AJUDA_en;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_de:
				ImgFile = ResourcePack.PIC_AJUDA_de;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_de;
				Size = ResourceDB.SIZE_PIC_AJUDA_de;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_es:
				ImgFile = ResourcePack.PIC_AJUDA_es;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_es;
				Size = ResourceDB.SIZE_PIC_AJUDA_es;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_fr:
				ImgFile = ResourcePack.PIC_AJUDA_fr;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_fr;
				Size = ResourceDB.SIZE_PIC_AJUDA_fr;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_it:
				ImgFile = ResourcePack.PIC_AJUDA_it;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_it;
				Size = ResourceDB.SIZE_PIC_AJUDA_it;
				break;
			case ResourceDB.INDEX_PIC_AJUDA_01:
				ImgFile = ResourcePack.PIC_AJUDA_01;
				Offset = ResourceDB.OFFSET_PIC_AJUDA_01;
				Size = ResourceDB.SIZE_PIC_AJUDA_01;
				break;
		}

		if(ImgFile==null) {

			ImgFile = new File(ExtractFromPackFile(Offset, Size));

			switch(Index) {
				case ResourceDB.INDEX_PIC_FF1:			ResourcePack.PIC_FF1 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF1_2:		ResourcePack.PIC_FF1_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF1_3:		ResourcePack.PIC_FF1_3 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF2:			ResourcePack.PIC_FF2 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF2_2:		ResourcePack.PIC_FF2_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF3:			ResourcePack.PIC_FF3 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF4:			ResourcePack.PIC_FF4 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF4_2:		ResourcePack.PIC_FF4_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF4_3:		ResourcePack.PIC_FF4_3 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF5:			ResourcePack.PIC_FF5 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF6:			ResourcePack.PIC_FF6 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF7:			ResourcePack.PIC_FF7 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF7_2:		ResourcePack.PIC_FF7_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF8:			ResourcePack.PIC_FF8 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF9:			ResourcePack.PIC_FF9 = ImgFile;			break;
				case ResourceDB.INDEX_PIC_FF10:			ResourcePack.PIC_FF10 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF10_2:		ResourcePack.PIC_FF10_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF11:			ResourcePack.PIC_FF11 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF12:			ResourcePack.PIC_FF12 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF12_2:		ResourcePack.PIC_FF12_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF13:			ResourcePack.PIC_FF13 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF13_2:		ResourcePack.PIC_FF13_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_FF13_3:		ResourcePack.PIC_FF13_3 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_DDFF:			ResourcePack.PIC_DDFF = ImgFile;		break;
				case ResourceDB.INDEX_PIC_DDFF_2:		ResourcePack.PIC_DDFF_2 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_DDFF_3:		ResourcePack.PIC_DDFF_3 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_DDFF_4:		ResourcePack.PIC_DDFF_4 = ImgFile;		break;
				case ResourceDB.INDEX_PIC_SPLASH:		ResourcePack.PIC_SPLASH = ImgFile;		break;
				case ResourceDB.INDEX_PIC_INICIO_pt:	ResourcePack.PIC_INICIO_pt = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_en:	ResourcePack.PIC_INICIO_en = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_de:	ResourcePack.PIC_INICIO_de = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_es:	ResourcePack.PIC_INICIO_es = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_fr:	ResourcePack.PIC_INICIO_fr = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_it:	ResourcePack.PIC_INICIO_it = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_0A:	ResourcePack.PIC_INICIO_0A = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_0B:	ResourcePack.PIC_INICIO_0B = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_0C:	ResourcePack.PIC_INICIO_0C = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_0D:	ResourcePack.PIC_INICIO_0D = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_01:	ResourcePack.PIC_INICIO_01 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_02:	ResourcePack.PIC_INICIO_02 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_03:	ResourcePack.PIC_INICIO_03 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_04:	ResourcePack.PIC_INICIO_04 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_05:	ResourcePack.PIC_INICIO_05 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_06:	ResourcePack.PIC_INICIO_06 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_07:	ResourcePack.PIC_INICIO_07 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_08:	ResourcePack.PIC_INICIO_08 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_09:	ResourcePack.PIC_INICIO_09 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_10:	ResourcePack.PIC_INICIO_10 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_11:	ResourcePack.PIC_INICIO_11 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_12:	ResourcePack.PIC_INICIO_12 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_13:	ResourcePack.PIC_INICIO_13 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_14:	ResourcePack.PIC_INICIO_14 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_15:	ResourcePack.PIC_INICIO_15 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_16:	ResourcePack.PIC_INICIO_16 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_17:	ResourcePack.PIC_INICIO_17 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_18:	ResourcePack.PIC_INICIO_18 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_19:	ResourcePack.PIC_INICIO_19 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_20:	ResourcePack.PIC_INICIO_20 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_21:	ResourcePack.PIC_INICIO_21 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_22:	ResourcePack.PIC_INICIO_22 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_23:	ResourcePack.PIC_INICIO_23 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_24:	ResourcePack.PIC_INICIO_24 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_25:	ResourcePack.PIC_INICIO_25 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_26:	ResourcePack.PIC_INICIO_26 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_27:	ResourcePack.PIC_INICIO_27 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_28:	ResourcePack.PIC_INICIO_28 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_29:	ResourcePack.PIC_INICIO_29 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_30:	ResourcePack.PIC_INICIO_30 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_INICIO_31:	ResourcePack.PIC_INICIO_31 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_pt:		ResourcePack.PIC_ABOUT_pt = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_en:		ResourcePack.PIC_ABOUT_en = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_de:		ResourcePack.PIC_ABOUT_de = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_es:		ResourcePack.PIC_ABOUT_es = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_fr:		ResourcePack.PIC_ABOUT_fr = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_it:		ResourcePack.PIC_ABOUT_it = ImgFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_01:		ResourcePack.PIC_ABOUT_01 = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_pt:		ResourcePack.PIC_AJUDA_pt = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_en:		ResourcePack.PIC_AJUDA_en = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_de:		ResourcePack.PIC_AJUDA_de = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_es:		ResourcePack.PIC_AJUDA_es = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_fr:		ResourcePack.PIC_AJUDA_fr = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_it:		ResourcePack.PIC_AJUDA_it = ImgFile;	break;
				case ResourceDB.INDEX_PIC_AJUDA_01:		ResourcePack.PIC_AJUDA_01 = ImgFile;	break;
			}

		}

		return ImgFile;

	}

	public static ImageIcon GetIconFile(int Index) {

		int Size;
		long Offset;
		ImageIcon IconFile;

		Size = 0;
		Offset = 0;
		IconFile = null;

		switch(Index) {
			case ResourceDB.INDEX_ICON_SUCCESS:
				IconFile = ResourcePack.ICON_SUCCESS;
				Offset = ResourceDB.OFFSET_ICON_SUCCESS;
				Size = ResourceDB.SIZE_ICON_SUCCESS;
				break;
			case ResourceDB.INDEX_ICON_SUCCESS_BIG:
				IconFile = ResourcePack.ICON_SUCCESS_BIG;
				Offset = ResourceDB.OFFSET_ICON_SUCCESS_BIG;
				Size = ResourceDB.SIZE_ICON_SUCCESS_BIG;
				break;
			case ResourceDB.INDEX_ICON_INFORMATION:
				IconFile = ResourcePack.ICON_INFORMATION;
				Offset = ResourceDB.OFFSET_ICON_INFORMATION;
				Size = ResourceDB.SIZE_ICON_INFORMATION;
				break;
			case ResourceDB.INDEX_ICON_INFORMATION_BIG:
				IconFile = ResourcePack.ICON_INFORMATION_BIG;
				Offset = ResourceDB.OFFSET_ICON_INFORMATION_BIG;
				Size = ResourceDB.SIZE_ICON_INFORMATION_BIG;
				break;
			case ResourceDB.INDEX_ICON_QUESTION:
				IconFile = ResourcePack.ICON_QUESTION;
				Offset = ResourceDB.OFFSET_ICON_QUESTION;
				Size = ResourceDB.SIZE_ICON_QUESTION;
				break;
			case ResourceDB.INDEX_ICON_QUESTION_BIG:
				IconFile = ResourcePack.ICON_QUESTION_BIG;
				Offset = ResourceDB.OFFSET_ICON_QUESTION_BIG;
				Size = ResourceDB.SIZE_ICON_QUESTION_BIG;
				break;
			case ResourceDB.INDEX_ICON_WARNING:
				IconFile = ResourcePack.ICON_WARNING;
				Offset = ResourceDB.OFFSET_ICON_WARNING;
				Size = ResourceDB.SIZE_ICON_WARNING;
				break;
			case ResourceDB.INDEX_ICON_WARNING_BIG:
				IconFile = ResourcePack.ICON_WARNING_BIG;
				Offset = ResourceDB.OFFSET_ICON_WARNING_BIG;
				Size = ResourceDB.SIZE_ICON_WARNING_BIG;
				break;
			case ResourceDB.INDEX_ICON_ERROR:
				IconFile = ResourcePack.ICON_ERROR;
				Offset = ResourceDB.OFFSET_ICON_ERROR;
				Size = ResourceDB.SIZE_ICON_ERROR;
				break;
			case ResourceDB.INDEX_ICON_ERROR_BIG:
				IconFile = ResourcePack.ICON_ERROR_BIG;
				Offset = ResourceDB.OFFSET_ICON_ERROR_BIG;
				Size = ResourceDB.SIZE_ICON_ERROR_BIG;
				break;
			case ResourceDB.INDEX_ICON_FLAG_pt:
				IconFile = ResourcePack.ICON_FLAG_pt;
				Offset = ResourceDB.OFFSET_ICON_FLAG_pt;
				Size = ResourceDB.SIZE_ICON_FLAG_pt;
				break;
			case ResourceDB.INDEX_ICON_FLAG_en:
				IconFile = ResourcePack.ICON_FLAG_en;
				Offset = ResourceDB.OFFSET_ICON_FLAG_en;
				Size = ResourceDB.SIZE_ICON_FLAG_en;
				break;
			case ResourceDB.INDEX_ICON_FLAG_de:
				IconFile = ResourcePack.ICON_FLAG_de;
				Offset = ResourceDB.OFFSET_ICON_FLAG_de;
				Size = ResourceDB.SIZE_ICON_FLAG_de;
				break;
			case ResourceDB.INDEX_ICON_FLAG_es:
				IconFile = ResourcePack.ICON_FLAG_es;
				Offset = ResourceDB.OFFSET_ICON_FLAG_es;
				Size = ResourceDB.SIZE_ICON_FLAG_es;
				break;
			case ResourceDB.INDEX_ICON_FLAG_fr:
				IconFile = ResourcePack.ICON_FLAG_fr;
				Offset = ResourceDB.OFFSET_ICON_FLAG_fr;
				Size = ResourceDB.SIZE_ICON_FLAG_fr;
				break;
			case ResourceDB.INDEX_ICON_FLAG_it:
				IconFile = ResourcePack.ICON_FLAG_it;
				Offset = ResourceDB.OFFSET_ICON_FLAG_it;
				Size = ResourceDB.SIZE_ICON_FLAG_it;
				break;
			case ResourceDB.INDEX_ICON_EXPORT:
				IconFile = ResourcePack.ICON_EXPORT;
				Offset = ResourceDB.OFFSET_ICON_EXPORT;
				Size = ResourceDB.SIZE_ICON_EXPORT;
				break;
			case ResourceDB.INDEX_ICON_EXPORT_BIG:
				IconFile = ResourcePack.ICON_EXPORT_BIG;
				Offset = ResourceDB.OFFSET_ICON_EXPORT_BIG;
				Size = ResourceDB.SIZE_ICON_EXPORT_BIG;
				break;
			case ResourceDB.INDEX_ICON_SAVE:
				IconFile = ResourcePack.ICON_SAVE;
				Offset = ResourceDB.OFFSET_ICON_SAVE;
				Size = ResourceDB.SIZE_ICON_SAVE;
				break;
			case ResourceDB.INDEX_ICON_LOAD:
				IconFile = ResourcePack.ICON_LOAD;
				Offset = ResourceDB.OFFSET_ICON_LOAD;
				Size = ResourceDB.SIZE_ICON_LOAD;
				break;
			case ResourceDB.INDEX_ICON_RESET:
				IconFile = ResourcePack.ICON_RESET;
				Offset = ResourceDB.OFFSET_ICON_RESET;
				Size = ResourceDB.SIZE_ICON_RESET;
				break;
			case ResourceDB.INDEX_ICON_ABOUT:
				IconFile = ResourcePack.ICON_ABOUT;
				Offset = ResourceDB.OFFSET_ICON_ABOUT;
				Size = ResourceDB.SIZE_ICON_ABOUT;
				break;
			case ResourceDB.INDEX_ICON_EXIT:
				IconFile = ResourcePack.ICON_EXIT;
				Offset = ResourceDB.OFFSET_ICON_EXIT;
				Size = ResourceDB.SIZE_ICON_EXIT;
				break;
			case ResourceDB.INDEX_ICON_THEME:
				IconFile = ResourcePack.ICON_THEME;
				Offset = ResourceDB.OFFSET_ICON_THEME;
				Size = ResourceDB.SIZE_ICON_THEME;
				break;
			case ResourceDB.INDEX_ICON_THEME_DEFAULT:
				IconFile = ResourcePack.ICON_THEME_DEFAULT;
				Offset = ResourceDB.OFFSET_ICON_THEME_DEFAULT;
				Size = ResourceDB.SIZE_ICON_THEME_DEFAULT;
				break;
			case ResourceDB.INDEX_ICON_THEME_DARK:
				IconFile = ResourcePack.ICON_THEME_DARK;
				Offset = ResourceDB.OFFSET_ICON_THEME_DARK;
				Size = ResourceDB.SIZE_ICON_THEME_DARK;
				break;
			case ResourceDB.INDEX_ICON_THEME_COSMOS:
				IconFile = ResourcePack.ICON_THEME_COSMOS;
				Offset = ResourceDB.OFFSET_ICON_THEME_COSMOS;
				Size = ResourceDB.SIZE_ICON_THEME_COSMOS;
				break;
			case ResourceDB.INDEX_ICON_THEME_CHAOS:
				IconFile = ResourcePack.ICON_THEME_CHAOS;
				Offset = ResourceDB.OFFSET_ICON_THEME_CHAOS;
				Size = ResourceDB.SIZE_ICON_THEME_CHAOS;
				break;
			case ResourceDB.INDEX_ICON_THEME_CUSTOM:
				IconFile = ResourcePack.ICON_THEME_CUSTOM;
				Offset = ResourceDB.OFFSET_ICON_THEME_CUSTOM;
				Size = ResourceDB.SIZE_ICON_THEME_CUSTOM;
				break;
			case ResourceDB.INDEX_ICON_SOUND_MAX:
				IconFile = ResourcePack.ICON_SOUND_MAX;
				Offset = ResourceDB.OFFSET_ICON_SOUND_MAX;
				Size = ResourceDB.SIZE_ICON_SOUND_MAX;
				break;
			case ResourceDB.INDEX_ICON_SOUND_MIN:
				IconFile = ResourcePack.ICON_SOUND_MIN;
				Offset = ResourceDB.OFFSET_ICON_SOUND_MIN;
				Size = ResourceDB.SIZE_ICON_SOUND_MIN;
				break;
			case ResourceDB.INDEX_ICON_SOUND_MUTE:
				IconFile = ResourcePack.ICON_SOUND_MUTE;
				Offset = ResourceDB.OFFSET_ICON_SOUND_MUTE;
				Size = ResourceDB.SIZE_ICON_SOUND_MUTE;
				break;
		}

		if(IconFile==null) {

			IconFile = new ImageIcon(ExtractFromPackFile(Offset, Size));

			switch(Index) {
				case ResourceDB.INDEX_ICON_SUCCESS:			ResourcePack.ICON_SUCCESS = IconFile;			break;
				case ResourceDB.INDEX_ICON_SUCCESS_BIG:		ResourcePack.ICON_SUCCESS_BIG = IconFile;		break;
				case ResourceDB.INDEX_ICON_INFORMATION:		ResourcePack.ICON_INFORMATION = IconFile;		break;
				case ResourceDB.INDEX_ICON_INFORMATION_BIG:	ResourcePack.ICON_INFORMATION_BIG = IconFile;	break;
				case ResourceDB.INDEX_ICON_QUESTION:		ResourcePack.ICON_QUESTION = IconFile;			break;
				case ResourceDB.INDEX_ICON_QUESTION_BIG:	ResourcePack.ICON_QUESTION_BIG = IconFile;		break;
				case ResourceDB.INDEX_ICON_WARNING:			ResourcePack.ICON_WARNING = IconFile;			break;
				case ResourceDB.INDEX_ICON_WARNING_BIG:		ResourcePack.ICON_WARNING_BIG = IconFile;		break;
				case ResourceDB.INDEX_ICON_ERROR:			ResourcePack.ICON_ERROR = IconFile;				break;
				case ResourceDB.INDEX_ICON_ERROR_BIG:		ResourcePack.ICON_ERROR_BIG = IconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_pt:			ResourcePack.ICON_FLAG_pt = IconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_en:			ResourcePack.ICON_FLAG_en = IconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_de:			ResourcePack.ICON_FLAG_de = IconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_es:			ResourcePack.ICON_FLAG_es = IconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_fr:			ResourcePack.ICON_FLAG_fr = IconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_it:			ResourcePack.ICON_FLAG_it = IconFile;			break;
				case ResourceDB.INDEX_ICON_EXPORT:			ResourcePack.ICON_EXPORT = IconFile;			break;
				case ResourceDB.INDEX_ICON_EXPORT_BIG:		ResourcePack.ICON_EXPORT_BIG = IconFile;		break;
				case ResourceDB.INDEX_ICON_SAVE:			ResourcePack.ICON_SAVE = IconFile;				break;
				case ResourceDB.INDEX_ICON_LOAD:			ResourcePack.ICON_LOAD = IconFile;				break;
				case ResourceDB.INDEX_ICON_RESET:			ResourcePack.ICON_RESET = IconFile;				break;
				case ResourceDB.INDEX_ICON_ABOUT:			ResourcePack.ICON_ABOUT = IconFile;				break;
				case ResourceDB.INDEX_ICON_EXIT:			ResourcePack.ICON_EXIT = IconFile;				break;
				case ResourceDB.INDEX_ICON_THEME:			ResourcePack.ICON_THEME = IconFile;				break;
				case ResourceDB.INDEX_ICON_THEME_DEFAULT:	ResourcePack.ICON_THEME_DEFAULT = IconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_DARK:		ResourcePack.ICON_THEME_DARK = IconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_COSMOS:	ResourcePack.ICON_THEME_COSMOS = IconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_CHAOS:		ResourcePack.ICON_THEME_CHAOS = IconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_CUSTOM:	ResourcePack.ICON_THEME_CUSTOM = IconFile;		break;
				case ResourceDB.INDEX_ICON_SOUND_MAX:		ResourcePack.ICON_SOUND_MAX = IconFile;			break;
				case ResourceDB.INDEX_ICON_SOUND_MIN:		ResourcePack.ICON_SOUND_MIN = IconFile;			break;
				case ResourceDB.INDEX_ICON_SOUND_MUTE:		ResourcePack.ICON_SOUND_MUTE = IconFile;		break;

			}

		}

		return IconFile;

	}

	public static File GetSoundFile(int Index) {

		int Size;
		long Offset;
		File SoundFile;

		Size = 0;
		Offset = 0;
		SoundFile = null;
		switch(Index) {
			case ResourceDB.INDEX_SOUND_CURSORMOVE:
				SoundFile = ResourcePack.SOUND_CURSORMOVE;
				Offset = ResourceDB.OFFSET_SOUND_CURSORMOVE;
				Size = ResourceDB.SIZE_SOUND_CURSORMOVE;
				break;
			case ResourceDB.INDEX_SOUND_CURSORMOVE_2:
				SoundFile = ResourcePack.SOUND_CURSORMOVE_2;
				Offset = ResourceDB.OFFSET_SOUND_CURSORMOVE_2;
				Size = ResourceDB.SIZE_SOUND_CURSORMOVE_2;
				break;
			case ResourceDB.INDEX_SOUND_CURSORMOVE_3:
				SoundFile = ResourcePack.SOUND_CURSORMOVE_3;
				Offset = ResourceDB.OFFSET_SOUND_CURSORMOVE_3;
				Size = ResourceDB.SIZE_SOUND_CURSORMOVE_3;
				break;
			case ResourceDB.INDEX_SOUND_CURSORCHOOSE:
				SoundFile = ResourcePack.SOUND_CURSORCHOOSE;
				Offset = ResourceDB.OFFSET_SOUND_CURSORCHOOSE;
				Size = ResourceDB.SIZE_SOUND_CURSORCHOOSE;
				break;
			case ResourceDB.INDEX_SOUND_CURSORBACK:
				SoundFile = ResourcePack.SOUND_CURSORBACK;
				Offset = ResourceDB.OFFSET_SOUND_CURSORBACK;
				Size = ResourceDB.SIZE_SOUND_CURSORBACK;
				break;
			case ResourceDB.INDEX_SOUND_MENUOPEN:
				SoundFile = ResourcePack.SOUND_MENUOPEN;
				Offset = ResourceDB.OFFSET_SOUND_MENUOPEN;
				Size = ResourceDB.SIZE_SOUND_MENUOPEN;
				break;
			case ResourceDB.INDEX_SOUND_MENUCLOSE:
				SoundFile = ResourcePack.SOUND_MENUCLOSE;
				Offset = ResourceDB.OFFSET_SOUND_MENUCLOSE;
				Size = ResourceDB.SIZE_SOUND_MENUCLOSE;
				break;
			case ResourceDB.INDEX_SOUND_PAGEROLL:
				SoundFile = ResourcePack.SOUND_PAGEROLL;
				Offset = ResourceDB.OFFSET_SOUND_PAGEROLL;
				Size = ResourceDB.SIZE_SOUND_PAGEROLL;
				break;
			case ResourceDB.INDEX_SOUND_PAGEROLL_2:
				SoundFile = ResourcePack.SOUND_PAGEROLL_2;
				Offset = ResourceDB.OFFSET_SOUND_PAGEROLL_2;
				Size = ResourceDB.SIZE_SOUND_PAGEROLL_2;
				break;
			case ResourceDB.INDEX_SOUND_WINDOWUP:
				SoundFile = ResourcePack.SOUND_WINDOWUP;
				Offset = ResourceDB.OFFSET_SOUND_WINDOWUP;
				Size = ResourceDB.SIZE_SOUND_WINDOWUP;
				break;
			case ResourceDB.INDEX_SOUND_WINDOWUP_2:
				SoundFile = ResourcePack.SOUND_WINDOWUP_2;
				Offset = ResourceDB.OFFSET_SOUND_WINDOWUP_2;
				Size = ResourceDB.SIZE_SOUND_WINDOWUP_2;
				break;
			case ResourceDB.INDEX_SOUND_ERROR:
				SoundFile = ResourcePack.SOUND_ERROR;
				Offset = ResourceDB.OFFSET_SOUND_ERROR;
				Size = ResourceDB.SIZE_SOUND_ERROR;
				break;
			case ResourceDB.INDEX_SOUND_CHOCOBO:
				SoundFile = ResourcePack.SOUND_CHOCOBO;
				Offset = ResourceDB.OFFSET_SOUND_CHOCOBO;
				Size = ResourceDB.SIZE_SOUND_CHOCOBO;
				break;
			case ResourceDB.INDEX_SOUND_MOOGLE:
				SoundFile = ResourcePack.SOUND_MOOGLE;
				Offset = ResourceDB.OFFSET_SOUND_MOOGLE;
				Size = ResourceDB.SIZE_SOUND_MOOGLE;
				break;
			case ResourceDB.INDEX_SOUND_MOOGLE_2:
				SoundFile = ResourcePack.SOUND_MOOGLE_2;
				Offset = ResourceDB.OFFSET_SOUND_MOOGLE_2;
				Size = ResourceDB.SIZE_SOUND_MOOGLE_2;
				break;
			case ResourceDB.INDEX_SOUND_STAIRS:
				SoundFile = ResourcePack.SOUND_STAIRS;
				Offset = ResourceDB.OFFSET_SOUND_STAIRS;
				Size = ResourceDB.SIZE_SOUND_STAIRS;
				break;
			case ResourceDB.INDEX_SOUND_EQUIP:
				SoundFile = ResourcePack.SOUND_EQUIP;
				Offset = ResourceDB.OFFSET_SOUND_EQUIP;
				Size = ResourceDB.SIZE_SOUND_EQUIP;
				break;
			case ResourceDB.INDEX_SOUND_UNEQUIP:
				SoundFile = ResourcePack.SOUND_UNEQUIP;
				Offset = ResourceDB.OFFSET_SOUND_UNEQUIP;
				Size = ResourceDB.SIZE_SOUND_UNEQUIP;
				break;
		}

		if(SoundFile==null) {

			SoundFile = new File(ExtractFromPackFile(Offset, Size));

			switch(Index) {
				case ResourceDB.INDEX_SOUND_CURSORMOVE:		ResourcePack.SOUND_CURSORMOVE = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_CURSORMOVE_2:	ResourcePack.SOUND_CURSORMOVE_2 = SoundFile;	break;
				case ResourceDB.INDEX_SOUND_CURSORMOVE_3:	ResourcePack.SOUND_CURSORMOVE_3 = SoundFile;	break;
				case ResourceDB.INDEX_SOUND_CURSORCHOOSE:	ResourcePack.SOUND_CURSORCHOOSE = SoundFile;	break;
				case ResourceDB.INDEX_SOUND_CURSORBACK:		ResourcePack.SOUND_CURSORBACK = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_MENUOPEN:		ResourcePack.SOUND_MENUOPEN = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_MENUCLOSE:		ResourcePack.SOUND_MENUCLOSE = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_PAGEROLL:		ResourcePack.SOUND_PAGEROLL = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_PAGEROLL_2:		ResourcePack.SOUND_PAGEROLL_2 = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_WINDOWUP:		ResourcePack.SOUND_WINDOWUP = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_WINDOWUP_2:		ResourcePack.SOUND_WINDOWUP_2 = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_ERROR:			ResourcePack.SOUND_ERROR = SoundFile;			break;
				case ResourceDB.INDEX_SOUND_CHOCOBO:		ResourcePack.SOUND_CHOCOBO = SoundFile;			break;
				case ResourceDB.INDEX_SOUND_MOOGLE:			ResourcePack.SOUND_MOOGLE = SoundFile;			break;
				case ResourceDB.INDEX_SOUND_MOOGLE_2:		ResourcePack.SOUND_MOOGLE_2 = SoundFile;		break;
				case ResourceDB.INDEX_SOUND_STAIRS:			ResourcePack.SOUND_STAIRS = SoundFile;			break;
				case ResourceDB.INDEX_SOUND_EQUIP:			ResourcePack.SOUND_EQUIP = SoundFile;			break;
				case ResourceDB.INDEX_SOUND_UNEQUIP:		ResourcePack.SOUND_UNEQUIP = SoundFile;			break;
			}

		}

		return SoundFile;

	}

	public static void SaveTitleList(ArrayList<JTextField> TextFieldAL) throws FileNotFoundException, IOException {

		File Pack;
		RandomAccessFile RandomPack;

		SimpleDateFormat Date_pt = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat Date_en = new SimpleDateFormat("MM/dd/yyyy hh:mm a");

		Pack = new File("RESOURCEPACK.BIN");

		if(!Pack.exists())
			throw new FileNotFoundException();

		RandomPack = new RandomAccessFile(Pack, "rw");

		RandomPack.seek(ResourceDB.OFFSET_LIST);
		if(Pack.canWrite()) {

			RandomPack.writeBytes(Date_pt.format(new Date()) + "\n");
			RandomPack.writeBytes(Date_en.format(new Date()) + "\n");

			for(JTextField JTF : TextFieldAL) {
				RandomPack.writeBytes(JTF.getText() + "\n");
				RandomPack.writeBoolean(JTF.isEnabled());
				RandomPack.writeBoolean(JTF.getForeground()==Color.BLACK);
			}

		}

		RandomPack.close();

	}

	public static void LoadTitleList(ArrayList<JTextField> TextFieldAL, ArrayList<JCheckBox> CheckBoxAL, ArrayList<BalloonTip> CheckBoxTipAL, StringBuffer Time_pt, StringBuffer Time_en) throws FileNotFoundException, IOException {

		File Pack;
		RandomAccessFile RandomPack;

		String Name;
		boolean IsEnabled;
		boolean IsSafe;

		Pack = new File("RESOURCEPACK.BIN");

		if(!Pack.exists())
			throw new FileNotFoundException();

		RandomPack = new RandomAccessFile(Pack, "r");

		RandomPack.seek(ResourceDB.OFFSET_LIST);
		if(Pack.canRead()) {

			Time_pt.append(RandomPack.readLine());
			Time_en.append(RandomPack.readLine());

			for(int i=0; i<TextFieldAL.size(); i++) {
				Name = RandomPack.readLine();
				IsEnabled = RandomPack.readBoolean();
				IsSafe = RandomPack.readBoolean();

				TextFieldAL.get(i).setText(Name);
				TextFieldAL.get(i).setEnabled(IsEnabled);
				CheckBoxAL.get(i).setSelected(IsEnabled);
				CheckBoxTipAL.get(i).setOpacity((IsEnabled)? 0.0f : 1.0f);
				TextFieldAL.get(i).setForeground((IsSafe)? Color.BLACK : Color.RED);
			}

		}

		RandomPack.close();

	}

	private static void initFileArrays() {

		FileNameAL = new ArrayList<>();
		FileSizeAL = new ArrayList<>();

		FileNameAL.add(ResourceDB.FILENAME_PIC_FF1);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF1_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF1_3);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF2_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF3);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF4);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF4_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF4_3);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF5);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF6);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF7);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF7_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF8);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF9);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF10);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF10_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF11);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF12);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF12_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF13);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF13_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_FF13_3);
		FileNameAL.add(ResourceDB.FILENAME_PIC_DDFF);
		FileNameAL.add(ResourceDB.FILENAME_PIC_DDFF_2);
		FileNameAL.add(ResourceDB.FILENAME_PIC_DDFF_3);
		FileNameAL.add(ResourceDB.FILENAME_PIC_DDFF_4);
		FileNameAL.add(ResourceDB.FILENAME_PIC_SPLASH);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_pt);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_en);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_de);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_es);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_fr);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_it);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_0A);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_0B);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_0C);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_0D);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_01);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_02);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_03);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_04);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_05);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_06);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_07);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_08);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_09);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_10);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_11);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_12);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_13);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_14);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_15);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_16);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_17);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_18);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_19);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_20);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_21);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_22);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_23);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_24);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_25);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_26);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_27);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_28);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_29);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_30);
		FileNameAL.add(ResourceDB.FILENAME_PIC_INICIO_31);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_pt);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_en);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_de);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_es);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_fr);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_it);
		FileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_01);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_pt);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_en);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_de);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_es);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_fr);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_it);
		FileNameAL.add(ResourceDB.FILENAME_PIC_AJUDA_01);
		FileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_pt);
		FileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_en);
		FileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_de);
		FileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_es);
		FileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_fr);
		FileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_it);
		FileNameAL.add(ResourceDB.FILENAME_ICON_SUCCESS);
		FileNameAL.add(ResourceDB.FILENAME_ICON_SUCCESS_BIG);
		FileNameAL.add(ResourceDB.FILENAME_ICON_INFORMATION);
		FileNameAL.add(ResourceDB.FILENAME_ICON_INFORMATION_BIG);
		FileNameAL.add(ResourceDB.FILENAME_ICON_QUESTION);
		FileNameAL.add(ResourceDB.FILENAME_ICON_QUESTION_BIG);
		FileNameAL.add(ResourceDB.FILENAME_ICON_WARNING);
		FileNameAL.add(ResourceDB.FILENAME_ICON_WARNING_BIG);
		FileNameAL.add(ResourceDB.FILENAME_ICON_ERROR);
		FileNameAL.add(ResourceDB.FILENAME_ICON_ERROR_BIG);
		FileNameAL.add(ResourceDB.FILENAME_ICON_EXPORT);
		FileNameAL.add(ResourceDB.FILENAME_ICON_EXPORT_BIG);
		FileNameAL.add(ResourceDB.FILENAME_ICON_SAVE);
		FileNameAL.add(ResourceDB.FILENAME_ICON_LOAD);
		FileNameAL.add(ResourceDB.FILENAME_ICON_RESET);
		FileNameAL.add(ResourceDB.FILENAME_ICON_ABOUT);
		FileNameAL.add(ResourceDB.FILENAME_ICON_EXIT);
		FileNameAL.add(ResourceDB.FILENAME_ICON_THEME);
		FileNameAL.add(ResourceDB.FILENAME_ICON_THEME_DEFAULT);
		FileNameAL.add(ResourceDB.FILENAME_ICON_THEME_DARK);
		FileNameAL.add(ResourceDB.FILENAME_ICON_THEME_COSMOS);
		FileNameAL.add(ResourceDB.FILENAME_ICON_THEME_CHAOS);
		FileNameAL.add(ResourceDB.FILENAME_ICON_THEME_CUSTOM);
		FileNameAL.add(ResourceDB.FILENAME_ICON_SOUND_MAX);
		FileNameAL.add(ResourceDB.FILENAME_ICON_SOUND_MIN);
		FileNameAL.add(ResourceDB.FILENAME_ICON_SOUND_MUTE);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORMOVE);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORMOVE_2);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORMOVE_3);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORCHOOSE);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORBACK);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_MENUOPEN);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_MENUCLOSE);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_PAGEROLL);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_PAGEROLL_2);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_WINDOWUP);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_WINDOWUP_2);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_ERROR);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_CHOCOBO);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_MOOGLE);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_MOOGLE_2);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_STAIRS);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_EQUIP);
		FileNameAL.add(ResourceDB.FILENAME_SOUND_UNEQUIP);

		FileSizeAL.add(ResourceDB.SIZE_PIC_FF1);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF1_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF1_3);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF2_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF3);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF4);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF4_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF4_3);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF5);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF6);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF7);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF7_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF8);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF9);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF10);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF10_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF11);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF12);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF12_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF13);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF13_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_FF13_3);
		FileSizeAL.add(ResourceDB.SIZE_PIC_DDFF);
		FileSizeAL.add(ResourceDB.SIZE_PIC_DDFF_2);
		FileSizeAL.add(ResourceDB.SIZE_PIC_DDFF_3);
		FileSizeAL.add(ResourceDB.SIZE_PIC_DDFF_4);
		FileSizeAL.add(ResourceDB.SIZE_PIC_SPLASH);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_pt);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_en);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_de);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_es);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_fr);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_it);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_0A);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_0B);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_0C);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_0D);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_01);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_02);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_03);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_04);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_05);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_06);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_07);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_08);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_09);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_10);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_11);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_12);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_13);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_14);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_15);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_16);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_17);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_18);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_19);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_20);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_21);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_22);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_23);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_24);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_25);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_26);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_27);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_28);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_29);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_30);
		FileSizeAL.add(ResourceDB.SIZE_PIC_INICIO_31);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_pt);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_en);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_de);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_es);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_fr);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_it);
		FileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_01);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_pt);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_en);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_de);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_es);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_fr);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_it);
		FileSizeAL.add(ResourceDB.SIZE_PIC_AJUDA_01);
		FileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_pt);
		FileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_en);
		FileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_de);
		FileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_es);
		FileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_fr);
		FileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_it);
		FileSizeAL.add(ResourceDB.SIZE_ICON_SUCCESS);
		FileSizeAL.add(ResourceDB.SIZE_ICON_SUCCESS_BIG);
		FileSizeAL.add(ResourceDB.SIZE_ICON_INFORMATION);
		FileSizeAL.add(ResourceDB.SIZE_ICON_INFORMATION_BIG);
		FileSizeAL.add(ResourceDB.SIZE_ICON_QUESTION);
		FileSizeAL.add(ResourceDB.SIZE_ICON_QUESTION_BIG);
		FileSizeAL.add(ResourceDB.SIZE_ICON_WARNING);
		FileSizeAL.add(ResourceDB.SIZE_ICON_WARNING_BIG);
		FileSizeAL.add(ResourceDB.SIZE_ICON_ERROR);
		FileSizeAL.add(ResourceDB.SIZE_ICON_ERROR_BIG);
		FileSizeAL.add(ResourceDB.SIZE_ICON_EXPORT);
		FileSizeAL.add(ResourceDB.SIZE_ICON_EXPORT_BIG);
		FileSizeAL.add(ResourceDB.SIZE_ICON_SAVE);
		FileSizeAL.add(ResourceDB.SIZE_ICON_LOAD);
		FileSizeAL.add(ResourceDB.SIZE_ICON_RESET);
		FileSizeAL.add(ResourceDB.SIZE_ICON_ABOUT);
		FileSizeAL.add(ResourceDB.SIZE_ICON_EXIT);
		FileSizeAL.add(ResourceDB.SIZE_ICON_THEME);
		FileSizeAL.add(ResourceDB.SIZE_ICON_THEME_DEFAULT);
		FileSizeAL.add(ResourceDB.SIZE_ICON_THEME_DARK);
		FileSizeAL.add(ResourceDB.SIZE_ICON_THEME_COSMOS);
		FileSizeAL.add(ResourceDB.SIZE_ICON_THEME_CHAOS);
		FileSizeAL.add(ResourceDB.SIZE_ICON_THEME_CUSTOM);
		FileSizeAL.add(ResourceDB.SIZE_ICON_SOUND_MAX);
		FileSizeAL.add(ResourceDB.SIZE_ICON_SOUND_MIN);
		FileSizeAL.add(ResourceDB.SIZE_ICON_SOUND_MUTE);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORMOVE);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORMOVE_2);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORMOVE_3);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORCHOOSE);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORBACK);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_MENUOPEN);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_MENUCLOSE);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_PAGEROLL);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_PAGEROLL_2);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_WINDOWUP);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_WINDOWUP_2);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_ERROR);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_CHOCOBO);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_MOOGLE);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_MOOGLE_2);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_STAIRS);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_EQUIP);
		FileSizeAL.add(ResourceDB.SIZE_SOUND_UNEQUIP);

	}

}