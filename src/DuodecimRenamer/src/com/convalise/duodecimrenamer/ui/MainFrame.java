package INTERFACE;

import DATABASE.*;
import ENGINE.*;
import LIBRARY.*;

import net.java.balloontip.*;
import net.java.balloontip.BalloonTip.*;
import net.java.balloontip.styles.*;
import net.java.balloontip.utils.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.colorchooser.*;

public class MainFrame extends JFrame {

	private final boolean isPerPixelTranslucencySupported;
	private final Dimension ScreenSize;

	private int Idioma;

	private SplashPanel SplashPnl;
	private AboutPanel AboutPnl;
	private HelpPanel HelpPnl;

	private JDialog SplashWindow;
	private JDialog AboutWindow;
	private JDialog HelpWindow;

	private JColorChooser ColorChooser;

	private BalloonTip CharLimitBalloon;

	private ArrayList<String> OffsetAL;
	private ArrayList<String> TitleAL;
	private ArrayList<JCheckBox> CheckBoxAL;
	private ArrayList<JTextField> TextFieldAL;
	private ArrayList<BalloonTip> CheckBoxTipAL;

	public MainFrame() {

		GraphicsEnvironment GraphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice GraphicsDev = GraphicsEnv.getDefaultScreenDevice();
		isPerPixelTranslucencySupported = GraphicsDev.isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT);

		ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();

//		ResourceManager.GeneratePackFile();
//		System.exit(0);

		ValidatePackFile();

		ShowSplahScreen();

		initComponents();
		initComponentsCustomization();

