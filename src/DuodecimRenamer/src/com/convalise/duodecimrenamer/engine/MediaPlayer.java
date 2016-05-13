
package com.convalise.duodecimrenamer.engine;

import com.convalise.duodecimrenamer.database.ResourceDB;

import javax.media.Manager;
import javax.media.Player;

public abstract class MediaPlayer {

	public static final int WINDOWS_ERROR		= 0;
	public static final int WINDOWS_QUESTION	= 1;
	public static final int WINDOWS_INFORMATION = 2;

	public static final int DISSIDIA_CURSORMOVE		=  3;
	public static final int DISSIDIA_CURSORMOVE_2	=  4;
	public static final int DISSIDIA_CURSORMOVE_3	=  5;
	public static final int DISSIDIA_CURSORCHOOSE	=  6;
	public static final int DISSIDIA_CURSORBACK		=  7;
	public static final int DISSIDIA_MENUOPEN		=  8;
	public static final int DISSIDIA_MENUCLOSE		=  9;
	public static final int DISSIDIA_PAGEROLL		= 10;
	public static final int DISSIDIA_PAGEROLL_2		= 11;
	public static final int DISSIDIA_WINDOWUP		= 12;
	public static final int DISSIDIA_WINDOWUP_2		= 13;
	public static final int DISSIDIA_ERROR			= 14;
	public static final int DISSIDIA_CHOCOBO		= 15;
	public static final int DISSIDIA_MOOGLE			= 16;
	public static final int DISSIDIA_MOOGLE_2		= 17;
	public static final int DISSIDIA_STAIRS			= 18;
	public static final int DISSIDIA_EQUIP			= 19;
	public static final int DISSIDIA_UNEQUIP		= 20;

	private static boolean isMute = false;

	public static void setMute(boolean disabled) {
		isMute = disabled;
	}

	public static void playWindowsSound(int soundIndex) {

		if(isMute) {
			return;
		}

		String soundName = null;
		
		switch(soundIndex) {
			case WINDOWS_ERROR:			soundName = "win.sound.default";		break;
			case WINDOWS_QUESTION:		soundName = "win.sound.exclamation";	break;
			case WINDOWS_INFORMATION:	soundName = "win.sound.asterisk";		break;
		}

		Runnable AudioRunnable = (Runnable) java.awt.Toolkit.getDefaultToolkit().getDesktopProperty(soundName);
		if(AudioRunnable != null) {
			AudioRunnable.run();
		}

	}

	public static void playCustomSound(int soundIndex) {

		if(isMute) {
			return;
		}

		int resourceIndex = -1;
		
		switch(soundIndex) {
			case DISSIDIA_CURSORMOVE:	resourceIndex = ResourceDB.INDEX_SOUND_CURSORMOVE;		break;
			case DISSIDIA_CURSORMOVE_2:	resourceIndex = ResourceDB.INDEX_SOUND_CURSORMOVE_2;	break;
			case DISSIDIA_CURSORMOVE_3:	resourceIndex = ResourceDB.INDEX_SOUND_CURSORMOVE_3;	break;
			case DISSIDIA_CURSORCHOOSE:	resourceIndex = ResourceDB.INDEX_SOUND_CURSORCHOOSE;	break;
			case DISSIDIA_CURSORBACK:	resourceIndex = ResourceDB.INDEX_SOUND_CURSORBACK;		break;
			case DISSIDIA_MENUOPEN:		resourceIndex = ResourceDB.INDEX_SOUND_MENUOPEN;		break;
			case DISSIDIA_MENUCLOSE:	resourceIndex = ResourceDB.INDEX_SOUND_MENUCLOSE;		break;
			case DISSIDIA_PAGEROLL:		resourceIndex = ResourceDB.INDEX_SOUND_PAGEROLL;		break;
			case DISSIDIA_PAGEROLL_2:	resourceIndex = ResourceDB.INDEX_SOUND_PAGEROLL_2;		break;
			case DISSIDIA_WINDOWUP:		resourceIndex = ResourceDB.INDEX_SOUND_WINDOWUP;		break;
			case DISSIDIA_WINDOWUP_2:	resourceIndex = ResourceDB.INDEX_SOUND_WINDOWUP_2;		break;
			case DISSIDIA_ERROR:		resourceIndex = ResourceDB.INDEX_SOUND_ERROR;			break;
			case DISSIDIA_CHOCOBO:		resourceIndex = ResourceDB.INDEX_SOUND_CHOCOBO;			break;
			case DISSIDIA_MOOGLE:		resourceIndex = ResourceDB.INDEX_SOUND_MOOGLE	;		break;
			case DISSIDIA_MOOGLE_2:		resourceIndex = ResourceDB.INDEX_SOUND_MOOGLE_2;		break;
			case DISSIDIA_STAIRS:		resourceIndex = ResourceDB.INDEX_SOUND_STAIRS;			break;
			case DISSIDIA_EQUIP:		resourceIndex = ResourceDB.INDEX_SOUND_EQUIP;			break;
			case DISSIDIA_UNEQUIP:		resourceIndex = ResourceDB.INDEX_SOUND_UNEQUIP;			break;
		}

		if(resourceIndex != -1) {
			new playerThread(resourceIndex).start();
		}

	}

	 private static class playerThread extends Thread {

		private Player wavePlayer;
		public int resourceIndex;

		public playerThread(int resourceIndex) {
			this.resourceIndex = resourceIndex;
		}

		@Override
		public void run() {
			try {
				wavePlayer = Manager.createPlayer(ResourceManager.loadSoundResource(resourceIndex).toURI().toURL());
				wavePlayer.start();
				sleep(3000);
				wavePlayer.close();
			}
			catch(Exception ex) {
				ex.printStackTrace(System.err);
			}
		}
	}

}
