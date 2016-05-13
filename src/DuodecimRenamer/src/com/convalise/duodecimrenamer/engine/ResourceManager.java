
package com.convalise.duodecimrenamer.engine;

import com.convalise.duodecimrenamer.database.ResourceDB;
import com.convalise.duodecimrenamer.database.ResourcePack;

import net.java.balloontip.BalloonTip;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public abstract class ResourceManager {

	private static final byte[] VALIDATION_HASH = {
		 109,  -75,  -78,   25,   62,  119,   41,  121,   52,   12,  -39,   47,   78,   88,  -43,   21,
		  46, -101,  -95,   23,  -40,  -34,   10,  -75,   25,   -9, -123, -126,   74,  -12,   66,  -92,
		 -35,  -74,  -13,   -6,   81,  -39,  -53, -125, -117,  -57,  -66,  114,   10,  -87,  -52,   62,
		-111,   -6,   -8,  -12,  -26,  -98,  -17,  -60,  -68,  125,   98,  -72,   25, -113,   76,  -67,
		  94,  -55,   25,    0,   -6,   41,   36,   37,   33,   85,  -65,  113, -121,  -98,   17,   10,
		 -41,   68,  -54, -102,  -15,  -20,  107,  -98,   -8,  -17, -114, -117,   46,   30,  -85,  -27,
		 108,   13, -120,  104, -108,   49,   16,  -49,  -10,  120,   67, -106,  -63,   30,  110,  -13,
		 -62,   20,  126,  -81,   93,    8,  -32, -125,   28,   44,    7,  -19,   -9,   81,   31,   -5
	};

	private static ArrayList<String> fileNameAL;
	private static ArrayList<Integer> fileSizeAL;

	public static void generatePackageFile() throws IOException {

		initFileArrays();

		File packageF = new File("RESOURCEPACK.BIN");

		if(packageF.exists()) {
			packageF.delete();
			packageF.createNewFile();
		}

		RandomAccessFile packageRA = new RandomAccessFile(packageF, "rw");

		if(packageF.canWrite()) {
			packageRA.write(VALIDATION_HASH);
		}

		File resourceF;
		RandomAccessFile resourceRA;
		byte[] byteArray;

		for(int i = 0; i < fileNameAL.size(); i++) {
			
			resourceF = new File(fileNameAL.get(i));
			resourceRA = new RandomAccessFile(resourceF, "r");

			byteArray = new byte[fileSizeAL.get(i)];

			if(resourceF.canRead()) {
				resourceRA.read(byteArray);
			}
			
			if(packageF.canWrite()) {
				packageRA.write(byteArray);
			}

			resourceRA.close();

		}

		packageRA.close();

		System.out.println("RESOURCEPACK generated successfully!");

	}

	public static boolean validatePackageFile() throws IOException {

		File packageF = new File("RESOURCEPACK.BIN");

		if(!packageF.exists())
			return false;

		RandomAccessFile packageRA = new RandomAccessFile(packageF, "rw");

		byte[] byteArray = new byte[128];

		if(packageF.canRead()) {
			packageRA.read(byteArray);
		}
		
		packageRA.close();

		return Arrays.equals(byteArray, VALIDATION_HASH);

	}

	private static String extractFromPackage(long resourceOffset, int resourceSize) throws IOException {

		byte[] byteArray = new byte[resourceSize];

		File container = new File("RESOURCEPACK.BIN");

		if(!container.exists())
			return null;

		RandomAccessFile containerRA = new RandomAccessFile(container, "r");

		containerRA.seek(resourceOffset);
		
		if(!container.canRead())
			return null;

		containerRA.read(byteArray);
		containerRA.close();

		File resourceF = File.createTempFile("tempfile", ".dr");
		resourceF.deleteOnExit();

		RandomAccessFile resourceRA = new RandomAccessFile(resourceF, "rw");

		if(!resourceF.canWrite())
			return null;
		
		resourceRA.write(byteArray);
		resourceRA.close();

		return resourceF.getAbsolutePath();

	}

	public static File loadImageResource(int index) {

		int size = 0;
		long offset = 0L;
		File imageFile = null;

		switch(index) {
			
			case ResourceDB.INDEX_PIC_FF1:
				imageFile = ResourcePack.PIC_FF1;
				offset = ResourceDB.OFFSET_PIC_FF1;
				size = ResourceDB.SIZE_PIC_FF1;
				break;
				
			case ResourceDB.INDEX_PIC_FF1_2:
				imageFile = ResourcePack.PIC_FF1_2;
				offset = ResourceDB.OFFSET_PIC_FF1_2;
				size = ResourceDB.SIZE_PIC_FF1_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF1_3:
				imageFile = ResourcePack.PIC_FF1_3;
				offset = ResourceDB.OFFSET_PIC_FF1_3;
				size = ResourceDB.SIZE_PIC_FF1_3;
				break;
				
			case ResourceDB.INDEX_PIC_FF2:
				imageFile = ResourcePack.PIC_FF2;
				offset = ResourceDB.OFFSET_PIC_FF2;
				size = ResourceDB.SIZE_PIC_FF2;
				break;
				
			case ResourceDB.INDEX_PIC_FF2_2:
				imageFile = ResourcePack.PIC_FF2_2;
				offset = ResourceDB.OFFSET_PIC_FF2_2;
				size = ResourceDB.SIZE_PIC_FF2_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF3:
				imageFile = ResourcePack.PIC_FF3;
				offset = ResourceDB.OFFSET_PIC_FF3;
				size = ResourceDB.SIZE_PIC_FF3;
				break;
				
			case ResourceDB.INDEX_PIC_FF4:
				imageFile = ResourcePack.PIC_FF4;
				offset = ResourceDB.OFFSET_PIC_FF4;
				size = ResourceDB.SIZE_PIC_FF4;
				break;
				
			case ResourceDB.INDEX_PIC_FF4_2:
				imageFile = ResourcePack.PIC_FF4_2;
				offset = ResourceDB.OFFSET_PIC_FF4_2;
				size = ResourceDB.SIZE_PIC_FF4_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF4_3:
				imageFile = ResourcePack.PIC_FF4_3;
				offset = ResourceDB.OFFSET_PIC_FF4_3;
				size = ResourceDB.SIZE_PIC_FF4_3;
				break;
				
			case ResourceDB.INDEX_PIC_FF5:
				imageFile = ResourcePack.PIC_FF5;
				offset = ResourceDB.OFFSET_PIC_FF5;
				size = ResourceDB.SIZE_PIC_FF5;
				break;
				
			case ResourceDB.INDEX_PIC_FF6:
				imageFile = ResourcePack.PIC_FF6;
				offset = ResourceDB.OFFSET_PIC_FF6;
				size = ResourceDB.SIZE_PIC_FF6;
				break;
				
			case ResourceDB.INDEX_PIC_FF7:
				imageFile = ResourcePack.PIC_FF7;
				offset = ResourceDB.OFFSET_PIC_FF7;
				size = ResourceDB.SIZE_PIC_FF7;
				break;
				
			case ResourceDB.INDEX_PIC_FF7_2:
				imageFile = ResourcePack.PIC_FF7_2;
				offset = ResourceDB.OFFSET_PIC_FF7_2;
				size = ResourceDB.SIZE_PIC_FF7_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF7_3:
				imageFile = ResourcePack.PIC_FF7_3;
				offset = ResourceDB.OFFSET_PIC_FF7_3;
				size = ResourceDB.SIZE_PIC_FF7_3;
				break;
				
			case ResourceDB.INDEX_PIC_FF7_4:
				imageFile = ResourcePack.PIC_FF7_4;
				offset = ResourceDB.OFFSET_PIC_FF7_4;
				size = ResourceDB.SIZE_PIC_FF7_4;
				break;
				
			case ResourceDB.INDEX_PIC_FF7_5:
				imageFile = ResourcePack.PIC_FF7_5;
				offset = ResourceDB.OFFSET_PIC_FF7_5;
				size = ResourceDB.SIZE_PIC_FF7_5;
				break;
				
			case ResourceDB.INDEX_PIC_FF8:
				imageFile = ResourcePack.PIC_FF8;
				offset = ResourceDB.OFFSET_PIC_FF8;
				size = ResourceDB.SIZE_PIC_FF8;
				break;
				
			case ResourceDB.INDEX_PIC_FF9:
				imageFile = ResourcePack.PIC_FF9;
				offset = ResourceDB.OFFSET_PIC_FF9;
				size = ResourceDB.SIZE_PIC_FF9;
				break;
				
			case ResourceDB.INDEX_PIC_FF10:
				imageFile = ResourcePack.PIC_FF10;
				offset = ResourceDB.OFFSET_PIC_FF10;
				size = ResourceDB.SIZE_PIC_FF10;
				break;
				
			case ResourceDB.INDEX_PIC_FF10_2:
				imageFile = ResourcePack.PIC_FF10_2;
				offset = ResourceDB.OFFSET_PIC_FF10_2;
				size = ResourceDB.SIZE_PIC_FF10_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF11:
				imageFile = ResourcePack.PIC_FF11;
				offset = ResourceDB.OFFSET_PIC_FF11;
				size = ResourceDB.SIZE_PIC_FF11;
				break;
				
			case ResourceDB.INDEX_PIC_FF12:
				imageFile = ResourcePack.PIC_FF12;
				offset = ResourceDB.OFFSET_PIC_FF12;
				size = ResourceDB.SIZE_PIC_FF12;
				break;
				
			case ResourceDB.INDEX_PIC_FF12_2:
				imageFile = ResourcePack.PIC_FF12_2;
				offset = ResourceDB.OFFSET_PIC_FF12_2;
				size = ResourceDB.SIZE_PIC_FF12_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF13:
				imageFile = ResourcePack.PIC_FF13;
				offset = ResourceDB.OFFSET_PIC_FF13;
				size = ResourceDB.SIZE_PIC_FF13;
				break;
				
			case ResourceDB.INDEX_PIC_FF13_2:
				imageFile = ResourcePack.PIC_FF13_2;
				offset = ResourceDB.OFFSET_PIC_FF13_2;
				size = ResourceDB.SIZE_PIC_FF13_2;
				break;
				
			case ResourceDB.INDEX_PIC_FF13_3:
				imageFile = ResourcePack.PIC_FF13_3;
				offset = ResourceDB.OFFSET_PIC_FF13_3;
				size = ResourceDB.SIZE_PIC_FF13_3;
				break;
				
			case ResourceDB.INDEX_PIC_DDFF:
				imageFile = ResourcePack.PIC_DDFF;
				offset = ResourceDB.OFFSET_PIC_DDFF;
				size = ResourceDB.SIZE_PIC_DDFF;
				break;
				
			case ResourceDB.INDEX_PIC_DDFF_2:
				imageFile = ResourcePack.PIC_DDFF_2;
				offset = ResourceDB.OFFSET_PIC_DDFF_2;
				size = ResourceDB.SIZE_PIC_DDFF_2;
				break;
				
			case ResourceDB.INDEX_PIC_DDFF_3:
				imageFile = ResourcePack.PIC_DDFF_3;
				offset = ResourceDB.OFFSET_PIC_DDFF_3;
				size = ResourceDB.SIZE_PIC_DDFF_3;
				break;
				
			case ResourceDB.INDEX_PIC_DDFF_4:
				imageFile = ResourcePack.PIC_DDFF_4;
				offset = ResourceDB.OFFSET_PIC_DDFF_4;
				size = ResourceDB.SIZE_PIC_DDFF_4;
				break;
				
			case ResourceDB.INDEX_PIC_SPLASH:
				imageFile = ResourcePack.PIC_SPLASH;
				offset = ResourceDB.OFFSET_PIC_SPLASH;
				size = ResourceDB.SIZE_PIC_SPLASH;
				break;
				
			case ResourceDB.INDEX_PIC_START_PT:
				imageFile = ResourcePack.PIC_START_PT;
				offset = ResourceDB.OFFSET_PIC_START_PT;
				size = ResourceDB.SIZE_PIC_START_PT;
				break;
				
			case ResourceDB.INDEX_PIC_START_EN:
				imageFile = ResourcePack.PIC_START_EN;
				offset = ResourceDB.OFFSET_PIC_START_EN;
				size = ResourceDB.SIZE_PIC_START_EN;
				break;
				
			case ResourceDB.INDEX_PIC_START_DE:
				imageFile = ResourcePack.PIC_START_DE;
				offset = ResourceDB.OFFSET_PIC_START_DE;
				size = ResourceDB.SIZE_PIC_START_DE;
				break;
				
			case ResourceDB.INDEX_PIC_START_ES:
				imageFile = ResourcePack.PIC_START_ES;
				offset = ResourceDB.OFFSET_PIC_START_ES;
				size = ResourceDB.SIZE_PIC_START_ES;
				break;
				
			case ResourceDB.INDEX_PIC_START_FR:
				imageFile = ResourcePack.PIC_START_FR;
				offset = ResourceDB.OFFSET_PIC_START_FR;
				size = ResourceDB.SIZE_PIC_START_FR;
				break;
				
			case ResourceDB.INDEX_PIC_START_IT:
				imageFile = ResourcePack.PIC_START_IT;
				offset = ResourceDB.OFFSET_PIC_START_IT;
				size = ResourceDB.SIZE_PIC_START_IT;
				break;
				
			case ResourceDB.INDEX_PIC_START_0A:
				imageFile = ResourcePack.PIC_START_0A;
				offset = ResourceDB.OFFSET_PIC_START_0A;
				size = ResourceDB.SIZE_PIC_START_0A;
				break;
				
			case ResourceDB.INDEX_PIC_START_0B:
				imageFile = ResourcePack.PIC_START_0B;
				offset = ResourceDB.OFFSET_PIC_START_0B;
				size = ResourceDB.SIZE_PIC_START_0B;
				break;
				
			case ResourceDB.INDEX_PIC_START_0C:
				imageFile = ResourcePack.PIC_START_0C;
				offset = ResourceDB.OFFSET_PIC_START_0C;
				size = ResourceDB.SIZE_PIC_START_0C;
				break;
				
			case ResourceDB.INDEX_PIC_START_0D:
				imageFile = ResourcePack.PIC_START_0D;
				offset = ResourceDB.OFFSET_PIC_START_0D;
				size = ResourceDB.SIZE_PIC_START_0D;
				break;
				
			case ResourceDB.INDEX_PIC_START_01:
				imageFile = ResourcePack.PIC_START_01;
				offset = ResourceDB.OFFSET_PIC_START_01;
				size = ResourceDB.SIZE_PIC_START_01;
				break;
				
			case ResourceDB.INDEX_PIC_START_02:
				imageFile = ResourcePack.PIC_START_02;
				offset = ResourceDB.OFFSET_PIC_START_02;
				size = ResourceDB.SIZE_PIC_START_02;
				break;
				
			case ResourceDB.INDEX_PIC_START_03:
				imageFile = ResourcePack.PIC_START_03;
				offset = ResourceDB.OFFSET_PIC_START_03;
				size = ResourceDB.SIZE_PIC_START_03;
				break;
				
			case ResourceDB.INDEX_PIC_START_04:
				imageFile = ResourcePack.PIC_START_04;
				offset = ResourceDB.OFFSET_PIC_START_04;
				size = ResourceDB.SIZE_PIC_START_04;
				break;
				
			case ResourceDB.INDEX_PIC_START_05:
				imageFile = ResourcePack.PIC_START_05;
				offset = ResourceDB.OFFSET_PIC_START_05;
				size = ResourceDB.SIZE_PIC_START_05;
				break;
				
			case ResourceDB.INDEX_PIC_START_06:
				imageFile = ResourcePack.PIC_START_06;
				offset = ResourceDB.OFFSET_PIC_START_06;
				size = ResourceDB.SIZE_PIC_START_06;
				break;
				
			case ResourceDB.INDEX_PIC_START_07:
				imageFile = ResourcePack.PIC_START_07;
				offset = ResourceDB.OFFSET_PIC_START_07;
				size = ResourceDB.SIZE_PIC_START_07;
				break;
				
			case ResourceDB.INDEX_PIC_START_08:
				imageFile = ResourcePack.PIC_START_08;
				offset = ResourceDB.OFFSET_PIC_START_08;
				size = ResourceDB.SIZE_PIC_START_08;
				break;
				
			case ResourceDB.INDEX_PIC_START_09:
				imageFile = ResourcePack.PIC_START_09;
				offset = ResourceDB.OFFSET_PIC_START_09;
				size = ResourceDB.SIZE_PIC_START_09;
				break;
				
			case ResourceDB.INDEX_PIC_START_10:
				imageFile = ResourcePack.PIC_START_10;
				offset = ResourceDB.OFFSET_PIC_START_10;
				size = ResourceDB.SIZE_PIC_START_10;
				break;
				
			case ResourceDB.INDEX_PIC_START_11:
				imageFile = ResourcePack.PIC_START_11;
				offset = ResourceDB.OFFSET_PIC_START_11;
				size = ResourceDB.SIZE_PIC_START_11;
				break;
				
			case ResourceDB.INDEX_PIC_START_12:
				imageFile = ResourcePack.PIC_START_12;
				offset = ResourceDB.OFFSET_PIC_START_12;
				size = ResourceDB.SIZE_PIC_START_12;
				break;
				
			case ResourceDB.INDEX_PIC_START_13:
				imageFile = ResourcePack.PIC_START_13;
				offset = ResourceDB.OFFSET_PIC_START_13;
				size = ResourceDB.SIZE_PIC_START_13;
				break;
				
			case ResourceDB.INDEX_PIC_START_14:
				imageFile = ResourcePack.PIC_START_14;
				offset = ResourceDB.OFFSET_PIC_START_14;
				size = ResourceDB.SIZE_PIC_START_14;
				break;
				
			case ResourceDB.INDEX_PIC_START_15:
				imageFile = ResourcePack.PIC_START_15;
				offset = ResourceDB.OFFSET_PIC_START_15;
				size = ResourceDB.SIZE_PIC_START_15;
				break;
				
			case ResourceDB.INDEX_PIC_START_16:
				imageFile = ResourcePack.PIC_START_16;
				offset = ResourceDB.OFFSET_PIC_START_16;
				size = ResourceDB.SIZE_PIC_START_16;
				break;
				
			case ResourceDB.INDEX_PIC_START_17:
				imageFile = ResourcePack.PIC_START_17;
				offset = ResourceDB.OFFSET_PIC_START_17;
				size = ResourceDB.SIZE_PIC_START_17;
				break;
				
			case ResourceDB.INDEX_PIC_START_18:
				imageFile = ResourcePack.PIC_START_18;
				offset = ResourceDB.OFFSET_PIC_START_18;
				size = ResourceDB.SIZE_PIC_START_18;
				break;
				
			case ResourceDB.INDEX_PIC_START_19:
				imageFile = ResourcePack.PIC_START_19;
				offset = ResourceDB.OFFSET_PIC_START_19;
				size = ResourceDB.SIZE_PIC_START_19;
				break;
				
			case ResourceDB.INDEX_PIC_START_20:
				imageFile = ResourcePack.PIC_START_20;
				offset = ResourceDB.OFFSET_PIC_START_20;
				size = ResourceDB.SIZE_PIC_START_20;
				break;
				
			case ResourceDB.INDEX_PIC_START_21:
				imageFile = ResourcePack.PIC_START_21;
				offset = ResourceDB.OFFSET_PIC_START_21;
				size = ResourceDB.SIZE_PIC_START_21;
				break;
				
			case ResourceDB.INDEX_PIC_START_22:
				imageFile = ResourcePack.PIC_START_22;
				offset = ResourceDB.OFFSET_PIC_START_22;
				size = ResourceDB.SIZE_PIC_START_22;
				break;
				
			case ResourceDB.INDEX_PIC_START_23:
				imageFile = ResourcePack.PIC_START_23;
				offset = ResourceDB.OFFSET_PIC_START_23;
				size = ResourceDB.SIZE_PIC_START_23;
				break;
				
			case ResourceDB.INDEX_PIC_START_24:
				imageFile = ResourcePack.PIC_START_24;
				offset = ResourceDB.OFFSET_PIC_START_24;
				size = ResourceDB.SIZE_PIC_START_24;
				break;
				
			case ResourceDB.INDEX_PIC_START_25:
				imageFile = ResourcePack.PIC_START_25;
				offset = ResourceDB.OFFSET_PIC_START_25;
				size = ResourceDB.SIZE_PIC_START_25;
				break;
				
			case ResourceDB.INDEX_PIC_START_26:
				imageFile = ResourcePack.PIC_START_26;
				offset = ResourceDB.OFFSET_PIC_START_26;
				size = ResourceDB.SIZE_PIC_START_26;
				break;
				
			case ResourceDB.INDEX_PIC_START_27:
				imageFile = ResourcePack.PIC_START_27;
				offset = ResourceDB.OFFSET_PIC_START_27;
				size = ResourceDB.SIZE_PIC_START_27;
				break;
				
			case ResourceDB.INDEX_PIC_START_28:
				imageFile = ResourcePack.PIC_START_28;
				offset = ResourceDB.OFFSET_PIC_START_28;
				size = ResourceDB.SIZE_PIC_START_28;
				break;
				
			case ResourceDB.INDEX_PIC_START_29:
				imageFile = ResourcePack.PIC_START_29;
				offset = ResourceDB.OFFSET_PIC_START_29;
				size = ResourceDB.SIZE_PIC_START_29;
				break;
				
			case ResourceDB.INDEX_PIC_START_30:
				imageFile = ResourcePack.PIC_START_30;
				offset = ResourceDB.OFFSET_PIC_START_30;
				size = ResourceDB.SIZE_PIC_START_30;
				break;
				
			case ResourceDB.INDEX_PIC_START_31:
				imageFile = ResourcePack.PIC_START_31;
				offset = ResourceDB.OFFSET_PIC_START_31;
				size = ResourceDB.SIZE_PIC_START_31;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_PT:
				imageFile = ResourcePack.PIC_ABOUT_PT;
				offset = ResourceDB.OFFSET_PIC_ABOUT_PT;
				size = ResourceDB.SIZE_PIC_ABOUT_PT;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_EN:
				imageFile = ResourcePack.PIC_ABOUT_EN;
				offset = ResourceDB.OFFSET_PIC_ABOUT_EN;
				size = ResourceDB.SIZE_PIC_ABOUT_EN;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_DE:
				imageFile = ResourcePack.PIC_ABOUT_DE;
				offset = ResourceDB.OFFSET_PIC_ABOUT_DE;
				size = ResourceDB.SIZE_PIC_ABOUT_DE;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_ES:
				imageFile = ResourcePack.PIC_ABOUT_ES;
				offset = ResourceDB.OFFSET_PIC_ABOUT_ES;
				size = ResourceDB.SIZE_PIC_ABOUT_ES;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_FR:
				imageFile = ResourcePack.PIC_ABOUT_FR;
				offset = ResourceDB.OFFSET_PIC_ABOUT_FR;
				size = ResourceDB.SIZE_PIC_ABOUT_FR;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_IT:
				imageFile = ResourcePack.PIC_ABOUT_IT;
				offset = ResourceDB.OFFSET_PIC_ABOUT_IT;
				size = ResourceDB.SIZE_PIC_ABOUT_IT;
				break;
				
			case ResourceDB.INDEX_PIC_ABOUT_01:
				imageFile = ResourcePack.PIC_ABOUT_01;
				offset = ResourceDB.OFFSET_PIC_ABOUT_01;
				size = ResourceDB.SIZE_PIC_ABOUT_01;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_PT:
				imageFile = ResourcePack.PIC_HELP_PT;
				offset = ResourceDB.OFFSET_PIC_HELP_PT;
				size = ResourceDB.SIZE_PIC_HELP_PT;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_EN:
				imageFile = ResourcePack.PIC_HELP_EN;
				offset = ResourceDB.OFFSET_PIC_HELP_EN;
				size = ResourceDB.SIZE_PIC_HELP_EN;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_DE:
				imageFile = ResourcePack.PIC_HELP_DE;
				offset = ResourceDB.OFFSET_PIC_HELP_DE;
				size = ResourceDB.SIZE_PIC_HELP_DE;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_ES:
				imageFile = ResourcePack.PIC_HELP_ES;
				offset = ResourceDB.OFFSET_PIC_HELP_ES;
				size = ResourceDB.SIZE_PIC_HELP_ES;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_FR:
				imageFile = ResourcePack.PIC_HELP_FR;
				offset = ResourceDB.OFFSET_PIC_HELP_FR;
				size = ResourceDB.SIZE_PIC_HELP_FR;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_IT:
				imageFile = ResourcePack.PIC_HELP_IT;
				offset = ResourceDB.OFFSET_PIC_HELP_IT;
				size = ResourceDB.SIZE_PIC_HELP_IT;
				break;
				
			case ResourceDB.INDEX_PIC_HELP_01:
				imageFile = ResourcePack.PIC_HELP_01;
				offset = ResourceDB.OFFSET_PIC_HELP_01;
				size = ResourceDB.SIZE_PIC_HELP_01;
				break;
				
		}

		if(imageFile == null) {
			
			String filePath = "";
			
			try {
				filePath = extractFromPackage(offset, size);
			}
			catch(Exception ex) {
				ex.printStackTrace(System.err);
			}
			
			imageFile = new File(filePath);

			switch(index) {
				case ResourceDB.INDEX_PIC_FF1:		ResourcePack.PIC_FF1 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF1_2:	ResourcePack.PIC_FF1_2 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF1_3:	ResourcePack.PIC_FF1_3 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF2:		ResourcePack.PIC_FF2 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF2_2:	ResourcePack.PIC_FF2_2 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF3:		ResourcePack.PIC_FF3 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF4:		ResourcePack.PIC_FF4 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF4_2:	ResourcePack.PIC_FF4_2 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF4_3:	ResourcePack.PIC_FF4_3 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF5:		ResourcePack.PIC_FF5 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF6:		ResourcePack.PIC_FF6 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF7:		ResourcePack.PIC_FF7 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF7_2:	ResourcePack.PIC_FF7_2 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF7_3:	ResourcePack.PIC_FF7_3 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF7_4:	ResourcePack.PIC_FF7_4 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF7_5:	ResourcePack.PIC_FF7_5 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF8:		ResourcePack.PIC_FF8 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF9:		ResourcePack.PIC_FF9 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF10:		ResourcePack.PIC_FF10 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF10_2:	ResourcePack.PIC_FF10_2 = imageFile;	break;
				case ResourceDB.INDEX_PIC_FF11:		ResourcePack.PIC_FF11 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF12:		ResourcePack.PIC_FF12 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF12_2:	ResourcePack.PIC_FF12_2 = imageFile;	break;
				case ResourceDB.INDEX_PIC_FF13:		ResourcePack.PIC_FF13 = imageFile;		break;
				case ResourceDB.INDEX_PIC_FF13_2:	ResourcePack.PIC_FF13_2 = imageFile;	break;
				case ResourceDB.INDEX_PIC_FF13_3:	ResourcePack.PIC_FF13_3 = imageFile;	break;
				case ResourceDB.INDEX_PIC_DDFF:		ResourcePack.PIC_DDFF = imageFile;		break;
				case ResourceDB.INDEX_PIC_DDFF_2:	ResourcePack.PIC_DDFF_2 = imageFile;	break;
				case ResourceDB.INDEX_PIC_DDFF_3:	ResourcePack.PIC_DDFF_3 = imageFile;	break;
				case ResourceDB.INDEX_PIC_DDFF_4:	ResourcePack.PIC_DDFF_4 = imageFile;	break;
				case ResourceDB.INDEX_PIC_SPLASH:	ResourcePack.PIC_SPLASH = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_PT:	ResourcePack.PIC_START_PT = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_EN:	ResourcePack.PIC_START_EN = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_DE:	ResourcePack.PIC_START_DE = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_ES:	ResourcePack.PIC_START_ES = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_FR:	ResourcePack.PIC_START_FR = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_IT:	ResourcePack.PIC_START_IT = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_0A:	ResourcePack.PIC_START_0A = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_0B:	ResourcePack.PIC_START_0B = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_0C:	ResourcePack.PIC_START_0C = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_0D:	ResourcePack.PIC_START_0D = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_01:	ResourcePack.PIC_START_01 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_02:	ResourcePack.PIC_START_02 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_03:	ResourcePack.PIC_START_03 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_04:	ResourcePack.PIC_START_04 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_05:	ResourcePack.PIC_START_05 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_06:	ResourcePack.PIC_START_06 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_07:	ResourcePack.PIC_START_07 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_08:	ResourcePack.PIC_START_08 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_09:	ResourcePack.PIC_START_09 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_10:	ResourcePack.PIC_START_10 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_11:	ResourcePack.PIC_START_11 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_12:	ResourcePack.PIC_START_12 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_13:	ResourcePack.PIC_START_13 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_14:	ResourcePack.PIC_START_14 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_15:	ResourcePack.PIC_START_15 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_16:	ResourcePack.PIC_START_16 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_17:	ResourcePack.PIC_START_17 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_18:	ResourcePack.PIC_START_18 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_19:	ResourcePack.PIC_START_19 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_20:	ResourcePack.PIC_START_20 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_21:	ResourcePack.PIC_START_21 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_22:	ResourcePack.PIC_START_22 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_23:	ResourcePack.PIC_START_23 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_24:	ResourcePack.PIC_START_24 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_25:	ResourcePack.PIC_START_25 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_26:	ResourcePack.PIC_START_26 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_27:	ResourcePack.PIC_START_27 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_28:	ResourcePack.PIC_START_28 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_29:	ResourcePack.PIC_START_29 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_30:	ResourcePack.PIC_START_30 = imageFile;	break;
				case ResourceDB.INDEX_PIC_START_31:	ResourcePack.PIC_START_31 = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_PT:	ResourcePack.PIC_ABOUT_PT = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_EN:	ResourcePack.PIC_ABOUT_EN = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_DE:	ResourcePack.PIC_ABOUT_DE = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_ES:	ResourcePack.PIC_ABOUT_ES = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_FR:	ResourcePack.PIC_ABOUT_FR = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_IT:	ResourcePack.PIC_ABOUT_IT = imageFile;	break;
				case ResourceDB.INDEX_PIC_ABOUT_01:	ResourcePack.PIC_ABOUT_01 = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_PT:	ResourcePack.PIC_HELP_PT = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_EN:	ResourcePack.PIC_HELP_EN = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_DE:	ResourcePack.PIC_HELP_DE = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_ES:	ResourcePack.PIC_HELP_ES = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_FR:	ResourcePack.PIC_HELP_FR = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_IT:	ResourcePack.PIC_HELP_IT = imageFile;	break;
				case ResourceDB.INDEX_PIC_HELP_01:	ResourcePack.PIC_HELP_01 = imageFile;	break;
			}

		}

		return imageFile;

	}

	public static ImageIcon loadIconResource(int index) {

		int size = 0;
		long offset = 0L;
		ImageIcon iconFile = null;

		switch(index) {
			
			case ResourceDB.INDEX_ICON_SUCCESS:
				iconFile = ResourcePack.ICON_SUCCESS;
				offset = ResourceDB.OFFSET_ICON_SUCCESS;
				size = ResourceDB.SIZE_ICON_SUCCESS;
				break;
				
			case ResourceDB.INDEX_ICON_SUCCESS_BIG:
				iconFile = ResourcePack.ICON_SUCCESS_BIG;
				offset = ResourceDB.OFFSET_ICON_SUCCESS_BIG;
				size = ResourceDB.SIZE_ICON_SUCCESS_BIG;
				break;
				
			case ResourceDB.INDEX_ICON_INFORMATION:
				iconFile = ResourcePack.ICON_INFORMATION;
				offset = ResourceDB.OFFSET_ICON_INFORMATION;
				size = ResourceDB.SIZE_ICON_INFORMATION;
				break;
				
			case ResourceDB.INDEX_ICON_INFORMATION_BIG:
				iconFile = ResourcePack.ICON_INFORMATION_BIG;
				offset = ResourceDB.OFFSET_ICON_INFORMATION_BIG;
				size = ResourceDB.SIZE_ICON_INFORMATION_BIG;
				break;
				
			case ResourceDB.INDEX_ICON_QUESTION:
				iconFile = ResourcePack.ICON_QUESTION;
				offset = ResourceDB.OFFSET_ICON_QUESTION;
				size = ResourceDB.SIZE_ICON_QUESTION;
				break;
				
			case ResourceDB.INDEX_ICON_QUESTION_BIG:
				iconFile = ResourcePack.ICON_QUESTION_BIG;
				offset = ResourceDB.OFFSET_ICON_QUESTION_BIG;
				size = ResourceDB.SIZE_ICON_QUESTION_BIG;
				break;
				
			case ResourceDB.INDEX_ICON_WARNING:
				iconFile = ResourcePack.ICON_WARNING;
				offset = ResourceDB.OFFSET_ICON_WARNING;
				size = ResourceDB.SIZE_ICON_WARNING;
				break;
				
			case ResourceDB.INDEX_ICON_WARNING_BIG:
				iconFile = ResourcePack.ICON_WARNING_BIG;
				offset = ResourceDB.OFFSET_ICON_WARNING_BIG;
				size = ResourceDB.SIZE_ICON_WARNING_BIG;
				break;
				
			case ResourceDB.INDEX_ICON_ERROR:
				iconFile = ResourcePack.ICON_ERROR;
				offset = ResourceDB.OFFSET_ICON_ERROR;
				size = ResourceDB.SIZE_ICON_ERROR;
				break;
				
			case ResourceDB.INDEX_ICON_ERROR_BIG:
				iconFile = ResourcePack.ICON_ERROR_BIG;
				offset = ResourceDB.OFFSET_ICON_ERROR_BIG;
				size = ResourceDB.SIZE_ICON_ERROR_BIG;
				break;
				
			case ResourceDB.INDEX_ICON_FLAG_PT:
				iconFile = ResourcePack.ICON_FLAG_PT;
				offset = ResourceDB.OFFSET_ICON_FLAG_PT;
				size = ResourceDB.SIZE_ICON_FLAG_PT;
				break;
				
			case ResourceDB.INDEX_ICON_FLAG_EN:
				iconFile = ResourcePack.ICON_FLAG_EN;
				offset = ResourceDB.OFFSET_ICON_FLAG_EN;
				size = ResourceDB.SIZE_ICON_FLAG_EN;
				break;
				
			case ResourceDB.INDEX_ICON_FLAG_DE:
				iconFile = ResourcePack.ICON_FLAG_DE;
				offset = ResourceDB.OFFSET_ICON_FLAG_DE;
				size = ResourceDB.SIZE_ICON_FLAG_DE;
				break;
				
			case ResourceDB.INDEX_ICON_FLAG_ES:
				iconFile = ResourcePack.ICON_FLAG_ES;
				offset = ResourceDB.OFFSET_ICON_FLAG_ES;
				size = ResourceDB.SIZE_ICON_FLAG_ES;
				break;
				
			case ResourceDB.INDEX_ICON_FLAG_FR:
				iconFile = ResourcePack.ICON_FLAG_FR;
				offset = ResourceDB.OFFSET_ICON_FLAG_FR;
				size = ResourceDB.SIZE_ICON_FLAG_FR;
				break;
				
			case ResourceDB.INDEX_ICON_FLAG_IT:
				iconFile = ResourcePack.ICON_FLAG_IT;
				offset = ResourceDB.OFFSET_ICON_FLAG_IT;
				size = ResourceDB.SIZE_ICON_FLAG_IT;
				break;
				
			case ResourceDB.INDEX_ICON_EXPORT:
				iconFile = ResourcePack.ICON_EXPORT;
				offset = ResourceDB.OFFSET_ICON_EXPORT;
				size = ResourceDB.SIZE_ICON_EXPORT;
				break;
				
			case ResourceDB.INDEX_ICON_EXPORT_BIG:
				iconFile = ResourcePack.ICON_EXPORT_BIG;
				offset = ResourceDB.OFFSET_ICON_EXPORT_BIG;
				size = ResourceDB.SIZE_ICON_EXPORT_BIG;
				break;
				
			case ResourceDB.INDEX_ICON_SAVE:
				iconFile = ResourcePack.ICON_SAVE;
				offset = ResourceDB.OFFSET_ICON_SAVE;
				size = ResourceDB.SIZE_ICON_SAVE;
				break;
				
			case ResourceDB.INDEX_ICON_LOAD:
				iconFile = ResourcePack.ICON_LOAD;
				offset = ResourceDB.OFFSET_ICON_LOAD;
				size = ResourceDB.SIZE_ICON_LOAD;
				break;
				
			case ResourceDB.INDEX_ICON_RESET:
				iconFile = ResourcePack.ICON_RESET;
				offset = ResourceDB.OFFSET_ICON_RESET;
				size = ResourceDB.SIZE_ICON_RESET;
				break;
				
			case ResourceDB.INDEX_ICON_ABOUT:
				iconFile = ResourcePack.ICON_ABOUT;
				offset = ResourceDB.OFFSET_ICON_ABOUT;
				size = ResourceDB.SIZE_ICON_ABOUT;
				break;
				
			case ResourceDB.INDEX_ICON_EXIT:
				iconFile = ResourcePack.ICON_EXIT;
				offset = ResourceDB.OFFSET_ICON_EXIT;
				size = ResourceDB.SIZE_ICON_EXIT;
				break;
				
			case ResourceDB.INDEX_ICON_THEME:
				iconFile = ResourcePack.ICON_THEME;
				offset = ResourceDB.OFFSET_ICON_THEME;
				size = ResourceDB.SIZE_ICON_THEME;
				break;
				
			case ResourceDB.INDEX_ICON_THEME_DEFAULT:
				iconFile = ResourcePack.ICON_THEME_DEFAULT;
				offset = ResourceDB.OFFSET_ICON_THEME_DEFAULT;
				size = ResourceDB.SIZE_ICON_THEME_DEFAULT;
				break;
				
			case ResourceDB.INDEX_ICON_THEME_DARK:
				iconFile = ResourcePack.ICON_THEME_DARK;
				offset = ResourceDB.OFFSET_ICON_THEME_DARK;
				size = ResourceDB.SIZE_ICON_THEME_DARK;
				break;
				
			case ResourceDB.INDEX_ICON_THEME_COSMOS:
				iconFile = ResourcePack.ICON_THEME_COSMOS;
				offset = ResourceDB.OFFSET_ICON_THEME_COSMOS;
				size = ResourceDB.SIZE_ICON_THEME_COSMOS;
				break;
				
			case ResourceDB.INDEX_ICON_THEME_CHAOS:
				iconFile = ResourcePack.ICON_THEME_CHAOS;
				offset = ResourceDB.OFFSET_ICON_THEME_CHAOS;
				size = ResourceDB.SIZE_ICON_THEME_CHAOS;
				break;
				
			case ResourceDB.INDEX_ICON_THEME_CUSTOM:
				iconFile = ResourcePack.ICON_THEME_CUSTOM;
				offset = ResourceDB.OFFSET_ICON_THEME_CUSTOM;
				size = ResourceDB.SIZE_ICON_THEME_CUSTOM;
				break;
				
			case ResourceDB.INDEX_ICON_SOUND_MAX:
				iconFile = ResourcePack.ICON_SOUND_MAX;
				offset = ResourceDB.OFFSET_ICON_SOUND_MAX;
				size = ResourceDB.SIZE_ICON_SOUND_MAX;
				break;
				
			case ResourceDB.INDEX_ICON_SOUND_MIN:
				iconFile = ResourcePack.ICON_SOUND_MIN;
				offset = ResourceDB.OFFSET_ICON_SOUND_MIN;
				size = ResourceDB.SIZE_ICON_SOUND_MIN;
				break;
				
			case ResourceDB.INDEX_ICON_SOUND_MUTE:
				iconFile = ResourcePack.ICON_SOUND_MUTE;
				offset = ResourceDB.OFFSET_ICON_SOUND_MUTE;
				size = ResourceDB.SIZE_ICON_SOUND_MUTE;
				break;
				
		}

		if(iconFile == null) {
			
			String filePath = "";
			
			try {
				filePath = extractFromPackage(offset, size);
			}
			catch(Exception ex) {
				ex.printStackTrace(System.err);
			}
			
			iconFile = new ImageIcon(filePath);

			switch(index) {
				case ResourceDB.INDEX_ICON_SUCCESS:			ResourcePack.ICON_SUCCESS = iconFile;			break;
				case ResourceDB.INDEX_ICON_SUCCESS_BIG:		ResourcePack.ICON_SUCCESS_BIG = iconFile;		break;
				case ResourceDB.INDEX_ICON_INFORMATION:		ResourcePack.ICON_INFORMATION = iconFile;		break;
				case ResourceDB.INDEX_ICON_INFORMATION_BIG:	ResourcePack.ICON_INFORMATION_BIG = iconFile;	break;
				case ResourceDB.INDEX_ICON_QUESTION:		ResourcePack.ICON_QUESTION = iconFile;			break;
				case ResourceDB.INDEX_ICON_QUESTION_BIG:	ResourcePack.ICON_QUESTION_BIG = iconFile;		break;
				case ResourceDB.INDEX_ICON_WARNING:			ResourcePack.ICON_WARNING = iconFile;			break;
				case ResourceDB.INDEX_ICON_WARNING_BIG:		ResourcePack.ICON_WARNING_BIG = iconFile;		break;
				case ResourceDB.INDEX_ICON_ERROR:			ResourcePack.ICON_ERROR = iconFile;				break;
				case ResourceDB.INDEX_ICON_ERROR_BIG:		ResourcePack.ICON_ERROR_BIG = iconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_PT:			ResourcePack.ICON_FLAG_PT = iconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_EN:			ResourcePack.ICON_FLAG_EN = iconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_DE:			ResourcePack.ICON_FLAG_DE = iconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_ES:			ResourcePack.ICON_FLAG_ES = iconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_FR:			ResourcePack.ICON_FLAG_FR = iconFile;			break;
				case ResourceDB.INDEX_ICON_FLAG_IT:			ResourcePack.ICON_FLAG_IT = iconFile;			break;
				case ResourceDB.INDEX_ICON_EXPORT:			ResourcePack.ICON_EXPORT = iconFile;			break;
				case ResourceDB.INDEX_ICON_EXPORT_BIG:		ResourcePack.ICON_EXPORT_BIG = iconFile;		break;
				case ResourceDB.INDEX_ICON_SAVE:			ResourcePack.ICON_SAVE = iconFile;				break;
				case ResourceDB.INDEX_ICON_LOAD:			ResourcePack.ICON_LOAD = iconFile;				break;
				case ResourceDB.INDEX_ICON_RESET:			ResourcePack.ICON_RESET = iconFile;				break;
				case ResourceDB.INDEX_ICON_ABOUT:			ResourcePack.ICON_ABOUT = iconFile;				break;
				case ResourceDB.INDEX_ICON_EXIT:			ResourcePack.ICON_EXIT = iconFile;				break;
				case ResourceDB.INDEX_ICON_THEME:			ResourcePack.ICON_THEME = iconFile;				break;
				case ResourceDB.INDEX_ICON_THEME_DEFAULT:	ResourcePack.ICON_THEME_DEFAULT = iconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_DARK:		ResourcePack.ICON_THEME_DARK = iconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_COSMOS:	ResourcePack.ICON_THEME_COSMOS = iconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_CHAOS:		ResourcePack.ICON_THEME_CHAOS = iconFile;		break;
				case ResourceDB.INDEX_ICON_THEME_CUSTOM:	ResourcePack.ICON_THEME_CUSTOM = iconFile;		break;
				case ResourceDB.INDEX_ICON_SOUND_MAX:		ResourcePack.ICON_SOUND_MAX = iconFile;			break;
				case ResourceDB.INDEX_ICON_SOUND_MIN:		ResourcePack.ICON_SOUND_MIN = iconFile;			break;
				case ResourceDB.INDEX_ICON_SOUND_MUTE:		ResourcePack.ICON_SOUND_MUTE = iconFile;		break;

			}

		}

		return iconFile;

	}

	public static File loadSoundResource(int index) {

		int size = 0;
		long offset = 0L;
		File soundFile = null;

		switch(index) {
			
			case ResourceDB.INDEX_SOUND_CURSORMOVE:
				soundFile = ResourcePack.SOUND_CURSORMOVE;
				offset = ResourceDB.OFFSET_SOUND_CURSORMOVE;
				size = ResourceDB.SIZE_SOUND_CURSORMOVE;
				break;
				
			case ResourceDB.INDEX_SOUND_CURSORMOVE_2:
				soundFile = ResourcePack.SOUND_CURSORMOVE_2;
				offset = ResourceDB.OFFSET_SOUND_CURSORMOVE_2;
				size = ResourceDB.SIZE_SOUND_CURSORMOVE_2;
				break;
				
			case ResourceDB.INDEX_SOUND_CURSORMOVE_3:
				soundFile = ResourcePack.SOUND_CURSORMOVE_3;
				offset = ResourceDB.OFFSET_SOUND_CURSORMOVE_3;
				size = ResourceDB.SIZE_SOUND_CURSORMOVE_3;
				break;
				
			case ResourceDB.INDEX_SOUND_CURSORCHOOSE:
				soundFile = ResourcePack.SOUND_CURSORCHOOSE;
				offset = ResourceDB.OFFSET_SOUND_CURSORCHOOSE;
				size = ResourceDB.SIZE_SOUND_CURSORCHOOSE;
				break;
				
			case ResourceDB.INDEX_SOUND_CURSORBACK:
				soundFile = ResourcePack.SOUND_CURSORBACK;
				offset = ResourceDB.OFFSET_SOUND_CURSORBACK;
				size = ResourceDB.SIZE_SOUND_CURSORBACK;
				break;
				
			case ResourceDB.INDEX_SOUND_MENUOPEN:
				soundFile = ResourcePack.SOUND_MENUOPEN;
				offset = ResourceDB.OFFSET_SOUND_MENUOPEN;
				size = ResourceDB.SIZE_SOUND_MENUOPEN;
				break;
				
			case ResourceDB.INDEX_SOUND_MENUCLOSE:
				soundFile = ResourcePack.SOUND_MENUCLOSE;
				offset = ResourceDB.OFFSET_SOUND_MENUCLOSE;
				size = ResourceDB.SIZE_SOUND_MENUCLOSE;
				break;
				
			case ResourceDB.INDEX_SOUND_PAGEROLL:
				soundFile = ResourcePack.SOUND_PAGEROLL;
				offset = ResourceDB.OFFSET_SOUND_PAGEROLL;
				size = ResourceDB.SIZE_SOUND_PAGEROLL;
				break;
				
			case ResourceDB.INDEX_SOUND_PAGEROLL_2:
				soundFile = ResourcePack.SOUND_PAGEROLL_2;
				offset = ResourceDB.OFFSET_SOUND_PAGEROLL_2;
				size = ResourceDB.SIZE_SOUND_PAGEROLL_2;
				break;
				
			case ResourceDB.INDEX_SOUND_WINDOWUP:
				soundFile = ResourcePack.SOUND_WINDOWUP;
				offset = ResourceDB.OFFSET_SOUND_WINDOWUP;
				size = ResourceDB.SIZE_SOUND_WINDOWUP;
				break;
				
			case ResourceDB.INDEX_SOUND_WINDOWUP_2:
				soundFile = ResourcePack.SOUND_WINDOWUP_2;
				offset = ResourceDB.OFFSET_SOUND_WINDOWUP_2;
				size = ResourceDB.SIZE_SOUND_WINDOWUP_2;
				break;
				
			case ResourceDB.INDEX_SOUND_ERROR:
				soundFile = ResourcePack.SOUND_ERROR;
				offset = ResourceDB.OFFSET_SOUND_ERROR;
				size = ResourceDB.SIZE_SOUND_ERROR;
				break;
				
			case ResourceDB.INDEX_SOUND_CHOCOBO:
				soundFile = ResourcePack.SOUND_CHOCOBO;
				offset = ResourceDB.OFFSET_SOUND_CHOCOBO;
				size = ResourceDB.SIZE_SOUND_CHOCOBO;
				break;
				
			case ResourceDB.INDEX_SOUND_MOOGLE:
				soundFile = ResourcePack.SOUND_MOOGLE;
				offset = ResourceDB.OFFSET_SOUND_MOOGLE;
				size = ResourceDB.SIZE_SOUND_MOOGLE;
				break;
				
			case ResourceDB.INDEX_SOUND_MOOGLE_2:
				soundFile = ResourcePack.SOUND_MOOGLE_2;
				offset = ResourceDB.OFFSET_SOUND_MOOGLE_2;
				size = ResourceDB.SIZE_SOUND_MOOGLE_2;
				break;
				
			case ResourceDB.INDEX_SOUND_STAIRS:
				soundFile = ResourcePack.SOUND_STAIRS;
				offset = ResourceDB.OFFSET_SOUND_STAIRS;
				size = ResourceDB.SIZE_SOUND_STAIRS;
				break;
				
			case ResourceDB.INDEX_SOUND_EQUIP:
				soundFile = ResourcePack.SOUND_EQUIP;
				offset = ResourceDB.OFFSET_SOUND_EQUIP;
				size = ResourceDB.SIZE_SOUND_EQUIP;
				break;
				
			case ResourceDB.INDEX_SOUND_UNEQUIP:
				soundFile = ResourcePack.SOUND_UNEQUIP;
				offset = ResourceDB.OFFSET_SOUND_UNEQUIP;
				size = ResourceDB.SIZE_SOUND_UNEQUIP;
				break;
				
		}

		if(soundFile == null) {
			
			String filePath = "";
			
			try {
				filePath = extractFromPackage(offset, size);
			}
			catch(Exception ex) {
				ex.printStackTrace(System.err);
			}
			
			soundFile = new File(filePath);

			switch(index) {
				case ResourceDB.INDEX_SOUND_CURSORMOVE:		ResourcePack.SOUND_CURSORMOVE = soundFile;		break;
				case ResourceDB.INDEX_SOUND_CURSORMOVE_2:	ResourcePack.SOUND_CURSORMOVE_2 = soundFile;	break;
				case ResourceDB.INDEX_SOUND_CURSORMOVE_3:	ResourcePack.SOUND_CURSORMOVE_3 = soundFile;	break;
				case ResourceDB.INDEX_SOUND_CURSORCHOOSE:	ResourcePack.SOUND_CURSORCHOOSE = soundFile;	break;
				case ResourceDB.INDEX_SOUND_CURSORBACK:		ResourcePack.SOUND_CURSORBACK = soundFile;		break;
				case ResourceDB.INDEX_SOUND_MENUOPEN:		ResourcePack.SOUND_MENUOPEN = soundFile;		break;
				case ResourceDB.INDEX_SOUND_MENUCLOSE:		ResourcePack.SOUND_MENUCLOSE = soundFile;		break;
				case ResourceDB.INDEX_SOUND_PAGEROLL:		ResourcePack.SOUND_PAGEROLL = soundFile;		break;
				case ResourceDB.INDEX_SOUND_PAGEROLL_2:		ResourcePack.SOUND_PAGEROLL_2 = soundFile;		break;
				case ResourceDB.INDEX_SOUND_WINDOWUP:		ResourcePack.SOUND_WINDOWUP = soundFile;		break;
				case ResourceDB.INDEX_SOUND_WINDOWUP_2:		ResourcePack.SOUND_WINDOWUP_2 = soundFile;		break;
				case ResourceDB.INDEX_SOUND_ERROR:			ResourcePack.SOUND_ERROR = soundFile;			break;
				case ResourceDB.INDEX_SOUND_CHOCOBO:		ResourcePack.SOUND_CHOCOBO = soundFile;			break;
				case ResourceDB.INDEX_SOUND_MOOGLE:			ResourcePack.SOUND_MOOGLE = soundFile;			break;
				case ResourceDB.INDEX_SOUND_MOOGLE_2:		ResourcePack.SOUND_MOOGLE_2 = soundFile;		break;
				case ResourceDB.INDEX_SOUND_STAIRS:			ResourcePack.SOUND_STAIRS = soundFile;			break;
				case ResourceDB.INDEX_SOUND_EQUIP:			ResourcePack.SOUND_EQUIP = soundFile;			break;
				case ResourceDB.INDEX_SOUND_UNEQUIP:		ResourcePack.SOUND_UNEQUIP = soundFile;			break;
			}

		}

		return soundFile;

	}

	public static void saveTitlesList(ArrayList<JTextField> textFieldAL) throws FileNotFoundException, IOException {

		SimpleDateFormat date_pt = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat date_en = new SimpleDateFormat("MMM dd, yyyy hh:mm a");

		File packageF = new File("RESOURCEPACK.BIN");

		if(!packageF.exists())
			throw new FileNotFoundException();

		RandomAccessFile packageRA = new RandomAccessFile(packageF, "rw");

		packageRA.seek(ResourceDB.OFFSET_LIST);
		
		if(packageF.canWrite()) {

			packageRA.writeBytes(date_pt.format(new Date()) + "\n");
			packageRA.writeBytes(date_en.format(new Date()) + "\n");

			for(JTextField textField : textFieldAL) {
				packageRA.writeBytes(textField.getText() + "\n");
				packageRA.writeBoolean(textField.isEnabled());
				packageRA.writeBoolean(textField.getForeground() == Color.BLACK);
			}

		}

		packageRA.close();

	}

	public static void LoadTitleList(ArrayList<JTextField> textFieldAL, ArrayList<JCheckBox> checkBoxAL, ArrayList<BalloonTip> checkBoxTipAL, StringBuffer time_pt, StringBuffer time_en) throws FileNotFoundException, IOException {

		String title;
		boolean isEnabled;
		boolean isSafe;

		File packageF = new File("RESOURCEPACK.BIN");

		if(!packageF.exists())
			throw new FileNotFoundException();

		RandomAccessFile packageRA = new RandomAccessFile(packageF, "r");

		packageRA.seek(ResourceDB.OFFSET_LIST);
		
		if(packageF.canRead()) {

			time_pt.append(packageRA.readLine());
			time_en.append(packageRA.readLine());

			for(int i = 0; i < textFieldAL.size(); i++) {
				
				title = packageRA.readLine();
				isEnabled = packageRA.readBoolean();
				isSafe = packageRA.readBoolean();

				textFieldAL.get(i).setText(title);
				textFieldAL.get(i).setEnabled(isEnabled);
				checkBoxAL.get(i).setSelected(isEnabled);
				checkBoxTipAL.get(i).setOpacity((isEnabled)? 0.0f : 1.0f);
				textFieldAL.get(i).setForeground((isSafe)? Color.BLACK : Color.RED);
			}

		}

		packageRA.close();

	}

	private static void initFileArrays() {

		fileNameAL = new ArrayList<>();
		fileSizeAL = new ArrayList<>();

		fileNameAL.add(ResourceDB.FILENAME_PIC_FF1);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF1_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF1_3);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF2_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF3);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF4);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF4_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF4_3);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF5);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF6);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF7);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF7_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF7_3);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF7_4);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF7_5);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF8);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF9);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF10);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF10_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF11);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF12);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF12_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF13);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF13_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_FF13_3);
		fileNameAL.add(ResourceDB.FILENAME_PIC_DDFF);
		fileNameAL.add(ResourceDB.FILENAME_PIC_DDFF_2);
		fileNameAL.add(ResourceDB.FILENAME_PIC_DDFF_3);
		fileNameAL.add(ResourceDB.FILENAME_PIC_DDFF_4);
		fileNameAL.add(ResourceDB.FILENAME_PIC_SPLASH);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_PT);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_EN);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_DE);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_ES);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_FR);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_IT);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_0A);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_0B);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_0C);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_0D);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_01);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_02);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_03);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_04);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_05);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_06);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_07);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_08);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_09);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_10);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_11);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_12);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_13);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_14);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_15);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_16);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_17);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_18);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_19);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_20);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_21);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_22);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_23);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_24);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_25);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_26);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_27);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_28);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_29);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_30);
		fileNameAL.add(ResourceDB.FILENAME_PIC_START_31);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_PT);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_EN);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_DE);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_ES);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_FR);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_IT);
		fileNameAL.add(ResourceDB.FILENAME_PIC_ABOUT_01);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_PT);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_EN);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_DE);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_ES);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_FR);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_IT);
		fileNameAL.add(ResourceDB.FILENAME_PIC_HELP_01);
		fileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_PT);
		fileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_EN);
		fileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_DE);
		fileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_ES);
		fileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_FR);
		fileNameAL.add(ResourceDB.FILENAME_ICON_FLAG_IT);
		fileNameAL.add(ResourceDB.FILENAME_ICON_SUCCESS);
		fileNameAL.add(ResourceDB.FILENAME_ICON_SUCCESS_BIG);
		fileNameAL.add(ResourceDB.FILENAME_ICON_INFORMATION);
		fileNameAL.add(ResourceDB.FILENAME_ICON_INFORMATION_BIG);
		fileNameAL.add(ResourceDB.FILENAME_ICON_QUESTION);
		fileNameAL.add(ResourceDB.FILENAME_ICON_QUESTION_BIG);
		fileNameAL.add(ResourceDB.FILENAME_ICON_WARNING);
		fileNameAL.add(ResourceDB.FILENAME_ICON_WARNING_BIG);
		fileNameAL.add(ResourceDB.FILENAME_ICON_ERROR);
		fileNameAL.add(ResourceDB.FILENAME_ICON_ERROR_BIG);
		fileNameAL.add(ResourceDB.FILENAME_ICON_EXPORT);
		fileNameAL.add(ResourceDB.FILENAME_ICON_EXPORT_BIG);
		fileNameAL.add(ResourceDB.FILENAME_ICON_SAVE);
		fileNameAL.add(ResourceDB.FILENAME_ICON_LOAD);
		fileNameAL.add(ResourceDB.FILENAME_ICON_RESET);
		fileNameAL.add(ResourceDB.FILENAME_ICON_ABOUT);
		fileNameAL.add(ResourceDB.FILENAME_ICON_EXIT);
		fileNameAL.add(ResourceDB.FILENAME_ICON_THEME);
		fileNameAL.add(ResourceDB.FILENAME_ICON_THEME_DEFAULT);
		fileNameAL.add(ResourceDB.FILENAME_ICON_THEME_DARK);
		fileNameAL.add(ResourceDB.FILENAME_ICON_THEME_COSMOS);
		fileNameAL.add(ResourceDB.FILENAME_ICON_THEME_CHAOS);
		fileNameAL.add(ResourceDB.FILENAME_ICON_THEME_CUSTOM);
		fileNameAL.add(ResourceDB.FILENAME_ICON_SOUND_MAX);
		fileNameAL.add(ResourceDB.FILENAME_ICON_SOUND_MIN);
		fileNameAL.add(ResourceDB.FILENAME_ICON_SOUND_MUTE);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORMOVE);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORMOVE_2);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORMOVE_3);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORCHOOSE);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_CURSORBACK);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_MENUOPEN);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_MENUCLOSE);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_PAGEROLL);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_PAGEROLL_2);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_WINDOWUP);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_WINDOWUP_2);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_ERROR);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_CHOCOBO);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_MOOGLE);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_MOOGLE_2);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_STAIRS);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_EQUIP);
		fileNameAL.add(ResourceDB.FILENAME_SOUND_UNEQUIP);

		fileSizeAL.add(ResourceDB.SIZE_PIC_FF1);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF1_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF1_3);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF2_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF3);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF4);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF4_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF4_3);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF5);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF6);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF7);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF7_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF7_3);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF7_4);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF7_5);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF8);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF9);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF10);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF10_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF11);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF12);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF12_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF13);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF13_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_FF13_3);
		fileSizeAL.add(ResourceDB.SIZE_PIC_DDFF);
		fileSizeAL.add(ResourceDB.SIZE_PIC_DDFF_2);
		fileSizeAL.add(ResourceDB.SIZE_PIC_DDFF_3);
		fileSizeAL.add(ResourceDB.SIZE_PIC_DDFF_4);
		fileSizeAL.add(ResourceDB.SIZE_PIC_SPLASH);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_PT);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_EN);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_DE);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_ES);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_FR);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_IT);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_0A);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_0B);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_0C);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_0D);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_01);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_02);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_03);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_04);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_05);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_06);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_07);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_08);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_09);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_10);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_11);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_12);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_13);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_14);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_15);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_16);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_17);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_18);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_19);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_20);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_21);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_22);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_23);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_24);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_25);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_26);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_27);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_28);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_29);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_30);
		fileSizeAL.add(ResourceDB.SIZE_PIC_START_31);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_PT);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_EN);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_DE);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_ES);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_FR);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_IT);
		fileSizeAL.add(ResourceDB.SIZE_PIC_ABOUT_01);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_PT);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_EN);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_DE);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_ES);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_FR);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_IT);
		fileSizeAL.add(ResourceDB.SIZE_PIC_HELP_01);
		fileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_PT);
		fileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_EN);
		fileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_DE);
		fileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_ES);
		fileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_FR);
		fileSizeAL.add(ResourceDB.SIZE_ICON_FLAG_IT);
		fileSizeAL.add(ResourceDB.SIZE_ICON_SUCCESS);
		fileSizeAL.add(ResourceDB.SIZE_ICON_SUCCESS_BIG);
		fileSizeAL.add(ResourceDB.SIZE_ICON_INFORMATION);
		fileSizeAL.add(ResourceDB.SIZE_ICON_INFORMATION_BIG);
		fileSizeAL.add(ResourceDB.SIZE_ICON_QUESTION);
		fileSizeAL.add(ResourceDB.SIZE_ICON_QUESTION_BIG);
		fileSizeAL.add(ResourceDB.SIZE_ICON_WARNING);
		fileSizeAL.add(ResourceDB.SIZE_ICON_WARNING_BIG);
		fileSizeAL.add(ResourceDB.SIZE_ICON_ERROR);
		fileSizeAL.add(ResourceDB.SIZE_ICON_ERROR_BIG);
		fileSizeAL.add(ResourceDB.SIZE_ICON_EXPORT);
		fileSizeAL.add(ResourceDB.SIZE_ICON_EXPORT_BIG);
		fileSizeAL.add(ResourceDB.SIZE_ICON_SAVE);
		fileSizeAL.add(ResourceDB.SIZE_ICON_LOAD);
		fileSizeAL.add(ResourceDB.SIZE_ICON_RESET);
		fileSizeAL.add(ResourceDB.SIZE_ICON_ABOUT);
		fileSizeAL.add(ResourceDB.SIZE_ICON_EXIT);
		fileSizeAL.add(ResourceDB.SIZE_ICON_THEME);
		fileSizeAL.add(ResourceDB.SIZE_ICON_THEME_DEFAULT);
		fileSizeAL.add(ResourceDB.SIZE_ICON_THEME_DARK);
		fileSizeAL.add(ResourceDB.SIZE_ICON_THEME_COSMOS);
		fileSizeAL.add(ResourceDB.SIZE_ICON_THEME_CHAOS);
		fileSizeAL.add(ResourceDB.SIZE_ICON_THEME_CUSTOM);
		fileSizeAL.add(ResourceDB.SIZE_ICON_SOUND_MAX);
		fileSizeAL.add(ResourceDB.SIZE_ICON_SOUND_MIN);
		fileSizeAL.add(ResourceDB.SIZE_ICON_SOUND_MUTE);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORMOVE);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORMOVE_2);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORMOVE_3);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORCHOOSE);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_CURSORBACK);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_MENUOPEN);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_MENUCLOSE);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_PAGEROLL);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_PAGEROLL_2);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_WINDOWUP);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_WINDOWUP_2);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_ERROR);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_CHOCOBO);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_MOOGLE);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_MOOGLE_2);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_STAIRS);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_EQUIP);
		fileSizeAL.add(ResourceDB.SIZE_SOUND_UNEQUIP);

	}

}