		setResizable(false);
		requestFocus(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(MessageDB.TITLE_FRAME);
		setLocation((ScreenSize.width-getSize().width)/2,(ScreenSize.height-getSize().height)/2);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent winEvt) {
				SaveTitleList();
			}
		});

		HideSplashScreen();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CHOCOBO);

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_MainPanel = new GradientPanel();
        TP_TabbedPane = new javax.swing.JTabbedPane();
        P_INICIO = new LIBRARY.ImagePanel();
        P_FF1 = new GradientPanel();
        P_FF1_PIC = new LIBRARY.ImagePanel();
        P_FF1_ISO = new javax.swing.JPanel();
        CB_FF1_ISO1 = new javax.swing.JCheckBox();
        TF_FF1_ISO1 = new javax.swing.JTextField();
        CB_FF1_ISO2 = new javax.swing.JCheckBox();
        TF_FF1_ISO2 = new javax.swing.JTextField();
        CB_FF1_ISO3 = new javax.swing.JCheckBox();
        TF_FF1_ISO3 = new javax.swing.JTextField();
        CB_FF1_ISO4 = new javax.swing.JCheckBox();
        TF_FF1_ISO4 = new javax.swing.JTextField();
        CB_FF1_ISO5 = new javax.swing.JCheckBox();
        TF_FF1_ISO5 = new javax.swing.JTextField();
        P_FF1_DLC = new javax.swing.JPanel();
        CB_FF1_DLC1 = new javax.swing.JCheckBox();
        TF_FF1_DLC1 = new javax.swing.JTextField();
        CB_FF1_DLC2 = new javax.swing.JCheckBox();
        TF_FF1_DLC2 = new javax.swing.JTextField();
        CB_FF1_DLC3 = new javax.swing.JCheckBox();
        TF_FF1_DLC3 = new javax.swing.JTextField();
        CB_FF1_DLC4 = new javax.swing.JCheckBox();
        TF_FF1_DLC4 = new javax.swing.JTextField();
        CB_FF1_DLC5 = new javax.swing.JCheckBox();
        TF_FF1_DLC5 = new javax.swing.JTextField();
        P_FF2 = new GradientPanel();
        P_FF2_PIC = new LIBRARY.ImagePanel();
        P_FF2_ISO = new javax.swing.JPanel();
        CB_FF2_ISO1 = new javax.swing.JCheckBox();
        TF_FF2_ISO1 = new javax.swing.JTextField();
        CB_FF2_ISO2 = new javax.swing.JCheckBox();
        TF_FF2_ISO2 = new javax.swing.JTextField();
        CB_FF2_ISO3 = new javax.swing.JCheckBox();
        TF_FF2_ISO3 = new javax.swing.JTextField();
        CB_FF2_ISO4 = new javax.swing.JCheckBox();
        TF_FF2_ISO4 = new javax.swing.JTextField();
        CB_FF2_ISO5 = new javax.swing.JCheckBox();
        TF_FF2_ISO5 = new javax.swing.JTextField();
        P_FF2_DLC = new javax.swing.JPanel();
        CB_FF2_DLC1 = new javax.swing.JCheckBox();
        TF_FF2_DLC1 = new javax.swing.JTextField();
        CB_FF2_DLC2 = new javax.swing.JCheckBox();
        TF_FF2_DLC2 = new javax.swing.JTextField();
        CB_FF2_DLC3 = new javax.swing.JCheckBox();
        TF_FF2_DLC3 = new javax.swing.JTextField();
        P_FF3 = new GradientPanel();
        P_FF3_PIC = new LIBRARY.ImagePanel();
        P_FF3_ISO = new javax.swing.JPanel();
        CB_FF3_ISO1 = new javax.swing.JCheckBox();
        TF_FF3_ISO1 = new javax.swing.JTextField();
        CB_FF3_ISO2 = new javax.swing.JCheckBox();
        TF_FF3_ISO2 = new javax.swing.JTextField();
        CB_FF3_ISO3 = new javax.swing.JCheckBox();
        TF_FF3_ISO3 = new javax.swing.JTextField();
        CB_FF3_ISO4 = new javax.swing.JCheckBox();
        TF_FF3_ISO4 = new javax.swing.JTextField();
        CB_FF3_ISO5 = new javax.swing.JCheckBox();
        TF_FF3_ISO5 = new javax.swing.JTextField();
        P_FF3_DLC = new javax.swing.JPanel();
        CB_FF3_DLC1 = new javax.swing.JCheckBox();
        TF_FF3_DLC1 = new javax.swing.JTextField();
        CB_FF3_DLC2 = new javax.swing.JCheckBox();
        TF_FF3_DLC2 = new javax.swing.JTextField();
        CB_FF3_DLC3 = new javax.swing.JCheckBox();
        TF_FF3_DLC3 = new javax.swing.JTextField();
        P_FF4 = new GradientPanel();
        P_FF4_PIC = new LIBRARY.ImagePanel();
        P_FF4_ISO = new javax.swing.JPanel();
        CB_FF4_ISO1 = new javax.swing.JCheckBox();
        TF_FF4_ISO1 = new javax.swing.JTextField();
        CB_FF4_ISO2 = new javax.swing.JCheckBox();
        TF_FF4_ISO2 = new javax.swing.JTextField();
        CB_FF4_ISO3 = new javax.swing.JCheckBox();
        TF_FF4_ISO3 = new javax.swing.JTextField();
        CB_FF4_ISO4 = new javax.swing.JCheckBox();
        TF_FF4_ISO4 = new javax.swing.JTextField();
        CB_FF4_ISO5 = new javax.swing.JCheckBox();
        TF_FF4_ISO5 = new javax.swing.JTextField();
        P_FF4_DLC = new javax.swing.JPanel();
        CB_FF4_DLC1 = new javax.swing.JCheckBox();
        TF_FF4_DLC1 = new javax.swing.JTextField();
        CB_FF4_DLC2 = new javax.swing.JCheckBox();
        TF_FF4_DLC2 = new javax.swing.JTextField();
        CB_FF4_DLC3 = new javax.swing.JCheckBox();
        TF_FF4_DLC3 = new javax.swing.JTextField();
        P_FF5 = new GradientPanel();
        P_FF5_PIC = new LIBRARY.ImagePanel();
        P_FF5_ISO = new javax.swing.JPanel();
        CB_FF5_ISO1 = new javax.swing.JCheckBox();
        TF_FF5_ISO1 = new javax.swing.JTextField();
        CB_FF5_ISO2 = new javax.swing.JCheckBox();
        TF_FF5_ISO2 = new javax.swing.JTextField();
        CB_FF5_ISO3 = new javax.swing.JCheckBox();
        TF_FF5_ISO3 = new javax.swing.JTextField();
        CB_FF5_ISO4 = new javax.swing.JCheckBox();
        TF_FF5_ISO4 = new javax.swing.JTextField();
        CB_FF5_ISO5 = new javax.swing.JCheckBox();
        TF_FF5_ISO5 = new javax.swing.JTextField();
        P_FF5_DLC = new javax.swing.JPanel();
        CB_FF5_DLC1 = new javax.swing.JCheckBox();
        TF_FF5_DLC1 = new javax.swing.JTextField();
        CB_FF5_DLC2 = new javax.swing.JCheckBox();
        TF_FF5_DLC2 = new javax.swing.JTextField();
        CB_FF5_DLC3 = new javax.swing.JCheckBox();
        TF_FF5_DLC3 = new javax.swing.JTextField();
        P_FF6 = new GradientPanel();
        P_FF6_PIC = new LIBRARY.ImagePanel();
        P_FF6_ISO = new javax.swing.JPanel();
        CB_FF6_ISO1 = new javax.swing.JCheckBox();
        TF_FF6_ISO1 = new javax.swing.JTextField();
        CB_FF6_ISO2 = new javax.swing.JCheckBox();
        TF_FF6_ISO2 = new javax.swing.JTextField();
        CB_FF6_ISO3 = new javax.swing.JCheckBox();
        TF_FF6_ISO3 = new javax.swing.JTextField();
        CB_FF6_ISO4 = new javax.swing.JCheckBox();
        TF_FF6_ISO4 = new javax.swing.JTextField();
        CB_FF6_ISO5 = new javax.swing.JCheckBox();
        TF_FF6_ISO5 = new javax.swing.JTextField();
        P_FF6_DLC = new javax.swing.JPanel();
        CB_FF6_DLC1 = new javax.swing.JCheckBox();
        TF_FF6_DLC1 = new javax.swing.JTextField();
        CB_FF6_DLC2 = new javax.swing.JCheckBox();
        TF_FF6_DLC2 = new javax.swing.JTextField();
        CB_FF6_DLC3 = new javax.swing.JCheckBox();
        TF_FF6_DLC3 = new javax.swing.JTextField();
        P_FF7 = new GradientPanel();
        P_FF7_PIC = new LIBRARY.ImagePanel();
        P_FF7_ISO = new javax.swing.JPanel();
        CB_FF7_ISO1 = new javax.swing.JCheckBox();
        TF_FF7_ISO1 = new javax.swing.JTextField();
        CB_FF7_ISO2 = new javax.swing.JCheckBox();
        TF_FF7_ISO2 = new javax.swing.JTextField();
        CB_FF7_ISO3 = new javax.swing.JCheckBox();
        TF_FF7_ISO3 = new javax.swing.JTextField();
        CB_FF7_ISO4 = new javax.swing.JCheckBox();
        TF_FF7_ISO4 = new javax.swing.JTextField();
        CB_FF7_ISO5 = new javax.swing.JCheckBox();
        TF_FF7_ISO5 = new javax.swing.JTextField();
        P_FF7_DLC = new javax.swing.JPanel();
        CB_FF7_DLC1 = new javax.swing.JCheckBox();
        TF_FF7_DLC1 = new javax.swing.JTextField();
        CB_FF7_DLC2 = new javax.swing.JCheckBox();
        TF_FF7_DLC2 = new javax.swing.JTextField();
        CB_FF7_DLC3 = new javax.swing.JCheckBox();
        TF_FF7_DLC3 = new javax.swing.JTextField();
        P_FF8 = new GradientPanel();
        P_FF8_PIC = new LIBRARY.ImagePanel();
        P_FF8_ISO = new javax.swing.JPanel();
        CB_FF8_ISO1 = new javax.swing.JCheckBox();
        TF_FF8_ISO1 = new javax.swing.JTextField();
        CB_FF8_ISO2 = new javax.swing.JCheckBox();
        TF_FF8_ISO2 = new javax.swing.JTextField();
        CB_FF8_ISO3 = new javax.swing.JCheckBox();
        TF_FF8_ISO3 = new javax.swing.JTextField();
        CB_FF8_ISO4 = new javax.swing.JCheckBox();
        TF_FF8_ISO4 = new javax.swing.JTextField();
        CB_FF8_ISO5 = new javax.swing.JCheckBox();
        TF_FF8_ISO5 = new javax.swing.JTextField();
        P_FF8_DLC = new javax.swing.JPanel();
        CB_FF8_DLC1 = new javax.swing.JCheckBox();
        TF_FF8_DLC1 = new javax.swing.JTextField();
        CB_FF8_DLC2 = new javax.swing.JCheckBox();
        TF_FF8_DLC2 = new javax.swing.JTextField();
        CB_FF8_DLC3 = new javax.swing.JCheckBox();
        TF_FF8_DLC3 = new javax.swing.JTextField();
        P_FF9 = new GradientPanel();
        P_FF9_PIC = new LIBRARY.ImagePanel();
        P_FF9_ISO = new javax.swing.JPanel();
        CB_FF9_ISO1 = new javax.swing.JCheckBox();
        TF_FF9_ISO1 = new javax.swing.JTextField();
        CB_FF9_ISO2 = new javax.swing.JCheckBox();
        TF_FF9_ISO2 = new javax.swing.JTextField();
        CB_FF9_ISO3 = new javax.swing.JCheckBox();
        TF_FF9_ISO3 = new javax.swing.JTextField();
        CB_FF9_ISO4 = new javax.swing.JCheckBox();
        TF_FF9_ISO4 = new javax.swing.JTextField();
        CB_FF9_ISO5 = new javax.swing.JCheckBox();
        TF_FF9_ISO5 = new javax.swing.JTextField();
        P_FF9_DLC = new javax.swing.JPanel();
        CB_FF9_DLC1 = new javax.swing.JCheckBox();
        TF_FF9_DLC1 = new javax.swing.JTextField();
        CB_FF9_DLC2 = new javax.swing.JCheckBox();
        TF_FF9_DLC2 = new javax.swing.JTextField();
        CB_FF9_DLC3 = new javax.swing.JCheckBox();
        TF_FF9_DLC3 = new javax.swing.JTextField();
        P_FF10 = new GradientPanel();
        P_FF10_PIC = new LIBRARY.ImagePanel();
        P_FF10_ISO = new javax.swing.JPanel();
        CB_FF10_ISO1 = new javax.swing.JCheckBox();
        TF_FF10_ISO1 = new javax.swing.JTextField();
        CB_FF10_ISO2 = new javax.swing.JCheckBox();
        TF_FF10_ISO2 = new javax.swing.JTextField();
        CB_FF10_ISO3 = new javax.swing.JCheckBox();
        TF_FF10_ISO3 = new javax.swing.JTextField();
        CB_FF10_ISO4 = new javax.swing.JCheckBox();
        TF_FF10_ISO4 = new javax.swing.JTextField();
        CB_FF10_ISO5 = new javax.swing.JCheckBox();
        TF_FF10_ISO5 = new javax.swing.JTextField();
        P_FF10_DLC = new javax.swing.JPanel();
        CB_FF10_DLC1 = new javax.swing.JCheckBox();
        TF_FF10_DLC1 = new javax.swing.JTextField();
        CB_FF10_DLC2 = new javax.swing.JCheckBox();
        TF_FF10_DLC2 = new javax.swing.JTextField();
        CB_FF10_DLC3 = new javax.swing.JCheckBox();
        TF_FF10_DLC3 = new javax.swing.JTextField();
        P_FF11 = new GradientPanel();
        P_FF11_PIC = new LIBRARY.ImagePanel();
        P_FF11_ISO = new javax.swing.JPanel();
        CB_FF11_ISO1 = new javax.swing.JCheckBox();
        TF_FF11_ISO1 = new javax.swing.JTextField();
        CB_FF11_ISO2 = new javax.swing.JCheckBox();
        TF_FF11_ISO2 = new javax.swing.JTextField();
        CB_FF11_ISO3 = new javax.swing.JCheckBox();
        TF_FF11_ISO3 = new javax.swing.JTextField();
        CB_FF11_ISO4 = new javax.swing.JCheckBox();
        TF_FF11_ISO4 = new javax.swing.JTextField();
        P_FF11_DLC = new javax.swing.JPanel();
        CB_FF11_DLC1 = new javax.swing.JCheckBox();
        TF_FF11_DLC1 = new javax.swing.JTextField();
        CB_FF11_DLC2 = new javax.swing.JCheckBox();
        TF_FF11_DLC2 = new javax.swing.JTextField();
        CB_FF11_DLC3 = new javax.swing.JCheckBox();
        TF_FF11_DLC3 = new javax.swing.JTextField();
        P_FF12 = new GradientPanel();
        P_FF12_PIC = new LIBRARY.ImagePanel();
        P_FF12_ISO = new javax.swing.JPanel();
        CB_FF12_ISO1 = new javax.swing.JCheckBox();
        TF_FF12_ISO1 = new javax.swing.JTextField();
        CB_FF12_ISO2 = new javax.swing.JCheckBox();
        TF_FF12_ISO2 = new javax.swing.JTextField();
        CB_FF12_ISO3 = new javax.swing.JCheckBox();
        TF_FF12_ISO3 = new javax.swing.JTextField();
        CB_FF12_ISO4 = new javax.swing.JCheckBox();
        TF_FF12_ISO4 = new javax.swing.JTextField();
        P_FF12_DLC = new javax.swing.JPanel();
        CB_FF12_DLC1 = new javax.swing.JCheckBox();
        TF_FF12_DLC1 = new javax.swing.JTextField();
        CB_FF12_DLC2 = new javax.swing.JCheckBox();
        TF_FF12_DLC2 = new javax.swing.JTextField();
        CB_FF12_DLC3 = new javax.swing.JCheckBox();
        TF_FF12_DLC3 = new javax.swing.JTextField();
        P_FF13 = new GradientPanel();
        P_FF13_PIC = new LIBRARY.ImagePanel();
        P_FF13_ISO = new javax.swing.JPanel();
        CB_FF13_ISO1 = new javax.swing.JCheckBox();
        TF_FF13_ISO1 = new javax.swing.JTextField();
        CB_FF13_ISO2 = new javax.swing.JCheckBox();
        TF_FF13_ISO2 = new javax.swing.JTextField();
        CB_FF13_ISO3 = new javax.swing.JCheckBox();
        TF_FF13_ISO3 = new javax.swing.JTextField();
        P_FF13_DLC = new javax.swing.JPanel();
        CB_FF13_DLC1 = new javax.swing.JCheckBox();
        TF_FF13_DLC1 = new javax.swing.JTextField();
        CB_FF13_DLC2 = new javax.swing.JCheckBox();
        TF_FF13_DLC2 = new javax.swing.JTextField();
        CB_FF13_DLC3 = new javax.swing.JCheckBox();
        TF_FF13_DLC3 = new javax.swing.JTextField();
        CB_FF13_DLC4 = new javax.swing.JCheckBox();
        TF_FF13_DLC4 = new javax.swing.JTextField();
        CB_FF13_DLC5 = new javax.swing.JCheckBox();
        TF_FF13_DLC5 = new javax.swing.JTextField();
        P_DDFF = new GradientPanel();
        P_DDFF_PIC = new LIBRARY.ImagePanel();
        P_DDFF_ISO = new javax.swing.JPanel();
        CB_DDFF_ISO1 = new javax.swing.JCheckBox();
        TF_DDFF_ISO1 = new javax.swing.JTextField();
        CB_DDFF_ISO2 = new javax.swing.JCheckBox();
        TF_DDFF_ISO2 = new javax.swing.JTextField();
        CB_DDFF_ISO3 = new javax.swing.JCheckBox();
        TF_DDFF_ISO3 = new javax.swing.JTextField();
        CB_DDFF_ISO4 = new javax.swing.JCheckBox();
        TF_DDFF_ISO4 = new javax.swing.JTextField();
        CB_DDFF_ISO5 = new javax.swing.JCheckBox();
        TF_DDFF_ISO5 = new javax.swing.JTextField();
        CB_DDFF_ISO6 = new javax.swing.JCheckBox();
        TF_DDFF_ISO6 = new javax.swing.JTextField();
        P_Opcoes = new GradientPanel();
        CB_Regiao = new javax.swing.JComboBox();
        CB_AutoAtivar = new javax.swing.JCheckBox();
        P_Data = new GradientPanel();
        B_Save = new GradientButton();
        B_Load = new GradientButton();
        B_Exportar = new GradientButton();
        MB_MenuBar = new javax.swing.JMenuBar();
        M_Funcoes = new javax.swing.JMenu();
        MI_Exportar = new javax.swing.JMenuItem();
        MI_Save = new javax.swing.JMenuItem();
        MI_Load = new javax.swing.JMenuItem();
        MI_Reset = new javax.swing.JMenuItem();
        S_Separator_1 = new javax.swing.JPopupMenu.Separator();
        M_Idioma = new javax.swing.JMenu();
        MI_Portugues = new javax.swing.JMenuItem();
        MI_English = new javax.swing.JMenuItem();
        MI_Deutsch = new javax.swing.JMenuItem();
        MI_Espanol = new javax.swing.JMenuItem();
        MI_Francaise = new javax.swing.JMenuItem();
        MI_Italiano = new javax.swing.JMenuItem();
        M_Audio = new javax.swing.JMenu();
        MI_Audio_ON = new javax.swing.JMenuItem();
        MI_Audio_OFF = new javax.swing.JMenuItem();
        M_Tema = new javax.swing.JMenu();
        MI_Tema_Default = new javax.swing.JMenuItem();
        MI_Tema_Dark = new javax.swing.JMenuItem();
        MI_Tema_Cosmos = new javax.swing.JMenuItem();
        MI_Tema_Chaos = new javax.swing.JMenuItem();
        MI_Tema_Custom = new javax.swing.JMenuItem();
        S_Separator_2 = new javax.swing.JPopupMenu.Separator();
        MI_Ajuda = new javax.swing.JMenuItem();
        MI_About = new javax.swing.JMenuItem();
        S_Separator_3 = new javax.swing.JPopupMenu.Separator();
        MI_Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TP_TabbedPane.setPreferredSize(new java.awt.Dimension(674, 422));
        TP_TabbedPane.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                TP_TabbedPaneMouseWheelMoved(evt);
            }
        });
        TP_TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TP_TabbedPaneStateChanged(evt);
            }
        });

        P_INICIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_INICIOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_INICIOLayout = new javax.swing.GroupLayout(P_INICIO);
        P_INICIO.setLayout(P_INICIOLayout);
        P_INICIOLayout.setHorizontalGroup(
            P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        P_INICIOLayout.setVerticalGroup(
            P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        TP_TabbedPane.addTab("P_INICIO", P_INICIO);

        P_FF1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF1_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF1_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF1_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF1_PICLayout = new javax.swing.GroupLayout(P_FF1_PIC);
        P_FF1_PIC.setLayout(P_FF1_PICLayout);
        P_FF1_PICLayout.setHorizontalGroup(
            P_FF1_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF1_PICLayout.setVerticalGroup(
            P_FF1_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF1_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF1_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_ISO1ActionPerformed(evt);
            }
        });

        TF_FF1_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_ISO1KeyReleased(evt);
            }
        });

        CB_FF1_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_ISO2ActionPerformed(evt);
            }
        });

        TF_FF1_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_ISO2KeyReleased(evt);
            }
        });

        CB_FF1_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_ISO3ActionPerformed(evt);
            }
        });

        TF_FF1_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_ISO3KeyReleased(evt);
            }
        });

        CB_FF1_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_ISO4ActionPerformed(evt);
            }
        });

        TF_FF1_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_ISO4KeyReleased(evt);
            }
        });

        CB_FF1_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_ISO5ActionPerformed(evt);
            }
        });

        TF_FF1_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF1_ISOLayout = new javax.swing.GroupLayout(P_FF1_ISO);
        P_FF1_ISO.setLayout(P_FF1_ISOLayout);
        P_FF1_ISOLayout.setHorizontalGroup(
            P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF1_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF1_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF1_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF1_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF1_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF1_ISOLayout.setVerticalGroup(
            P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF1_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF1_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF1_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));
        P_FF1_DLC.setPreferredSize(new java.awt.Dimension(507, 178));

        CB_FF1_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_DLC1ActionPerformed(evt);
            }
        });

        TF_FF1_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_DLC1KeyReleased(evt);
            }
        });

        CB_FF1_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_DLC2ActionPerformed(evt);
            }
        });

        TF_FF1_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_DLC2KeyReleased(evt);
            }
        });

        CB_FF1_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_DLC3ActionPerformed(evt);
            }
        });

        TF_FF1_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_DLC3KeyReleased(evt);
            }
        });

        CB_FF1_DLC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_DLC4ActionPerformed(evt);
            }
        });

        TF_FF1_DLC4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_DLC4KeyReleased(evt);
            }
        });

        CB_FF1_DLC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF1_DLC5ActionPerformed(evt);
            }
        });

        TF_FF1_DLC5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF1_DLC5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF1_DLCLayout = new javax.swing.GroupLayout(P_FF1_DLC);
        P_FF1_DLC.setLayout(P_FF1_DLCLayout);
        P_FF1_DLCLayout.setHorizontalGroup(
            P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF1_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF1_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF1_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF1_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF1_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF1_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF1_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF1_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF1_DLC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_DLC4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF1_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF1_DLC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF1_DLC5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF1_DLCLayout.setVerticalGroup(
            P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF1_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_DLC3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_DLC4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_DLC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF1_DLC5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF1_DLC5))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF1Layout = new javax.swing.GroupLayout(P_FF1);
        P_FF1.setLayout(P_FF1Layout);
        P_FF1Layout.setHorizontalGroup(
            P_FF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF1_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_FF1_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF1_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF1Layout.setVerticalGroup(
            P_FF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF1Layout.createSequentialGroup()
                        .addComponent(P_FF1_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF1_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF1_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF1", P_FF1);

        P_FF2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF2_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF2_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF2_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF2_PICLayout = new javax.swing.GroupLayout(P_FF2_PIC);
        P_FF2_PIC.setLayout(P_FF2_PICLayout);
        P_FF2_PICLayout.setHorizontalGroup(
            P_FF2_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF2_PICLayout.setVerticalGroup(
            P_FF2_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF2_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF2_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_ISO1ActionPerformed(evt);
            }
        });

        TF_FF2_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_ISO1KeyReleased(evt);
            }
        });

        CB_FF2_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_ISO2ActionPerformed(evt);
            }
        });

        TF_FF2_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_ISO2KeyReleased(evt);
            }
        });

        CB_FF2_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_ISO3ActionPerformed(evt);
            }
        });

        TF_FF2_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_ISO3KeyReleased(evt);
            }
        });

        CB_FF2_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_ISO4ActionPerformed(evt);
            }
        });

        TF_FF2_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_ISO4KeyReleased(evt);
            }
        });

        CB_FF2_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_ISO5ActionPerformed(evt);
            }
        });

        TF_FF2_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF2_ISOLayout = new javax.swing.GroupLayout(P_FF2_ISO);
        P_FF2_ISO.setLayout(P_FF2_ISOLayout);
        P_FF2_ISOLayout.setHorizontalGroup(
            P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF2_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF2_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF2_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF2_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF2_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF2_ISOLayout.setVerticalGroup(
            P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF2_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF2_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF2_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF2_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_DLC1ActionPerformed(evt);
            }
        });

        TF_FF2_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_DLC1KeyReleased(evt);
            }
        });

        CB_FF2_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_DLC2ActionPerformed(evt);
            }
        });

        TF_FF2_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_DLC2KeyReleased(evt);
            }
        });

        CB_FF2_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF2_DLC3ActionPerformed(evt);
            }
        });

        TF_FF2_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF2_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF2_DLCLayout = new javax.swing.GroupLayout(P_FF2_DLC);
        P_FF2_DLC.setLayout(P_FF2_DLCLayout);
        P_FF2_DLCLayout.setHorizontalGroup(
            P_FF2_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF2_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF2_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF2_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF2_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF2_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF2_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF2_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF2_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF2_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF2_DLCLayout.setVerticalGroup(
            P_FF2_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF2_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF2_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF2_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF2_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF2Layout = new javax.swing.GroupLayout(P_FF2);
        P_FF2.setLayout(P_FF2Layout);
        P_FF2Layout.setHorizontalGroup(
            P_FF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF2_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF2_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF2_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF2Layout.setVerticalGroup(
            P_FF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF2Layout.createSequentialGroup()
                        .addComponent(P_FF2_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF2_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF2_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF2", P_FF2);

        P_FF3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF3_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF3_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF3_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF3_PICLayout = new javax.swing.GroupLayout(P_FF3_PIC);
        P_FF3_PIC.setLayout(P_FF3_PICLayout);
        P_FF3_PICLayout.setHorizontalGroup(
            P_FF3_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF3_PICLayout.setVerticalGroup(
            P_FF3_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF3_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF3_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_ISO1ActionPerformed(evt);
            }
        });

        TF_FF3_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_ISO1KeyReleased(evt);
            }
        });

        CB_FF3_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_ISO2ActionPerformed(evt);
            }
        });

        TF_FF3_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_ISO2KeyReleased(evt);
            }
        });

        CB_FF3_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_ISO3ActionPerformed(evt);
            }
        });

        TF_FF3_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_ISO3KeyReleased(evt);
            }
        });

        CB_FF3_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_ISO4ActionPerformed(evt);
            }
        });

        TF_FF3_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_ISO4KeyReleased(evt);
            }
        });

        CB_FF3_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_ISO5ActionPerformed(evt);
            }
        });

        TF_FF3_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF3_ISOLayout = new javax.swing.GroupLayout(P_FF3_ISO);
        P_FF3_ISO.setLayout(P_FF3_ISOLayout);
        P_FF3_ISOLayout.setHorizontalGroup(
            P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF3_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF3_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF3_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF3_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF3_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF3_ISOLayout.setVerticalGroup(
            P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF3_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF3_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF3_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF3_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_DLC1ActionPerformed(evt);
            }
        });

        TF_FF3_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_DLC1KeyReleased(evt);
            }
        });

        CB_FF3_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_DLC2ActionPerformed(evt);
            }
        });

        TF_FF3_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_DLC2KeyReleased(evt);
            }
        });

        CB_FF3_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF3_DLC3ActionPerformed(evt);
            }
        });

        TF_FF3_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF3_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF3_DLCLayout = new javax.swing.GroupLayout(P_FF3_DLC);
        P_FF3_DLC.setLayout(P_FF3_DLCLayout);
        P_FF3_DLCLayout.setHorizontalGroup(
            P_FF3_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF3_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF3_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF3_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF3_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF3_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF3_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF3_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF3_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF3_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF3_DLCLayout.setVerticalGroup(
            P_FF3_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF3_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF3_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF3_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF3_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF3Layout = new javax.swing.GroupLayout(P_FF3);
        P_FF3.setLayout(P_FF3Layout);
        P_FF3Layout.setHorizontalGroup(
            P_FF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF3_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_FF3_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF3_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF3Layout.setVerticalGroup(
            P_FF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF3Layout.createSequentialGroup()
                        .addComponent(P_FF3_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF3_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF3_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF3", P_FF3);

        P_FF4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF4_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF4_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF4_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF4_PICLayout = new javax.swing.GroupLayout(P_FF4_PIC);
        P_FF4_PIC.setLayout(P_FF4_PICLayout);
        P_FF4_PICLayout.setHorizontalGroup(
            P_FF4_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF4_PICLayout.setVerticalGroup(
            P_FF4_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF4_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF4_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_ISO1ActionPerformed(evt);
            }
        });

        TF_FF4_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_ISO1KeyReleased(evt);
            }
        });

        CB_FF4_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_ISO2ActionPerformed(evt);
            }
        });

        TF_FF4_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_ISO2KeyReleased(evt);
            }
        });

        CB_FF4_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_ISO3ActionPerformed(evt);
            }
        });

        TF_FF4_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_ISO3KeyReleased(evt);
            }
        });

        CB_FF4_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_ISO4ActionPerformed(evt);
            }
        });

        TF_FF4_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_ISO4KeyReleased(evt);
            }
        });

        CB_FF4_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_ISO5ActionPerformed(evt);
            }
        });

        TF_FF4_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF4_ISOLayout = new javax.swing.GroupLayout(P_FF4_ISO);
        P_FF4_ISO.setLayout(P_FF4_ISOLayout);
        P_FF4_ISOLayout.setHorizontalGroup(
            P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF4_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF4_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF4_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF4_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF4_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF4_ISOLayout.setVerticalGroup(
            P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF4_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF4_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF4_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF4_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_DLC1ActionPerformed(evt);
            }
        });

        TF_FF4_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_DLC1KeyReleased(evt);
            }
        });

        CB_FF4_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_DLC2ActionPerformed(evt);
            }
        });

        TF_FF4_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_DLC2KeyReleased(evt);
            }
        });

        CB_FF4_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF4_DLC3ActionPerformed(evt);
            }
        });

        TF_FF4_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF4_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF4_DLCLayout = new javax.swing.GroupLayout(P_FF4_DLC);
        P_FF4_DLC.setLayout(P_FF4_DLCLayout);
        P_FF4_DLCLayout.setHorizontalGroup(
            P_FF4_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF4_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF4_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF4_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF4_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF4_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF4_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF4_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF4_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF4_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF4_DLCLayout.setVerticalGroup(
            P_FF4_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF4_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF4_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF4_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF4_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF4Layout = new javax.swing.GroupLayout(P_FF4);
        P_FF4.setLayout(P_FF4Layout);
        P_FF4Layout.setHorizontalGroup(
            P_FF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF4_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF4_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF4_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF4Layout.setVerticalGroup(
            P_FF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF4Layout.createSequentialGroup()
                        .addComponent(P_FF4_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF4_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF4_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF4", P_FF4);

        P_FF5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF5_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF5_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF5_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF5_PICLayout = new javax.swing.GroupLayout(P_FF5_PIC);
        P_FF5_PIC.setLayout(P_FF5_PICLayout);
        P_FF5_PICLayout.setHorizontalGroup(
            P_FF5_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF5_PICLayout.setVerticalGroup(
            P_FF5_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF5_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF5_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_ISO1ActionPerformed(evt);
            }
        });

        TF_FF5_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_ISO1KeyReleased(evt);
            }
        });

        CB_FF5_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_ISO2ActionPerformed(evt);
            }
        });

        TF_FF5_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_ISO2KeyReleased(evt);
            }
        });

        CB_FF5_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_ISO3ActionPerformed(evt);
            }
        });

        TF_FF5_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_ISO3KeyReleased(evt);
            }
        });

        CB_FF5_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_ISO4ActionPerformed(evt);
            }
        });

        TF_FF5_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_ISO4KeyReleased(evt);
            }
        });

        CB_FF5_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_ISO5ActionPerformed(evt);
            }
        });

        TF_FF5_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF5_ISOLayout = new javax.swing.GroupLayout(P_FF5_ISO);
        P_FF5_ISO.setLayout(P_FF5_ISOLayout);
        P_FF5_ISOLayout.setHorizontalGroup(
            P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF5_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF5_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF5_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF5_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF5_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF5_ISOLayout.setVerticalGroup(
            P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF5_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF5_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF5_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF5_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_DLC1ActionPerformed(evt);
            }
        });

        TF_FF5_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_DLC1KeyReleased(evt);
            }
        });

        CB_FF5_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_DLC2ActionPerformed(evt);
            }
        });

        TF_FF5_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_DLC2KeyReleased(evt);
            }
        });

        CB_FF5_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF5_DLC3ActionPerformed(evt);
            }
        });

        TF_FF5_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF5_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF5_DLCLayout = new javax.swing.GroupLayout(P_FF5_DLC);
        P_FF5_DLC.setLayout(P_FF5_DLCLayout);
        P_FF5_DLCLayout.setHorizontalGroup(
            P_FF5_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF5_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF5_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF5_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF5_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF5_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF5_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF5_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF5_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF5_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF5_DLCLayout.setVerticalGroup(
            P_FF5_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF5_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF5_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF5_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF5_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF5Layout = new javax.swing.GroupLayout(P_FF5);
        P_FF5.setLayout(P_FF5Layout);
        P_FF5Layout.setHorizontalGroup(
            P_FF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF5_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF5_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF5_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF5Layout.setVerticalGroup(
            P_FF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF5Layout.createSequentialGroup()
                        .addComponent(P_FF5_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF5_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF5_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF5", P_FF5);

        P_FF6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF6_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF6_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF6_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF6_PICLayout = new javax.swing.GroupLayout(P_FF6_PIC);
        P_FF6_PIC.setLayout(P_FF6_PICLayout);
        P_FF6_PICLayout.setHorizontalGroup(
            P_FF6_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF6_PICLayout.setVerticalGroup(
            P_FF6_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF6_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF6_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_ISO1ActionPerformed(evt);
            }
        });

        TF_FF6_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_ISO1KeyReleased(evt);
            }
        });

        CB_FF6_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_ISO2ActionPerformed(evt);
            }
        });

        TF_FF6_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_ISO2KeyReleased(evt);
            }
        });

        CB_FF6_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_ISO3ActionPerformed(evt);
            }
        });

        TF_FF6_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_ISO3KeyReleased(evt);
            }
        });

        CB_FF6_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_ISO4ActionPerformed(evt);
            }
        });

        TF_FF6_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_ISO4KeyReleased(evt);
            }
        });

        CB_FF6_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_ISO5ActionPerformed(evt);
            }
        });

        TF_FF6_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF6_ISOLayout = new javax.swing.GroupLayout(P_FF6_ISO);
        P_FF6_ISO.setLayout(P_FF6_ISOLayout);
        P_FF6_ISOLayout.setHorizontalGroup(
            P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF6_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF6_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF6_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF6_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF6_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF6_ISOLayout.setVerticalGroup(
            P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF6_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF6_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF6_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF6_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_DLC1ActionPerformed(evt);
            }
        });

        TF_FF6_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_DLC1KeyReleased(evt);
            }
        });

        CB_FF6_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_DLC2ActionPerformed(evt);
            }
        });

        TF_FF6_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_DLC2KeyReleased(evt);
            }
        });

        CB_FF6_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF6_DLC3ActionPerformed(evt);
            }
        });

        TF_FF6_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF6_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF6_DLCLayout = new javax.swing.GroupLayout(P_FF6_DLC);
        P_FF6_DLC.setLayout(P_FF6_DLCLayout);
        P_FF6_DLCLayout.setHorizontalGroup(
            P_FF6_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF6_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF6_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF6_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF6_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF6_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF6_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF6_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF6_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF6_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF6_DLCLayout.setVerticalGroup(
            P_FF6_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF6_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF6_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF6_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF6_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF6Layout = new javax.swing.GroupLayout(P_FF6);
        P_FF6.setLayout(P_FF6Layout);
        P_FF6Layout.setHorizontalGroup(
            P_FF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF6_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF6_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF6_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF6Layout.setVerticalGroup(
            P_FF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF6Layout.createSequentialGroup()
                        .addComponent(P_FF6_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF6_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF6_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF6", P_FF6);

        P_FF7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF7_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF7_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF7_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF7_PICLayout = new javax.swing.GroupLayout(P_FF7_PIC);
        P_FF7_PIC.setLayout(P_FF7_PICLayout);
        P_FF7_PICLayout.setHorizontalGroup(
            P_FF7_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF7_PICLayout.setVerticalGroup(
            P_FF7_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF7_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF7_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_ISO1ActionPerformed(evt);
            }
        });

        TF_FF7_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_ISO1KeyReleased(evt);
            }
        });

        CB_FF7_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_ISO2ActionPerformed(evt);
            }
        });

        TF_FF7_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_ISO2KeyReleased(evt);
            }
        });

        CB_FF7_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_ISO3ActionPerformed(evt);
            }
        });

        TF_FF7_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_ISO3KeyReleased(evt);
            }
        });

        CB_FF7_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_ISO4ActionPerformed(evt);
            }
        });

        TF_FF7_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_ISO4KeyReleased(evt);
            }
        });

        CB_FF7_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_ISO5ActionPerformed(evt);
            }
        });

        TF_FF7_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF7_ISOLayout = new javax.swing.GroupLayout(P_FF7_ISO);
        P_FF7_ISO.setLayout(P_FF7_ISOLayout);
        P_FF7_ISOLayout.setHorizontalGroup(
            P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF7_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF7_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF7_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF7_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF7_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF7_ISOLayout.setVerticalGroup(
            P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF7_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF7_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF7_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF7_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_DLC1ActionPerformed(evt);
            }
        });

        TF_FF7_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_DLC1KeyReleased(evt);
            }
        });

        CB_FF7_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_DLC2ActionPerformed(evt);
            }
        });

        TF_FF7_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_DLC2KeyReleased(evt);
            }
        });

        CB_FF7_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF7_DLC3ActionPerformed(evt);
            }
        });

        TF_FF7_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF7_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF7_DLCLayout = new javax.swing.GroupLayout(P_FF7_DLC);
        P_FF7_DLC.setLayout(P_FF7_DLCLayout);
        P_FF7_DLCLayout.setHorizontalGroup(
            P_FF7_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF7_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF7_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF7_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF7_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF7_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF7_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF7_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF7_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF7_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF7_DLCLayout.setVerticalGroup(
            P_FF7_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF7_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF7_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF7_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF7_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF7Layout = new javax.swing.GroupLayout(P_FF7);
        P_FF7.setLayout(P_FF7Layout);
        P_FF7Layout.setHorizontalGroup(
            P_FF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF7_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF7_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF7_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF7Layout.setVerticalGroup(
            P_FF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF7Layout.createSequentialGroup()
                        .addComponent(P_FF7_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF7_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF7_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF7", P_FF7);

        P_FF8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF8_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF8_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF8_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF8_PICLayout = new javax.swing.GroupLayout(P_FF8_PIC);
        P_FF8_PIC.setLayout(P_FF8_PICLayout);
        P_FF8_PICLayout.setHorizontalGroup(
            P_FF8_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF8_PICLayout.setVerticalGroup(
            P_FF8_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF8_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF8_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_ISO1ActionPerformed(evt);
            }
        });

        TF_FF8_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_ISO1KeyReleased(evt);
            }
        });

        CB_FF8_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_ISO2ActionPerformed(evt);
            }
        });

        TF_FF8_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_ISO2KeyReleased(evt);
            }
        });

        CB_FF8_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_ISO3ActionPerformed(evt);
            }
        });

        TF_FF8_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_ISO3KeyReleased(evt);
            }
        });

        CB_FF8_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_ISO4ActionPerformed(evt);
            }
        });

        TF_FF8_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_ISO4KeyReleased(evt);
            }
        });

        CB_FF8_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_ISO5ActionPerformed(evt);
            }
        });

        TF_FF8_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF8_ISOLayout = new javax.swing.GroupLayout(P_FF8_ISO);
        P_FF8_ISO.setLayout(P_FF8_ISOLayout);
        P_FF8_ISOLayout.setHorizontalGroup(
            P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF8_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF8_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF8_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF8_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF8_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF8_ISOLayout.setVerticalGroup(
            P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF8_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF8_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF8_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF8_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_DLC1ActionPerformed(evt);
            }
        });

        TF_FF8_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_DLC1KeyReleased(evt);
            }
        });

        CB_FF8_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_DLC2ActionPerformed(evt);
            }
        });

        TF_FF8_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_DLC2KeyReleased(evt);
            }
        });

        CB_FF8_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF8_DLC3ActionPerformed(evt);
            }
        });

        TF_FF8_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF8_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF8_DLCLayout = new javax.swing.GroupLayout(P_FF8_DLC);
        P_FF8_DLC.setLayout(P_FF8_DLCLayout);
        P_FF8_DLCLayout.setHorizontalGroup(
            P_FF8_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF8_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF8_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF8_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF8_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF8_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF8_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF8_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF8_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF8_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF8_DLCLayout.setVerticalGroup(
            P_FF8_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF8_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF8_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF8_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF8_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF8Layout = new javax.swing.GroupLayout(P_FF8);
        P_FF8.setLayout(P_FF8Layout);
        P_FF8Layout.setHorizontalGroup(
            P_FF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF8_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF8_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF8_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF8Layout.setVerticalGroup(
            P_FF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF8Layout.createSequentialGroup()
                        .addComponent(P_FF8_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF8_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF8_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF8", P_FF8);

        P_FF9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF9_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF9_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF9_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF9_PICLayout = new javax.swing.GroupLayout(P_FF9_PIC);
        P_FF9_PIC.setLayout(P_FF9_PICLayout);
        P_FF9_PICLayout.setHorizontalGroup(
            P_FF9_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF9_PICLayout.setVerticalGroup(
            P_FF9_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF9_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF9_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_ISO1ActionPerformed(evt);
            }
        });

        TF_FF9_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_ISO1KeyReleased(evt);
            }
        });

        CB_FF9_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_ISO2ActionPerformed(evt);
            }
        });

        TF_FF9_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_ISO2KeyReleased(evt);
            }
        });

        CB_FF9_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_ISO3ActionPerformed(evt);
            }
        });

        TF_FF9_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_ISO3KeyReleased(evt);
            }
        });

        CB_FF9_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_ISO4ActionPerformed(evt);
            }
        });

        TF_FF9_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_ISO4KeyReleased(evt);
            }
        });

        CB_FF9_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_ISO5ActionPerformed(evt);
            }
        });

        TF_FF9_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF9_ISOLayout = new javax.swing.GroupLayout(P_FF9_ISO);
        P_FF9_ISO.setLayout(P_FF9_ISOLayout);
        P_FF9_ISOLayout.setHorizontalGroup(
            P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF9_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF9_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF9_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF9_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF9_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF9_ISOLayout.setVerticalGroup(
            P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF9_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF9_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF9_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF9_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_DLC1ActionPerformed(evt);
            }
        });

        TF_FF9_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_DLC1KeyReleased(evt);
            }
        });

        CB_FF9_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_DLC2ActionPerformed(evt);
            }
        });

        TF_FF9_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_DLC2KeyReleased(evt);
            }
        });

        CB_FF9_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF9_DLC3ActionPerformed(evt);
            }
        });

        TF_FF9_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF9_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF9_DLCLayout = new javax.swing.GroupLayout(P_FF9_DLC);
        P_FF9_DLC.setLayout(P_FF9_DLCLayout);
        P_FF9_DLCLayout.setHorizontalGroup(
            P_FF9_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF9_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF9_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF9_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF9_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF9_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF9_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF9_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF9_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF9_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF9_DLCLayout.setVerticalGroup(
            P_FF9_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF9_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF9_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF9_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF9_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF9Layout = new javax.swing.GroupLayout(P_FF9);
        P_FF9.setLayout(P_FF9Layout);
        P_FF9Layout.setHorizontalGroup(
            P_FF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF9_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF9_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF9_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF9Layout.setVerticalGroup(
            P_FF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF9Layout.createSequentialGroup()
                        .addComponent(P_FF9_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF9_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF9_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF9", P_FF9);

        P_FF10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF10_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF10_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF10_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF10_PICLayout = new javax.swing.GroupLayout(P_FF10_PIC);
        P_FF10_PIC.setLayout(P_FF10_PICLayout);
        P_FF10_PICLayout.setHorizontalGroup(
            P_FF10_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF10_PICLayout.setVerticalGroup(
            P_FF10_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF10_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF10_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_ISO1ActionPerformed(evt);
            }
        });

        TF_FF10_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_ISO1KeyReleased(evt);
            }
        });

        CB_FF10_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_ISO2ActionPerformed(evt);
            }
        });

        TF_FF10_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_ISO2KeyReleased(evt);
            }
        });

        CB_FF10_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_ISO3ActionPerformed(evt);
            }
        });

        TF_FF10_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_ISO3KeyReleased(evt);
            }
        });

        CB_FF10_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_ISO4ActionPerformed(evt);
            }
        });

        TF_FF10_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_ISO4KeyReleased(evt);
            }
        });

        CB_FF10_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_ISO5ActionPerformed(evt);
            }
        });

        TF_FF10_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_ISO5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF10_ISOLayout = new javax.swing.GroupLayout(P_FF10_ISO);
        P_FF10_ISO.setLayout(P_FF10_ISOLayout);
        P_FF10_ISOLayout.setHorizontalGroup(
            P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF10_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF10_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF10_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF10_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF10_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF10_ISOLayout.setVerticalGroup(
            P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF10_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_FF10_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_ISO5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_FF10_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF10_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_DLC1ActionPerformed(evt);
            }
        });

        TF_FF10_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_DLC1KeyReleased(evt);
            }
        });

        CB_FF10_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_DLC2ActionPerformed(evt);
            }
        });

        TF_FF10_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_DLC2KeyReleased(evt);
            }
        });

        CB_FF10_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF10_DLC3ActionPerformed(evt);
            }
        });

        TF_FF10_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF10_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF10_DLCLayout = new javax.swing.GroupLayout(P_FF10_DLC);
        P_FF10_DLC.setLayout(P_FF10_DLCLayout);
        P_FF10_DLCLayout.setHorizontalGroup(
            P_FF10_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF10_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF10_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF10_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF10_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF10_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF10_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF10_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF10_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF10_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF10_DLCLayout.setVerticalGroup(
            P_FF10_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF10_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF10_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF10_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF10_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF10Layout = new javax.swing.GroupLayout(P_FF10);
        P_FF10.setLayout(P_FF10Layout);
        P_FF10Layout.setHorizontalGroup(
            P_FF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF10_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF10_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF10_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF10Layout.setVerticalGroup(
            P_FF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF10Layout.createSequentialGroup()
                        .addComponent(P_FF10_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF10_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF10_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF10", P_FF10);

        P_FF11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF11_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF11_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF11_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF11_PICLayout = new javax.swing.GroupLayout(P_FF11_PIC);
        P_FF11_PIC.setLayout(P_FF11_PICLayout);
        P_FF11_PICLayout.setHorizontalGroup(
            P_FF11_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF11_PICLayout.setVerticalGroup(
            P_FF11_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF11_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF11_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_ISO1ActionPerformed(evt);
            }
        });

        TF_FF11_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_ISO1KeyReleased(evt);
            }
        });

        CB_FF11_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_ISO2ActionPerformed(evt);
            }
        });

        TF_FF11_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_ISO2KeyReleased(evt);
            }
        });

        CB_FF11_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_ISO3ActionPerformed(evt);
            }
        });

        TF_FF11_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_ISO3KeyReleased(evt);
            }
        });

        CB_FF11_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_ISO4ActionPerformed(evt);
            }
        });

        TF_FF11_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_ISO4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF11_ISOLayout = new javax.swing.GroupLayout(P_FF11_ISO);
        P_FF11_ISO.setLayout(P_FF11_ISOLayout);
        P_FF11_ISOLayout.setHorizontalGroup(
            P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF11_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF11_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF11_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF11_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF11_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF11_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF11_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF11_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF11_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF11_ISOLayout.setVerticalGroup(
            P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF11_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF11_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_ISO4))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        P_FF11_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF11_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_DLC1ActionPerformed(evt);
            }
        });

        TF_FF11_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_DLC1KeyReleased(evt);
            }
        });

        CB_FF11_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_DLC2ActionPerformed(evt);
            }
        });

        TF_FF11_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_DLC2KeyReleased(evt);
            }
        });

        CB_FF11_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF11_DLC3ActionPerformed(evt);
            }
        });

        TF_FF11_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF11_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF11_DLCLayout = new javax.swing.GroupLayout(P_FF11_DLC);
        P_FF11_DLC.setLayout(P_FF11_DLCLayout);
        P_FF11_DLCLayout.setHorizontalGroup(
            P_FF11_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF11_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF11_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF11_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF11_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF11_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF11_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF11_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF11_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF11_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF11_DLCLayout.setVerticalGroup(
            P_FF11_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF11_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF11_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF11_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF11_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF11_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF11_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF11Layout = new javax.swing.GroupLayout(P_FF11);
        P_FF11.setLayout(P_FF11Layout);
        P_FF11Layout.setHorizontalGroup(
            P_FF11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF11_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF11_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF11_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF11Layout.setVerticalGroup(
            P_FF11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF11Layout.createSequentialGroup()
                        .addComponent(P_FF11_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF11_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF11_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF11", P_FF11);

        P_FF12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF12_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF12_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF12_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF12_PICLayout = new javax.swing.GroupLayout(P_FF12_PIC);
        P_FF12_PIC.setLayout(P_FF12_PICLayout);
        P_FF12_PICLayout.setHorizontalGroup(
            P_FF12_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF12_PICLayout.setVerticalGroup(
            P_FF12_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF12_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF12_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_ISO1ActionPerformed(evt);
            }
        });

        TF_FF12_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_ISO1KeyReleased(evt);
            }
        });

        CB_FF12_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_ISO2ActionPerformed(evt);
            }
        });

        TF_FF12_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_ISO2KeyReleased(evt);
            }
        });

        CB_FF12_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_ISO3ActionPerformed(evt);
            }
        });

        TF_FF12_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_ISO3KeyReleased(evt);
            }
        });

        CB_FF12_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_ISO4ActionPerformed(evt);
            }
        });

        TF_FF12_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_ISO4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF12_ISOLayout = new javax.swing.GroupLayout(P_FF12_ISO);
        P_FF12_ISO.setLayout(P_FF12_ISOLayout);
        P_FF12_ISOLayout.setHorizontalGroup(
            P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF12_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF12_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF12_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF12_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF12_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF12_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF12_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF12_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF12_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF12_ISOLayout.setVerticalGroup(
            P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF12_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF12_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_ISO4))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        P_FF12_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));

        CB_FF12_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_DLC1ActionPerformed(evt);
            }
        });

        TF_FF12_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_DLC1KeyReleased(evt);
            }
        });

        CB_FF12_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_DLC2ActionPerformed(evt);
            }
        });

        TF_FF12_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_DLC2KeyReleased(evt);
            }
        });

        CB_FF12_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF12_DLC3ActionPerformed(evt);
            }
        });

        TF_FF12_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF12_DLC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF12_DLCLayout = new javax.swing.GroupLayout(P_FF12_DLC);
        P_FF12_DLC.setLayout(P_FF12_DLCLayout);
        P_FF12_DLCLayout.setHorizontalGroup(
            P_FF12_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF12_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF12_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF12_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF12_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF12_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF12_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF12_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF12_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF12_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF12_DLCLayout.setVerticalGroup(
            P_FF12_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF12_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF12_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF12_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF12_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF12_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF12_DLC3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF12Layout = new javax.swing.GroupLayout(P_FF12);
        P_FF12.setLayout(P_FF12Layout);
        P_FF12Layout.setHorizontalGroup(
            P_FF12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF12_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF12_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF12_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF12Layout.setVerticalGroup(
            P_FF12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_FF12Layout.createSequentialGroup()
                        .addComponent(P_FF12_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF12_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF12_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF12", P_FF12);

        P_FF13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_FF13_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_FF13_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_FF13_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_FF13_PICLayout = new javax.swing.GroupLayout(P_FF13_PIC);
        P_FF13_PIC.setLayout(P_FF13_PICLayout);
        P_FF13_PICLayout.setHorizontalGroup(
            P_FF13_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_FF13_PICLayout.setVerticalGroup(
            P_FF13_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_FF13_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_FF13_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_ISO1ActionPerformed(evt);
            }
        });

        TF_FF13_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_ISO1KeyReleased(evt);
            }
        });

        CB_FF13_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_ISO2ActionPerformed(evt);
            }
        });

        TF_FF13_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_ISO2KeyReleased(evt);
            }
        });

        CB_FF13_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_ISO3ActionPerformed(evt);
            }
        });

        TF_FF13_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_ISO3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF13_ISOLayout = new javax.swing.GroupLayout(P_FF13_ISO);
        P_FF13_ISO.setLayout(P_FF13_ISOLayout);
        P_FF13_ISOLayout.setHorizontalGroup(
            P_FF13_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF13_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF13_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF13_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF13_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF13_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF13_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF13_ISOLayout.createSequentialGroup()
                        .addComponent(CB_FF13_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF13_ISOLayout.setVerticalGroup(
            P_FF13_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF13_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF13_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_ISO3))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        P_FF13_DLC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DLC"));
        P_FF13_DLC.setPreferredSize(new java.awt.Dimension(507, 182));

        CB_FF13_DLC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_DLC1ActionPerformed(evt);
            }
        });

        TF_FF13_DLC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_DLC1KeyReleased(evt);
            }
        });

        CB_FF13_DLC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_DLC2ActionPerformed(evt);
            }
        });

        TF_FF13_DLC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_DLC2KeyReleased(evt);
            }
        });

        CB_FF13_DLC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_DLC3ActionPerformed(evt);
            }
        });

        TF_FF13_DLC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_DLC3KeyReleased(evt);
            }
        });

        CB_FF13_DLC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_DLC4ActionPerformed(evt);
            }
        });

        TF_FF13_DLC4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_DLC4KeyReleased(evt);
            }
        });

        CB_FF13_DLC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FF13_DLC5ActionPerformed(evt);
            }
        });

        TF_FF13_DLC5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_FF13_DLC5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_FF13_DLCLayout = new javax.swing.GroupLayout(P_FF13_DLC);
        P_FF13_DLC.setLayout(P_FF13_DLCLayout);
        P_FF13_DLCLayout.setHorizontalGroup(
            P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF13_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FF13_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF13_DLC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_DLC1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_FF13_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF13_DLC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_DLC2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF13_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF13_DLC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_DLC3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF13_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF13_DLC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_DLC4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF13_DLCLayout.createSequentialGroup()
                        .addComponent(CB_FF13_DLC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_FF13_DLC5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_FF13_DLCLayout.setVerticalGroup(
            P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF13_DLCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_DLC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_DLC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_DLC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_DLC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_DLC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_DLC3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_DLC4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_DLC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13_DLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_FF13_DLC5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_FF13_DLC5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_FF13Layout = new javax.swing.GroupLayout(P_FF13);
        P_FF13.setLayout(P_FF13Layout);
        P_FF13Layout.setHorizontalGroup(
            P_FF13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_FF13_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_FF13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_FF13_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_FF13_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_FF13Layout.setVerticalGroup(
            P_FF13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FF13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FF13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FF13Layout.createSequentialGroup()
                        .addComponent(P_FF13_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_FF13_DLC, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_FF13_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_FF13", P_FF13);

        P_DDFF.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P_DDFF_PIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        P_DDFF_PIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_DDFF_PICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_DDFF_PICLayout = new javax.swing.GroupLayout(P_DDFF_PIC);
        P_DDFF_PIC.setLayout(P_DDFF_PICLayout);
        P_DDFF_PICLayout.setHorizontalGroup(
            P_DDFF_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        P_DDFF_PICLayout.setVerticalGroup(
            P_DDFF_PICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        P_DDFF_ISO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ISO"));

        CB_DDFF_ISO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DDFF_ISO1ActionPerformed(evt);
            }
        });

        TF_DDFF_ISO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_DDFF_ISO1KeyReleased(evt);
            }
        });

        CB_DDFF_ISO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DDFF_ISO2ActionPerformed(evt);
            }
        });

        TF_DDFF_ISO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_DDFF_ISO2KeyReleased(evt);
            }
        });

        CB_DDFF_ISO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DDFF_ISO3ActionPerformed(evt);
            }
        });

        TF_DDFF_ISO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_DDFF_ISO3KeyReleased(evt);
            }
        });

        CB_DDFF_ISO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DDFF_ISO4ActionPerformed(evt);
            }
        });

        TF_DDFF_ISO4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_DDFF_ISO4KeyReleased(evt);
            }
        });

        CB_DDFF_ISO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DDFF_ISO5ActionPerformed(evt);
            }
        });

        TF_DDFF_ISO5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_DDFF_ISO5KeyReleased(evt);
            }
        });

        CB_DDFF_ISO6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DDFF_ISO6ActionPerformed(evt);
            }
        });

        TF_DDFF_ISO6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_DDFF_ISO6KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout P_DDFF_ISOLayout = new javax.swing.GroupLayout(P_DDFF_ISO);
        P_DDFF_ISO.setLayout(P_DDFF_ISOLayout);
        P_DDFF_ISOLayout.setHorizontalGroup(
            P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                        .addComponent(CB_DDFF_ISO1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_DDFF_ISO1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                        .addComponent(CB_DDFF_ISO2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_DDFF_ISO2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                        .addComponent(CB_DDFF_ISO3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_DDFF_ISO3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                        .addComponent(CB_DDFF_ISO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_DDFF_ISO4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                        .addComponent(CB_DDFF_ISO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_DDFF_ISO5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                        .addComponent(CB_DDFF_ISO6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_DDFF_ISO6, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_DDFF_ISOLayout.setVerticalGroup(
            P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DDFF_ISOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_DDFF_ISO1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_DDFF_ISO1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_DDFF_ISO2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_DDFF_ISO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_DDFF_ISO3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_DDFF_ISO3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_DDFF_ISO4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_DDFF_ISO4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_DDFF_ISO5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_DDFF_ISO5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DDFF_ISOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_DDFF_ISO6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_DDFF_ISO6))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P_DDFFLayout = new javax.swing.GroupLayout(P_DDFF);
        P_DDFF.setLayout(P_DDFFLayout);
        P_DDFFLayout.setHorizontalGroup(
            P_DDFFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DDFFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_DDFF_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_DDFF_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        P_DDFFLayout.setVerticalGroup(
            P_DDFFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DDFFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_DDFFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_DDFF_ISO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_DDFF_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TP_TabbedPane.addTab("P_DDFF", P_DDFF);

        P_Opcoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        P_Opcoes.setPreferredSize(new java.awt.Dimension(240, 78));

        CB_Regiao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CB_Regiao" }));
        CB_Regiao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CB_AutoAtivar.setText("CB_AutoAtivar");
        CB_AutoAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_AutoAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_OpcoesLayout = new javax.swing.GroupLayout(P_Opcoes);
        P_Opcoes.setLayout(P_OpcoesLayout);
        P_OpcoesLayout.setHorizontalGroup(
            P_OpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_OpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_Regiao, 0, 226, Short.MAX_VALUE)
                    .addComponent(CB_AutoAtivar))
                .addContainerGap())
        );
        P_OpcoesLayout.setVerticalGroup(
            P_OpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CB_Regiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_AutoAtivar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        P_Data.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        P_Data.setPreferredSize(new java.awt.Dimension(240, 78));

        B_Save.setText("B_Save");
        B_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_SaveMouseExited(evt);
            }
        });
        B_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SaveActionPerformed(evt);
            }
        });

        B_Load.setText("B_Load");
        B_Load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_LoadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_LoadMouseExited(evt);
            }
        });
        B_Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_DataLayout = new javax.swing.GroupLayout(P_Data);
        P_Data.setLayout(P_DataLayout);
        P_DataLayout.setHorizontalGroup(
            P_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_Save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(B_Load, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_DataLayout.setVerticalGroup(
            P_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Load)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_Exportar.setText("B_Exportar");
        B_Exportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_ExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_ExportarMouseExited(evt);
            }
        });
        B_Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_MainPanelLayout = new javax.swing.GroupLayout(P_MainPanel);
        P_MainPanel.setLayout(P_MainPanelLayout);
        P_MainPanelLayout.setHorizontalGroup(
            P_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_MainPanelLayout.createSequentialGroup()
                        .addComponent(P_Opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Exportar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addComponent(TP_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_MainPanelLayout.setVerticalGroup(
            P_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TP_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(P_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Exportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(P_Opcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        M_Funcoes.setText("M_Funcoes");
        M_Funcoes.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                M_FuncoesMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
                M_FuncoesMenuDeselected(evt);
            }
        });

        MI_Exportar.setText("MI_Exportar");
        MI_Exportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_ExportarMouseEntered(evt);
            }
        });
        MI_Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ExportarActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_Exportar);

        MI_Save.setText("MI_Save");
        MI_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_SaveMouseEntered(evt);
            }
        });
        MI_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SaveActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_Save);

        MI_Load.setText("MI_Load");
        MI_Load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_LoadMouseEntered(evt);
            }
        });
        MI_Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_LoadActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_Load);

        MI_Reset.setText("MI_Reset");
        MI_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_ResetMouseEntered(evt);
            }
        });
        MI_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ResetActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_Reset);
        M_Funcoes.add(S_Separator_1);

        M_Idioma.setText("M_Idioma");
        M_Idioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M_IdiomaMouseEntered(evt);
            }
        });

        MI_Portugues.setText("MI_Portugues");
        MI_Portugues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_PortuguesMouseEntered(evt);
            }
        });
        MI_Portugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_PortuguesActionPerformed(evt);
            }
        });
        M_Idioma.add(MI_Portugues);

        MI_English.setText("MI_English");
        MI_English.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_EnglishMouseEntered(evt);
            }
        });
        MI_English.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_EnglishActionPerformed(evt);
            }
        });
        M_Idioma.add(MI_English);

        MI_Deutsch.setText("MI_Deutsch");
        MI_Deutsch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_DeutschMouseEntered(evt);
            }
        });
        MI_Deutsch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_DeutschActionPerformed(evt);
            }
        });
        M_Idioma.add(MI_Deutsch);

        MI_Espanol.setText("MI_Espanol");
        MI_Espanol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_EspanolMouseEntered(evt);
            }
        });
        MI_Espanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_EspanolActionPerformed(evt);
            }
        });
        M_Idioma.add(MI_Espanol);

        MI_Francaise.setText("MI_Francaise");
        MI_Francaise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_FrancaiseMouseEntered(evt);
            }
        });
        MI_Francaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_FrancaiseActionPerformed(evt);
            }
        });
        M_Idioma.add(MI_Francaise);

        MI_Italiano.setText("MI_Italiano");
        MI_Italiano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_ItalianoMouseEntered(evt);
            }
        });
        MI_Italiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ItalianoActionPerformed(evt);
            }
        });
        M_Idioma.add(MI_Italiano);

        M_Funcoes.add(M_Idioma);

        M_Audio.setText("M_Audio");
        M_Audio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M_AudioMouseEntered(evt);
            }
        });

        MI_Audio_ON.setText("MI_Audio_ON");
        MI_Audio_ON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Audio_ONMouseEntered(evt);
            }
        });
        MI_Audio_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Audio_ONActionPerformed(evt);
            }
        });
        M_Audio.add(MI_Audio_ON);

        MI_Audio_OFF.setText("MI_Audio_OFF");
        MI_Audio_OFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Audio_OFFMouseEntered(evt);
            }
        });
        MI_Audio_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Audio_OFFActionPerformed(evt);
            }
        });
        M_Audio.add(MI_Audio_OFF);

        M_Funcoes.add(M_Audio);

        M_Tema.setText("M_Tema");
        M_Tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M_TemaMouseEntered(evt);
            }
        });

        MI_Tema_Default.setText("MI_Tema_Default");
        MI_Tema_Default.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Tema_DefaultMouseEntered(evt);
            }
        });
        MI_Tema_Default.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Tema_DefaultActionPerformed(evt);
            }
        });
        M_Tema.add(MI_Tema_Default);

        MI_Tema_Dark.setText("MI_Tema_Dark");
        MI_Tema_Dark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Tema_DarkMouseEntered(evt);
            }
        });
        MI_Tema_Dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Tema_DarkActionPerformed(evt);
            }
        });
        M_Tema.add(MI_Tema_Dark);

        MI_Tema_Cosmos.setText("MI_Tema_Cosmos");
        MI_Tema_Cosmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Tema_CosmosMouseEntered(evt);
            }
        });
        MI_Tema_Cosmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Tema_CosmosActionPerformed(evt);
            }
        });
        M_Tema.add(MI_Tema_Cosmos);

        MI_Tema_Chaos.setText("MI_Tema_Chaos");
        MI_Tema_Chaos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Tema_ChaosMouseEntered(evt);
            }
        });
        MI_Tema_Chaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Tema_ChaosActionPerformed(evt);
            }
        });
        M_Tema.add(MI_Tema_Chaos);

        MI_Tema_Custom.setText("MI_Tema_Custom");
        MI_Tema_Custom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Tema_CustomMouseEntered(evt);
            }
        });
        MI_Tema_Custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Tema_CustomActionPerformed(evt);
            }
        });
        M_Tema.add(MI_Tema_Custom);

        M_Funcoes.add(M_Tema);
        M_Funcoes.add(S_Separator_2);

        MI_Ajuda.setText("MI_Ajuda");
        MI_Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_AjudaMouseEntered(evt);
            }
        });
        MI_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AjudaActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_Ajuda);

        MI_About.setText("MI_About");
        MI_About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_AboutMouseEntered(evt);
            }
        });
        MI_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AboutActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_About);
        M_Funcoes.add(S_Separator_3);

        MI_Exit.setText("MI_Exit");
        MI_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_ExitMouseEntered(evt);
            }
        });
        MI_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ExitActionPerformed(evt);
            }
        });
        M_Funcoes.add(MI_Exit);

        MB_MenuBar.add(M_Funcoes);

        setJMenuBar(MB_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

	private void CB_FF1_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO1ActionPerformed
		TF_FF1_ISO1.setEnabled(CB_FF1_ISO1.isSelected());
		CheckBoxTipAL.get(0).setOpacity(CB_FF1_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO1ActionPerformed

	private void CB_FF1_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO2ActionPerformed
		TF_FF1_ISO2.setEnabled(CB_FF1_ISO2.isSelected());
		CheckBoxTipAL.get(1).setOpacity(CB_FF1_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO2ActionPerformed

	private void CB_FF1_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO3ActionPerformed
		TF_FF1_ISO3.setEnabled(CB_FF1_ISO3.isSelected());
		CheckBoxTipAL.get(2).setOpacity(CB_FF1_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO3ActionPerformed

	private void CB_FF1_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO4ActionPerformed
		TF_FF1_ISO4.setEnabled(CB_FF1_ISO4.isSelected());
		CheckBoxTipAL.get(3).setOpacity(CB_FF1_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO4ActionPerformed

	private void CB_FF1_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO5ActionPerformed
		TF_FF1_ISO5.setEnabled(CB_FF1_ISO5.isSelected());
		CheckBoxTipAL.get(4).setOpacity(CB_FF1_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO5ActionPerformed

	private void CB_FF1_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC1ActionPerformed
		TF_FF1_DLC1.setEnabled(CB_FF1_DLC1.isSelected());
		CheckBoxTipAL.get(5).setOpacity(CB_FF1_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC1ActionPerformed

	private void CB_FF1_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC2ActionPerformed
		TF_FF1_DLC2.setEnabled(CB_FF1_DLC2.isSelected());
		CheckBoxTipAL.get(6).setOpacity(CB_FF1_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC2ActionPerformed

	private void CB_FF1_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC3ActionPerformed
		TF_FF1_DLC3.setEnabled(CB_FF1_DLC3.isSelected());
		CheckBoxTipAL.get(7).setOpacity(CB_FF1_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC3ActionPerformed

	private void CB_FF1_DLC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC4ActionPerformed
		TF_FF1_DLC4.setEnabled(CB_FF1_DLC4.isSelected());
		CheckBoxTipAL.get(8).setOpacity(CB_FF1_DLC4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_DLC4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC4ActionPerformed

	private void CB_FF1_DLC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC5ActionPerformed
		TF_FF1_DLC5.setEnabled(CB_FF1_DLC5.isSelected());
		CheckBoxTipAL.get(9).setOpacity(CB_FF1_DLC5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF1_DLC5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC5ActionPerformed

	private void TF_FF1_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO1KeyReleased
		if(TF_FF1_ISO1.getText().length() > TitleDB.FF1_ISO_BATTLE.length()) {
			TF_FF1_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO1KeyReleased

	private void TF_FF1_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO2KeyReleased
		if(TF_FF1_ISO2.getText().length() > TitleDB.FF1_ISO_DUNGEON.length()) {
			TF_FF1_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO2KeyReleased

	private void TF_FF1_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO3KeyReleased
		if(TF_FF1_ISO3.getText().length() > TitleDB.FF1_ISO_CHAOSSHRINE.length()) {
			TF_FF1_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO3KeyReleased

	private void TF_FF1_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO4KeyReleased
		if(TF_FF1_ISO4.getText().length() > TitleDB.FF1_ISO_TOWN.length()) {
			TF_FF1_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO4KeyReleased

	private void TF_FF1_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO5KeyReleased
		if(TF_FF1_ISO5.getText().length() > TitleDB.FF1_ISO_MTGULG.length()) {
			TF_FF1_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO5KeyReleased

	private void TF_FF1_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC1KeyReleased
		if(TF_FF1_DLC1.getText().length() > 56) {
			TF_FF1_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC1KeyReleased

	private void TF_FF1_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC2KeyReleased
		if(TF_FF1_DLC2.getText().length() > 56) {
			TF_FF1_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC2KeyReleased

	private void TF_FF1_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC3KeyReleased
		if(TF_FF1_DLC3.getText().length() > 56) {
			TF_FF1_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC3KeyReleased

	private void TF_FF1_DLC4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC4KeyReleased
		if(TF_FF1_DLC4.getText().length() > 56) {
			TF_FF1_DLC4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_DLC4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_DLC4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC4KeyReleased

	private void TF_FF1_DLC5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC5KeyReleased
		if(TF_FF1_DLC5.getText().length() > 56) {
			TF_FF1_DLC5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF1_DLC5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF1_DLC5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC5KeyReleased

	private void CB_FF2_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO1ActionPerformed
		TF_FF2_ISO1.setEnabled(CB_FF2_ISO1.isSelected());
		CheckBoxTipAL.get(10).setOpacity(CB_FF2_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO1ActionPerformed

	private void CB_FF2_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO2ActionPerformed
		TF_FF2_ISO2.setEnabled(CB_FF2_ISO2.isSelected());
		CheckBoxTipAL.get(11).setOpacity(CB_FF2_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO2ActionPerformed

	private void CB_FF2_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO3ActionPerformed
		TF_FF2_ISO3.setEnabled(CB_FF2_ISO3.isSelected());
		CheckBoxTipAL.get(12).setOpacity(CB_FF2_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO3ActionPerformed

	private void CB_FF2_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO4ActionPerformed
		TF_FF2_ISO4.setEnabled(CB_FF2_ISO4.isSelected());
		CheckBoxTipAL.get(13).setOpacity(CB_FF2_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO4ActionPerformed

	private void CB_FF2_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO5ActionPerformed
		TF_FF2_ISO5.setEnabled(CB_FF2_ISO5.isSelected());
		CheckBoxTipAL.get(14).setOpacity(CB_FF2_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO5ActionPerformed

	private void CB_FF2_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_DLC1ActionPerformed
		TF_FF2_DLC1.setEnabled(CB_FF2_DLC1.isSelected());
		CheckBoxTipAL.get(15).setOpacity(CB_FF2_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_DLC1ActionPerformed

	private void CB_FF2_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_DLC2ActionPerformed
		TF_FF2_DLC2.setEnabled(CB_FF2_DLC2.isSelected());
		CheckBoxTipAL.get(16).setOpacity(CB_FF2_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_DLC2ActionPerformed

	private void CB_FF2_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_DLC3ActionPerformed
		TF_FF2_DLC3.setEnabled(CB_FF2_DLC3.isSelected());
		CheckBoxTipAL.get(17).setOpacity(CB_FF2_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF2_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_DLC3ActionPerformed

	private void TF_FF2_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO1KeyReleased
		if(TF_FF2_ISO1.getText().length() > TitleDB.FF2_ISO_BATTLETHEME1.length()) {
			TF_FF2_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO1KeyReleased

	private void TF_FF2_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO2KeyReleased
		if(TF_FF2_ISO2.getText().length() > TitleDB.FF2_ISO_BATTLETHEME2.length()) {
			TF_FF2_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO2KeyReleased

	private void TF_FF2_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO3KeyReleased
		if(TF_FF2_ISO3.getText().length() > TitleDB.FF2_ISO_CASTLEPANDEMONIUM.length()) {
			TF_FF2_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO3KeyReleased

	private void TF_FF2_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO4KeyReleased
		if(TF_FF2_ISO4.getText().length() > TitleDB.FF2_ISO_THEREBELARMY.length()) {
			TF_FF2_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO4KeyReleased

	private void TF_FF2_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO5KeyReleased
		if(TF_FF2_ISO5.getText().length() > TitleDB.FF2_ISO_THEIMPERIALARMY.length()) {
			TF_FF2_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO5KeyReleased

	private void TF_FF2_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_DLC1KeyReleased
		if(TF_FF2_DLC1.getText().length() > 56) {
			TF_FF2_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_DLC1KeyReleased

	private void TF_FF2_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_DLC2KeyReleased
		if(TF_FF2_DLC2.getText().length() > 56) {
			TF_FF2_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_DLC2KeyReleased

	private void TF_FF2_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_DLC3KeyReleased
		if(TF_FF2_DLC3.getText().length() > 56) {
			TF_FF2_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF2_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF2_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_DLC3KeyReleased

	private void CB_FF3_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO1ActionPerformed
		TF_FF3_ISO1.setEnabled(CB_FF3_ISO1.isSelected());
		CheckBoxTipAL.get(18).setOpacity(CB_FF3_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO1ActionPerformed

	private void CB_FF3_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO2ActionPerformed
		TF_FF3_ISO2.setEnabled(CB_FF3_ISO2.isSelected());
		CheckBoxTipAL.get(19).setOpacity(CB_FF3_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO2ActionPerformed

	private void CB_FF3_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO3ActionPerformed
		TF_FF3_ISO3.setEnabled(CB_FF3_ISO3.isSelected());
		CheckBoxTipAL.get(20).setOpacity(CB_FF3_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO3ActionPerformed

	private void CB_FF3_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO4ActionPerformed
		TF_FF3_ISO4.setEnabled(CB_FF3_ISO4.isSelected());
		CheckBoxTipAL.get(21).setOpacity(CB_FF3_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO4ActionPerformed

	private void CB_FF3_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO5ActionPerformed
		TF_FF3_ISO5.setEnabled(CB_FF3_ISO5.isSelected());
		CheckBoxTipAL.get(22).setOpacity(CB_FF3_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO5ActionPerformed

	private void CB_FF3_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_DLC1ActionPerformed
		TF_FF3_DLC1.setEnabled(CB_FF3_DLC1.isSelected());
		CheckBoxTipAL.get(23).setOpacity(CB_FF3_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_DLC1ActionPerformed

	private void CB_FF3_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_DLC2ActionPerformed
		TF_FF3_DLC2.setEnabled(CB_FF3_DLC2.isSelected());
		CheckBoxTipAL.get(24).setOpacity(CB_FF3_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_DLC2ActionPerformed

	private void CB_FF3_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_DLC3ActionPerformed
		TF_FF3_DLC3.setEnabled(CB_FF3_DLC3.isSelected());
		CheckBoxTipAL.get(25).setOpacity(CB_FF3_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF3_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_DLC3ActionPerformed

	private void TF_FF3_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO1KeyReleased
		if(TF_FF3_ISO1.getText().length() > TitleDB.FF3_ISO_BATTLE1.length()) {
			TF_FF3_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO1KeyReleased

	private void TF_FF3_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO2KeyReleased
		if(TF_FF3_ISO2.getText().length() > TitleDB.FF3_ISO_BATTLE2.length()) {
			TF_FF3_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO2KeyReleased

	private void TF_FF3_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO3KeyReleased
		if(TF_FF3_ISO3.getText().length() > TitleDB.FF3_ISO_THISISTHELASTBATTLE.length()) {
			TF_FF3_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO3KeyReleased

	private void TF_FF3_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO4KeyReleased
		if(TF_FF3_ISO4.getText().length() > TitleDB.FF3_ISO_THECRYSTALTOWER.length()) {
			TF_FF3_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO4KeyReleased

	private void TF_FF3_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO5KeyReleased
		if(TF_FF3_ISO5.getText().length() > TitleDB.FF3_ISO_LETMEKNOWTHETHRUTH.length()) {
			TF_FF3_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO5KeyReleased

	private void TF_FF3_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_DLC1KeyReleased
		if(TF_FF3_DLC1.getText().length() > 56) {
			TF_FF3_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_DLC1KeyReleased

	private void TF_FF3_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_DLC2KeyReleased
		if(TF_FF3_DLC2.getText().length() > 56) {
			TF_FF3_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_DLC2KeyReleased

	private void TF_FF3_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_DLC3KeyReleased
		if(TF_FF3_DLC3.getText().length() > 56) {
			TF_FF3_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF3_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF3_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_DLC3KeyReleased

	private void CB_FF4_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO1ActionPerformed
		TF_FF4_ISO1.setEnabled(CB_FF4_ISO1.isSelected());
		CheckBoxTipAL.get(26).setOpacity(CB_FF4_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO1ActionPerformed

	private void CB_FF4_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO2ActionPerformed
		TF_FF4_ISO2.setEnabled(CB_FF4_ISO2.isSelected());
		CheckBoxTipAL.get(27).setOpacity(CB_FF4_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO2ActionPerformed

	private void CB_FF4_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO3ActionPerformed
		TF_FF4_ISO3.setEnabled(CB_FF4_ISO3.isSelected());
		CheckBoxTipAL.get(28).setOpacity(CB_FF4_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO3ActionPerformed

	private void CB_FF4_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO4ActionPerformed
		TF_FF4_ISO4.setEnabled(CB_FF4_ISO4.isSelected());
		CheckBoxTipAL.get(29).setOpacity(CB_FF4_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO4ActionPerformed

	private void CB_FF4_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO5ActionPerformed
		TF_FF4_ISO5.setEnabled(CB_FF4_ISO5.isSelected());
		CheckBoxTipAL.get(30).setOpacity(CB_FF4_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO5ActionPerformed

	private void CB_FF4_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_DLC1ActionPerformed
		TF_FF4_DLC1.setEnabled(CB_FF4_DLC1.isSelected());
		CheckBoxTipAL.get(31).setOpacity(CB_FF4_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_DLC1ActionPerformed

	private void CB_FF4_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_DLC2ActionPerformed
		TF_FF4_DLC2.setEnabled(CB_FF4_DLC2.isSelected());
		CheckBoxTipAL.get(32).setOpacity(CB_FF4_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_DLC2ActionPerformed

	private void CB_FF4_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_DLC3ActionPerformed
		TF_FF4_DLC3.setEnabled(CB_FF4_DLC3.isSelected());
		CheckBoxTipAL.get(33).setOpacity(CB_FF4_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF4_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_DLC3ActionPerformed

	private void TF_FF4_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO1KeyReleased
		if(TF_FF4_ISO1.getText().length() > TitleDB.FF4_ISO_BATTLE1.length()) {
			TF_FF4_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO1KeyReleased

	private void TF_FF4_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO2KeyReleased
		if(TF_FF4_ISO2.getText().length() > TitleDB.FF4_ISO_BATTLE2.length()) {
			TF_FF4_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO2KeyReleased

	private void TF_FF4_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO3KeyReleased
		if(TF_FF4_ISO3.getText().length() > TitleDB.FF4_ISO_BATTLEWITHTHEFOURFIENDS.length()) {
			TF_FF4_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO3KeyReleased

	private void TF_FF4_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO4KeyReleased
		if(TF_FF4_ISO4.getText().length() > TitleDB.FF4_ISO_THEREDWINGS.length()) {
			TF_FF4_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO4KeyReleased

	private void TF_FF4_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO5KeyReleased
		if(TF_FF4_ISO5.getText().length() > TitleDB.FF4_ISO_THEMEOFLOVE.length()) {
			TF_FF4_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO5KeyReleased

	private void TF_FF4_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_DLC1KeyReleased
		if(TF_FF4_DLC1.getText().length() > 56) {
			TF_FF4_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_DLC1KeyReleased

	private void TF_FF4_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_DLC2KeyReleased
		if(TF_FF4_DLC2.getText().length() > 56) {
			TF_FF4_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_DLC2KeyReleased

	private void TF_FF4_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_DLC3KeyReleased
		if(TF_FF4_DLC3.getText().length() > 56) {
			TF_FF4_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF4_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF4_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_DLC3KeyReleased

	private void CB_FF5_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO1ActionPerformed
		TF_FF5_ISO1.setEnabled(CB_FF5_ISO1.isSelected());
		CheckBoxTipAL.get(34).setOpacity(CB_FF5_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO1ActionPerformed

	private void CB_FF5_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO2ActionPerformed
		TF_FF5_ISO2.setEnabled(CB_FF5_ISO2.isSelected());
		CheckBoxTipAL.get(35).setOpacity(CB_FF5_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO2ActionPerformed

	private void CB_FF5_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO3ActionPerformed
		TF_FF5_ISO3.setEnabled(CB_FF5_ISO3.isSelected());
		CheckBoxTipAL.get(36).setOpacity(CB_FF5_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO3ActionPerformed

	private void CB_FF5_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO4ActionPerformed
		TF_FF5_ISO4.setEnabled(CB_FF5_ISO4.isSelected());
		CheckBoxTipAL.get(37).setOpacity(CB_FF5_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO4ActionPerformed

	private void CB_FF5_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO5ActionPerformed
		TF_FF5_ISO5.setEnabled(CB_FF5_ISO5.isSelected());
		CheckBoxTipAL.get(38).setOpacity(CB_FF5_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO5ActionPerformed

	private void CB_FF5_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_DLC1ActionPerformed
		TF_FF5_DLC1.setEnabled(CB_FF5_DLC1.isSelected());
		CheckBoxTipAL.get(39).setOpacity(CB_FF5_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_DLC1ActionPerformed

	private void CB_FF5_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_DLC2ActionPerformed
		TF_FF5_DLC2.setEnabled(CB_FF5_DLC2.isSelected());
		CheckBoxTipAL.get(40).setOpacity(CB_FF5_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_DLC2ActionPerformed

	private void CB_FF5_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_DLC3ActionPerformed
		TF_FF5_DLC3.setEnabled(CB_FF5_DLC3.isSelected());
		CheckBoxTipAL.get(41).setOpacity(CB_FF5_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF5_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_DLC3ActionPerformed

	private void TF_FF5_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO1KeyReleased
		if(TF_FF5_ISO1.getText().length() > TitleDB.FF5_ISO_BATTLE1.length()) {
			TF_FF5_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO1KeyReleased

	private void TF_FF5_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO2KeyReleased
		if(TF_FF5_ISO2.getText().length() > TitleDB.FF5_ISO_BATTLEATTHEBIGBRIDGE.length()) {
			TF_FF5_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO2KeyReleased

	private void TF_FF5_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO3KeyReleased
		if(TF_FF5_ISO3.getText().length() > TitleDB.FF5_ISO_THEFINALBATTLE.length()) {
			TF_FF5_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO3KeyReleased

	private void TF_FF5_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO4KeyReleased
		if(TF_FF5_ISO4.getText().length() > TitleDB.FF5_ISO_THEDECISIVEBATTLE.length()) {
			TF_FF5_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO4KeyReleased

	private void TF_FF5_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO5KeyReleased
		if(TF_FF5_ISO5.getText().length() > TitleDB.FF5_ISO_HOMESWEETHOME.length()) {
			TF_FF5_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO5KeyReleased

	private void TF_FF5_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_DLC1KeyReleased
		if(TF_FF5_DLC1.getText().length() > 56) {
			TF_FF5_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_DLC1KeyReleased

	private void TF_FF5_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_DLC2KeyReleased
		if(TF_FF5_DLC2.getText().length() > 56) {
			TF_FF5_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_DLC2KeyReleased

	private void TF_FF5_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_DLC3KeyReleased
		if(TF_FF5_DLC3.getText().length() > 56) {
			TF_FF5_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF5_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF5_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_DLC3KeyReleased

	private void CB_FF6_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO1ActionPerformed
		TF_FF6_ISO1.setEnabled(CB_FF6_ISO1.isSelected());
		CheckBoxTipAL.get(42).setOpacity(CB_FF6_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO1ActionPerformed

	private void CB_FF6_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO2ActionPerformed
		TF_FF6_ISO2.setEnabled(CB_FF6_ISO2.isSelected());
		CheckBoxTipAL.get(43).setOpacity(CB_FF6_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO2ActionPerformed

	private void CB_FF6_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO3ActionPerformed
		TF_FF6_ISO3.setEnabled(CB_FF6_ISO3.isSelected());
		CheckBoxTipAL.get(44).setOpacity(CB_FF6_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO3ActionPerformed

	private void CB_FF6_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO4ActionPerformed
		TF_FF6_ISO4.setEnabled(CB_FF6_ISO4.isSelected());
		CheckBoxTipAL.get(45).setOpacity(CB_FF6_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO4ActionPerformed

	private void CB_FF6_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO5ActionPerformed
		TF_FF6_ISO5.setEnabled(CB_FF6_ISO5.isSelected());
		CheckBoxTipAL.get(46).setOpacity(CB_FF6_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO5ActionPerformed

	private void CB_FF6_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_DLC1ActionPerformed
		TF_FF6_DLC1.setEnabled(CB_FF6_DLC1.isSelected());
		CheckBoxTipAL.get(47).setOpacity(CB_FF6_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_DLC1ActionPerformed

	private void CB_FF6_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_DLC2ActionPerformed
		TF_FF6_DLC2.setEnabled(CB_FF6_DLC2.isSelected());
		CheckBoxTipAL.get(48).setOpacity(CB_FF6_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_DLC2ActionPerformed

	private void CB_FF6_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_DLC3ActionPerformed
		TF_FF6_DLC3.setEnabled(CB_FF6_DLC3.isSelected());
		CheckBoxTipAL.get(49).setOpacity(CB_FF6_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF6_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_DLC3ActionPerformed

	private void TF_FF6_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO1KeyReleased
		if(TF_FF6_ISO1.getText().length() > TitleDB.FF6_ISO_BATTLE.length()) {
			TF_FF6_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO1KeyReleased

	private void TF_FF6_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO2KeyReleased
		if(TF_FF6_ISO2.getText().length() > TitleDB.FF6_ISO_THEDECISIVEBATTLE.length()) {
			TF_FF6_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO2KeyReleased

	private void TF_FF6_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO3KeyReleased
		if(TF_FF6_ISO3.getText().length() > TitleDB.FF6_ISO_BATTLETOTHEDEATH.length()) {
			TF_FF6_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO3KeyReleased

	private void TF_FF6_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO4KeyReleased
		if(TF_FF6_ISO4.getText().length() > TitleDB.FF6_ISO_DANCINGMAD.length()) {
			TF_FF6_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO4KeyReleased

	private void TF_FF6_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO5KeyReleased
		if(TF_FF6_ISO5.getText().length() > TitleDB.FF6_ISO_SEARCHINGFORFRIENDS.length()) {
			TF_FF6_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO5KeyReleased

	private void TF_FF6_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_DLC1KeyReleased
		if(TF_FF6_DLC1.getText().length() > 56) {
			TF_FF6_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_DLC1KeyReleased

	private void TF_FF6_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_DLC2KeyReleased
		if(TF_FF6_DLC2.getText().length() > 56) {
			TF_FF6_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_DLC2KeyReleased

	private void TF_FF6_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_DLC3KeyReleased
		if(TF_FF6_DLC3.getText().length() > 56) {
			TF_FF6_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF6_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF6_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_DLC3KeyReleased

	private void CB_FF7_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO1ActionPerformed
		TF_FF7_ISO1.setEnabled(CB_FF7_ISO1.isSelected());
		CheckBoxTipAL.get(50).setOpacity(CB_FF7_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO1ActionPerformed

	private void CB_FF7_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO2ActionPerformed
		TF_FF7_ISO2.setEnabled(CB_FF7_ISO2.isSelected());
		CheckBoxTipAL.get(51).setOpacity(CB_FF7_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO2ActionPerformed

	private void CB_FF7_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO3ActionPerformed
		TF_FF7_ISO3.setEnabled(CB_FF7_ISO3.isSelected());
		CheckBoxTipAL.get(52).setOpacity(CB_FF7_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO3ActionPerformed

	private void CB_FF7_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO4ActionPerformed
		TF_FF7_ISO4.setEnabled(CB_FF7_ISO4.isSelected());
		CheckBoxTipAL.get(53).setOpacity(CB_FF7_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO4ActionPerformed

	private void CB_FF7_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO5ActionPerformed
		TF_FF7_ISO5.setEnabled(CB_FF7_ISO5.isSelected());
		CheckBoxTipAL.get(54).setOpacity(CB_FF7_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO5ActionPerformed

	private void CB_FF7_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_DLC1ActionPerformed
		TF_FF7_DLC1.setEnabled(CB_FF7_DLC1.isSelected());
		CheckBoxTipAL.get(55).setOpacity(CB_FF7_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_DLC1ActionPerformed

	private void CB_FF7_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_DLC2ActionPerformed
		TF_FF7_DLC2.setEnabled(CB_FF7_DLC2.isSelected());
		CheckBoxTipAL.get(56).setOpacity(CB_FF7_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_DLC2ActionPerformed

	private void CB_FF7_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_DLC3ActionPerformed
		TF_FF7_DLC3.setEnabled(CB_FF7_DLC3.isSelected());
		CheckBoxTipAL.get(57).setOpacity(CB_FF7_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF7_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_DLC3ActionPerformed

	private void TF_FF7_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO1KeyReleased
		if(TF_FF7_ISO1.getText().length() > TitleDB.FF7_ISO_FIGHTON.length()) {
			TF_FF7_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO1KeyReleased

	private void TF_FF7_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO2KeyReleased
		if(TF_FF7_ISO2.getText().length() > TitleDB.FF7_ISO_JENOVA.length()) {
			TF_FF7_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO2KeyReleased

	private void TF_FF7_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO3KeyReleased
		if(TF_FF7_ISO3.getText().length() > TitleDB.FF7_ISO_ONEWINGEDANGEL.length()) {
			TF_FF7_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO3KeyReleased

	private void TF_FF7_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO4KeyReleased
		if(TF_FF7_ISO4.getText().length() > TitleDB.FF7_ISO_OPENINGBOMBINGMISSION.length()) {
			TF_FF7_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO4KeyReleased

	private void TF_FF7_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO5KeyReleased
		if(TF_FF7_ISO5.getText().length() > TitleDB.FF7_ISO_LETTHEBATTLESBEGIN.length()) {
			TF_FF7_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO5KeyReleased

	private void TF_FF7_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_DLC1KeyReleased
		if(TF_FF7_DLC1.getText().length() > 56) {
			TF_FF7_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_DLC1KeyReleased

	private void TF_FF7_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_DLC2KeyReleased
		if(TF_FF7_DLC2.getText().length() > 56) {
			TF_FF7_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_DLC2KeyReleased

	private void TF_FF7_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_DLC3KeyReleased
		if(TF_FF7_DLC3.getText().length() > 56) {
			TF_FF7_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF7_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF7_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_DLC3KeyReleased

	private void CB_FF8_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO1ActionPerformed
		TF_FF8_ISO1.setEnabled(CB_FF8_ISO1.isSelected());
		CheckBoxTipAL.get(58).setOpacity(CB_FF8_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO1ActionPerformed

	private void CB_FF8_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO2ActionPerformed
		TF_FF8_ISO2.setEnabled(CB_FF8_ISO2.isSelected());
		CheckBoxTipAL.get(59).setOpacity(CB_FF8_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO2ActionPerformed

	private void CB_FF8_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO3ActionPerformed
		TF_FF8_ISO3.setEnabled(CB_FF8_ISO3.isSelected());
		CheckBoxTipAL.get(60).setOpacity(CB_FF8_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO3ActionPerformed

	private void CB_FF8_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO4ActionPerformed
		TF_FF8_ISO4.setEnabled(CB_FF8_ISO4.isSelected());
		CheckBoxTipAL.get(61).setOpacity(CB_FF8_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO4ActionPerformed

	private void CB_FF8_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO5ActionPerformed
		TF_FF8_ISO5.setEnabled(CB_FF8_ISO5.isSelected());
		CheckBoxTipAL.get(62).setOpacity(CB_FF8_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO5ActionPerformed

	private void CB_FF8_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_DLC1ActionPerformed
		TF_FF8_DLC1.setEnabled(CB_FF8_DLC1.isSelected());
		CheckBoxTipAL.get(63).setOpacity(CB_FF8_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_DLC1ActionPerformed

	private void CB_FF8_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_DLC2ActionPerformed
		TF_FF8_DLC2.setEnabled(CB_FF8_DLC2.isSelected());
		CheckBoxTipAL.get(64).setOpacity(CB_FF8_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_DLC2ActionPerformed

	private void CB_FF8_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_DLC3ActionPerformed
		TF_FF8_DLC3.setEnabled(CB_FF8_DLC3.isSelected());
		CheckBoxTipAL.get(65).setOpacity(CB_FF8_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF8_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_DLC3ActionPerformed

	private void TF_FF8_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO1KeyReleased
		if(TF_FF8_ISO1.getText().length() > TitleDB.FF8_ISO_DONTBEAFRAID.length()) {
			TF_FF8_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO1KeyReleased

	private void TF_FF8_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO2KeyReleased
		if(TF_FF8_ISO2.getText().length() > TitleDB.FF8_ISO_FORCEYOURWAY.length()) {
			TF_FF8_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO2KeyReleased

	private void TF_FF8_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO3KeyReleased
		if(TF_FF8_ISO3.getText().length() > TitleDB.FF8_ISO_THEEXTREME.length()) {
			TF_FF8_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO3KeyReleased

	private void TF_FF8_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO4KeyReleased
		if(TF_FF8_ISO4.getText().length() > TitleDB.FF8_ISO_THEMANWITHTHEMACHINEGUN.length()) {
			TF_FF8_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO4KeyReleased

	private void TF_FF8_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO5KeyReleased
		if(TF_FF8_ISO5.getText().length() > TitleDB.FF8_ISO_PREMONITION.length()) {
			TF_FF8_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO5KeyReleased

	private void TF_FF8_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_DLC1KeyReleased
		if(TF_FF8_DLC1.getText().length() > 56) {
			TF_FF8_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_DLC1KeyReleased

	private void TF_FF8_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_DLC2KeyReleased
		if(TF_FF8_DLC2.getText().length() > 56) {
			TF_FF8_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_DLC2KeyReleased

	private void TF_FF8_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_DLC3KeyReleased
		if(TF_FF8_DLC3.getText().length() > 56) {
			TF_FF8_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF8_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF8_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_DLC3KeyReleased

	private void CB_FF9_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO1ActionPerformed
		TF_FF9_ISO1.setEnabled(CB_FF9_ISO1.isSelected());
		CheckBoxTipAL.get(66).setOpacity(CB_FF9_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO1ActionPerformed

	private void CB_FF9_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO2ActionPerformed
		TF_FF9_ISO2.setEnabled(CB_FF9_ISO2.isSelected());
		CheckBoxTipAL.get(67).setOpacity(CB_FF9_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO2ActionPerformed

	private void CB_FF9_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO3ActionPerformed
		TF_FF9_ISO3.setEnabled(CB_FF9_ISO3.isSelected());
		CheckBoxTipAL.get(68).setOpacity(CB_FF9_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO3ActionPerformed

	private void CB_FF9_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO4ActionPerformed
		TF_FF9_ISO4.setEnabled(CB_FF9_ISO4.isSelected());
		CheckBoxTipAL.get(69).setOpacity(CB_FF9_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO4ActionPerformed

	private void CB_FF9_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO5ActionPerformed
		TF_FF9_ISO5.setEnabled(CB_FF9_ISO5.isSelected());
		CheckBoxTipAL.get(70).setOpacity(CB_FF9_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO5ActionPerformed

	private void CB_FF9_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_DLC1ActionPerformed
		TF_FF9_DLC1.setEnabled(CB_FF9_DLC1.isSelected());
		CheckBoxTipAL.get(71).setOpacity(CB_FF9_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_DLC1ActionPerformed

	private void CB_FF9_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_DLC2ActionPerformed
		TF_FF9_DLC2.setEnabled(CB_FF9_DLC2.isSelected());
		CheckBoxTipAL.get(72).setOpacity(CB_FF9_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_DLC2ActionPerformed

	private void CB_FF9_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_DLC3ActionPerformed
		TF_FF9_DLC3.setEnabled(CB_FF9_DLC3.isSelected());
		CheckBoxTipAL.get(73).setOpacity(CB_FF9_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF9_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_DLC3ActionPerformed

	private void TF_FF9_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO1KeyReleased
		if(TF_FF9_ISO1.getText().length() > TitleDB.FF9_ISO_BATTLE1.length()) {
			TF_FF9_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO1KeyReleased

	private void TF_FF9_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO2KeyReleased
		if(TF_FF9_ISO2.getText().length() > TitleDB.FF9_ISO_BATTLE2.length()) {
			TF_FF9_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO2KeyReleased

	private void TF_FF9_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO3KeyReleased
		if(TF_FF9_ISO3.getText().length() > TitleDB.FF9_ISO_THEFINALBATTLE.length()) {
			TF_FF9_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO3KeyReleased

	private void TF_FF9_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO4KeyReleased
		if(TF_FF9_ISO4.getText().length() > TitleDB.FF9_ISO_THEDARKNESSOFETERNITY.length()) {
			TF_FF9_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO4KeyReleased

	private void TF_FF9_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO5KeyReleased
		if(TF_FF9_ISO5.getText().length() > TitleDB.FF9_ISO_NOTALONE.length()) {
			TF_FF9_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO5KeyReleased

	private void TF_FF9_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_DLC1KeyReleased
		if(TF_FF9_DLC1.getText().length() > 56) {
			TF_FF9_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_DLC1KeyReleased

	private void TF_FF9_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_DLC2KeyReleased
		if(TF_FF9_DLC2.getText().length() > 56) {
			TF_FF9_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_DLC2KeyReleased

	private void TF_FF9_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_DLC3KeyReleased
		if(TF_FF9_DLC3.getText().length() > 56) {
			TF_FF9_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF9_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF9_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_DLC3KeyReleased

	private void CB_FF10_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO1ActionPerformed
		TF_FF10_ISO1.setEnabled(CB_FF10_ISO1.isSelected());
		CheckBoxTipAL.get(74).setOpacity(CB_FF10_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO1ActionPerformed

	private void CB_FF10_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO2ActionPerformed
		TF_FF10_ISO2.setEnabled(CB_FF10_ISO2.isSelected());
		CheckBoxTipAL.get(75).setOpacity(CB_FF10_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO2ActionPerformed

	private void CB_FF10_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO3ActionPerformed
		TF_FF10_ISO3.setEnabled(CB_FF10_ISO3.isSelected());
		CheckBoxTipAL.get(76).setOpacity(CB_FF10_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);;
	}//GEN-LAST:event_CB_FF10_ISO3ActionPerformed

	private void CB_FF10_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO4ActionPerformed
		TF_FF10_ISO4.setEnabled(CB_FF10_ISO4.isSelected());
		CheckBoxTipAL.get(77).setOpacity(CB_FF10_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO4ActionPerformed

	private void CB_FF10_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO5ActionPerformed
		TF_FF10_ISO5.setEnabled(CB_FF10_ISO5.isSelected());
		CheckBoxTipAL.get(78).setOpacity(CB_FF10_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO5ActionPerformed

	private void CB_FF10_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_DLC1ActionPerformed
		TF_FF10_DLC1.setEnabled(CB_FF10_DLC1.isSelected());
		CheckBoxTipAL.get(79).setOpacity(CB_FF10_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_DLC1ActionPerformed

	private void CB_FF10_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_DLC2ActionPerformed
		TF_FF10_DLC2.setEnabled(CB_FF10_DLC2.isSelected());
		CheckBoxTipAL.get(80).setOpacity(CB_FF10_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_DLC2ActionPerformed

	private void CB_FF10_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_DLC3ActionPerformed
		TF_FF10_DLC3.setEnabled(CB_FF10_DLC3.isSelected());
		CheckBoxTipAL.get(81).setOpacity(CB_FF10_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF10_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_DLC3ActionPerformed

	private void TF_FF10_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO1KeyReleased
		if(TF_FF10_ISO1.getText().length() > TitleDB.FF10_ISO_BATTLETHEME.length()) {
			TF_FF10_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO1KeyReleased

	private void TF_FF10_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO2KeyReleased
		if(TF_FF10_ISO2.getText().length() > TitleDB.FF10_ISO_OTHERWORLD.length()) {
			TF_FF10_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO2KeyReleased

	private void TF_FF10_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO3KeyReleased
		if(TF_FF10_ISO3.getText().length() > TitleDB.FF10_ISO_SUMMONEDMONSTERBATTLE.length()) {
			TF_FF10_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO3KeyReleased

	private void TF_FF10_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO4KeyReleased
		if(TF_FF10_ISO4.getText().length() > TitleDB.FF10_ISO_FIGHTWITHSEYMOUR.length()) {
			TF_FF10_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO4KeyReleased

	private void TF_FF10_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO5KeyReleased
		if(TF_FF10_ISO5.getText().length() > TitleDB.FF10_ISO_AFLEETINGDREAM.length()) {
			TF_FF10_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO5KeyReleased

	private void TF_FF10_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_DLC1KeyReleased
		if(TF_FF10_DLC1.getText().length() > 56) {
			TF_FF10_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_DLC1KeyReleased

	private void TF_FF10_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_DLC2KeyReleased
		if(TF_FF10_DLC2.getText().length() > 56) {
			TF_FF10_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_DLC2KeyReleased

	private void TF_FF10_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_DLC3KeyReleased
		if(TF_FF10_DLC3.getText().length() > 56) {
			TF_FF10_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF10_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF10_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_DLC3KeyReleased

	private void CB_FF11_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO1ActionPerformed
		TF_FF11_ISO1.setEnabled(CB_FF11_ISO1.isSelected());
		CheckBoxTipAL.get(82).setOpacity(CB_FF11_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO1ActionPerformed

	private void CB_FF11_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO2ActionPerformed
		TF_FF11_ISO2.setEnabled(CB_FF11_ISO2.isSelected());
		CheckBoxTipAL.get(83).setOpacity(CB_FF11_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO2ActionPerformed

	private void CB_FF11_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO3ActionPerformed
		TF_FF11_ISO3.setEnabled(CB_FF11_ISO3.isSelected());
		CheckBoxTipAL.get(84).setOpacity(CB_FF11_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO3ActionPerformed

	private void CB_FF11_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO4ActionPerformed
		TF_FF11_ISO4.setEnabled(CB_FF11_ISO4.isSelected());
		CheckBoxTipAL.get(85).setOpacity(CB_FF11_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO4ActionPerformed

	private void CB_FF11_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_DLC1ActionPerformed
		TF_FF11_DLC1.setEnabled(CB_FF11_DLC1.isSelected());
		CheckBoxTipAL.get(86).setOpacity(CB_FF11_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_DLC1ActionPerformed

	private void CB_FF11_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_DLC2ActionPerformed
		TF_FF11_DLC2.setEnabled(CB_FF11_DLC2.isSelected());
		CheckBoxTipAL.get(87).setOpacity(CB_FF11_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_DLC2ActionPerformed

	private void CB_FF11_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_DLC3ActionPerformed
		TF_FF11_DLC3.setEnabled(CB_FF11_DLC3.isSelected());
		CheckBoxTipAL.get(88).setOpacity(CB_FF11_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF11_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_DLC3ActionPerformed

	private void TF_FF11_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO1KeyReleased
		if(TF_FF11_ISO1.getText().length() > TitleDB.FF11_ISO_BATTLEINTHEDUNGEON2.length()) {
			TF_FF11_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO1KeyReleased

	private void TF_FF11_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO2KeyReleased
		if(TF_FF11_ISO2.getText().length() > TitleDB.FF11_ISO_AREALMOFEMPTINESS.length()) {
			TF_FF11_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO2KeyReleased

	private void TF_FF11_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO3KeyReleased
		if(TF_FF11_ISO3.getText().length() > TitleDB.FF11_ISO_AWAKENING.length()) {
			TF_FF11_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO3KeyReleased

	private void TF_FF11_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO4KeyReleased
		if(TF_FF11_ISO4.getText().length() > TitleDB.FF11_ISO_IRONCOLOSSUS.length()) {
			TF_FF11_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO4KeyReleased

	private void TF_FF11_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_DLC1KeyReleased
		if(TF_FF11_DLC1.getText().length() > 56) {
			TF_FF11_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_DLC1KeyReleased

	private void TF_FF11_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_DLC2KeyReleased
		if(TF_FF11_DLC2.getText().length() > 56) {
			TF_FF11_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_DLC2KeyReleased

	private void TF_FF11_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_DLC3KeyReleased
		if(TF_FF11_DLC3.getText().length() > 56) {
			TF_FF11_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF11_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF11_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_DLC3KeyReleased

	private void CB_FF12_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO1ActionPerformed
		TF_FF12_ISO1.setEnabled(CB_FF12_ISO1.isSelected());
		CheckBoxTipAL.get(89).setOpacity(CB_FF12_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO1ActionPerformed

	private void CB_FF12_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO2ActionPerformed
		TF_FF12_ISO2.setEnabled(CB_FF12_ISO2.isSelected());
		CheckBoxTipAL.get(90).setOpacity(CB_FF12_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO2ActionPerformed

	private void CB_FF12_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO3ActionPerformed
		TF_FF12_ISO3.setEnabled(CB_FF12_ISO3.isSelected());
		CheckBoxTipAL.get(91).setOpacity(CB_FF12_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO3ActionPerformed

	private void CB_FF12_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO4ActionPerformed
		TF_FF12_ISO4.setEnabled(CB_FF12_ISO4.isSelected());
		CheckBoxTipAL.get(92).setOpacity(CB_FF12_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO4ActionPerformed

	private void CB_FF12_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_DLC1ActionPerformed
		TF_FF12_DLC1.setEnabled(CB_FF12_DLC1.isSelected());
		CheckBoxTipAL.get(93).setOpacity(CB_FF12_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_DLC1ActionPerformed

	private void CB_FF12_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_DLC2ActionPerformed
		TF_FF12_DLC2.setEnabled(CB_FF12_DLC2.isSelected());
		CheckBoxTipAL.get(94).setOpacity(CB_FF12_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_DLC2ActionPerformed

	private void CB_FF12_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_DLC3ActionPerformed
		TF_FF12_DLC3.setEnabled(CB_FF12_DLC3.isSelected());
		CheckBoxTipAL.get(95).setOpacity(CB_FF12_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF12_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_DLC3ActionPerformed

	private void TF_FF12_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO1KeyReleased
		if(TF_FF12_ISO1.getText().length() > TitleDB.FF12_ISO_BOSSBATTLE.length()) {
			TF_FF12_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO1KeyReleased

	private void TF_FF12_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO2KeyReleased
		if(TF_FF12_ISO2.getText().length() > TitleDB.FF12_ISO_ESPERBATTLE.length()) {
			TF_FF12_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO2KeyReleased

	private void TF_FF12_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO3KeyReleased
		if(TF_FF12_ISO3.getText().length() > TitleDB.FF12_ISO_FIGHTTOTHEDEATH.length()) {
			TF_FF12_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO3KeyReleased

	private void TF_FF12_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO4KeyReleased
		if(TF_FF12_ISO4.getText().length() > TitleDB.FF12_ISO_THEBATTLEFORFREEDOM.length()) {
			TF_FF12_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO4KeyReleased

	private void TF_FF12_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_DLC1KeyReleased
		if(TF_FF12_DLC1.getText().length() > 56) {
			TF_FF12_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_DLC1KeyReleased

	private void TF_FF12_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_DLC2KeyReleased
		if(TF_FF12_DLC2.getText().length() > 56) {
			TF_FF12_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_DLC2KeyReleased

	private void TF_FF12_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_DLC3KeyReleased
		if(TF_FF12_DLC3.getText().length() > 56) {
			TF_FF12_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF12_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF12_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_DLC3KeyReleased

	private void CB_FF13_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_ISO1ActionPerformed
		TF_FF13_ISO1.setEnabled(CB_FF13_ISO1.isSelected());
		CheckBoxTipAL.get(96).setOpacity(CB_FF13_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_ISO1ActionPerformed

	private void CB_FF13_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_ISO2ActionPerformed
		TF_FF13_ISO2.setEnabled(CB_FF13_ISO2.isSelected());
		CheckBoxTipAL.get(97).setOpacity(CB_FF13_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_ISO2ActionPerformed

	private void CB_FF13_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_ISO3ActionPerformed
		TF_FF13_ISO3.setEnabled(CB_FF13_ISO3.isSelected());
		CheckBoxTipAL.get(98).setOpacity(CB_FF13_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_ISO3ActionPerformed

	private void CB_FF13_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC1ActionPerformed
		TF_FF13_DLC1.setEnabled(CB_FF13_DLC1.isSelected());
		CheckBoxTipAL.get(99).setOpacity(CB_FF13_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC1ActionPerformed

	private void CB_FF13_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC2ActionPerformed
		TF_FF13_DLC2.setEnabled(CB_FF13_DLC2.isSelected());
		CheckBoxTipAL.get(100).setOpacity(CB_FF13_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC2ActionPerformed

	private void CB_FF13_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC3ActionPerformed
		TF_FF13_DLC3.setEnabled(CB_FF13_DLC3.isSelected());
		CheckBoxTipAL.get(101).setOpacity(CB_FF13_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC3ActionPerformed

	private void CB_FF13_DLC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC4ActionPerformed
		TF_FF13_DLC4.setEnabled(CB_FF13_DLC4.isSelected());
		CheckBoxTipAL.get(102).setOpacity(CB_FF13_DLC4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_DLC4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC4ActionPerformed

	private void CB_FF13_DLC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC5ActionPerformed
		TF_FF13_DLC5.setEnabled(CB_FF13_DLC5.isSelected());
		CheckBoxTipAL.get(103).setOpacity(CB_FF13_DLC5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_FF13_DLC5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC5ActionPerformed

	private void TF_FF13_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_ISO1KeyReleased
		if(TF_FF13_ISO1.getText().length() > TitleDB.FF13_ISO_BLINDEDBYLIGHT.length()) {
			TF_FF13_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_ISO1KeyReleased

	private void TF_FF13_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_ISO2KeyReleased
		if(TF_FF13_ISO2.getText().length() > TitleDB.FF13_ISO_SABERSEDGE.length()) {
			TF_FF13_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_ISO2KeyReleased

	private void TF_FF13_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_ISO3KeyReleased
		if(TF_FF13_ISO3.getText().length() > TitleDB.FF13_ISO_NASCENTREQUIEM.length()) {
			TF_FF13_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_ISO3KeyReleased

	private void TF_FF13_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC1KeyReleased
		if(TF_FF13_DLC1.getText().length() > 56) {
			TF_FF13_DLC1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_DLC1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_DLC1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC1KeyReleased

	private void TF_FF13_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC2KeyReleased
		if(TF_FF13_DLC2.getText().length() > 56) {
			TF_FF13_DLC2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_DLC2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_DLC2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC2KeyReleased

	private void TF_FF13_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC3KeyReleased
		if(TF_FF13_DLC3.getText().length() > 56) {
			TF_FF13_DLC3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_DLC3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_DLC3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC3KeyReleased

	private void TF_FF13_DLC4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC4KeyReleased
		if(TF_FF13_DLC4.getText().length() > 56) {
			TF_FF13_DLC4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_DLC4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_DLC4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC4KeyReleased

	private void TF_FF13_DLC5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC5KeyReleased
		if(TF_FF13_DLC5.getText().length() > 56) {
			TF_FF13_DLC5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_FF13_DLC5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_FF13_DLC5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC5KeyReleased

	private void CB_DDFF_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO1ActionPerformed
		TF_DDFF_ISO1.setEnabled(CB_DDFF_ISO1.isSelected());
		CheckBoxTipAL.get(104).setOpacity(CB_DDFF_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_DDFF_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO1ActionPerformed

	private void CB_DDFF_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO2ActionPerformed
		TF_DDFF_ISO2.setEnabled(CB_DDFF_ISO2.isSelected());
		CheckBoxTipAL.get(105).setOpacity(CB_DDFF_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_DDFF_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO2ActionPerformed

	private void CB_DDFF_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO3ActionPerformed
		TF_DDFF_ISO3.setEnabled(CB_DDFF_ISO3.isSelected());
		CheckBoxTipAL.get(106).setOpacity(CB_DDFF_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_DDFF_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO3ActionPerformed

	private void CB_DDFF_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO4ActionPerformed
		TF_DDFF_ISO4.setEnabled(CB_DDFF_ISO4.isSelected());
		CheckBoxTipAL.get(107).setOpacity(CB_DDFF_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_DDFF_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO4ActionPerformed

	private void CB_DDFF_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO5ActionPerformed
		TF_DDFF_ISO5.setEnabled(CB_DDFF_ISO5.isSelected());
		CheckBoxTipAL.get(108).setOpacity(CB_DDFF_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_DDFF_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO5ActionPerformed

	private void CB_DDFF_ISO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO6ActionPerformed
		TF_DDFF_ISO6.setEnabled(CB_DDFF_ISO6.isSelected());
		CheckBoxTipAL.get(109).setOpacity(CB_DDFF_ISO6.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.PlayCustomSound(CB_DDFF_ISO6.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO6ActionPerformed

	private void TF_DDFF_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO1KeyReleased
		if(TF_DDFF_ISO1.getText().length() > TitleDB.DDFF_ISO_COSMOS.length()) {
			TF_DDFF_ISO1.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_DDFF_ISO1);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_DDFF_ISO1.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO1KeyReleased

	private void TF_DDFF_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO2KeyReleased
		if(TF_DDFF_ISO2.getText().length() > TitleDB.DDFF_ISO_CHAOSLASTBATTLE1.length()) {
			TF_DDFF_ISO2.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_DDFF_ISO2);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_DDFF_ISO2.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO2KeyReleased

	private void TF_DDFF_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO3KeyReleased
		if(TF_DDFF_ISO3.getText().length() > TitleDB.DDFF_ISO_CHAOSLASTBATTLE2.length()) {
			TF_DDFF_ISO3.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_DDFF_ISO3);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_DDFF_ISO3.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO3KeyReleased

	private void TF_DDFF_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO4KeyReleased
		if(TF_DDFF_ISO4.getText().length() > TitleDB.DDFF_ISO_CHAOSLASTBATTLE3.length()) {
			TF_DDFF_ISO4.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_DDFF_ISO4);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_DDFF_ISO4.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO4KeyReleased

	private void TF_DDFF_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO5KeyReleased
		if(TF_DDFF_ISO5.getText().length() > TitleDB.DDFF_ISO_CANTATAMORTISGODINFIRE.length()) {
			TF_DDFF_ISO5.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_DDFF_ISO5);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_DDFF_ISO5.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO5KeyReleased

	private void TF_DDFF_ISO6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO6KeyReleased
		if(TF_DDFF_ISO6.getText().length() > TitleDB.DDFF_ISO_OPENING.length()) {
			TF_DDFF_ISO6.setForeground(Color.RED);
			CharLimitBalloon.setAttachedComponent(TF_DDFF_ISO6);
			TimingUtils.showTimedBalloon(CharLimitBalloon, 3000);
		}
		else {
			TF_DDFF_ISO6.setForeground(Color.BLACK);
			CharLimitBalloon.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO6KeyReleased

	private void P_FF1_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF1_PICMouseClicked
		switch(P_FF1_PIC.getImageID()) {
			case 0:
				P_FF1_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF1_2) } );
				P_FF1.setGradientColors(P_FF1.getGradientStartColor(), new Color(190, 210, 220));
				P_FF1_PIC.setImageID(1);
				break;
			case 1:
				P_FF1_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF1_3) } );
				P_FF1.setGradientColors(P_FF1.getGradientStartColor(), new Color(190, 210, 220));
				P_FF1_PIC.setImageID(2);
				break;
			case 2:
				P_FF1_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF1) } );
				P_FF1.setGradientColors(P_FF1.getGradientStartColor(), new Color(190, 210, 220));
				P_FF1_PIC.setImageID(0);
				break;
		}
		P_FF1.repaint();
		P_FF1_PIC.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF1_PICMouseClicked

	private void P_FF2_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF2_PICMouseClicked
		switch(P_FF2_PIC.getImageID()) {
			case 0:
				P_FF2_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF2_2) } );
				P_FF2.setGradientColors(P_FF2.getGradientStartColor(), new Color(220, 205, 215));
				P_FF2_PIC.setImageID(1);
				break;
			case 1:
				P_FF2_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF2) } );
				P_FF2.setGradientColors(P_FF2.getGradientStartColor(), new Color(220, 205, 215));
				P_FF2_PIC.setImageID(0);
				break;
		}
		P_FF2.repaint();
		P_FF2_PIC.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF2_PICMouseClicked

	private void P_FF3_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF3_PICMouseClicked

	}//GEN-LAST:event_P_FF3_PICMouseClicked

	private void P_FF4_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF4_PICMouseClicked
		switch(P_FF4_PIC.getImageID()) {
			case 0:
				P_FF4_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF4_2) } );
				P_FF4.setGradientColors(P_FF4.getGradientStartColor(), new Color(180, 200, 245));
				P_FF4_PIC.setImageID(1);
				break;
			case 1:
				P_FF4_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF4_3) } );
				P_FF4.setGradientColors(P_FF4.getGradientStartColor(), new Color(215, 205, 235));
				P_FF4_PIC.setImageID(2);
				break;
			case 2:
				P_FF4_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF4) } );
				P_FF4.setGradientColors(P_FF4.getGradientStartColor(), new Color(200, 190, 200));
				P_FF4_PIC.setImageID(0);
				break;
		}
		P_FF4_PIC.repaint();
		P_FF4.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF4_PICMouseClicked

	private void P_FF5_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF5_PICMouseClicked

	}//GEN-LAST:event_P_FF5_PICMouseClicked

	private void P_FF6_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF6_PICMouseClicked

	}//GEN-LAST:event_P_FF6_PICMouseClicked

	private void P_FF7_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF7_PICMouseClicked
		switch(P_FF7_PIC.getImageID()) {
			case 0:
				P_FF7_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF7_2) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(200, 210, 210));
				P_FF7_PIC.setImageID(1);
				break;
			case 1:
				P_FF7_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF7) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(190, 205, 210));
				P_FF7_PIC.setImageID(0);
				break;
		}
		P_FF7_PIC.repaint();
		P_FF7.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF7_PICMouseClicked

	private void P_FF8_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF8_PICMouseClicked

	}//GEN-LAST:event_P_FF8_PICMouseClicked

	private void P_FF9_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF9_PICMouseClicked

	}//GEN-LAST:event_P_FF9_PICMouseClicked

	private void P_FF10_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF10_PICMouseClicked
		switch(P_FF10_PIC.getImageID()) {
			case 0:
				P_FF10_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF10_2) } );
				P_FF10.setGradientColors(P_FF10.getGradientStartColor(), new Color(220, 210, 240));
				P_FF10_PIC.setImageID(1);
				break;
			case 1:
				P_FF10_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF10) } );
				P_FF10.setGradientColors(P_FF10.getGradientStartColor(), new Color(190, 195, 215));
				P_FF10_PIC.setImageID(0);
				break;
		}
		P_FF10_PIC.repaint();
		P_FF10.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF10_PICMouseClicked

	private void P_FF11_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF11_PICMouseClicked

	}//GEN-LAST:event_P_FF11_PICMouseClicked

	private void P_FF12_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF12_PICMouseClicked
		switch(P_FF12_PIC.getImageID()) {
			case 0:
				P_FF12_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF12_2) } );
				P_FF12.setGradientColors(P_FF12.getGradientStartColor(), new Color(190, 210, 220));
				P_FF12_PIC.setImageID(1);
				break;
			case 1:
				P_FF12_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF12) } );
				P_FF12.setGradientColors(P_FF12.getGradientStartColor(), new Color(190, 195, 200));
				P_FF12_PIC.setImageID(0);
				break;
		}
		P_FF12_PIC.repaint();
		P_FF12.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF12_PICMouseClicked

	private void P_FF13_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF13_PICMouseClicked
		switch(P_FF13_PIC.getImageID()) {
			case 0:
				P_FF13_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF13_2) } );
				P_FF13.setGradientColors(P_FF13.getGradientStartColor(), new Color(210, 190, 200));
				P_FF13_PIC.setImageID(1);
				break;
			case 1:
				P_FF13_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF13_3) } );
				P_FF13.setGradientColors(P_FF13.getGradientStartColor(), new Color(190, 195, 200));
				P_FF13_PIC.setImageID(2);
				break;
			case 2:
				P_FF13_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF13) } );
				P_FF13.setGradientColors(P_FF13.getGradientStartColor(), new Color(200, 210, 210));
				P_FF13_PIC.setImageID(0);
				break;
		}
		P_FF13_PIC.repaint();
		P_FF13.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF13_PICMouseClicked

	private void P_DDFF_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_DDFF_PICMouseClicked
		switch(P_DDFF_PIC.getImageID()) {
			case 0:
				P_DDFF_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_DDFF_2) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(145, 155, 160));
				P_DDFF_PIC.setImageID(1);
				break;
			case 1:
				P_DDFF_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_DDFF_3) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(190, 210, 225));
				P_DDFF_PIC.setImageID(2);
				break;
			case 2:
				P_DDFF_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_DDFF_4) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(215, 195, 195));
				P_DDFF_PIC.setImageID(3);
				break;
			case 3:
				P_DDFF_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_DDFF) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(170, 170, 150));
				P_DDFF_PIC.setImageID(0);
				break;
		}
		P_DDFF_PIC.repaint();
		P_DDFF.repaint();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_DDFF_PICMouseClicked

	private void B_ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ExportarActionPerformed
		GenerateCheatDB();
	}//GEN-LAST:event_B_ExportarActionPerformed

	private void B_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SaveActionPerformed
		SaveTitleList();
	}//GEN-LAST:event_B_SaveActionPerformed

	private void B_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LoadActionPerformed
		LoadTitleList();
	}//GEN-LAST:event_B_LoadActionPerformed

	private void MI_PortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_PortuguesActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		Idioma = MessageDB.IDIOMA_PT;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_PortuguesActionPerformed

	private void MI_EnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_EnglishActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		Idioma = MessageDB.IDIOMA_EN;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_EnglishActionPerformed

		private void MI_DeutschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_DeutschActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		Idioma = MessageDB.IDIOMA_DE;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_DeutschActionPerformed

	private void MI_EspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_EspanolActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		Idioma = MessageDB.IDIOMA_ES;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_EspanolActionPerformed

	private void MI_FrancaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_FrancaiseActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		Idioma = MessageDB.IDIOMA_FR;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_FrancaiseActionPerformed

	private void MI_ItalianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ItalianoActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		Idioma = MessageDB.IDIOMA_IT;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_ItalianoActionPerformed

	private void MI_ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ExportarActionPerformed
		GenerateCheatDB();
	}//GEN-LAST:event_MI_ExportarActionPerformed

	private void MI_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SaveActionPerformed
		SaveTitleList();
	}//GEN-LAST:event_MI_SaveActionPerformed

	private void MI_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_LoadActionPerformed
		LoadTitleList();
	}//GEN-LAST:event_MI_LoadActionPerformed

	private void MI_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ResetActionPerformed
		int Input;
		String Message;
		Object[] Options;

		Input = -1;
		Message = null;
		Options = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_QUESTION_RESET_PT; Options = new String[] {"Sim", "Não"};  break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_QUESTION_RESET_EN; Options = new String[] {"Yes", "No"};   break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_QUESTION_RESET_DE; Options = new String[] {"Ja", "Nicht"}; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_QUESTION_RESET_ES; Options = new String[] {"Sí", "No"};    break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_QUESTION_RESET_FR; Options = new String[] {"Oui", "Non"};  break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_QUESTION_RESET_IT; Options = new String[] {"Si", "Non"};   break;
		}
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		Input = JOptionPane.showOptionDialog(null, Message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_QUESTION_BIG), Options, null);

		if(Input==JOptionPane.YES_OPTION) {
			initFields();
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_UNEQUIP);
		}
	}//GEN-LAST:event_MI_ResetActionPerformed

	private void MI_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AjudaActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_WINDOWUP_2);
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: HelpWindow.setTitle("AJUDA"); break;
			case MessageDB.IDIOMA_EN: HelpWindow.setTitle("HELP"); break;
		}
		HelpPnl.setLanguage(Idioma);
		HelpWindow.setContentPane(HelpPnl);
		HelpWindow.setLocation((ScreenSize.width-HelpWindow.getSize().width)/2,(ScreenSize.height-HelpWindow.getSize().height)/2+10);
		HelpWindow.setVisible(true);
	}//GEN-LAST:event_MI_AjudaActionPerformed

	private void MI_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AboutActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_WINDOWUP);
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: AboutWindow.setTitle("SOBRE..."); break;
			case MessageDB.IDIOMA_EN: AboutWindow.setTitle("ABOUT..."); break;
		}
		AboutPnl.setLanguage(Idioma);
		AboutWindow.setContentPane(AboutPnl);
		AboutWindow.setLocation((ScreenSize.width-AboutWindow.getSize().width)/2,(ScreenSize.height-AboutWindow.getSize().height)/2+10);
		AboutWindow.setVisible(true);
	}//GEN-LAST:event_MI_AboutActionPerformed

	private void MI_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ExitActionPerformed
		int Input;
		String Message;
		Object[] Options;

		Input = -1;
		Message = null;
		Options = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_QUESTION_EXIT_PT; Options = new String[] {"Sim", "Não"};  break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_QUESTION_EXIT_EN; Options = new String[] {"Yes", "No"};   break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_QUESTION_EXIT_DE; Options = new String[] {"Ja", "Nicht"}; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_QUESTION_EXIT_ES; Options = new String[] {"Sí", "No"};    break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_QUESTION_EXIT_FR; Options = new String[] {"Oui", "Non"};  break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_QUESTION_EXIT_IT; Options = new String[] {"Si", "Non"};   break;
		}
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		Input = JOptionPane.showOptionDialog(null, Message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_QUESTION_BIG), Options, null);

		if(Input==JOptionPane.YES_OPTION) {
			SaveTitleList();
			System.exit(0);
		}
	}//GEN-LAST:event_MI_ExitActionPerformed

	private void MI_Tema_DefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Tema_DefaultActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_INICIO.setImageBackgroundAt(00, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_0A));
		P_MainPanel.setGradientColors(new Color(248, 248, 248), new Color(210, 210, 210));
		P_Opcoes.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		P_Data.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		TP_TabbedPane.setBackground(new Color(200, 210, 210));
		B_Exportar.setGradientColors(Color.WHITE, new Color(165, 195, 130), new Color(130, 155, 120));
		B_Save.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		B_Load.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		P_INICIO.repaint();
		P_MainPanel.repaint();
		P_Opcoes.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Exportar.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Tema_DefaultActionPerformed

	private void MI_Tema_DarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Tema_DarkActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_INICIO.setImageBackgroundAt(00, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_0A));
		P_MainPanel.setGradientColors(new Color(51, 51, 51), new Color(220, 220, 220));
		P_Opcoes.setGradientColors(new Color(248, 248, 248), new Color(200, 210, 210));
		P_Data.setGradientColors(new Color(248, 248, 248), new Color(200, 210, 210));
		TP_TabbedPane.setBackground(new Color(220, 225, 225));
		B_Exportar.setGradientColors(Color.WHITE, new Color(165, 195, 130), new Color(130, 155, 120));
		B_Save.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		B_Load.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		P_INICIO.repaint();
		P_MainPanel.repaint();
		P_Opcoes.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Exportar.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Tema_DarkActionPerformed

	private void MI_Tema_CosmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Tema_CosmosActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_INICIO.setImageBackgroundAt(00, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_0C));
		P_MainPanel.setGradientColors(new Color(0, 0, 51), new Color(220, 220, 220));
		P_Opcoes.setGradientColors(new Color(238, 238, 238), new Color(238, 228, 248));
		P_Data.setGradientColors(new Color(238, 238, 238), new Color(238, 228, 248));
		TP_TabbedPane.setBackground(new Color(238, 228, 248));
		B_Exportar.setGradientColors(Color.WHITE, new Color(150, 175, 225), new Color(90, 110, 130));
		B_Save.setGradientColors(Color.WHITE, new Color(175, 165, 235), new Color(120, 125, 160));
		B_Load.setGradientColors(Color.WHITE, new Color(175, 165, 235), new Color(120, 125, 160));
		P_INICIO.repaint();
		P_MainPanel.repaint();
		P_Opcoes.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Exportar.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Tema_CosmosActionPerformed

	private void MI_Tema_ChaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Tema_ChaosActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_INICIO.setImageBackgroundAt(00, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_0D));
		P_MainPanel.setGradientColors(new Color(51, 0, 0), new Color(220, 220, 220));
		P_Opcoes.setGradientColors(new Color(238, 238, 238), new Color(238, 230, 228));
		P_Data.setGradientColors(new Color(238, 238, 238), new Color(238, 230, 228));
		TP_TabbedPane.setBackground(new Color(248, 240, 238));
		B_Exportar.setGradientColors(Color.WHITE, new Color(230, 150, 150), new Color(145, 100, 100));
		B_Save.setGradientColors(Color.WHITE, new Color(235, 165, 145), new Color(150, 115, 95));
		B_Load.setGradientColors(Color.WHITE, new Color(235, 165, 145), new Color(150, 115, 95));
		P_INICIO.repaint();
		P_MainPanel.repaint();
		P_Opcoes.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Exportar.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Tema_ChaosActionPerformed

	private void MI_Tema_CustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Tema_CustomActionPerformed
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		ColorChooser.setColor(P_MainPanel.getGradientStartColor());
		JDialog ColorDialog = JColorChooser.createDialog(null, "COLOR", true, ColorChooser, null, null);
		ColorDialog.setVisible(true);

		if(!ColorChooser.getColor().equals(P_MainPanel.getGradientStartColor())) {
			P_INICIO.setImageBackgroundAt(00, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_0B));
			P_MainPanel.setGradientColors(ColorChooser.getColor(), new Color(220, 220, 220));
			P_Opcoes.setGradientColors(new Color(238, 238, 238), new Color(210, 210, 210));
			P_Data.setGradientColors(new Color(238, 238, 238), new Color(210, 210, 210));
			TP_TabbedPane.setBackground(new Color(225, 225, 225));
			B_Exportar.setGradientColors(Color.WHITE, new Color(165, 165, 165), new Color(100, 100, 100));
			B_Save.setGradientColors(Color.WHITE, new Color(190, 190, 190), new Color(150, 150, 150));
			B_Load.setGradientColors(Color.WHITE, new Color(190, 190, 190), new Color(150, 150, 150));
			P_INICIO.repaint();
			P_MainPanel.repaint();
			P_Opcoes.repaint();
			P_Data.repaint();
			TP_TabbedPane.repaint();
			B_Exportar.repaint();
			B_Save.repaint();
			B_Load.repaint();
		}
	}//GEN-LAST:event_MI_Tema_CustomActionPerformed

	private void MI_Audio_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Audio_ONActionPerformed
		M_Audio.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SOUND_MAX));
		MediaPlayer.setMute(false);
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
	}//GEN-LAST:event_MI_Audio_ONActionPerformed

	private void MI_Audio_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Audio_OFFActionPerformed
		M_Audio.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SOUND_MUTE));
		MediaPlayer.setMute(true);
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
	}//GEN-LAST:event_MI_Audio_OFFActionPerformed

	private void M_FuncoesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_M_FuncoesMenuSelected
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MENUOPEN);
	}//GEN-LAST:event_M_FuncoesMenuSelected

	private void M_FuncoesMenuDeselected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_M_FuncoesMenuDeselected
		//MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MENUCLOSE);
	}//GEN-LAST:event_M_FuncoesMenuDeselected

	private void MI_ExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ExportarMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ExportarMouseEntered

	private void MI_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_SaveMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_SaveMouseEntered

	private void MI_LoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_LoadMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_LoadMouseEntered

	private void MI_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ResetMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ResetMouseEntered

	private void M_IdiomaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_IdiomaMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_M_IdiomaMouseEntered

	private void M_AudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_AudioMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_M_AudioMouseEntered

	private void M_TemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_TemaMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_M_TemaMouseEntered

	private void MI_AjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_AjudaMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_AjudaMouseEntered

	private void MI_AboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_AboutMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_AboutMouseEntered

	private void MI_PortuguesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_PortuguesMouseEntered
		if(MI_Portugues.isEnabled())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_PortuguesMouseEntered

	private void MI_EnglishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_EnglishMouseEntered
		if(MI_English.isEnabled())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_EnglishMouseEntered

	private void MI_DeutschMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_DeutschMouseEntered
		if(MI_Deutsch.isEnabled())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_DeutschMouseEntered

	private void MI_EspanolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_EspanolMouseEntered
		if(MI_Espanol.isEnabled())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_EspanolMouseEntered

	private void MI_FrancaiseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_FrancaiseMouseEntered
		if(MI_Francaise.isEnabled())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_FrancaiseMouseEntered

	private void MI_ItalianoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ItalianoMouseEntered
		if(MI_Italiano.isEnabled())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ItalianoMouseEntered

	private void MI_Audio_ONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Audio_ONMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Audio_ONMouseEntered

	private void MI_Audio_OFFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Audio_OFFMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Audio_OFFMouseEntered

	private void MI_Tema_DefaultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Tema_DefaultMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Tema_DefaultMouseEntered

	private void MI_Tema_DarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Tema_DarkMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Tema_DarkMouseEntered

	private void MI_Tema_CosmosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Tema_CosmosMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Tema_CosmosMouseEntered

	private void MI_Tema_ChaosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Tema_ChaosMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Tema_ChaosMouseEntered

	private void MI_Tema_CustomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Tema_CustomMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Tema_CustomMouseEntered

	private void MI_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ExitMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ExitMouseEntered

	private void TP_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TP_TabbedPaneStateChanged
		if(TP_TabbedPane.isShowing())
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL);
	}//GEN-LAST:event_TP_TabbedPaneStateChanged

	private void B_ExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExportarMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE_3);
		B_Exportar.setHovered(true);
	}//GEN-LAST:event_B_ExportarMouseEntered

	private void B_ExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExportarMouseExited
		B_Exportar.setHovered(false);
	}//GEN-LAST:event_B_ExportarMouseExited

	private void B_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SaveMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
		B_Save.setHovered(true);
	}//GEN-LAST:event_B_SaveMouseEntered

	private void B_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SaveMouseExited
		B_Save.setHovered(false);
	}//GEN-LAST:event_B_SaveMouseExited

	private void B_LoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LoadMouseEntered
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
		B_Load.setHovered(true);
	}//GEN-LAST:event_B_LoadMouseEntered

	private void B_LoadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LoadMouseExited
		B_Load.setHovered(false);
	}//GEN-LAST:event_B_LoadMouseExited

	private void CB_AutoAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_AutoAtivarActionPerformed
		MediaPlayer.PlayCustomSound(CB_AutoAtivar.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_AutoAtivarActionPerformed

	private void TP_TabbedPaneMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_TP_TabbedPaneMouseWheelMoved
		int Index = TP_TabbedPane.getSelectedIndex();
		Index += evt.getWheelRotation();
		Index = (Index<0) ? 0 : (Index>14)? 14 : Index;
		TP_TabbedPane.setSelectedIndex(Index);
	}//GEN-LAST:event_TP_TabbedPaneMouseWheelMoved

	private void P_INICIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_INICIOMouseClicked
		UpdateStartTab();
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_INICIOMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GradientButton B_Exportar;
    private GradientButton B_Load;
    private GradientButton B_Save;
    private javax.swing.JCheckBox CB_AutoAtivar;
    private javax.swing.JCheckBox CB_DDFF_ISO1;
    private javax.swing.JCheckBox CB_DDFF_ISO2;
    private javax.swing.JCheckBox CB_DDFF_ISO3;
    private javax.swing.JCheckBox CB_DDFF_ISO4;
    private javax.swing.JCheckBox CB_DDFF_ISO5;
    private javax.swing.JCheckBox CB_DDFF_ISO6;
    private javax.swing.JCheckBox CB_FF10_DLC1;
    private javax.swing.JCheckBox CB_FF10_DLC2;
    private javax.swing.JCheckBox CB_FF10_DLC3;
    private javax.swing.JCheckBox CB_FF10_ISO1;
    private javax.swing.JCheckBox CB_FF10_ISO2;
    private javax.swing.JCheckBox CB_FF10_ISO3;
    private javax.swing.JCheckBox CB_FF10_ISO4;
    private javax.swing.JCheckBox CB_FF10_ISO5;
    private javax.swing.JCheckBox CB_FF11_DLC1;
    private javax.swing.JCheckBox CB_FF11_DLC2;
    private javax.swing.JCheckBox CB_FF11_DLC3;
    private javax.swing.JCheckBox CB_FF11_ISO1;
    private javax.swing.JCheckBox CB_FF11_ISO2;
    private javax.swing.JCheckBox CB_FF11_ISO3;
    private javax.swing.JCheckBox CB_FF11_ISO4;
    private javax.swing.JCheckBox CB_FF12_DLC1;
    private javax.swing.JCheckBox CB_FF12_DLC2;
    private javax.swing.JCheckBox CB_FF12_DLC3;
    private javax.swing.JCheckBox CB_FF12_ISO1;
    private javax.swing.JCheckBox CB_FF12_ISO2;
    private javax.swing.JCheckBox CB_FF12_ISO3;
    private javax.swing.JCheckBox CB_FF12_ISO4;
    private javax.swing.JCheckBox CB_FF13_DLC1;
    private javax.swing.JCheckBox CB_FF13_DLC2;
    private javax.swing.JCheckBox CB_FF13_DLC3;
    private javax.swing.JCheckBox CB_FF13_DLC4;
    private javax.swing.JCheckBox CB_FF13_DLC5;
    private javax.swing.JCheckBox CB_FF13_ISO1;
    private javax.swing.JCheckBox CB_FF13_ISO2;
    private javax.swing.JCheckBox CB_FF13_ISO3;
    private javax.swing.JCheckBox CB_FF1_DLC1;
    private javax.swing.JCheckBox CB_FF1_DLC2;
    private javax.swing.JCheckBox CB_FF1_DLC3;
    private javax.swing.JCheckBox CB_FF1_DLC4;
    private javax.swing.JCheckBox CB_FF1_DLC5;
    private javax.swing.JCheckBox CB_FF1_ISO1;
    private javax.swing.JCheckBox CB_FF1_ISO2;
    private javax.swing.JCheckBox CB_FF1_ISO3;
    private javax.swing.JCheckBox CB_FF1_ISO4;
    private javax.swing.JCheckBox CB_FF1_ISO5;
    private javax.swing.JCheckBox CB_FF2_DLC1;
    private javax.swing.JCheckBox CB_FF2_DLC2;
    private javax.swing.JCheckBox CB_FF2_DLC3;
    private javax.swing.JCheckBox CB_FF2_ISO1;
    private javax.swing.JCheckBox CB_FF2_ISO2;
    private javax.swing.JCheckBox CB_FF2_ISO3;
    private javax.swing.JCheckBox CB_FF2_ISO4;
    private javax.swing.JCheckBox CB_FF2_ISO5;
    private javax.swing.JCheckBox CB_FF3_DLC1;
    private javax.swing.JCheckBox CB_FF3_DLC2;
    private javax.swing.JCheckBox CB_FF3_DLC3;
    private javax.swing.JCheckBox CB_FF3_ISO1;
    private javax.swing.JCheckBox CB_FF3_ISO2;
    private javax.swing.JCheckBox CB_FF3_ISO3;
    private javax.swing.JCheckBox CB_FF3_ISO4;
    private javax.swing.JCheckBox CB_FF3_ISO5;
    private javax.swing.JCheckBox CB_FF4_DLC1;
    private javax.swing.JCheckBox CB_FF4_DLC2;
    private javax.swing.JCheckBox CB_FF4_DLC3;
    private javax.swing.JCheckBox CB_FF4_ISO1;
    private javax.swing.JCheckBox CB_FF4_ISO2;
    private javax.swing.JCheckBox CB_FF4_ISO3;
    private javax.swing.JCheckBox CB_FF4_ISO4;
    private javax.swing.JCheckBox CB_FF4_ISO5;
    private javax.swing.JCheckBox CB_FF5_DLC1;
    private javax.swing.JCheckBox CB_FF5_DLC2;
    private javax.swing.JCheckBox CB_FF5_DLC3;
    private javax.swing.JCheckBox CB_FF5_ISO1;
    private javax.swing.JCheckBox CB_FF5_ISO2;
    private javax.swing.JCheckBox CB_FF5_ISO3;
    private javax.swing.JCheckBox CB_FF5_ISO4;
    private javax.swing.JCheckBox CB_FF5_ISO5;
    private javax.swing.JCheckBox CB_FF6_DLC1;
    private javax.swing.JCheckBox CB_FF6_DLC2;
    private javax.swing.JCheckBox CB_FF6_DLC3;
    private javax.swing.JCheckBox CB_FF6_ISO1;
    private javax.swing.JCheckBox CB_FF6_ISO2;
    private javax.swing.JCheckBox CB_FF6_ISO3;
    private javax.swing.JCheckBox CB_FF6_ISO4;
    private javax.swing.JCheckBox CB_FF6_ISO5;
    private javax.swing.JCheckBox CB_FF7_DLC1;
    private javax.swing.JCheckBox CB_FF7_DLC2;
    private javax.swing.JCheckBox CB_FF7_DLC3;
    private javax.swing.JCheckBox CB_FF7_ISO1;
    private javax.swing.JCheckBox CB_FF7_ISO2;
    private javax.swing.JCheckBox CB_FF7_ISO3;
    private javax.swing.JCheckBox CB_FF7_ISO4;
    private javax.swing.JCheckBox CB_FF7_ISO5;
    private javax.swing.JCheckBox CB_FF8_DLC1;
    private javax.swing.JCheckBox CB_FF8_DLC2;
    private javax.swing.JCheckBox CB_FF8_DLC3;
    private javax.swing.JCheckBox CB_FF8_ISO1;
    private javax.swing.JCheckBox CB_FF8_ISO2;
    private javax.swing.JCheckBox CB_FF8_ISO3;
    private javax.swing.JCheckBox CB_FF8_ISO4;
    private javax.swing.JCheckBox CB_FF8_ISO5;
    private javax.swing.JCheckBox CB_FF9_DLC1;
    private javax.swing.JCheckBox CB_FF9_DLC2;
    private javax.swing.JCheckBox CB_FF9_DLC3;
    private javax.swing.JCheckBox CB_FF9_ISO1;
    private javax.swing.JCheckBox CB_FF9_ISO2;
    private javax.swing.JCheckBox CB_FF9_ISO3;
    private javax.swing.JCheckBox CB_FF9_ISO4;
    private javax.swing.JCheckBox CB_FF9_ISO5;
    private javax.swing.JComboBox CB_Regiao;
    private javax.swing.JMenuBar MB_MenuBar;
    private javax.swing.JMenuItem MI_About;
    private javax.swing.JMenuItem MI_Ajuda;
    private javax.swing.JMenuItem MI_Audio_OFF;
    private javax.swing.JMenuItem MI_Audio_ON;
    private javax.swing.JMenuItem MI_Deutsch;
    private javax.swing.JMenuItem MI_English;
    private javax.swing.JMenuItem MI_Espanol;
    private javax.swing.JMenuItem MI_Exit;
    private javax.swing.JMenuItem MI_Exportar;
    private javax.swing.JMenuItem MI_Francaise;
    private javax.swing.JMenuItem MI_Italiano;
    private javax.swing.JMenuItem MI_Load;
    private javax.swing.JMenuItem MI_Portugues;
    private javax.swing.JMenuItem MI_Reset;
    private javax.swing.JMenuItem MI_Save;
    private javax.swing.JMenuItem MI_Tema_Chaos;
    private javax.swing.JMenuItem MI_Tema_Cosmos;
    private javax.swing.JMenuItem MI_Tema_Custom;
    private javax.swing.JMenuItem MI_Tema_Dark;
    private javax.swing.JMenuItem MI_Tema_Default;
    private javax.swing.JMenu M_Audio;
    private javax.swing.JMenu M_Funcoes;
    private javax.swing.JMenu M_Idioma;
    private javax.swing.JMenu M_Tema;
    private GradientPanel P_DDFF;
    private javax.swing.JPanel P_DDFF_ISO;
    private ImagePanel P_DDFF_PIC;
    private GradientPanel P_Data;
    private GradientPanel P_FF1;
    private GradientPanel P_FF10;
    private javax.swing.JPanel P_FF10_DLC;
    private javax.swing.JPanel P_FF10_ISO;
    private ImagePanel P_FF10_PIC;
    private GradientPanel P_FF11;
    private javax.swing.JPanel P_FF11_DLC;
    private javax.swing.JPanel P_FF11_ISO;
    private ImagePanel P_FF11_PIC;
    private GradientPanel P_FF12;
    private javax.swing.JPanel P_FF12_DLC;
    private javax.swing.JPanel P_FF12_ISO;
    private ImagePanel P_FF12_PIC;
    private GradientPanel P_FF13;
    private javax.swing.JPanel P_FF13_DLC;
    private javax.swing.JPanel P_FF13_ISO;
    private ImagePanel P_FF13_PIC;
    private javax.swing.JPanel P_FF1_DLC;
    private javax.swing.JPanel P_FF1_ISO;
    private ImagePanel P_FF1_PIC;
    private GradientPanel P_FF2;
    private javax.swing.JPanel P_FF2_DLC;
    private javax.swing.JPanel P_FF2_ISO;
    private ImagePanel P_FF2_PIC;
    private GradientPanel P_FF3;
    private javax.swing.JPanel P_FF3_DLC;
    private javax.swing.JPanel P_FF3_ISO;
    private ImagePanel P_FF3_PIC;
    private GradientPanel P_FF4;
    private javax.swing.JPanel P_FF4_DLC;
    private javax.swing.JPanel P_FF4_ISO;
    private ImagePanel P_FF4_PIC;
    private GradientPanel P_FF5;
    private javax.swing.JPanel P_FF5_DLC;
    private javax.swing.JPanel P_FF5_ISO;
    private ImagePanel P_FF5_PIC;
    private GradientPanel P_FF6;
    private javax.swing.JPanel P_FF6_DLC;
    private javax.swing.JPanel P_FF6_ISO;
    private ImagePanel P_FF6_PIC;
    private GradientPanel P_FF7;
    private javax.swing.JPanel P_FF7_DLC;
    private javax.swing.JPanel P_FF7_ISO;
    private ImagePanel P_FF7_PIC;
    private GradientPanel P_FF8;
    private javax.swing.JPanel P_FF8_DLC;
    private javax.swing.JPanel P_FF8_ISO;
    private ImagePanel P_FF8_PIC;
    private GradientPanel P_FF9;
    private javax.swing.JPanel P_FF9_DLC;
    private javax.swing.JPanel P_FF9_ISO;
    private ImagePanel P_FF9_PIC;
    private ImagePanel P_INICIO;
    private GradientPanel P_MainPanel;
    private GradientPanel P_Opcoes;
    private javax.swing.JPopupMenu.Separator S_Separator_1;
    private javax.swing.JPopupMenu.Separator S_Separator_2;
    private javax.swing.JPopupMenu.Separator S_Separator_3;
    private javax.swing.JTextField TF_DDFF_ISO1;
    private javax.swing.JTextField TF_DDFF_ISO2;
    private javax.swing.JTextField TF_DDFF_ISO3;
    private javax.swing.JTextField TF_DDFF_ISO4;
    private javax.swing.JTextField TF_DDFF_ISO5;
    private javax.swing.JTextField TF_DDFF_ISO6;
    private javax.swing.JTextField TF_FF10_DLC1;
    private javax.swing.JTextField TF_FF10_DLC2;
    private javax.swing.JTextField TF_FF10_DLC3;
    private javax.swing.JTextField TF_FF10_ISO1;
    private javax.swing.JTextField TF_FF10_ISO2;
    private javax.swing.JTextField TF_FF10_ISO3;
    private javax.swing.JTextField TF_FF10_ISO4;
    private javax.swing.JTextField TF_FF10_ISO5;
    private javax.swing.JTextField TF_FF11_DLC1;
    private javax.swing.JTextField TF_FF11_DLC2;
    private javax.swing.JTextField TF_FF11_DLC3;
    private javax.swing.JTextField TF_FF11_ISO1;
    private javax.swing.JTextField TF_FF11_ISO2;
    private javax.swing.JTextField TF_FF11_ISO3;
    private javax.swing.JTextField TF_FF11_ISO4;
    private javax.swing.JTextField TF_FF12_DLC1;
    private javax.swing.JTextField TF_FF12_DLC2;
    private javax.swing.JTextField TF_FF12_DLC3;
    private javax.swing.JTextField TF_FF12_ISO1;
    private javax.swing.JTextField TF_FF12_ISO2;
    private javax.swing.JTextField TF_FF12_ISO3;
    private javax.swing.JTextField TF_FF12_ISO4;
    private javax.swing.JTextField TF_FF13_DLC1;
    private javax.swing.JTextField TF_FF13_DLC2;
    private javax.swing.JTextField TF_FF13_DLC3;
    private javax.swing.JTextField TF_FF13_DLC4;
    private javax.swing.JTextField TF_FF13_DLC5;
    private javax.swing.JTextField TF_FF13_ISO1;
    private javax.swing.JTextField TF_FF13_ISO2;
    private javax.swing.JTextField TF_FF13_ISO3;
    private javax.swing.JTextField TF_FF1_DLC1;
    private javax.swing.JTextField TF_FF1_DLC2;
    private javax.swing.JTextField TF_FF1_DLC3;
    private javax.swing.JTextField TF_FF1_DLC4;
    private javax.swing.JTextField TF_FF1_DLC5;
    private javax.swing.JTextField TF_FF1_ISO1;
    private javax.swing.JTextField TF_FF1_ISO2;
    private javax.swing.JTextField TF_FF1_ISO3;
    private javax.swing.JTextField TF_FF1_ISO4;
    private javax.swing.JTextField TF_FF1_ISO5;
    private javax.swing.JTextField TF_FF2_DLC1;
    private javax.swing.JTextField TF_FF2_DLC2;
    private javax.swing.JTextField TF_FF2_DLC3;
    private javax.swing.JTextField TF_FF2_ISO1;
    private javax.swing.JTextField TF_FF2_ISO2;
    private javax.swing.JTextField TF_FF2_ISO3;
    private javax.swing.JTextField TF_FF2_ISO4;
    private javax.swing.JTextField TF_FF2_ISO5;
    private javax.swing.JTextField TF_FF3_DLC1;
    private javax.swing.JTextField TF_FF3_DLC2;
    private javax.swing.JTextField TF_FF3_DLC3;
    private javax.swing.JTextField TF_FF3_ISO1;
    private javax.swing.JTextField TF_FF3_ISO2;
    private javax.swing.JTextField TF_FF3_ISO3;
    private javax.swing.JTextField TF_FF3_ISO4;
    private javax.swing.JTextField TF_FF3_ISO5;
    private javax.swing.JTextField TF_FF4_DLC1;
    private javax.swing.JTextField TF_FF4_DLC2;
    private javax.swing.JTextField TF_FF4_DLC3;
    private javax.swing.JTextField TF_FF4_ISO1;
    private javax.swing.JTextField TF_FF4_ISO2;
    private javax.swing.JTextField TF_FF4_ISO3;
    private javax.swing.JTextField TF_FF4_ISO4;
    private javax.swing.JTextField TF_FF4_ISO5;
    private javax.swing.JTextField TF_FF5_DLC1;
    private javax.swing.JTextField TF_FF5_DLC2;
    private javax.swing.JTextField TF_FF5_DLC3;
    private javax.swing.JTextField TF_FF5_ISO1;
    private javax.swing.JTextField TF_FF5_ISO2;
    private javax.swing.JTextField TF_FF5_ISO3;
    private javax.swing.JTextField TF_FF5_ISO4;
    private javax.swing.JTextField TF_FF5_ISO5;
    private javax.swing.JTextField TF_FF6_DLC1;
    private javax.swing.JTextField TF_FF6_DLC2;
    private javax.swing.JTextField TF_FF6_DLC3;
    private javax.swing.JTextField TF_FF6_ISO1;
    private javax.swing.JTextField TF_FF6_ISO2;
    private javax.swing.JTextField TF_FF6_ISO3;
    private javax.swing.JTextField TF_FF6_ISO4;
    private javax.swing.JTextField TF_FF6_ISO5;
    private javax.swing.JTextField TF_FF7_DLC1;
    private javax.swing.JTextField TF_FF7_DLC2;
    private javax.swing.JTextField TF_FF7_DLC3;
    private javax.swing.JTextField TF_FF7_ISO1;
    private javax.swing.JTextField TF_FF7_ISO2;
    private javax.swing.JTextField TF_FF7_ISO3;
    private javax.swing.JTextField TF_FF7_ISO4;
    private javax.swing.JTextField TF_FF7_ISO5;
    private javax.swing.JTextField TF_FF8_DLC1;
    private javax.swing.JTextField TF_FF8_DLC2;
    private javax.swing.JTextField TF_FF8_DLC3;
    private javax.swing.JTextField TF_FF8_ISO1;
    private javax.swing.JTextField TF_FF8_ISO2;
    private javax.swing.JTextField TF_FF8_ISO3;
    private javax.swing.JTextField TF_FF8_ISO4;
    private javax.swing.JTextField TF_FF8_ISO5;
    private javax.swing.JTextField TF_FF9_DLC1;
    private javax.swing.JTextField TF_FF9_DLC2;
    private javax.swing.JTextField TF_FF9_DLC3;
    private javax.swing.JTextField TF_FF9_ISO1;
    private javax.swing.JTextField TF_FF9_ISO2;
    private javax.swing.JTextField TF_FF9_ISO3;
    private javax.swing.JTextField TF_FF9_ISO4;
    private javax.swing.JTextField TF_FF9_ISO5;
    private javax.swing.JTabbedPane TP_TabbedPane;
    // End of variables declaration//GEN-END:variables

	public static void main(String[] args) {

		new MainFrame().setVisible(true);

		/*
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
		*/
	}

	private void ShowSplahScreen() {

		SplashPnl = new SplashPanel();
		SplashPnl.setGradientTranslucent(isPerPixelTranslucencySupported);
		SplashPnl.setGradientColors(new Color(0, 0, 0, 0), new Color(0, 0, 0, 0));

		SplashWindow = new JDialog();
		SplashWindow.setModal(false);
		SplashWindow.setResizable(false);
		SplashWindow.setAlwaysOnTop(true);
		SplashWindow.setType(Type.UTILITY);
		SplashWindow.setSize(new Dimension(600, 360));
		SplashWindow.setContentPane(SplashPnl);
		SplashWindow.setLocation((ScreenSize.width-SplashWindow.getSize().width)/2,(ScreenSize.height-SplashWindow.getSize().height)/2);
		SplashWindow.setUndecorated(true);
		SplashWindow.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		SplashWindow.setBackground(new Color(0, 0, 0, 0));
		SplashWindow.setVisible(true);

		//java.text.SimpleDateFormat Date_pt = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		//System.out.println(Date_pt.format(new Date()));

	}

	private void HideSplashScreen() {
		/*
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {

		}
		*/
		SplashWindow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		SplashWindow.setVisible(false);

		//java.text.SimpleDateFormat Date_pt = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		//System.out.println(Date_pt.format(new Date()));

	}

	private boolean CheckForWarnings() {

		int Input;
		boolean SelectWarning;
		boolean TitleWarning;
		String Message;
		Object[] Options;

		SelectWarning = true;
		for(JCheckBox JCB : CheckBoxAL)
			if(JCB.isSelected()) {
				SelectWarning = false;
				break;
			}

		TitleWarning = false;
		for(JTextField JTF : TextFieldAL)
			if(JTF.isEnabled() && JTF.getForeground()==Color.RED) {
				TitleWarning = true;
				break;
			}

		Message = null;
		if(SelectWarning) {
			switch(Idioma) {
				case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_PT; break;
				case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_EN; break;
				case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_DE; break;
				case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_ES; break;
				case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_FR; break;
				case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_IT; break;
			}
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_ERROR);
			JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_ERROR_BIG));
			return true;
		}

		Input = -1;
		Options = null;
		Message = null;
		if(TitleWarning) {
			switch(Idioma) {
				case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_PT; Options = new String[] {"Sim", "Não"};  break;
				case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_EN; Options = new String[] {"Yes", "No"};   break;
				case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_DE; Options = new String[] {"Ja", "Nicht"}; break;
				case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_ES; Options = new String[] {"Sí", "No"};    break;
				case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_FR; Options = new String[] {"Oui", "Non"};  break;
				case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_IT; Options = new String[] {"Si", "Non"};   break;
			}
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
			Input = JOptionPane.showOptionDialog(null, Message, "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_WARNING_BIG), Options, null);
			return (Input==JOptionPane.YES_OPTION) ? false : true;
		}

		return false;

	}

	private void GenerateCheatDB() {

		int Input;
		boolean Prosseguir;
		String Cheat;
		String Message;
		File CheatDB = null;
		RandomAccessFile RandomCheatDB;
		Object[] Options;

		Input = -1;
		Message = null;
		Options = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_QUESTION_EXPORT_PT; Options = new String[] {"Sim", "Não"};  break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_QUESTION_EXPORT_EN; Options = new String[] {"Yes", "No"};   break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_QUESTION_EXPORT_DE; Options = new String[] {"Ja", "Nicht"}; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_QUESTION_EXPORT_ES; Options = new String[] {"Sí", "No"};    break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_QUESTION_EXPORT_FR; Options = new String[] {"Oui", "Non"};  break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_QUESTION_EXPORT_IT; Options = new String[] {"Si", "Non"};   break;
		}
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		Input = JOptionPane.showOptionDialog(null, Message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_QUESTION_BIG), Options, null);

		if(Input==JOptionPane.YES_OPTION) {

			Prosseguir = !CheckForWarnings();

			if(Prosseguir) {

				//CheatGenerator DR = new CheatGenerator(CB_Regiao.getSelectedIndex(), CB_AutoAtivar.isSelected());

				try {

					CheatDB = new File("cheat.db");

					if(CheatDB.exists()) {
						CheatDB.delete();
						CheatDB.createNewFile();
					}

					RandomCheatDB = new RandomAccessFile(CheatDB, "rw");

					if(CheatDB.canWrite()) {

						RandomCheatDB.writeBytes(CheatGenerator.ParseHeader(CB_Regiao.getSelectedIndex()));

						for(int i=0; i<CheckBoxAL.size(); i++) {
							if(CheckBoxAL.get(i).isSelected()) {
								Cheat = CheatGenerator.ParseTitle(OffsetAL.get(i), TitleAL.get(i), TextFieldAL.get(i).getText(), CB_AutoAtivar.isSelected());
								RandomCheatDB.writeBytes(Cheat);
							}
						}

					}

					RandomCheatDB.close();

				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

				Message = null;
				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_PT; break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_EN; break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_DE; break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_ES; break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_FR; break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_IT; break;
				}
				JLabel Label = new JLabel("<html><center>" + Message + "<br>" + CheatDB.getAbsolutePath() + "</center></html");
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CHOCOBO);
				JOptionPane.showMessageDialog(null, Label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SUCCESS_BIG));

			}

		}

	}

	private void ValidatePackFile() {

		int Input;
		String Message;
		Object[] Options;

		if(!ResourceManager.ValidatePackFile()) {

			Message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_PT;
			Options = new String[] {"OK", "What?", "Ce qu'il a dit?", "Quello che ha detto?"};
			MediaPlayer.PlayWindowsSound(MediaPlayer.WINDOWS_ERROR);
			Input = JOptionPane.showOptionDialog(null, Message, "ERROR", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, Options, null);
			if(Input != 0) {
				switch(Input) {
					case 1: Message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_EN; break;
					case 2: Message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_FR; break;
					case 3: Message = MessageDB.MESSAGE_ERROR_INVALIDPACKFILE_IT; break;
				}
				MediaPlayer.PlayWindowsSound(MediaPlayer.WINDOWS_ERROR);
				JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			
			System.exit(0);

		}

	}

	private void SaveTitleList() {

		int Input;
		String Message;
		Object[] Options;

		Input = -1;
		Message = null;
		Options = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_QUESTION_SAVE_PT; Options = new String[] {"Sim", "Não"};  break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_QUESTION_SAVE_EN; Options = new String[] {"Yes", "No"};   break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_QUESTION_SAVE_DE; Options = new String[] {"Ja", "Nicht"}; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_QUESTION_SAVE_ES; Options = new String[] {"Sí", "No"};    break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_QUESTION_SAVE_FR; Options = new String[] {"Oui", "Non"};  break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_QUESTION_SAVE_IT; Options = new String[] {"Si", "Non"};   break;
		}
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		Input = JOptionPane.showOptionDialog(null, Message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_QUESTION_BIG), Options, null);

		if(Input == JOptionPane.YES_OPTION) {

			Message = null;
			try {
				ResourceManager.SaveTitleList(TextFieldAL);

				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_PT; break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_EN; break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_DE; break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_ES; break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_FR; break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_IT; break;
				}
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE_2);
				JOptionPane.showMessageDialog(null, Message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SUCCESS_BIG));

			}
			catch(FileNotFoundException e) {
				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_PT; break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_EN; break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_DE; break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_ES; break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_FR; break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_IT; break;
				}
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_ERROR);
				JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_ERROR_BIG));
			}
			catch(IOException e) {
				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_PT; break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_EN; break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_DE; break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_ES; break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_FR; break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_IT; break;
				}
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_ERROR);
				JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_ERROR_BIG));
			}

		}

	}

	private void LoadTitleList() {

		int Input;
		String Message;
		Object[] Options;
		StringBuffer Time_pt;
		StringBuffer Time_en;

		Input = -1;
		Message = null;
		Options = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_QUESTION_LOAD_PT; Options = new String[] {"Sim", "Não"};  break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_QUESTION_LOAD_EN; Options = new String[] {"Yes", "No"};   break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_QUESTION_LOAD_DE; Options = new String[] {"Ja", "Nicht"}; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_QUESTION_LOAD_ES; Options = new String[] {"Sí", "No"};    break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_QUESTION_LOAD_FR; Options = new String[] {"Oui", "Non"};  break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_QUESTION_LOAD_IT; Options = new String[] {"Si", "Non"};   break;
		}
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		Input = JOptionPane.showOptionDialog(null, Message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_QUESTION_BIG), Options, null);

		if(Input==JOptionPane.YES_OPTION) {

			Message = null;
			Time_pt = new StringBuffer("");
			Time_en = new StringBuffer("");

			try {
				ResourceManager.LoadTitleList(TextFieldAL, CheckBoxAL, CheckBoxTipAL, Time_pt, Time_en);

				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_PT + "<br>" + Time_pt.toString(); break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_EN + "<br>" + Time_en.toString(); break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_DE + "<br>" + Time_pt.toString(); break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_ES + "<br>" + Time_pt.toString(); break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_FR + "<br>" + Time_pt.toString(); break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_IT + "<br>" + Time_pt.toString(); break;
				}
				JLabel Label = new JLabel("<html><center>" + Message + "</center></html");
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_EQUIP);
				JOptionPane.showMessageDialog(null, Label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SUCCESS_BIG));

			}
			catch(FileNotFoundException e) {
				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_PT; break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_EN; break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_DE; break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_ES; break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_FR; break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_IT; break;
				}
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_ERROR);
				JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_ERROR_BIG));
			}
			catch(IOException e) {
				switch(Idioma) {
					case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_PT; break;
					case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_EN; break;
					case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_DE; break;
					case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_ES; break;
					case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_FR; break;
					case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_IT; break;
				}
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_ERROR);
				JOptionPane.showMessageDialog(null, Message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_ERROR_BIG));
			}

		}

	}

	private void UpdateStartTab() {

		int Index = 0;
		int Switch = new Random().nextInt(31) + 1;

		switch(Switch) {
			case 1:  Index = ResourceDB.INDEX_PIC_INICIO_01;	break;
			case 2:  Index = ResourceDB.INDEX_PIC_INICIO_02;	break;
			case 3:  Index = ResourceDB.INDEX_PIC_INICIO_03;	break;
			case 4:  Index = ResourceDB.INDEX_PIC_INICIO_04;	break;
			case 5:  Index = ResourceDB.INDEX_PIC_INICIO_05;	break;
			case 6:  Index = ResourceDB.INDEX_PIC_INICIO_06;	break;
			case 7:  Index = ResourceDB.INDEX_PIC_INICIO_07;	break;
			case 8:  Index = ResourceDB.INDEX_PIC_INICIO_08;	break;
			case 9:  Index = ResourceDB.INDEX_PIC_INICIO_09;	break;
			case 10: Index = ResourceDB.INDEX_PIC_INICIO_10;	break;
			case 11: Index = ResourceDB.INDEX_PIC_INICIO_11;	break;
			case 12: Index = ResourceDB.INDEX_PIC_INICIO_12;	break;
			case 13: Index = ResourceDB.INDEX_PIC_INICIO_13;	break;
			case 14: Index = ResourceDB.INDEX_PIC_INICIO_14;	break;
			case 15: Index = ResourceDB.INDEX_PIC_INICIO_15;	break;
			case 16: Index = ResourceDB.INDEX_PIC_INICIO_16;	break;
			case 17: Index = ResourceDB.INDEX_PIC_INICIO_17;	break;
			case 18: Index = ResourceDB.INDEX_PIC_INICIO_18;	break;
			case 19: Index = ResourceDB.INDEX_PIC_INICIO_19;	break;
			case 20: Index = ResourceDB.INDEX_PIC_INICIO_20;	break;
			case 21: Index = ResourceDB.INDEX_PIC_INICIO_21;	break;
			case 22: Index = ResourceDB.INDEX_PIC_INICIO_22;	break;
			case 23: Index = ResourceDB.INDEX_PIC_INICIO_23;	break;
			case 24: Index = ResourceDB.INDEX_PIC_INICIO_24;	break;
			case 25: Index = ResourceDB.INDEX_PIC_INICIO_25;	break;
			case 26: Index = ResourceDB.INDEX_PIC_INICIO_26;	break;
			case 27: Index = ResourceDB.INDEX_PIC_INICIO_27;	break;
			case 28: Index = ResourceDB.INDEX_PIC_INICIO_28;	break;
			case 29: Index = ResourceDB.INDEX_PIC_INICIO_29;	break;
			case 30: Index = ResourceDB.INDEX_PIC_INICIO_30;	break;
			case 31: Index = ResourceDB.INDEX_PIC_INICIO_31;	break;
		}

		P_INICIO.setImageBackgroundAt(01, ResourceManager.GetImgFile(Index));
		P_INICIO.repaint();

	}

	private void initComponentsCustomization() {

		Idioma = MessageDB.IDIOMA_PT;

		initPanels();
		initArrays();
		initComponentsTexts();
		initToolTipsMessages();
		initFields();

		UIManager.put("Button.select", new Color(0, 0, 0, 50));

		ColorChooser = new JColorChooser();
		AbstractColorChooserPanel[] oldPanels = ColorChooser.getChooserPanels();
		for(int i=1; i<oldPanels.length; i++)
		ColorChooser.removeChooserPanel(oldPanels[i]);
		ColorChooser.setPreviewPanel(new JPanel());

		AboutPnl = new AboutPanel();
		AboutPnl.setLanguage(Idioma);

		HelpPnl = new HelpPanel();
		HelpPnl.setLanguage(Idioma);

		AboutWindow = new JDialog();
		AboutWindow.setModal(true);
		AboutWindow.setResizable(false);
		AboutWindow.setType(Type.UTILITY);
		AboutWindow.setSize(new Dimension(606, 384));
		AboutWindow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORBACK);
			}
		});

		HelpWindow = new JDialog();
		HelpWindow.setModal(true);
		HelpWindow.setResizable(false);
		HelpWindow.setType(Type.UTILITY);
		HelpWindow.setSize(new Dimension(826, 594));
		HelpWindow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORBACK);
			}
		});

		M_Funcoes.setFont(new Font("Arial", Font.BOLD, 12));
		M_Idioma.setFont(new Font("Arial", Font.PLAIN, 12));
		M_Tema.setFont(new Font("Arial", Font.PLAIN, 12));
		M_Audio.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Exportar.setFont(new Font ("Arial", Font.PLAIN, 12));
		MI_Save.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Load.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Reset.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Ajuda.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_About.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Exit.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Portugues.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_English.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Deutsch.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Espanol.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Francaise.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Italiano.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Tema_Default.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Tema_Dark.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Tema_Cosmos.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Tema_Chaos.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Tema_Custom.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Audio_ON.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Audio_OFF.setFont(new Font("Arial", Font.PLAIN, 12));
		B_Exportar.setFont(new Font("Arial", Font.PLAIN, 12));
		B_Save.setFont(new Font("Arial", Font.PLAIN, 12));
		B_Load.setFont(new Font("Arial", Font.PLAIN, 12));
		CB_AutoAtivar.setFont(new Font("Arial", Font.PLAIN, 12));
		CB_Regiao.setFont(new Font("Arial", Font.PLAIN, 12));

		M_Tema.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_THEME));
		M_Audio.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SOUND_MAX));
		MI_Exportar.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_EXPORT));
		MI_Reset.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_RESET));
		MI_Save.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SAVE));
		MI_Load.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_LOAD));
		MI_Ajuda.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_QUESTION));
		MI_About.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_ABOUT));
		MI_Exit.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_EXIT));
		MI_Portugues.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_pt));
		MI_English.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_en));
		MI_Deutsch.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_de));
		MI_Espanol.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_es));
		MI_Francaise.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_fr));
		MI_Italiano.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_it));
		MI_Tema_Default.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_THEME_DEFAULT));
		MI_Tema_Dark.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_THEME_DARK));
		MI_Tema_Cosmos.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_THEME_COSMOS));
		MI_Tema_Chaos.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_THEME_CHAOS));
		MI_Tema_Custom.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_THEME_CUSTOM));
		MI_Audio_ON.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SOUND_MAX));
		MI_Audio_OFF.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_SOUND_MUTE));
		B_Exportar.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_EXPORT_BIG));

		MI_Deutsch.setEnabled(false);
		MI_Espanol.setEnabled(false);
	//	MI_Francaise.setEnabled(false);
	//	MI_Italiano.setEnabled(false);

		B_Exportar.setVerticalTextPosition(SwingConstants.BOTTOM);
		B_Exportar.setHorizontalTextPosition(SwingConstants.CENTER);

		TP_TabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		TP_TabbedPane.setBackground(new Color(200, 210, 210));

		P_FF1_ISO.setOpaque(false);
		P_FF1_DLC.setOpaque(false);
		P_FF2_ISO.setOpaque(false);
		P_FF2_DLC.setOpaque(false);
		P_FF3_ISO.setOpaque(false);
		P_FF3_DLC.setOpaque(false);
		P_FF4_ISO.setOpaque(false);
		P_FF4_DLC.setOpaque(false);
		P_FF5_ISO.setOpaque(false);
		P_FF5_DLC.setOpaque(false);
		P_FF6_ISO.setOpaque(false);
		P_FF6_DLC.setOpaque(false);
		P_FF7_ISO.setOpaque(false);
		P_FF7_DLC.setOpaque(false);
		P_FF8_ISO.setOpaque(false);
		P_FF8_DLC.setOpaque(false);
		P_FF9_ISO.setOpaque(false);
		P_FF9_DLC.setOpaque(false);
		P_FF10_ISO.setOpaque(false);
		P_FF10_DLC.setOpaque(false);
		P_FF11_ISO.setOpaque(false);
		P_FF11_DLC.setOpaque(false);
		P_FF12_ISO.setOpaque(false);
		P_FF12_DLC.setOpaque(false);
		P_FF13_ISO.setOpaque(false);
		P_FF13_DLC.setOpaque(false);
		P_DDFF_ISO.setOpaque(false);
		CB_AutoAtivar.setOpaque(false);
		for(JCheckBox JCB : CheckBoxAL)
			JCB.setOpaque(false);

	}

	private void initPanels() {

		Color DefaultColor = new Color(238, 238, 238);

		P_MainPanel.setGradientColors(new Color(248, 248, 248), new Color(210, 210, 210));
		P_Opcoes.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		P_Data.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		P_INICIO.setGradientColors(new Color(155, 165, 90), Color.BLACK);
		P_FF1.setGradientColors(DefaultColor, new Color(190, 210, 220));
		P_FF2.setGradientColors(DefaultColor, new Color(220, 205, 215));
		P_FF3.setGradientColors(DefaultColor, new Color(190, 200, 190));
		P_FF4.setGradientColors(DefaultColor, new Color(200, 190, 200));
		P_FF5.setGradientColors(DefaultColor, new Color(215, 210, 230));
		P_FF6.setGradientColors(DefaultColor, new Color(200, 190, 190));
		P_FF7.setGradientColors(DefaultColor, new Color(190, 205, 210));
		P_FF8.setGradientColors(DefaultColor, new Color(210, 195, 190));
		P_FF9.setGradientColors(DefaultColor, new Color(220, 215, 190));
		P_FF10.setGradientColors(DefaultColor, new Color(190, 195, 215));
		P_FF11.setGradientColors(DefaultColor, new Color(200, 215, 235));
		P_FF12.setGradientColors(DefaultColor, new Color(190, 195, 200));
		P_FF13.setGradientColors(DefaultColor, new Color(200, 210, 210));
		P_DDFF.setGradientColors(DefaultColor, new Color(170, 170, 150));

		P_MainPanel.setGradientDirection(GradientPanel.DIR_VERTICAL);
		P_Opcoes.setGradientDirection(GradientPanel.DIR_VERTICAL);
		P_Data.setGradientDirection(GradientPanel.DIR_VERTICAL);
		P_INICIO.setGradientDirection(GradientPanel.DIR_DIAGONALINVERSE);
		P_FF1.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF2.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF3.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF4.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF5.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF6.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF7.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF8.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF9.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF10.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF11.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF12.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_FF13.setGradientDirection(GradientPanel.DIR_HORIZONTAL);
		P_DDFF.setGradientDirection(GradientPanel.DIR_HORIZONTAL);

		P_INICIO.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_0A), ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_13), ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_pt) } );

		UpdateStartTab();

		P_FF1_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF1) } );
		P_FF2_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF2) } );
		P_FF3_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF3) } );
		P_FF4_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF4) } );
		P_FF5_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF5) } );
		P_FF6_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF6) } );
		P_FF7_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF7) } );
		P_FF8_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF8) } );
		P_FF9_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF9) } );
		P_FF10_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF10) } );
		P_FF11_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF11) } );
		P_FF12_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF12) } );
		P_FF13_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_FF13) } );
		P_DDFF_PIC.setImageBackground(new File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_DDFF) } );

		B_Exportar.setGradientColors(Color.WHITE, new Color(165, 195, 130), new Color(130, 155, 120));
		B_Save.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(55, 130, 145));
		B_Load.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(55, 130, 145));

	}

	private void initComponentsTexts() {

		int CBIndex;

		CBIndex = CB_Regiao.getSelectedIndex();
		CB_Regiao.removeAllItems();

		switch(Idioma) {
			case MessageDB.IDIOMA_PT:
				M_Funcoes.setText(MessageDB.TITLE_M_Funcoes_PT);
				M_Idioma.setText(MessageDB.TITLE_M_Idioma_PT);
				M_Tema.setText(MessageDB.TITLE_M_Tema_PT);
				M_Audio.setText(MessageDB.TITLE_M_Audio_PT);
				MI_Exportar.setText(MessageDB.TITLE_MI_Exportar_PT);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_PT);
				MI_Save.setText(MessageDB.TITLE_MI_Save_PT);
				MI_Load.setText(MessageDB.TITLE_MI_Load_PT);
				MI_Ajuda.setText(MessageDB.TITLE_MI_Ajuda_PT);
				MI_About.setText(MessageDB.TITLE_MI_About_PT);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_PT);
				MI_Tema_Default.setText(MessageDB.TITLE_MI_Tema_Default_PT);
				MI_Tema_Dark.setText(MessageDB.TITLE_MI_Tema_Dark_PT);
				MI_Tema_Cosmos.setText(MessageDB.TITLE_MI_Tema_Cosmos_PT);
				MI_Tema_Chaos.setText(MessageDB.TITLE_MI_Tema_Chaos_PT);
				MI_Tema_Custom.setText(MessageDB.TITLE_MI_Tema_Custom_PT);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_PT);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_PT);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_PT);
				B_Exportar.setText(MessageDB.TITLE_B_Exportar_PT);
				B_Save.setText(MessageDB.TITLE_B_Save_PT);
				B_Load.setText(MessageDB.TITLE_B_Load_PT);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_USA_PT);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_EUR_PT);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_JPN_PT);
				CB_AutoAtivar.setText(MessageDB.TITLE_CB_AutoAtivar_PT);

				P_INICIO.setImageBackgroundAt(02, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_pt));
				M_Funcoes.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_pt));
				M_Idioma.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_pt));

				break;
			case MessageDB.IDIOMA_EN:
				M_Funcoes.setText(MessageDB.TITLE_M_Funcoes_EN);
				M_Idioma.setText(MessageDB.TITLE_M_Idioma_EN);
				M_Tema.setText(MessageDB.TITLE_M_Tema_EN);
				M_Audio.setText(MessageDB.TITLE_M_Audio_EN);
				MI_Exportar.setText(MessageDB.TITLE_MI_Exportar_EN);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_EN);
				MI_Save.setText(MessageDB.TITLE_MI_Save_EN);
				MI_Load.setText(MessageDB.TITLE_MI_Load_EN);
				MI_Ajuda.setText(MessageDB.TITLE_MI_Ajuda_EN);
				MI_About.setText(MessageDB.TITLE_MI_About_EN);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_EN);
				MI_Tema_Default.setText(MessageDB.TITLE_MI_Tema_Default_EN);
				MI_Tema_Dark.setText(MessageDB.TITLE_MI_Tema_Dark_EN);
				MI_Tema_Cosmos.setText(MessageDB.TITLE_MI_Tema_Cosmos_EN);
				MI_Tema_Chaos.setText(MessageDB.TITLE_MI_Tema_Chaos_EN);
				MI_Tema_Custom.setText(MessageDB.TITLE_MI_Tema_Custom_EN);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_EN);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_EN);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_EN);
				B_Exportar.setText(MessageDB.TITLE_B_Exportar_EN);
				B_Save.setText(MessageDB.TITLE_B_Save_EN);
				B_Load.setText(MessageDB.TITLE_B_Load_EN);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_USA_EN);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_EUR_EN);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_JPN_EN);
				CB_AutoAtivar.setText(MessageDB.TITLE_CB_AutoAtivar_EN);

				P_INICIO.setImageBackgroundAt(02, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_en));
				M_Funcoes.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_en));
				M_Idioma.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_en));

				break;
			case MessageDB.IDIOMA_DE:

				M_Funcoes.setText(MessageDB.TITLE_M_Funcoes_DE);
				M_Idioma.setText(MessageDB.TITLE_M_Idioma_DE);
				M_Tema.setText(MessageDB.TITLE_M_Tema_DE);
				M_Audio.setText(MessageDB.TITLE_M_Audio_DE);
				MI_Exportar.setText(MessageDB.TITLE_MI_Exportar_DE);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_DE);
				MI_Save.setText(MessageDB.TITLE_MI_Save_DE);
				MI_Load.setText(MessageDB.TITLE_MI_Load_DE);
				MI_Ajuda.setText(MessageDB.TITLE_MI_Ajuda_DE);
				MI_About.setText(MessageDB.TITLE_MI_About_DE);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_DE);
				MI_Tema_Default.setText(MessageDB.TITLE_MI_Tema_Default_DE);
				MI_Tema_Dark.setText(MessageDB.TITLE_MI_Tema_Dark_DE);
				MI_Tema_Cosmos.setText(MessageDB.TITLE_MI_Tema_Cosmos_DE);
				MI_Tema_Chaos.setText(MessageDB.TITLE_MI_Tema_Chaos_DE);
				MI_Tema_Custom.setText(MessageDB.TITLE_MI_Tema_Custom_DE);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_DE);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_DE);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_DE);
				B_Exportar.setText(MessageDB.TITLE_B_Exportar_DE);
				B_Save.setText(MessageDB.TITLE_B_Save_DE);
				B_Load.setText(MessageDB.TITLE_B_Load_DE);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_USA_DE);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_EUR_DE);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_JPN_DE);
				CB_AutoAtivar.setText(MessageDB.TITLE_CB_AutoAtivar_DE);

				P_INICIO.setImageBackgroundAt(02, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_de));
				M_Funcoes.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_de));
				M_Idioma.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_de));

				break;
			case MessageDB.IDIOMA_ES:

				M_Funcoes.setText(MessageDB.TITLE_M_Funcoes_ES);
				M_Idioma.setText(MessageDB.TITLE_M_Idioma_ES);
				M_Tema.setText(MessageDB.TITLE_M_Tema_ES);
				M_Audio.setText(MessageDB.TITLE_M_Audio_ES);
				MI_Exportar.setText(MessageDB.TITLE_MI_Exportar_ES);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_ES);
				MI_Save.setText(MessageDB.TITLE_MI_Save_ES);
				MI_Load.setText(MessageDB.TITLE_MI_Load_ES);
				MI_Ajuda.setText(MessageDB.TITLE_MI_Ajuda_ES);
				MI_About.setText(MessageDB.TITLE_MI_About_ES);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_ES);
				MI_Tema_Default.setText(MessageDB.TITLE_MI_Tema_Default_ES);
				MI_Tema_Dark.setText(MessageDB.TITLE_MI_Tema_Dark_ES);
				MI_Tema_Cosmos.setText(MessageDB.TITLE_MI_Tema_Cosmos_ES);
				MI_Tema_Chaos.setText(MessageDB.TITLE_MI_Tema_Chaos_ES);
				MI_Tema_Custom.setText(MessageDB.TITLE_MI_Tema_Custom_ES);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_ES);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_ES);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_ES);
				B_Exportar.setText(MessageDB.TITLE_B_Exportar_ES);
				B_Save.setText(MessageDB.TITLE_B_Save_ES);
				B_Load.setText(MessageDB.TITLE_B_Load_ES);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_USA_ES);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_EUR_ES);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_JPN_ES);
				CB_AutoAtivar.setText(MessageDB.TITLE_CB_AutoAtivar_ES);
				
				P_INICIO.setImageBackgroundAt(02, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_es));
				M_Funcoes.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_es));
				M_Idioma.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_es));

				break;
			case MessageDB.IDIOMA_FR:

				M_Funcoes.setText(MessageDB.TITLE_M_Funcoes_FR);
				M_Idioma.setText(MessageDB.TITLE_M_Idioma_FR);
				M_Tema.setText(MessageDB.TITLE_M_Tema_FR);
				M_Audio.setText(MessageDB.TITLE_M_Audio_FR);
				MI_Exportar.setText(MessageDB.TITLE_MI_Exportar_FR);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_FR);
				MI_Save.setText(MessageDB.TITLE_MI_Save_FR);
				MI_Load.setText(MessageDB.TITLE_MI_Load_FR);
				MI_Ajuda.setText(MessageDB.TITLE_MI_Ajuda_FR);
				MI_About.setText(MessageDB.TITLE_MI_About_FR);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_FR);
				MI_Tema_Default.setText(MessageDB.TITLE_MI_Tema_Default_FR);
				MI_Tema_Dark.setText(MessageDB.TITLE_MI_Tema_Dark_FR);
				MI_Tema_Cosmos.setText(MessageDB.TITLE_MI_Tema_Cosmos_FR);
				MI_Tema_Chaos.setText(MessageDB.TITLE_MI_Tema_Chaos_FR);
				MI_Tema_Custom.setText(MessageDB.TITLE_MI_Tema_Custom_FR);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_FR);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_FR);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_FR);
				B_Exportar.setText(MessageDB.TITLE_B_Exportar_FR);
				B_Save.setText(MessageDB.TITLE_B_Save_FR);
				B_Load.setText(MessageDB.TITLE_B_Load_FR);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_USA_FR);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_EUR_FR);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_JPN_FR);
				CB_AutoAtivar.setText(MessageDB.TITLE_CB_AutoAtivar_FR);
				
				P_INICIO.setImageBackgroundAt(02, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_fr));
				M_Funcoes.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_fr));
				M_Idioma.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_fr));

				break;
			case MessageDB.IDIOMA_IT:

				M_Funcoes.setText(MessageDB.TITLE_M_Funcoes_IT);
				M_Idioma.setText(MessageDB.TITLE_M_Idioma_IT);
				M_Tema.setText(MessageDB.TITLE_M_Tema_IT);
				M_Audio.setText(MessageDB.TITLE_M_Audio_IT);
				MI_Exportar.setText(MessageDB.TITLE_MI_Exportar_IT);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_IT);
				MI_Save.setText(MessageDB.TITLE_MI_Save_IT);
				MI_Load.setText(MessageDB.TITLE_MI_Load_IT);
				MI_Ajuda.setText(MessageDB.TITLE_MI_Ajuda_IT);
				MI_About.setText(MessageDB.TITLE_MI_About_IT);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_IT);
				MI_Tema_Default.setText(MessageDB.TITLE_MI_Tema_Default_IT);
				MI_Tema_Dark.setText(MessageDB.TITLE_MI_Tema_Dark_IT);
				MI_Tema_Cosmos.setText(MessageDB.TITLE_MI_Tema_Cosmos_IT);
				MI_Tema_Chaos.setText(MessageDB.TITLE_MI_Tema_Chaos_IT);
				MI_Tema_Custom.setText(MessageDB.TITLE_MI_Tema_Custom_IT);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_IT);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_IT);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_IT);
				B_Exportar.setText(MessageDB.TITLE_B_Exportar_IT);
				B_Save.setText(MessageDB.TITLE_B_Save_IT);
				B_Load.setText(MessageDB.TITLE_B_Load_IT);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_USA_IT);
				CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_EUR_IT);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Regiao_JPN_IT);
				CB_AutoAtivar.setText(MessageDB.TITLE_CB_AutoAtivar_IT);
				
				P_INICIO.setImageBackgroundAt(02, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_INICIO_it));
				M_Funcoes.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_it));
				M_Idioma.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_FLAG_it));

				break;
		}

		TP_TabbedPane.setTitleAt(1, MessageDB.TITLE_TP_FF1);
		TP_TabbedPane.setTitleAt(2, MessageDB.TITLE_TP_FF2);
		TP_TabbedPane.setTitleAt(3, MessageDB.TITLE_TP_FF3);
		TP_TabbedPane.setTitleAt(4, MessageDB.TITLE_TP_FF4);
		TP_TabbedPane.setTitleAt(5, MessageDB.TITLE_TP_FF5);
		TP_TabbedPane.setTitleAt(6, MessageDB.TITLE_TP_FF6);
		TP_TabbedPane.setTitleAt(7, MessageDB.TITLE_TP_FF7);
		TP_TabbedPane.setTitleAt(8, MessageDB.TITLE_TP_FF8);
		TP_TabbedPane.setTitleAt(9, MessageDB.TITLE_TP_FF9);
		TP_TabbedPane.setTitleAt(10, MessageDB.TITLE_TP_FF10);
		TP_TabbedPane.setTitleAt(11, MessageDB.TITLE_TP_FF11);
		TP_TabbedPane.setTitleAt(12, MessageDB.TITLE_TP_FF12);
		TP_TabbedPane.setTitleAt(13, MessageDB.TITLE_TP_FF13);
		TP_TabbedPane.setTitleAt(14, MessageDB.TITLE_TP_DDFF);

		MI_Portugues.setText(MessageDB.TITLE_MI_PORTUGUES);
		MI_English.setText(MessageDB.TITLE_MI_ENGLISH);
		MI_Deutsch.setText(MessageDB.TITLE_MI_DEUTSCH);
		MI_Espanol.setText(MessageDB.TITLE_MI_ESPANOL);
		MI_Francaise.setText(MessageDB.TITLE_MI_FRANCAISE);
		MI_Italiano.setText(MessageDB.TITLE_MI_ITALIANO);

		CB_Regiao.setSelectedIndex(CBIndex);
		P_INICIO.repaint();

	}

	private void initToolTipsMessages() {

		int i;
		JLabel Label;
		String Message;

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_IT; break;
		}
		Label = new JLabel(Message);
		Label.setForeground(new Color(200, 100, 0));
		Label.setFont(new Font("Arial", Font.ITALIC, 13));
		Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_WARNING));
		BalloonTipStyle Style = new ModernBalloonStyle(6, 6, new Color(255, 240, 220), Color.WHITE, new Color(200, 100, 0));
		CharLimitBalloon = new BalloonTip(TF_FF1_ISO1, Label, Style, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 10, 8, false);
		CharLimitBalloon.setVisible(false);

		i = 0;
		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_IT; break;
		}
		for(int j=0; j<110; j++) {
			Label = new JLabel(Message);
			Label.setFont(new Font("Arial", Font.ITALIC, 11));
			Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
			CheckBoxTipAL.get(i++).setContents(Label);
		}

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_IT; break;
		}
		Label = new JLabel(Message);
		Label.setFont(new Font("Arial", Font.ITALIC, 11));
		Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
		CheckBoxTipAL.get(i++).setContents(Label);

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_IT; break;
		}
		Label = new JLabel(Message);
		Label.setFont(new Font("Arial", Font.ITALIC, 11));
		Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
		CheckBoxTipAL.get(i++).setContents(Label);

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_IT; break;
		}
		Label = new JLabel(Message);
		Label.setFont(new Font("Arial", Font.ITALIC, 11));
		Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
		CheckBoxTipAL.get(i++).setContents(Label);

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_IT; break;
		}
		Label = new JLabel(Message);
		Label.setFont(new Font("Arial", Font.ITALIC, 11));
		Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
		CheckBoxTipAL.get(i++).setContents(Label);

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_IT; break;
		}
		Label = new JLabel(Message);
		Label.setFont(new Font("Arial", Font.ITALIC, 11));
		Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
		CheckBoxTipAL.get(i++).setContents(Label);

		Message = null;
		switch(Idioma) {
			case MessageDB.IDIOMA_PT: Message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_PT; break;
			case MessageDB.IDIOMA_EN: Message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_EN; break;
			case MessageDB.IDIOMA_DE: Message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_DE; break;
			case MessageDB.IDIOMA_ES: Message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_ES; break;
			case MessageDB.IDIOMA_FR: Message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_FR; break;
			case MessageDB.IDIOMA_IT: Message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_IT; break;
		}
		for(int j=0; j<8; j++) {
			Label = new JLabel(Message);
			Label.setFont(new Font("Arial", Font.ITALIC, 11));
			Label.setIcon(ResourceManager.GetIconFile(ResourceDB.INDEX_ICON_INFORMATION));
			CheckBoxTipAL.get(i++).setContents(Label);
		}

	}

	private void initFields() {

		for(JCheckBox JCB : CheckBoxAL)
			JCB.setSelected(false);

		for(BalloonTip BT : CheckBoxTipAL)
			BT.setOpacity(1.0f);

		for(int i=0; i<TextFieldAL.size(); i++) {
			JTextField JTF = TextFieldAL.get(i);
			JTF.setFont(new Font("Courier New", Font.PLAIN, 15));
			JTF.setForeground(Color.BLACK);
			JTF.setText(TitleAL.get(i));
			JTF.setEnabled(false);
		}

	}

	private void initArrays() {

		OffsetAL = new ArrayList<>();
		TitleAL = new ArrayList<>();
		CheckBoxAL = new ArrayList<>();
		TextFieldAL = new ArrayList<>();
		CheckBoxTipAL = new ArrayList<>();

		OffsetAL.add(OffsetDB.FF1_ISO_BATTLE);
		OffsetAL.add(OffsetDB.FF1_ISO_DUNGEON);
		OffsetAL.add(OffsetDB.FF1_ISO_CHAOSSHRINE);
		OffsetAL.add(OffsetDB.FF1_ISO_TOWN);
		OffsetAL.add(OffsetDB.FF1_ISO_MTGULG);
		OffsetAL.add(OffsetDB.FF1_DLC_AIRSHIP);
		OffsetAL.add(OffsetDB.FF1_DLC_BATTLE);
		OffsetAL.add(OffsetDB.FF1_DLC_CASTLECORNELIA);
		OffsetAL.add(OffsetDB.FF1_DLC_MENUSCREEN);
		OffsetAL.add(OffsetDB.FF1_DLC_CHAOSSHRINE);
		OffsetAL.add(OffsetDB.FF2_ISO_BATTLETHEME1);
		OffsetAL.add(OffsetDB.FF2_ISO_BATTLETHEME2);
		OffsetAL.add(OffsetDB.FF2_ISO_CASTLEPANDEMONIUM);
		OffsetAL.add(OffsetDB.FF2_ISO_THEREBELARMY);
		OffsetAL.add(OffsetDB.FF2_ISO_THEIMPERIALARMY);
		OffsetAL.add(OffsetDB.FF2_DLC_TOWEROFTHEMAGI);
		OffsetAL.add(OffsetDB.FF2_DLC_THEPRINCESSSSEDUCTION);
		OffsetAL.add(OffsetDB.FF2_DLC_REVIVAL);
		OffsetAL.add(OffsetDB.FF3_ISO_BATTLE1);
		OffsetAL.add(OffsetDB.FF3_ISO_BATTLE2);
		OffsetAL.add(OffsetDB.FF3_ISO_THISISTHELASTBATTLE);
		OffsetAL.add(OffsetDB.FF3_ISO_THECRYSTALTOWER);
		OffsetAL.add(OffsetDB.FF3_ISO_LETMEKNOWTHETHRUTH);
		OffsetAL.add(OffsetDB.FF3_DLC_THEBOUNDLESSOCEAN);
		OffsetAL.add(OffsetDB.FF3_DLC_GOODOLFELLOWS);
		OffsetAL.add(OffsetDB.FF3_DLC_FORBIDDENLAND);
		OffsetAL.add(OffsetDB.FF4_ISO_BATTLE1);
		OffsetAL.add(OffsetDB.FF4_ISO_BATTLE2);
		OffsetAL.add(OffsetDB.FF4_ISO_BATTLEWITHTHEFOURFIENDS);
		OffsetAL.add(OffsetDB.FF4_ISO_THEREDWINGS);
		OffsetAL.add(OffsetDB.FF4_ISO_THEMEOFLOVE);
		OffsetAL.add(OffsetDB.FF4_DLC_GOLBEZCLADINDARKNESS);
		OffsetAL.add(OffsetDB.FF4_DLC_WITHINTHEGIANT);
		OffsetAL.add(OffsetDB.FF4_DLC_THEFINALBATTLE);
		OffsetAL.add(OffsetDB.FF5_ISO_BATTLE1);
		OffsetAL.add(OffsetDB.FF5_ISO_BATTLEATTHEBIGBRIDGE);
		OffsetAL.add(OffsetDB.FF5_ISO_THEFINALBATTLE);
		OffsetAL.add(OffsetDB.FF5_ISO_THEDECISIVEBATTLE);
		OffsetAL.add(OffsetDB.FF5_ISO_HOMESWEETHOME);
		OffsetAL.add(OffsetDB.FF5_DLC_BATTLE2);
		OffsetAL.add(OffsetDB.FF5_DLC_THEEVILLORDXDEATH);
		OffsetAL.add(OffsetDB.FF5_DLC_THEDAWNWARRIORS);
		OffsetAL.add(OffsetDB.FF6_ISO_BATTLE);
		OffsetAL.add(OffsetDB.FF6_ISO_THEDECISIVEBATTLE);
		OffsetAL.add(OffsetDB.FF6_ISO_BATTLETOTHEDEATH);
		OffsetAL.add(OffsetDB.FF6_ISO_DANCINGMAD);
		OffsetAL.add(OffsetDB.FF6_ISO_SEARCHINGFORFRIENDS);
		OffsetAL.add(OffsetDB.FF6_DLC_PHANTOMTRAIN);
		OffsetAL.add(OffsetDB.FF6_DLC_PROTECTTHEESPERS);
		OffsetAL.add(OffsetDB.FF6_DLC_MAGITEKRESEARCHFACILITY);
		OffsetAL.add(OffsetDB.FF7_ISO_FIGHTON);
		OffsetAL.add(OffsetDB.FF7_ISO_JENOVA);
		OffsetAL.add(OffsetDB.FF7_ISO_ONEWINGEDANGEL);
		OffsetAL.add(OffsetDB.FF7_ISO_OPENINGBOMBINGMISSION);
		OffsetAL.add(OffsetDB.FF7_ISO_LETTHEBATTLESBEGIN);
		OffsetAL.add(OffsetDB.FF7_DLC_THECHASE);
		OffsetAL.add(OffsetDB.FF7_DLC_ELETRICDECHOCOBO);
		OffsetAL.add(OffsetDB.FF7_DLC_BIRTHOFAGOD);
		OffsetAL.add(OffsetDB.FF8_ISO_DONTBEAFRAID);
		OffsetAL.add(OffsetDB.FF8_ISO_FORCEYOURWAY);
		OffsetAL.add(OffsetDB.FF8_ISO_THEEXTREME);
		OffsetAL.add(OffsetDB.FF8_ISO_THEMANWITHTHEMACHINEGUN);
		OffsetAL.add(OffsetDB.FF8_ISO_PREMONITION);
		OffsetAL.add(OffsetDB.FF8_DLC_LIBERIFATALI);
		OffsetAL.add(OffsetDB.FF8_DLC_THELANDING);
		OffsetAL.add(OffsetDB.FF8_DLC_SHUFFLEORBOOGIE);
		OffsetAL.add(OffsetDB.FF9_ISO_BATTLE1);
		OffsetAL.add(OffsetDB.FF9_ISO_BATTLE2);
		OffsetAL.add(OffsetDB.FF9_ISO_THEFINALBATTLE);
		OffsetAL.add(OffsetDB.FF9_ISO_THEDARKNESSOFETERNITY);
		OffsetAL.add(OffsetDB.FF9_ISO_NOTALONE);
		OffsetAL.add(OffsetDB.FF9_DLC_SWORDSOFFURY);
		OffsetAL.add(OffsetDB.FF9_DLC_FESTIVALOFTHEHUNT);
		OffsetAL.add(OffsetDB.FF9_DLC_ROSESOFMAY);
		OffsetAL.add(OffsetDB.FF10_ISO_BATTLETHEME);
		OffsetAL.add(OffsetDB.FF10_ISO_OTHERWORLD);
		OffsetAL.add(OffsetDB.FF10_ISO_SUMMONEDMONSTERBATTLE);
		OffsetAL.add(OffsetDB.FF10_ISO_FIGHTWITHSEYMOUR);
		OffsetAL.add(OffsetDB.FF10_ISO_AFLEETINGDREAM);
		OffsetAL.add(OffsetDB.FF10_DLC_ENEMYATTACK);
		OffsetAL.add(OffsetDB.FF10_DLC_ASSAULT);
		OffsetAL.add(OffsetDB.FF10_DLC_FINALBATTLE);
		OffsetAL.add(OffsetDB.FF11_ISO_BATTLEINTHEDUNGEON2);
		OffsetAL.add(OffsetDB.FF11_ISO_AREALMOFEMPTINESS);
		OffsetAL.add(OffsetDB.FF11_ISO_AWAKENING);
		OffsetAL.add(OffsetDB.FF11_ISO_IRONCOLOSSUS);
		OffsetAL.add(OffsetDB.FF11_DLC_VANADIELMARCH);
		OffsetAL.add(OffsetDB.FF11_DLC_RAGNAROK);
		OffsetAL.add(OffsetDB.FF11_DLC_FIGHTERSOFTHECRYSTAL);
		OffsetAL.add(OffsetDB.FF12_ISO_BOSSBATTLE);
		OffsetAL.add(OffsetDB.FF12_ISO_ESPERBATTLE);
		OffsetAL.add(OffsetDB.FF12_ISO_FIGHTTOTHEDEATH);
		OffsetAL.add(OffsetDB.FF12_ISO_THEBATTLEFORFREEDOM);
		OffsetAL.add(OffsetDB.FF12_DLC_FLASHOFSTEEL);
		OffsetAL.add(OffsetDB.FF12_DLC_DISCORD);
		OffsetAL.add(OffsetDB.FF12_DLC_RESPITE);
		OffsetAL.add(OffsetDB.FF13_ISO_BLINDEDBYLIGHT);
		OffsetAL.add(OffsetDB.FF13_ISO_SABERSEDGE);
		OffsetAL.add(OffsetDB.FF13_ISO_NASCENTREQUIEM);
		OffsetAL.add(OffsetDB.FF13_DLC_DUSTTODUST);
		OffsetAL.add(OffsetDB.FF13_DLC_EIDOLONS);
		OffsetAL.add(OffsetDB.FF13_DLC_FIGHTINGFATE);
		OffsetAL.add(OffsetDB.FF13_DLC_CHOCOBOSOFCOCOON);
		OffsetAL.add(OffsetDB.FF13_DLC_EDENUNDERSIEGE);
		OffsetAL.add(OffsetDB.DDFF_ISO_COSMOS);
		OffsetAL.add(OffsetDB.DDFF_ISO_CHAOSLASTBATTLE1);
		OffsetAL.add(OffsetDB.DDFF_ISO_CHAOSLASTBATTLE2);
		OffsetAL.add(OffsetDB.DDFF_ISO_CHAOSLASTBATTLE3);
		OffsetAL.add(OffsetDB.DDFF_ISO_CANTATAMORTISGODINFIRE);
		OffsetAL.add(OffsetDB.DDFF_ISO_OPENING);

		TitleAL.add(TitleDB.FF1_ISO_BATTLE);
		TitleAL.add(TitleDB.FF1_ISO_DUNGEON);
		TitleAL.add(TitleDB.FF1_ISO_CHAOSSHRINE);
		TitleAL.add(TitleDB.FF1_ISO_TOWN);
		TitleAL.add(TitleDB.FF1_ISO_MTGULG);
		TitleAL.add(TitleDB.FF1_DLC_AIRSHIP);
		TitleAL.add(TitleDB.FF1_DLC_BATTLE);
		TitleAL.add(TitleDB.FF1_DLC_CASTLECORNELIA);
		TitleAL.add(TitleDB.FF1_DLC_MENUSCREEN);
		TitleAL.add(TitleDB.FF1_DLC_CHAOSSHRINE);
		TitleAL.add(TitleDB.FF2_ISO_BATTLETHEME1);
		TitleAL.add(TitleDB.FF2_ISO_BATTLETHEME2);
		TitleAL.add(TitleDB.FF2_ISO_CASTLEPANDEMONIUM);
		TitleAL.add(TitleDB.FF2_ISO_THEREBELARMY);
		TitleAL.add(TitleDB.FF2_ISO_THEIMPERIALARMY);
		TitleAL.add(TitleDB.FF2_DLC_TOWEROFTHEMAGI);
		TitleAL.add(TitleDB.FF2_DLC_THEPRINCESSSSEDUCTION);
		TitleAL.add(TitleDB.FF2_DLC_REVIVAL);
		TitleAL.add(TitleDB.FF3_ISO_BATTLE1);
		TitleAL.add(TitleDB.FF3_ISO_BATTLE2);
		TitleAL.add(TitleDB.FF3_ISO_THISISTHELASTBATTLE);
		TitleAL.add(TitleDB.FF3_ISO_THECRYSTALTOWER);
		TitleAL.add(TitleDB.FF3_ISO_LETMEKNOWTHETHRUTH);
		TitleAL.add(TitleDB.FF3_DLC_THEBOUNDLESSOCEAN);
		TitleAL.add(TitleDB.FF3_DLC_GOODOLFELLOWS);
		TitleAL.add(TitleDB.FF3_DLC_FORBIDDENLAND);
		TitleAL.add(TitleDB.FF4_ISO_BATTLE1);
		TitleAL.add(TitleDB.FF4_ISO_BATTLE2);
		TitleAL.add(TitleDB.FF4_ISO_BATTLEWITHTHEFOURFIENDS);
		TitleAL.add(TitleDB.FF4_ISO_THEREDWINGS);
		TitleAL.add(TitleDB.FF4_ISO_THEMEOFLOVE);
		TitleAL.add(TitleDB.FF4_DLC_GOLBEZCLADINDARKNESS);
		TitleAL.add(TitleDB.FF4_DLC_WITHINTHEGIANT);
		TitleAL.add(TitleDB.FF4_DLC_THEFINALBATTLE);
		TitleAL.add(TitleDB.FF5_ISO_BATTLE1);
		TitleAL.add(TitleDB.FF5_ISO_BATTLEATTHEBIGBRIDGE);
		TitleAL.add(TitleDB.FF5_ISO_THEFINALBATTLE);
		TitleAL.add(TitleDB.FF5_ISO_THEDECISIVEBATTLE);
		TitleAL.add(TitleDB.FF5_ISO_HOMESWEETHOME);
		TitleAL.add(TitleDB.FF5_DLC_BATTLE2);
		TitleAL.add(TitleDB.FF5_DLC_THEEVILLORDXDEATH);
		TitleAL.add(TitleDB.FF5_DLC_THEDAWNWARRIORS);
		TitleAL.add(TitleDB.FF6_ISO_BATTLE);
		TitleAL.add(TitleDB.FF6_ISO_THEDECISIVEBATTLE);
		TitleAL.add(TitleDB.FF6_ISO_BATTLETOTHEDEATH);
		TitleAL.add(TitleDB.FF6_ISO_DANCINGMAD);
		TitleAL.add(TitleDB.FF6_ISO_SEARCHINGFORFRIENDS);
		TitleAL.add(TitleDB.FF6_DLC_PHANTOMTRAIN);
		TitleAL.add(TitleDB.FF6_DLC_PROTECTTHEESPERS);
		TitleAL.add(TitleDB.FF6_DLC_MAGITEKRESEARCHFACILITY);
		TitleAL.add(TitleDB.FF7_ISO_FIGHTON);
		TitleAL.add(TitleDB.FF7_ISO_JENOVA);
		TitleAL.add(TitleDB.FF7_ISO_ONEWINGEDANGEL);
		TitleAL.add(TitleDB.FF7_ISO_OPENINGBOMBINGMISSION);
		TitleAL.add(TitleDB.FF7_ISO_LETTHEBATTLESBEGIN);
		TitleAL.add(TitleDB.FF7_DLC_THECHASE);
		TitleAL.add(TitleDB.FF7_DLC_ELETRICDECHOCOBO);
		TitleAL.add(TitleDB.FF7_DLC_BIRTHOFAGOD);
		TitleAL.add(TitleDB.FF8_ISO_DONTBEAFRAID);
		TitleAL.add(TitleDB.FF8_ISO_FORCEYOURWAY);
		TitleAL.add(TitleDB.FF8_ISO_THEEXTREME);
		TitleAL.add(TitleDB.FF8_ISO_THEMANWITHTHEMACHINEGUN);
		TitleAL.add(TitleDB.FF8_ISO_PREMONITION);
		TitleAL.add(TitleDB.FF8_DLC_LIBERIFATALI);
		TitleAL.add(TitleDB.FF8_DLC_THELANDING);
		TitleAL.add(TitleDB.FF8_DLC_SHUFFLEORBOOGIE);
		TitleAL.add(TitleDB.FF9_ISO_BATTLE1);
		TitleAL.add(TitleDB.FF9_ISO_BATTLE2);
		TitleAL.add(TitleDB.FF9_ISO_THEFINALBATTLE);
		TitleAL.add(TitleDB.FF9_ISO_THEDARKNESSOFETERNITY);
		TitleAL.add(TitleDB.FF9_ISO_NOTALONE);
		TitleAL.add(TitleDB.FF9_DLC_SWORDSOFFURY);
		TitleAL.add(TitleDB.FF9_DLC_FESTIVALOFTHEHUNT);
		TitleAL.add(TitleDB.FF9_DLC_ROSESOFMAY);
		TitleAL.add(TitleDB.FF10_ISO_BATTLETHEME);
		TitleAL.add(TitleDB.FF10_ISO_OTHERWORLD);
		TitleAL.add(TitleDB.FF10_ISO_SUMMONEDMONSTERBATTLE);
		TitleAL.add(TitleDB.FF10_ISO_FIGHTWITHSEYMOUR);
		TitleAL.add(TitleDB.FF10_ISO_AFLEETINGDREAM);
		TitleAL.add(TitleDB.FF10_DLC_ENEMYATTACK);
		TitleAL.add(TitleDB.FF10_DLC_ASSAULT);
		TitleAL.add(TitleDB.FF10_DLC_FINALBATTLE);
		TitleAL.add(TitleDB.FF11_ISO_BATTLEINTHEDUNGEON2);
		TitleAL.add(TitleDB.FF11_ISO_AREALMOFEMPTINESS);
		TitleAL.add(TitleDB.FF11_ISO_AWAKENING);
		TitleAL.add(TitleDB.FF11_ISO_IRONCOLOSSUS);
		TitleAL.add(TitleDB.FF11_DLC_VANADIELMARCH);
		TitleAL.add(TitleDB.FF11_DLC_RAGNAROK);
		TitleAL.add(TitleDB.FF11_DLC_FIGHTERSOFTHECRYSTAL);
		TitleAL.add(TitleDB.FF12_ISO_BOSSBATTLE);
		TitleAL.add(TitleDB.FF12_ISO_ESPERBATTLE);
		TitleAL.add(TitleDB.FF12_ISO_FIGHTTOTHEDEATH);
		TitleAL.add(TitleDB.FF12_ISO_THEBATTLEFORFREEDOM);
		TitleAL.add(TitleDB.FF12_DLC_FLASHOFSTEEL);
		TitleAL.add(TitleDB.FF12_DLC_DISCORD);
		TitleAL.add(TitleDB.FF12_DLC_RESPITE);
		TitleAL.add(TitleDB.FF13_ISO_BLINDEDBYLIGHT);
		TitleAL.add(TitleDB.FF13_ISO_SABERSEDGE);
		TitleAL.add(TitleDB.FF13_ISO_NASCENTREQUIEM);
		TitleAL.add(TitleDB.FF13_DLC_DUSTTODUST);
		TitleAL.add(TitleDB.FF13_DLC_EIDOLONS);
		TitleAL.add(TitleDB.FF13_DLC_FIGHTINGFATE);
		TitleAL.add(TitleDB.FF13_DLC_CHOCOBOSOFCOCOON);
		TitleAL.add(TitleDB.FF13_DLC_EDENUNDERSIEGE);
		TitleAL.add(TitleDB.DDFF_ISO_COSMOS);
		TitleAL.add(TitleDB.DDFF_ISO_CHAOSLASTBATTLE1);
		TitleAL.add(TitleDB.DDFF_ISO_CHAOSLASTBATTLE2);
		TitleAL.add(TitleDB.DDFF_ISO_CHAOSLASTBATTLE3);
		TitleAL.add(TitleDB.DDFF_ISO_CANTATAMORTISGODINFIRE);
		TitleAL.add(TitleDB.DDFF_ISO_OPENING);

		CheckBoxAL.add(CB_FF1_ISO1);
		CheckBoxAL.add(CB_FF1_ISO2);
		CheckBoxAL.add(CB_FF1_ISO3);
		CheckBoxAL.add(CB_FF1_ISO4);
		CheckBoxAL.add(CB_FF1_ISO5);
		CheckBoxAL.add(CB_FF1_DLC1);
		CheckBoxAL.add(CB_FF1_DLC2);
		CheckBoxAL.add(CB_FF1_DLC3);
		CheckBoxAL.add(CB_FF1_DLC4);
		CheckBoxAL.add(CB_FF1_DLC5);
		CheckBoxAL.add(CB_FF2_ISO1);
		CheckBoxAL.add(CB_FF2_ISO2);
		CheckBoxAL.add(CB_FF2_ISO3);
		CheckBoxAL.add(CB_FF2_ISO4);
		CheckBoxAL.add(CB_FF2_ISO5);
		CheckBoxAL.add(CB_FF2_DLC1);
		CheckBoxAL.add(CB_FF2_DLC2);
		CheckBoxAL.add(CB_FF2_DLC3);
		CheckBoxAL.add(CB_FF3_ISO1);
		CheckBoxAL.add(CB_FF3_ISO2);
		CheckBoxAL.add(CB_FF3_ISO3);
		CheckBoxAL.add(CB_FF3_ISO4);
		CheckBoxAL.add(CB_FF3_ISO5);
		CheckBoxAL.add(CB_FF3_DLC1);
		CheckBoxAL.add(CB_FF3_DLC2);
		CheckBoxAL.add(CB_FF3_DLC3);
		CheckBoxAL.add(CB_FF4_ISO1);
		CheckBoxAL.add(CB_FF4_ISO2);
		CheckBoxAL.add(CB_FF4_ISO3);
		CheckBoxAL.add(CB_FF4_ISO4);
		CheckBoxAL.add(CB_FF4_ISO5);
		CheckBoxAL.add(CB_FF4_DLC1);
		CheckBoxAL.add(CB_FF4_DLC2);
		CheckBoxAL.add(CB_FF4_DLC3);
		CheckBoxAL.add(CB_FF5_ISO1);
		CheckBoxAL.add(CB_FF5_ISO2);
		CheckBoxAL.add(CB_FF5_ISO3);
		CheckBoxAL.add(CB_FF5_ISO4);
		CheckBoxAL.add(CB_FF5_ISO5);
		CheckBoxAL.add(CB_FF5_DLC1);
		CheckBoxAL.add(CB_FF5_DLC2);
		CheckBoxAL.add(CB_FF5_DLC3);
		CheckBoxAL.add(CB_FF6_ISO1);
		CheckBoxAL.add(CB_FF6_ISO2);
		CheckBoxAL.add(CB_FF6_ISO3);
		CheckBoxAL.add(CB_FF6_ISO4);
		CheckBoxAL.add(CB_FF6_ISO5);
		CheckBoxAL.add(CB_FF6_DLC1);
		CheckBoxAL.add(CB_FF6_DLC2);
		CheckBoxAL.add(CB_FF6_DLC3);
		CheckBoxAL.add(CB_FF7_ISO1);
		CheckBoxAL.add(CB_FF7_ISO2);
		CheckBoxAL.add(CB_FF7_ISO3);
		CheckBoxAL.add(CB_FF7_ISO4);
		CheckBoxAL.add(CB_FF7_ISO5);
		CheckBoxAL.add(CB_FF7_DLC1);
		CheckBoxAL.add(CB_FF7_DLC2);
		CheckBoxAL.add(CB_FF7_DLC3);
		CheckBoxAL.add(CB_FF8_ISO1);
		CheckBoxAL.add(CB_FF8_ISO2);
		CheckBoxAL.add(CB_FF8_ISO3);
		CheckBoxAL.add(CB_FF8_ISO4);
		CheckBoxAL.add(CB_FF8_ISO5);
		CheckBoxAL.add(CB_FF8_DLC1);
		CheckBoxAL.add(CB_FF8_DLC2);
		CheckBoxAL.add(CB_FF8_DLC3);
		CheckBoxAL.add(CB_FF9_ISO1);
		CheckBoxAL.add(CB_FF9_ISO2);
		CheckBoxAL.add(CB_FF9_ISO3);
		CheckBoxAL.add(CB_FF9_ISO4);
		CheckBoxAL.add(CB_FF9_ISO5);
		CheckBoxAL.add(CB_FF9_DLC1);
		CheckBoxAL.add(CB_FF9_DLC2);
		CheckBoxAL.add(CB_FF9_DLC3);
		CheckBoxAL.add(CB_FF10_ISO1);
		CheckBoxAL.add(CB_FF10_ISO2);
		CheckBoxAL.add(CB_FF10_ISO3);
		CheckBoxAL.add(CB_FF10_ISO4);
		CheckBoxAL.add(CB_FF10_ISO5);
		CheckBoxAL.add(CB_FF10_DLC1);
		CheckBoxAL.add(CB_FF10_DLC2);
		CheckBoxAL.add(CB_FF10_DLC3);
		CheckBoxAL.add(CB_FF11_ISO1);
		CheckBoxAL.add(CB_FF11_ISO2);
		CheckBoxAL.add(CB_FF11_ISO3);
		CheckBoxAL.add(CB_FF11_ISO4);
		CheckBoxAL.add(CB_FF11_DLC1);
		CheckBoxAL.add(CB_FF11_DLC2);
		CheckBoxAL.add(CB_FF11_DLC3);
		CheckBoxAL.add(CB_FF12_ISO1);
		CheckBoxAL.add(CB_FF12_ISO2);
		CheckBoxAL.add(CB_FF12_ISO3);
		CheckBoxAL.add(CB_FF12_ISO4);
		CheckBoxAL.add(CB_FF12_DLC1);
		CheckBoxAL.add(CB_FF12_DLC2);
		CheckBoxAL.add(CB_FF12_DLC3);
		CheckBoxAL.add(CB_FF13_ISO1);
		CheckBoxAL.add(CB_FF13_ISO2);
		CheckBoxAL.add(CB_FF13_ISO3);
		CheckBoxAL.add(CB_FF13_DLC1);
		CheckBoxAL.add(CB_FF13_DLC2);
		CheckBoxAL.add(CB_FF13_DLC3);
		CheckBoxAL.add(CB_FF13_DLC4);
		CheckBoxAL.add(CB_FF13_DLC5);
		CheckBoxAL.add(CB_DDFF_ISO1);
		CheckBoxAL.add(CB_DDFF_ISO2);
		CheckBoxAL.add(CB_DDFF_ISO3);
		CheckBoxAL.add(CB_DDFF_ISO4);
		CheckBoxAL.add(CB_DDFF_ISO5);
		CheckBoxAL.add(CB_DDFF_ISO6);

		TextFieldAL.add(TF_FF1_ISO1);
		TextFieldAL.add(TF_FF1_ISO2);
		TextFieldAL.add(TF_FF1_ISO3);
		TextFieldAL.add(TF_FF1_ISO4);
		TextFieldAL.add(TF_FF1_ISO5);
		TextFieldAL.add(TF_FF1_DLC1);
		TextFieldAL.add(TF_FF1_DLC2);
		TextFieldAL.add(TF_FF1_DLC3);
		TextFieldAL.add(TF_FF1_DLC4);
		TextFieldAL.add(TF_FF1_DLC5);
		TextFieldAL.add(TF_FF2_ISO1);
		TextFieldAL.add(TF_FF2_ISO2);
		TextFieldAL.add(TF_FF2_ISO3);
		TextFieldAL.add(TF_FF2_ISO4);
		TextFieldAL.add(TF_FF2_ISO5);
		TextFieldAL.add(TF_FF2_DLC1);
		TextFieldAL.add(TF_FF2_DLC2);
		TextFieldAL.add(TF_FF2_DLC3);
		TextFieldAL.add(TF_FF3_ISO1);
		TextFieldAL.add(TF_FF3_ISO2);
		TextFieldAL.add(TF_FF3_ISO3);
		TextFieldAL.add(TF_FF3_ISO4);
		TextFieldAL.add(TF_FF3_ISO5);
		TextFieldAL.add(TF_FF3_DLC1);
		TextFieldAL.add(TF_FF3_DLC2);
		TextFieldAL.add(TF_FF3_DLC3);
		TextFieldAL.add(TF_FF4_ISO1);
		TextFieldAL.add(TF_FF4_ISO2);
		TextFieldAL.add(TF_FF4_ISO3);
		TextFieldAL.add(TF_FF4_ISO4);
		TextFieldAL.add(TF_FF4_ISO5);
		TextFieldAL.add(TF_FF4_DLC1);
		TextFieldAL.add(TF_FF4_DLC2);
		TextFieldAL.add(TF_FF4_DLC3);
		TextFieldAL.add(TF_FF5_ISO1);
		TextFieldAL.add(TF_FF5_ISO2);
		TextFieldAL.add(TF_FF5_ISO3);
		TextFieldAL.add(TF_FF5_ISO4);
		TextFieldAL.add(TF_FF5_ISO5);
		TextFieldAL.add(TF_FF5_DLC1);
		TextFieldAL.add(TF_FF5_DLC2);
		TextFieldAL.add(TF_FF5_DLC3);
		TextFieldAL.add(TF_FF6_ISO1);
		TextFieldAL.add(TF_FF6_ISO2);
		TextFieldAL.add(TF_FF6_ISO3);
		TextFieldAL.add(TF_FF6_ISO4);
		TextFieldAL.add(TF_FF6_ISO5);
		TextFieldAL.add(TF_FF6_DLC1);
		TextFieldAL.add(TF_FF6_DLC2);
		TextFieldAL.add(TF_FF6_DLC3);
		TextFieldAL.add(TF_FF7_ISO1);
		TextFieldAL.add(TF_FF7_ISO2);
		TextFieldAL.add(TF_FF7_ISO3);
		TextFieldAL.add(TF_FF7_ISO4);
		TextFieldAL.add(TF_FF7_ISO5);
		TextFieldAL.add(TF_FF7_DLC1);
		TextFieldAL.add(TF_FF7_DLC2);
		TextFieldAL.add(TF_FF7_DLC3);
		TextFieldAL.add(TF_FF8_ISO1);
		TextFieldAL.add(TF_FF8_ISO2);
		TextFieldAL.add(TF_FF8_ISO3);
		TextFieldAL.add(TF_FF8_ISO4);
		TextFieldAL.add(TF_FF8_ISO5);
		TextFieldAL.add(TF_FF8_DLC1);
		TextFieldAL.add(TF_FF8_DLC2);
		TextFieldAL.add(TF_FF8_DLC3);
		TextFieldAL.add(TF_FF9_ISO1);
		TextFieldAL.add(TF_FF9_ISO2);
		TextFieldAL.add(TF_FF9_ISO3);
		TextFieldAL.add(TF_FF9_ISO4);
		TextFieldAL.add(TF_FF9_ISO5);
		TextFieldAL.add(TF_FF9_DLC1);
		TextFieldAL.add(TF_FF9_DLC2);
		TextFieldAL.add(TF_FF9_DLC3);
		TextFieldAL.add(TF_FF10_ISO1);
		TextFieldAL.add(TF_FF10_ISO2);
		TextFieldAL.add(TF_FF10_ISO3);
		TextFieldAL.add(TF_FF10_ISO4);
		TextFieldAL.add(TF_FF10_ISO5);
		TextFieldAL.add(TF_FF10_DLC1);
		TextFieldAL.add(TF_FF10_DLC2);
		TextFieldAL.add(TF_FF10_DLC3);
		TextFieldAL.add(TF_FF11_ISO1);
		TextFieldAL.add(TF_FF11_ISO2);
		TextFieldAL.add(TF_FF11_ISO3);
		TextFieldAL.add(TF_FF11_ISO4);
		TextFieldAL.add(TF_FF11_DLC1);
		TextFieldAL.add(TF_FF11_DLC2);
		TextFieldAL.add(TF_FF11_DLC3);
		TextFieldAL.add(TF_FF12_ISO1);
		TextFieldAL.add(TF_FF12_ISO2);
		TextFieldAL.add(TF_FF12_ISO3);
		TextFieldAL.add(TF_FF12_ISO4);
		TextFieldAL.add(TF_FF12_DLC1);
		TextFieldAL.add(TF_FF12_DLC2);
		TextFieldAL.add(TF_FF12_DLC3);
		TextFieldAL.add(TF_FF13_ISO1);
		TextFieldAL.add(TF_FF13_ISO2);
		TextFieldAL.add(TF_FF13_ISO3);
		TextFieldAL.add(TF_FF13_DLC1);
		TextFieldAL.add(TF_FF13_DLC2);
		TextFieldAL.add(TF_FF13_DLC3);
		TextFieldAL.add(TF_FF13_DLC4);
		TextFieldAL.add(TF_FF13_DLC5);
		TextFieldAL.add(TF_DDFF_ISO1);
		TextFieldAL.add(TF_DDFF_ISO2);
		TextFieldAL.add(TF_DDFF_ISO3);
		TextFieldAL.add(TF_DDFF_ISO4);
		TextFieldAL.add(TF_DDFF_ISO5);
		TextFieldAL.add(TF_DDFF_ISO6);

		BalloonTip Balloon;
		BalloonTipStyle Style;

		Style = new ToolTipBalloonStyle(new Color(230, 240, 220), Color.BLACK);

		for(JCheckBox JCB : CheckBoxAL) {
			Balloon = new BalloonTip(JCB, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
			ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
			CheckBoxTipAL.add(Balloon);
		}

		Balloon = new BalloonTip(B_Save, new JLabel(), Style, Orientation.RIGHT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(B_Load, new JLabel(), Style, Orientation.RIGHT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(B_Exportar, new JLabel(), Style, Orientation.RIGHT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(CB_Regiao, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(CB_AutoAtivar, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF1_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF2_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF4_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF7_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF10_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF12_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_FF13_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

		Balloon = new BalloonTip(P_DDFF_PIC, new JLabel(), Style, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(Balloon, 500, 10000);
		CheckBoxTipAL.add(Balloon);

	}

}
