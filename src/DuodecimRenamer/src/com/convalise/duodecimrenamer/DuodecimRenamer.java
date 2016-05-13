
package com.convalise.duodecimrenamer;

import com.convalise.duodecimrenamer.database.MessageDB;
import com.convalise.duodecimrenamer.engine.MediaPlayer;
import com.convalise.duodecimrenamer.engine.ResourceManager;
import com.convalise.duodecimrenamer.ui.MainFrame;
import com.convalise.duodecimrenamer.ui.SplashPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DuodecimRenamer {
	
	public static DuodecimRenamer instance;
	
	public final boolean isPerPixelTranslucencySupported;
	public final Dimension screenSize;

	public MessageDB.Language language;

	private JDialog splashWindow;
	private SplashPanel splashPanel;
	
	public static void main(String[] args) {
		instance = new DuodecimRenamer();
		instance.run();
	}
	
	public DuodecimRenamer() {
		
		language = MessageDB.Language.EN;
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();

		this.isPerPixelTranslucencySupported = graphicsDevice.isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT);
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
	}
	
	public void run() {

		validatePackFile();
		
		showSplahScreen();
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);

		hideSplashScreen();
		
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CHOCOBO);
		
	}

	private void validatePackFile() {

		boolean isPackValid = false;
		
		try {
			isPackValid = ResourceManager.validatePackageFile();
		}
		catch(Exception ex) {
			ex.printStackTrace(System.err);
		}

		if(!isPackValid) {

			String message = "";

			switch(language) {
				case PT: message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_PT; break;
				case EN: message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_EN; break;
				case DE: message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_DE; break;
				case ES: message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_ES; break;
				case FR: message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_FR; break;
				case IT: message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_IT; break;
			}
			
			JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE, null);
			
			System.exit(0);

		}

	}
	
	private void showSplahScreen() {

		splashPanel = new SplashPanel();
		splashPanel.setGradientTranslucent(isPerPixelTranslucencySupported);
		splashPanel.setGradientColors(new Color(0, 0, 0, 0), new Color(0, 0, 0, 0));

		splashWindow = new JDialog();
		splashWindow.setModal(false);
		splashWindow.setResizable(false);
		splashWindow.setAlwaysOnTop(true);
		splashWindow.setType(Window.Type.UTILITY);
		splashWindow.setSize(new Dimension(600, 360));
		splashWindow.setContentPane(splashPanel);
		splashWindow.setLocation((screenSize.width - splashWindow.getSize().width) / 2, (screenSize.height - splashWindow.getSize().height) / 2);
		splashWindow.setUndecorated(true);
		splashWindow.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		splashWindow.setBackground(new Color(0, 0, 0, 0));
		splashWindow.setVisible(true);

	}

	private void hideSplashScreen() {

		splashWindow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		splashWindow.setVisible(false);

	}
	
}
