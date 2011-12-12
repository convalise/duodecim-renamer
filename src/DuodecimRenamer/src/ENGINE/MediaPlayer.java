package ENGINE;

import DATABASE.*;

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

	private static boolean Mute = false;

	public static void setMute(boolean Disable) {
		Mute = Disable;
	}

	public static void PlayWindowsSound(int Sound) {

		Runnable AudioRunnable;
		String SoundName;

		if(Mute)
			return;

		SoundName = null;
		switch(Sound) {
			case WINDOWS_ERROR:			SoundName = "win.sound.default";		break;
			case WINDOWS_QUESTION:		SoundName = "win.sound.exclamation";	break;
			case WINDOWS_INFORMATION:	SoundName = "win.sound.asterisk";		break;
		}

		AudioRunnable = (Runnable) java.awt.Toolkit.getDefaultToolkit().getDesktopProperty(SoundName);
		if(AudioRunnable!=null)
			AudioRunnable.run();

	}

	public static void PlayCustomSound(int Sound) {
		int SoundFile;

		if(Mute)
			return;

		SoundFile = -1;
		switch(Sound) {
			case DISSIDIA_CURSORMOVE:	SoundFile = ResourceDB.INDEX_SOUND_CURSORMOVE;		break;
			case DISSIDIA_CURSORMOVE_2:	SoundFile = ResourceDB.INDEX_SOUND_CURSORMOVE_2;	break;
			case DISSIDIA_CURSORMOVE_3:	SoundFile = ResourceDB.INDEX_SOUND_CURSORMOVE_3;	break;
			case DISSIDIA_CURSORCHOOSE:	SoundFile = ResourceDB.INDEX_SOUND_CURSORCHOOSE;	break;
			case DISSIDIA_CURSORBACK:	SoundFile = ResourceDB.INDEX_SOUND_CURSORBACK;		break;
			case DISSIDIA_MENUOPEN:		SoundFile = ResourceDB.INDEX_SOUND_MENUOPEN;		break;
			case DISSIDIA_MENUCLOSE:	SoundFile = ResourceDB.INDEX_SOUND_MENUCLOSE;		break;
			case DISSIDIA_PAGEROLL:		SoundFile = ResourceDB.INDEX_SOUND_PAGEROLL;		break;
			case DISSIDIA_PAGEROLL_2:	SoundFile = ResourceDB.INDEX_SOUND_PAGEROLL_2;		break;
			case DISSIDIA_WINDOWUP:		SoundFile = ResourceDB.INDEX_SOUND_WINDOWUP;		break;
			case DISSIDIA_WINDOWUP_2:	SoundFile = ResourceDB.INDEX_SOUND_WINDOWUP_2;		break;
			case DISSIDIA_ERROR:		SoundFile = ResourceDB.INDEX_SOUND_ERROR;			break;
			case DISSIDIA_CHOCOBO:		SoundFile = ResourceDB.INDEX_SOUND_CHOCOBO;			break;
			case DISSIDIA_MOOGLE:		SoundFile = ResourceDB.INDEX_SOUND_MOOGLE	;		break;
			case DISSIDIA_MOOGLE_2:		SoundFile = ResourceDB.INDEX_SOUND_MOOGLE_2;		break;
			case DISSIDIA_STAIRS:		SoundFile = ResourceDB.INDEX_SOUND_STAIRS;			break;
			case DISSIDIA_EQUIP:		SoundFile = ResourceDB.INDEX_SOUND_EQUIP;			break;
			case DISSIDIA_UNEQUIP:		SoundFile = ResourceDB.INDEX_SOUND_UNEQUIP;			break;
		}

		if(SoundFile!=-1)
			new PlayerThread(SoundFile).start();

	}

	 private static class PlayerThread extends Thread {

		private Player WAVPlayer;

		public int SoundFile;

		public PlayerThread(int SoundFile) {
			this.SoundFile = SoundFile;
		}

		@Override
		public void run() {
			try {
				WAVPlayer = Manager.createPlayer(ResourceManager.GetSoundFile(SoundFile).toURI().toURL());
				WAVPlayer.start();
				sleep(3000);
				WAVPlayer.close();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

