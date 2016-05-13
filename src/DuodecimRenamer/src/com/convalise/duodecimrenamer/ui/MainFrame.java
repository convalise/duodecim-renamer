
package com.convalise.duodecimrenamer.ui;

import com.convalise.duodecimrenamer.DuodecimRenamer;
import com.convalise.duodecimrenamer.database.MessageDB;
import com.convalise.duodecimrenamer.database.OffsetDB;
import com.convalise.duodecimrenamer.database.ResourceDB;
import com.convalise.duodecimrenamer.database.SongTitleDB;
import com.convalise.duodecimrenamer.engine.MediaPlayer;
import com.convalise.duodecimrenamer.engine.ResourceManager;
import com.convalise.duodecimrenamer.engine.CheatGenerator;
import com.convalise.lib.GradientButton;
import com.convalise.lib.ImagePanel;
import com.convalise.lib.GradientPanel;

import net.java.balloontip.BalloonTip;
import net.java.balloontip.BalloonTip.AttachLocation;
import net.java.balloontip.BalloonTip.Orientation;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.ModernBalloonStyle;
import net.java.balloontip.styles.ToolTipBalloonStyle;
import net.java.balloontip.utils.TimingUtils;
import net.java.balloontip.utils.ToolTipUtils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class MainFrame extends JFrame {

	private AboutPanel aboutPanel;
	private HelpPanel helpPanel;

	private JDialog aboutWindow;
	private JDialog helpWindow;

	private JColorChooser colorChooser;

	private BalloonTip charLimitBalloonTip;

	private ArrayList<String> bgmOffsetAL;
	private ArrayList<String> bgmTitleAL;
	private ArrayList<JCheckBox> checkBoxAL;
	private ArrayList<JTextField> textFieldAL;
	private ArrayList<BalloonTip> checkBoxTipAL;

	public MainFrame() {

		initComponents();
		initComponentsCustomization();

		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent winEvt) {
				queryForSaveTitleList();
			}
		});
		
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setTitle(MessageDB.TITLE_FRAME);
		super.setLocation((DuodecimRenamer.instance.screenSize.width - super.getSize().width) / 2, (DuodecimRenamer.instance.screenSize.height - super.getSize().height) / 2);
		super.requestFocus();
		
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_MainPanel = new GradientPanel();
        TP_TabbedPane = new javax.swing.JTabbedPane();
        P_START = new com.convalise.lib.ImagePanel();
        P_FF1 = new GradientPanel();
        P_FF1_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF2_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF3_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF4_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF5_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF6_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF7_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF8_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF9_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF10_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF11_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF12_PIC = new com.convalise.lib.ImagePanel();
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
        P_FF13_PIC = new com.convalise.lib.ImagePanel();
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
        P_DDFF_PIC = new com.convalise.lib.ImagePanel();
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
        P_Options = new GradientPanel();
        CB_Region = new javax.swing.JComboBox<String>();
        CB_AutoActivate = new javax.swing.JCheckBox();
        P_Data = new GradientPanel();
        B_Save = new GradientButton();
        B_Load = new GradientButton();
        B_Export = new GradientButton();
        MB_MenuBar = new javax.swing.JMenuBar();
        M_Functions = new javax.swing.JMenu();
        MI_Export = new javax.swing.JMenuItem();
        MI_Save = new javax.swing.JMenuItem();
        MI_Load = new javax.swing.JMenuItem();
        MI_Reset = new javax.swing.JMenuItem();
        S_Separator_1 = new javax.swing.JPopupMenu.Separator();
        M_Idiom = new javax.swing.JMenu();
        MI_Portugues = new javax.swing.JMenuItem();
        MI_English = new javax.swing.JMenuItem();
        MI_Deutsch = new javax.swing.JMenuItem();
        MI_Espanol = new javax.swing.JMenuItem();
        MI_Francaise = new javax.swing.JMenuItem();
        MI_Italiano = new javax.swing.JMenuItem();
        M_Audio = new javax.swing.JMenu();
        MI_Audio_ON = new javax.swing.JMenuItem();
        MI_Audio_OFF = new javax.swing.JMenuItem();
        M_Theme = new javax.swing.JMenu();
        MI_Theme_Default = new javax.swing.JMenuItem();
        MI_Theme_Dark = new javax.swing.JMenuItem();
        MI_Theme_Cosmos = new javax.swing.JMenuItem();
        MI_Theme_Chaos = new javax.swing.JMenuItem();
        MI_Theme_Custom = new javax.swing.JMenuItem();
        S_Separator_2 = new javax.swing.JPopupMenu.Separator();
        MI_Help = new javax.swing.JMenuItem();
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

        P_START.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_STARTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_STARTLayout = new javax.swing.GroupLayout(P_START);
        P_START.setLayout(P_STARTLayout);
        P_STARTLayout.setHorizontalGroup(
            P_STARTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        P_STARTLayout.setVerticalGroup(
            P_STARTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        TP_TabbedPane.addTab("P_START", P_START);

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

        P_Options.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        P_Options.setPreferredSize(new java.awt.Dimension(240, 78));

        CB_Region.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CB_Region" }));
        CB_Region.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CB_AutoActivate.setText("CB_AutoActivate");
        CB_AutoActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_AutoActivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_OptionsLayout = new javax.swing.GroupLayout(P_Options);
        P_Options.setLayout(P_OptionsLayout);
        P_OptionsLayout.setHorizontalGroup(
            P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_Region, 0, 226, Short.MAX_VALUE)
                    .addComponent(CB_AutoActivate))
                .addContainerGap())
        );
        P_OptionsLayout.setVerticalGroup(
            P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CB_Region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_AutoActivate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(B_Save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_Export.setText("B_Export");
        B_Export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_ExportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_ExportMouseExited(evt);
            }
        });
        B_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ExportActionPerformed(evt);
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
                        .addComponent(P_Options, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(B_Export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(P_Options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        M_Functions.setText("M_Functions");
        M_Functions.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
                M_FunctionsMenuDeselected(evt);
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                M_FunctionsMenuSelected(evt);
            }
        });

        MI_Export.setText("MI_Export");
        MI_Export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_ExportMouseEntered(evt);
            }
        });
        MI_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ExportActionPerformed(evt);
            }
        });
        M_Functions.add(MI_Export);

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
        M_Functions.add(MI_Save);

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
        M_Functions.add(MI_Load);

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
        M_Functions.add(MI_Reset);
        M_Functions.add(S_Separator_1);

        M_Idiom.setText("M_Idiom");
        M_Idiom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M_IdiomMouseEntered(evt);
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
        M_Idiom.add(MI_Portugues);

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
        M_Idiom.add(MI_English);

        MI_Deutsch.setText("MI_Deutsch");
        MI_Deutsch.setEnabled(false);
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
        M_Idiom.add(MI_Deutsch);

        MI_Espanol.setText("MI_Espanol");
        MI_Espanol.setEnabled(false);
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
        M_Idiom.add(MI_Espanol);

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
        M_Idiom.add(MI_Francaise);

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
        M_Idiom.add(MI_Italiano);

        M_Functions.add(M_Idiom);

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

        M_Functions.add(M_Audio);

        M_Theme.setText("M_Theme");
        M_Theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M_ThemeMouseEntered(evt);
            }
        });

        MI_Theme_Default.setText("MI_Theme_Default");
        MI_Theme_Default.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Theme_DefaultMouseEntered(evt);
            }
        });
        MI_Theme_Default.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Theme_DefaultActionPerformed(evt);
            }
        });
        M_Theme.add(MI_Theme_Default);

        MI_Theme_Dark.setText("MI_Theme_Dark");
        MI_Theme_Dark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Theme_DarkMouseEntered(evt);
            }
        });
        MI_Theme_Dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Theme_DarkActionPerformed(evt);
            }
        });
        M_Theme.add(MI_Theme_Dark);

        MI_Theme_Cosmos.setText("MI_Theme_Cosmos");
        MI_Theme_Cosmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Theme_CosmosMouseEntered(evt);
            }
        });
        MI_Theme_Cosmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Theme_CosmosActionPerformed(evt);
            }
        });
        M_Theme.add(MI_Theme_Cosmos);

        MI_Theme_Chaos.setText("MI_Theme_Chaos");
        MI_Theme_Chaos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Theme_ChaosMouseEntered(evt);
            }
        });
        MI_Theme_Chaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Theme_ChaosActionPerformed(evt);
            }
        });
        M_Theme.add(MI_Theme_Chaos);

        MI_Theme_Custom.setText("MI_Theme_Custom");
        MI_Theme_Custom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_Theme_CustomMouseEntered(evt);
            }
        });
        MI_Theme_Custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_Theme_CustomActionPerformed(evt);
            }
        });
        M_Theme.add(MI_Theme_Custom);

        M_Functions.add(M_Theme);
        M_Functions.add(S_Separator_2);

        MI_Help.setText("MI_Help");
        MI_Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MI_HelpMouseEntered(evt);
            }
        });
        MI_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_HelpActionPerformed(evt);
            }
        });
        M_Functions.add(MI_Help);

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
        M_Functions.add(MI_About);
        M_Functions.add(S_Separator_3);

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
        M_Functions.add(MI_Exit);

        MB_MenuBar.add(M_Functions);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void CB_FF1_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO1ActionPerformed
		TF_FF1_ISO1.setEnabled(CB_FF1_ISO1.isSelected());
		checkBoxTipAL.get(0).setOpacity(CB_FF1_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO1ActionPerformed

	private void CB_FF1_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO2ActionPerformed
		TF_FF1_ISO2.setEnabled(CB_FF1_ISO2.isSelected());
		checkBoxTipAL.get(1).setOpacity(CB_FF1_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO2ActionPerformed

	private void CB_FF1_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO3ActionPerformed
		TF_FF1_ISO3.setEnabled(CB_FF1_ISO3.isSelected());
		checkBoxTipAL.get(2).setOpacity(CB_FF1_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO3ActionPerformed

	private void CB_FF1_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO4ActionPerformed
		TF_FF1_ISO4.setEnabled(CB_FF1_ISO4.isSelected());
		checkBoxTipAL.get(3).setOpacity(CB_FF1_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO4ActionPerformed

	private void CB_FF1_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_ISO5ActionPerformed
		TF_FF1_ISO5.setEnabled(CB_FF1_ISO5.isSelected());
		checkBoxTipAL.get(4).setOpacity(CB_FF1_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_ISO5ActionPerformed

	private void CB_FF1_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC1ActionPerformed
		TF_FF1_DLC1.setEnabled(CB_FF1_DLC1.isSelected());
		checkBoxTipAL.get(5).setOpacity(CB_FF1_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC1ActionPerformed

	private void CB_FF1_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC2ActionPerformed
		TF_FF1_DLC2.setEnabled(CB_FF1_DLC2.isSelected());
		checkBoxTipAL.get(6).setOpacity(CB_FF1_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC2ActionPerformed

	private void CB_FF1_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC3ActionPerformed
		TF_FF1_DLC3.setEnabled(CB_FF1_DLC3.isSelected());
		checkBoxTipAL.get(7).setOpacity(CB_FF1_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC3ActionPerformed

	private void CB_FF1_DLC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC4ActionPerformed
		TF_FF1_DLC4.setEnabled(CB_FF1_DLC4.isSelected());
		checkBoxTipAL.get(8).setOpacity(CB_FF1_DLC4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_DLC4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC4ActionPerformed

	private void CB_FF1_DLC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF1_DLC5ActionPerformed
		TF_FF1_DLC5.setEnabled(CB_FF1_DLC5.isSelected());
		checkBoxTipAL.get(9).setOpacity(CB_FF1_DLC5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF1_DLC5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF1_DLC5ActionPerformed

	private void TF_FF1_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO1KeyReleased
		if(TF_FF1_ISO1.getText().length() > SongTitleDB.FF1_ISO_BATTLE.length()) {
			TF_FF1_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO1KeyReleased

	private void TF_FF1_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO2KeyReleased
		if(TF_FF1_ISO2.getText().length() > SongTitleDB.FF1_ISO_DUNGEON.length()) {
			TF_FF1_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO2KeyReleased

	private void TF_FF1_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO3KeyReleased
		if(TF_FF1_ISO3.getText().length() > SongTitleDB.FF1_ISO_CHAOSSHRINE.length()) {
			TF_FF1_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO3KeyReleased

	private void TF_FF1_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO4KeyReleased
		if(TF_FF1_ISO4.getText().length() > SongTitleDB.FF1_ISO_TOWN.length()) {
			TF_FF1_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO4KeyReleased

	private void TF_FF1_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_ISO5KeyReleased
		if(TF_FF1_ISO5.getText().length() > SongTitleDB.FF1_ISO_MTGULG.length()) {
			TF_FF1_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_ISO5KeyReleased

	private void TF_FF1_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC1KeyReleased
		if(TF_FF1_DLC1.getText().length() > 56) {
			TF_FF1_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC1KeyReleased

	private void TF_FF1_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC2KeyReleased
		if(TF_FF1_DLC2.getText().length() > 56) {
			TF_FF1_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC2KeyReleased

	private void TF_FF1_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC3KeyReleased
		if(TF_FF1_DLC3.getText().length() > 56) {
			TF_FF1_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC3KeyReleased

	private void TF_FF1_DLC4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC4KeyReleased
		if(TF_FF1_DLC4.getText().length() > 56) {
			TF_FF1_DLC4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_DLC4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_DLC4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC4KeyReleased

	private void TF_FF1_DLC5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF1_DLC5KeyReleased
		if(TF_FF1_DLC5.getText().length() > 56) {
			TF_FF1_DLC5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF1_DLC5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF1_DLC5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF1_DLC5KeyReleased

	private void CB_FF2_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO1ActionPerformed
		TF_FF2_ISO1.setEnabled(CB_FF2_ISO1.isSelected());
		checkBoxTipAL.get(10).setOpacity(CB_FF2_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO1ActionPerformed

	private void CB_FF2_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO2ActionPerformed
		TF_FF2_ISO2.setEnabled(CB_FF2_ISO2.isSelected());
		checkBoxTipAL.get(11).setOpacity(CB_FF2_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO2ActionPerformed

	private void CB_FF2_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO3ActionPerformed
		TF_FF2_ISO3.setEnabled(CB_FF2_ISO3.isSelected());
		checkBoxTipAL.get(12).setOpacity(CB_FF2_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO3ActionPerformed

	private void CB_FF2_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO4ActionPerformed
		TF_FF2_ISO4.setEnabled(CB_FF2_ISO4.isSelected());
		checkBoxTipAL.get(13).setOpacity(CB_FF2_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO4ActionPerformed

	private void CB_FF2_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_ISO5ActionPerformed
		TF_FF2_ISO5.setEnabled(CB_FF2_ISO5.isSelected());
		checkBoxTipAL.get(14).setOpacity(CB_FF2_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_ISO5ActionPerformed

	private void CB_FF2_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_DLC1ActionPerformed
		TF_FF2_DLC1.setEnabled(CB_FF2_DLC1.isSelected());
		checkBoxTipAL.get(15).setOpacity(CB_FF2_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_DLC1ActionPerformed

	private void CB_FF2_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_DLC2ActionPerformed
		TF_FF2_DLC2.setEnabled(CB_FF2_DLC2.isSelected());
		checkBoxTipAL.get(16).setOpacity(CB_FF2_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_DLC2ActionPerformed

	private void CB_FF2_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF2_DLC3ActionPerformed
		TF_FF2_DLC3.setEnabled(CB_FF2_DLC3.isSelected());
		checkBoxTipAL.get(17).setOpacity(CB_FF2_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF2_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF2_DLC3ActionPerformed

	private void TF_FF2_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO1KeyReleased
		if(TF_FF2_ISO1.getText().length() > SongTitleDB.FF2_ISO_BATTLETHEME1.length()) {
			TF_FF2_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO1KeyReleased

	private void TF_FF2_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO2KeyReleased
		if(TF_FF2_ISO2.getText().length() > SongTitleDB.FF2_ISO_BATTLETHEME2.length()) {
			TF_FF2_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO2KeyReleased

	private void TF_FF2_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO3KeyReleased
		if(TF_FF2_ISO3.getText().length() > SongTitleDB.FF2_ISO_CASTLEPANDEMONIUM.length()) {
			TF_FF2_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO3KeyReleased

	private void TF_FF2_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO4KeyReleased
		if(TF_FF2_ISO4.getText().length() > SongTitleDB.FF2_ISO_THEREBELARMY.length()) {
			TF_FF2_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO4KeyReleased

	private void TF_FF2_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_ISO5KeyReleased
		if(TF_FF2_ISO5.getText().length() > SongTitleDB.FF2_ISO_THEIMPERIALARMY.length()) {
			TF_FF2_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_ISO5KeyReleased

	private void TF_FF2_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_DLC1KeyReleased
		if(TF_FF2_DLC1.getText().length() > 56) {
			TF_FF2_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_DLC1KeyReleased

	private void TF_FF2_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_DLC2KeyReleased
		if(TF_FF2_DLC2.getText().length() > 56) {
			TF_FF2_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_DLC2KeyReleased

	private void TF_FF2_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF2_DLC3KeyReleased
		if(TF_FF2_DLC3.getText().length() > 56) {
			TF_FF2_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF2_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF2_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF2_DLC3KeyReleased

	private void CB_FF3_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO1ActionPerformed
		TF_FF3_ISO1.setEnabled(CB_FF3_ISO1.isSelected());
		checkBoxTipAL.get(18).setOpacity(CB_FF3_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO1ActionPerformed

	private void CB_FF3_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO2ActionPerformed
		TF_FF3_ISO2.setEnabled(CB_FF3_ISO2.isSelected());
		checkBoxTipAL.get(19).setOpacity(CB_FF3_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO2ActionPerformed

	private void CB_FF3_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO3ActionPerformed
		TF_FF3_ISO3.setEnabled(CB_FF3_ISO3.isSelected());
		checkBoxTipAL.get(20).setOpacity(CB_FF3_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO3ActionPerformed

	private void CB_FF3_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO4ActionPerformed
		TF_FF3_ISO4.setEnabled(CB_FF3_ISO4.isSelected());
		checkBoxTipAL.get(21).setOpacity(CB_FF3_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO4ActionPerformed

	private void CB_FF3_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_ISO5ActionPerformed
		TF_FF3_ISO5.setEnabled(CB_FF3_ISO5.isSelected());
		checkBoxTipAL.get(22).setOpacity(CB_FF3_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_ISO5ActionPerformed

	private void CB_FF3_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_DLC1ActionPerformed
		TF_FF3_DLC1.setEnabled(CB_FF3_DLC1.isSelected());
		checkBoxTipAL.get(23).setOpacity(CB_FF3_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_DLC1ActionPerformed

	private void CB_FF3_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_DLC2ActionPerformed
		TF_FF3_DLC2.setEnabled(CB_FF3_DLC2.isSelected());
		checkBoxTipAL.get(24).setOpacity(CB_FF3_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_DLC2ActionPerformed

	private void CB_FF3_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF3_DLC3ActionPerformed
		TF_FF3_DLC3.setEnabled(CB_FF3_DLC3.isSelected());
		checkBoxTipAL.get(25).setOpacity(CB_FF3_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF3_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF3_DLC3ActionPerformed

	private void TF_FF3_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO1KeyReleased
		if(TF_FF3_ISO1.getText().length() > SongTitleDB.FF3_ISO_BATTLE1.length()) {
			TF_FF3_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO1KeyReleased

	private void TF_FF3_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO2KeyReleased
		if(TF_FF3_ISO2.getText().length() > SongTitleDB.FF3_ISO_BATTLE2.length()) {
			TF_FF3_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO2KeyReleased

	private void TF_FF3_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO3KeyReleased
		if(TF_FF3_ISO3.getText().length() > SongTitleDB.FF3_ISO_THISISTHELASTBATTLE.length()) {
			TF_FF3_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO3KeyReleased

	private void TF_FF3_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO4KeyReleased
		if(TF_FF3_ISO4.getText().length() > SongTitleDB.FF3_ISO_THECRYSTALTOWER.length()) {
			TF_FF3_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO4KeyReleased

	private void TF_FF3_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_ISO5KeyReleased
		if(TF_FF3_ISO5.getText().length() > SongTitleDB.FF3_ISO_LETMEKNOWTHETHRUTH.length()) {
			TF_FF3_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_ISO5KeyReleased

	private void TF_FF3_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_DLC1KeyReleased
		if(TF_FF3_DLC1.getText().length() > 56) {
			TF_FF3_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_DLC1KeyReleased

	private void TF_FF3_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_DLC2KeyReleased
		if(TF_FF3_DLC2.getText().length() > 56) {
			TF_FF3_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_DLC2KeyReleased

	private void TF_FF3_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF3_DLC3KeyReleased
		if(TF_FF3_DLC3.getText().length() > 56) {
			TF_FF3_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF3_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF3_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF3_DLC3KeyReleased

	private void CB_FF4_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO1ActionPerformed
		TF_FF4_ISO1.setEnabled(CB_FF4_ISO1.isSelected());
		checkBoxTipAL.get(26).setOpacity(CB_FF4_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO1ActionPerformed

	private void CB_FF4_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO2ActionPerformed
		TF_FF4_ISO2.setEnabled(CB_FF4_ISO2.isSelected());
		checkBoxTipAL.get(27).setOpacity(CB_FF4_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO2ActionPerformed

	private void CB_FF4_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO3ActionPerformed
		TF_FF4_ISO3.setEnabled(CB_FF4_ISO3.isSelected());
		checkBoxTipAL.get(28).setOpacity(CB_FF4_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO3ActionPerformed

	private void CB_FF4_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO4ActionPerformed
		TF_FF4_ISO4.setEnabled(CB_FF4_ISO4.isSelected());
		checkBoxTipAL.get(29).setOpacity(CB_FF4_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO4ActionPerformed

	private void CB_FF4_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_ISO5ActionPerformed
		TF_FF4_ISO5.setEnabled(CB_FF4_ISO5.isSelected());
		checkBoxTipAL.get(30).setOpacity(CB_FF4_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_ISO5ActionPerformed

	private void CB_FF4_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_DLC1ActionPerformed
		TF_FF4_DLC1.setEnabled(CB_FF4_DLC1.isSelected());
		checkBoxTipAL.get(31).setOpacity(CB_FF4_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_DLC1ActionPerformed

	private void CB_FF4_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_DLC2ActionPerformed
		TF_FF4_DLC2.setEnabled(CB_FF4_DLC2.isSelected());
		checkBoxTipAL.get(32).setOpacity(CB_FF4_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_DLC2ActionPerformed

	private void CB_FF4_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF4_DLC3ActionPerformed
		TF_FF4_DLC3.setEnabled(CB_FF4_DLC3.isSelected());
		checkBoxTipAL.get(33).setOpacity(CB_FF4_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF4_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF4_DLC3ActionPerformed

	private void TF_FF4_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO1KeyReleased
		if(TF_FF4_ISO1.getText().length() > SongTitleDB.FF4_ISO_BATTLE1.length()) {
			TF_FF4_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO1KeyReleased

	private void TF_FF4_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO2KeyReleased
		if(TF_FF4_ISO2.getText().length() > SongTitleDB.FF4_ISO_BATTLE2.length()) {
			TF_FF4_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO2KeyReleased

	private void TF_FF4_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO3KeyReleased
		if(TF_FF4_ISO3.getText().length() > SongTitleDB.FF4_ISO_BATTLEWITHTHEFOURFIENDS.length()) {
			TF_FF4_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO3KeyReleased

	private void TF_FF4_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO4KeyReleased
		if(TF_FF4_ISO4.getText().length() > SongTitleDB.FF4_ISO_THEREDWINGS.length()) {
			TF_FF4_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO4KeyReleased

	private void TF_FF4_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_ISO5KeyReleased
		if(TF_FF4_ISO5.getText().length() > SongTitleDB.FF4_ISO_THEMEOFLOVE.length()) {
			TF_FF4_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_ISO5KeyReleased

	private void TF_FF4_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_DLC1KeyReleased
		if(TF_FF4_DLC1.getText().length() > 56) {
			TF_FF4_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_DLC1KeyReleased

	private void TF_FF4_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_DLC2KeyReleased
		if(TF_FF4_DLC2.getText().length() > 56) {
			TF_FF4_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_DLC2KeyReleased

	private void TF_FF4_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF4_DLC3KeyReleased
		if(TF_FF4_DLC3.getText().length() > 56) {
			TF_FF4_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF4_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF4_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF4_DLC3KeyReleased

	private void CB_FF5_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO1ActionPerformed
		TF_FF5_ISO1.setEnabled(CB_FF5_ISO1.isSelected());
		checkBoxTipAL.get(34).setOpacity(CB_FF5_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO1ActionPerformed

	private void CB_FF5_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO2ActionPerformed
		TF_FF5_ISO2.setEnabled(CB_FF5_ISO2.isSelected());
		checkBoxTipAL.get(35).setOpacity(CB_FF5_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO2ActionPerformed

	private void CB_FF5_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO3ActionPerformed
		TF_FF5_ISO3.setEnabled(CB_FF5_ISO3.isSelected());
		checkBoxTipAL.get(36).setOpacity(CB_FF5_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO3ActionPerformed

	private void CB_FF5_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO4ActionPerformed
		TF_FF5_ISO4.setEnabled(CB_FF5_ISO4.isSelected());
		checkBoxTipAL.get(37).setOpacity(CB_FF5_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO4ActionPerformed

	private void CB_FF5_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_ISO5ActionPerformed
		TF_FF5_ISO5.setEnabled(CB_FF5_ISO5.isSelected());
		checkBoxTipAL.get(38).setOpacity(CB_FF5_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_ISO5ActionPerformed

	private void CB_FF5_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_DLC1ActionPerformed
		TF_FF5_DLC1.setEnabled(CB_FF5_DLC1.isSelected());
		checkBoxTipAL.get(39).setOpacity(CB_FF5_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_DLC1ActionPerformed

	private void CB_FF5_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_DLC2ActionPerformed
		TF_FF5_DLC2.setEnabled(CB_FF5_DLC2.isSelected());
		checkBoxTipAL.get(40).setOpacity(CB_FF5_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_DLC2ActionPerformed

	private void CB_FF5_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF5_DLC3ActionPerformed
		TF_FF5_DLC3.setEnabled(CB_FF5_DLC3.isSelected());
		checkBoxTipAL.get(41).setOpacity(CB_FF5_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF5_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF5_DLC3ActionPerformed

	private void TF_FF5_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO1KeyReleased
		if(TF_FF5_ISO1.getText().length() > SongTitleDB.FF5_ISO_BATTLE1.length()) {
			TF_FF5_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO1KeyReleased

	private void TF_FF5_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO2KeyReleased
		if(TF_FF5_ISO2.getText().length() > SongTitleDB.FF5_ISO_BATTLEATTHEBIGBRIDGE.length()) {
			TF_FF5_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO2KeyReleased

	private void TF_FF5_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO3KeyReleased
		if(TF_FF5_ISO3.getText().length() > SongTitleDB.FF5_ISO_THEFINALBATTLE.length()) {
			TF_FF5_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO3KeyReleased

	private void TF_FF5_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO4KeyReleased
		if(TF_FF5_ISO4.getText().length() > SongTitleDB.FF5_ISO_THEDECISIVEBATTLE.length()) {
			TF_FF5_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO4KeyReleased

	private void TF_FF5_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_ISO5KeyReleased
		if(TF_FF5_ISO5.getText().length() > SongTitleDB.FF5_ISO_HOMESWEETHOME.length()) {
			TF_FF5_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_ISO5KeyReleased

	private void TF_FF5_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_DLC1KeyReleased
		if(TF_FF5_DLC1.getText().length() > 56) {
			TF_FF5_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_DLC1KeyReleased

	private void TF_FF5_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_DLC2KeyReleased
		if(TF_FF5_DLC2.getText().length() > 56) {
			TF_FF5_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_DLC2KeyReleased

	private void TF_FF5_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF5_DLC3KeyReleased
		if(TF_FF5_DLC3.getText().length() > 56) {
			TF_FF5_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF5_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF5_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF5_DLC3KeyReleased

	private void CB_FF6_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO1ActionPerformed
		TF_FF6_ISO1.setEnabled(CB_FF6_ISO1.isSelected());
		checkBoxTipAL.get(42).setOpacity(CB_FF6_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO1ActionPerformed

	private void CB_FF6_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO2ActionPerformed
		TF_FF6_ISO2.setEnabled(CB_FF6_ISO2.isSelected());
		checkBoxTipAL.get(43).setOpacity(CB_FF6_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO2ActionPerformed

	private void CB_FF6_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO3ActionPerformed
		TF_FF6_ISO3.setEnabled(CB_FF6_ISO3.isSelected());
		checkBoxTipAL.get(44).setOpacity(CB_FF6_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO3ActionPerformed

	private void CB_FF6_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO4ActionPerformed
		TF_FF6_ISO4.setEnabled(CB_FF6_ISO4.isSelected());
		checkBoxTipAL.get(45).setOpacity(CB_FF6_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO4ActionPerformed

	private void CB_FF6_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_ISO5ActionPerformed
		TF_FF6_ISO5.setEnabled(CB_FF6_ISO5.isSelected());
		checkBoxTipAL.get(46).setOpacity(CB_FF6_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_ISO5ActionPerformed

	private void CB_FF6_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_DLC1ActionPerformed
		TF_FF6_DLC1.setEnabled(CB_FF6_DLC1.isSelected());
		checkBoxTipAL.get(47).setOpacity(CB_FF6_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_DLC1ActionPerformed

	private void CB_FF6_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_DLC2ActionPerformed
		TF_FF6_DLC2.setEnabled(CB_FF6_DLC2.isSelected());
		checkBoxTipAL.get(48).setOpacity(CB_FF6_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_DLC2ActionPerformed

	private void CB_FF6_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF6_DLC3ActionPerformed
		TF_FF6_DLC3.setEnabled(CB_FF6_DLC3.isSelected());
		checkBoxTipAL.get(49).setOpacity(CB_FF6_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF6_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF6_DLC3ActionPerformed

	private void TF_FF6_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO1KeyReleased
		if(TF_FF6_ISO1.getText().length() > SongTitleDB.FF6_ISO_BATTLE.length()) {
			TF_FF6_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO1KeyReleased

	private void TF_FF6_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO2KeyReleased
		if(TF_FF6_ISO2.getText().length() > SongTitleDB.FF6_ISO_THEDECISIVEBATTLE.length()) {
			TF_FF6_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO2KeyReleased

	private void TF_FF6_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO3KeyReleased
		if(TF_FF6_ISO3.getText().length() > SongTitleDB.FF6_ISO_BATTLETOTHEDEATH.length()) {
			TF_FF6_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO3KeyReleased

	private void TF_FF6_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO4KeyReleased
		if(TF_FF6_ISO4.getText().length() > SongTitleDB.FF6_ISO_DANCINGMAD.length()) {
			TF_FF6_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO4KeyReleased

	private void TF_FF6_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_ISO5KeyReleased
		if(TF_FF6_ISO5.getText().length() > SongTitleDB.FF6_ISO_SEARCHINGFORFRIENDS.length()) {
			TF_FF6_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_ISO5KeyReleased

	private void TF_FF6_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_DLC1KeyReleased
		if(TF_FF6_DLC1.getText().length() > 56) {
			TF_FF6_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_DLC1KeyReleased

	private void TF_FF6_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_DLC2KeyReleased
		if(TF_FF6_DLC2.getText().length() > 56) {
			TF_FF6_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_DLC2KeyReleased

	private void TF_FF6_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF6_DLC3KeyReleased
		if(TF_FF6_DLC3.getText().length() > 56) {
			TF_FF6_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF6_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF6_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF6_DLC3KeyReleased

	private void CB_FF7_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO1ActionPerformed
		TF_FF7_ISO1.setEnabled(CB_FF7_ISO1.isSelected());
		checkBoxTipAL.get(50).setOpacity(CB_FF7_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO1ActionPerformed

	private void CB_FF7_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO2ActionPerformed
		TF_FF7_ISO2.setEnabled(CB_FF7_ISO2.isSelected());
		checkBoxTipAL.get(51).setOpacity(CB_FF7_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO2ActionPerformed

	private void CB_FF7_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO3ActionPerformed
		TF_FF7_ISO3.setEnabled(CB_FF7_ISO3.isSelected());
		checkBoxTipAL.get(52).setOpacity(CB_FF7_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO3ActionPerformed

	private void CB_FF7_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO4ActionPerformed
		TF_FF7_ISO4.setEnabled(CB_FF7_ISO4.isSelected());
		checkBoxTipAL.get(53).setOpacity(CB_FF7_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO4ActionPerformed

	private void CB_FF7_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_ISO5ActionPerformed
		TF_FF7_ISO5.setEnabled(CB_FF7_ISO5.isSelected());
		checkBoxTipAL.get(54).setOpacity(CB_FF7_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_ISO5ActionPerformed

	private void CB_FF7_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_DLC1ActionPerformed
		TF_FF7_DLC1.setEnabled(CB_FF7_DLC1.isSelected());
		checkBoxTipAL.get(55).setOpacity(CB_FF7_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_DLC1ActionPerformed

	private void CB_FF7_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_DLC2ActionPerformed
		TF_FF7_DLC2.setEnabled(CB_FF7_DLC2.isSelected());
		checkBoxTipAL.get(56).setOpacity(CB_FF7_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_DLC2ActionPerformed

	private void CB_FF7_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF7_DLC3ActionPerformed
		TF_FF7_DLC3.setEnabled(CB_FF7_DLC3.isSelected());
		checkBoxTipAL.get(57).setOpacity(CB_FF7_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF7_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF7_DLC3ActionPerformed

	private void TF_FF7_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO1KeyReleased
		if(TF_FF7_ISO1.getText().length() > SongTitleDB.FF7_ISO_FIGHTON.length()) {
			TF_FF7_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO1KeyReleased

	private void TF_FF7_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO2KeyReleased
		if(TF_FF7_ISO2.getText().length() > SongTitleDB.FF7_ISO_JENOVA.length()) {
			TF_FF7_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO2KeyReleased

	private void TF_FF7_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO3KeyReleased
		if(TF_FF7_ISO3.getText().length() > SongTitleDB.FF7_ISO_ONEWINGEDANGEL.length()) {
			TF_FF7_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO3KeyReleased

	private void TF_FF7_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO4KeyReleased
		if(TF_FF7_ISO4.getText().length() > SongTitleDB.FF7_ISO_OPENINGBOMBINGMISSION.length()) {
			TF_FF7_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO4KeyReleased

	private void TF_FF7_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_ISO5KeyReleased
		if(TF_FF7_ISO5.getText().length() > SongTitleDB.FF7_ISO_LETTHEBATTLESBEGIN.length()) {
			TF_FF7_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_ISO5KeyReleased

	private void TF_FF7_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_DLC1KeyReleased
		if(TF_FF7_DLC1.getText().length() > 56) {
			TF_FF7_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_DLC1KeyReleased

	private void TF_FF7_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_DLC2KeyReleased
		if(TF_FF7_DLC2.getText().length() > 56) {
			TF_FF7_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_DLC2KeyReleased

	private void TF_FF7_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF7_DLC3KeyReleased
		if(TF_FF7_DLC3.getText().length() > 56) {
			TF_FF7_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF7_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF7_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF7_DLC3KeyReleased

	private void CB_FF8_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO1ActionPerformed
		TF_FF8_ISO1.setEnabled(CB_FF8_ISO1.isSelected());
		checkBoxTipAL.get(58).setOpacity(CB_FF8_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO1ActionPerformed

	private void CB_FF8_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO2ActionPerformed
		TF_FF8_ISO2.setEnabled(CB_FF8_ISO2.isSelected());
		checkBoxTipAL.get(59).setOpacity(CB_FF8_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO2ActionPerformed

	private void CB_FF8_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO3ActionPerformed
		TF_FF8_ISO3.setEnabled(CB_FF8_ISO3.isSelected());
		checkBoxTipAL.get(60).setOpacity(CB_FF8_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO3ActionPerformed

	private void CB_FF8_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO4ActionPerformed
		TF_FF8_ISO4.setEnabled(CB_FF8_ISO4.isSelected());
		checkBoxTipAL.get(61).setOpacity(CB_FF8_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO4ActionPerformed

	private void CB_FF8_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_ISO5ActionPerformed
		TF_FF8_ISO5.setEnabled(CB_FF8_ISO5.isSelected());
		checkBoxTipAL.get(62).setOpacity(CB_FF8_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_ISO5ActionPerformed

	private void CB_FF8_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_DLC1ActionPerformed
		TF_FF8_DLC1.setEnabled(CB_FF8_DLC1.isSelected());
		checkBoxTipAL.get(63).setOpacity(CB_FF8_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_DLC1ActionPerformed

	private void CB_FF8_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_DLC2ActionPerformed
		TF_FF8_DLC2.setEnabled(CB_FF8_DLC2.isSelected());
		checkBoxTipAL.get(64).setOpacity(CB_FF8_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_DLC2ActionPerformed

	private void CB_FF8_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF8_DLC3ActionPerformed
		TF_FF8_DLC3.setEnabled(CB_FF8_DLC3.isSelected());
		checkBoxTipAL.get(65).setOpacity(CB_FF8_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF8_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF8_DLC3ActionPerformed

	private void TF_FF8_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO1KeyReleased
		if(TF_FF8_ISO1.getText().length() > SongTitleDB.FF8_ISO_DONTBEAFRAID.length()) {
			TF_FF8_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO1KeyReleased

	private void TF_FF8_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO2KeyReleased
		if(TF_FF8_ISO2.getText().length() > SongTitleDB.FF8_ISO_FORCEYOURWAY.length()) {
			TF_FF8_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO2KeyReleased

	private void TF_FF8_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO3KeyReleased
		if(TF_FF8_ISO3.getText().length() > SongTitleDB.FF8_ISO_THEEXTREME.length()) {
			TF_FF8_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO3KeyReleased

	private void TF_FF8_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO4KeyReleased
		if(TF_FF8_ISO4.getText().length() > SongTitleDB.FF8_ISO_THEMANWITHTHEMACHINEGUN.length()) {
			TF_FF8_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO4KeyReleased

	private void TF_FF8_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_ISO5KeyReleased
		if(TF_FF8_ISO5.getText().length() > SongTitleDB.FF8_ISO_PREMONITION.length()) {
			TF_FF8_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_ISO5KeyReleased

	private void TF_FF8_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_DLC1KeyReleased
		if(TF_FF8_DLC1.getText().length() > 56) {
			TF_FF8_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_DLC1KeyReleased

	private void TF_FF8_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_DLC2KeyReleased
		if(TF_FF8_DLC2.getText().length() > 56) {
			TF_FF8_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_DLC2KeyReleased

	private void TF_FF8_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF8_DLC3KeyReleased
		if(TF_FF8_DLC3.getText().length() > 56) {
			TF_FF8_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF8_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF8_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF8_DLC3KeyReleased

	private void CB_FF9_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO1ActionPerformed
		TF_FF9_ISO1.setEnabled(CB_FF9_ISO1.isSelected());
		checkBoxTipAL.get(66).setOpacity(CB_FF9_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO1ActionPerformed

	private void CB_FF9_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO2ActionPerformed
		TF_FF9_ISO2.setEnabled(CB_FF9_ISO2.isSelected());
		checkBoxTipAL.get(67).setOpacity(CB_FF9_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO2ActionPerformed

	private void CB_FF9_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO3ActionPerformed
		TF_FF9_ISO3.setEnabled(CB_FF9_ISO3.isSelected());
		checkBoxTipAL.get(68).setOpacity(CB_FF9_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO3ActionPerformed

	private void CB_FF9_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO4ActionPerformed
		TF_FF9_ISO4.setEnabled(CB_FF9_ISO4.isSelected());
		checkBoxTipAL.get(69).setOpacity(CB_FF9_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO4ActionPerformed

	private void CB_FF9_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_ISO5ActionPerformed
		TF_FF9_ISO5.setEnabled(CB_FF9_ISO5.isSelected());
		checkBoxTipAL.get(70).setOpacity(CB_FF9_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_ISO5ActionPerformed

	private void CB_FF9_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_DLC1ActionPerformed
		TF_FF9_DLC1.setEnabled(CB_FF9_DLC1.isSelected());
		checkBoxTipAL.get(71).setOpacity(CB_FF9_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_DLC1ActionPerformed

	private void CB_FF9_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_DLC2ActionPerformed
		TF_FF9_DLC2.setEnabled(CB_FF9_DLC2.isSelected());
		checkBoxTipAL.get(72).setOpacity(CB_FF9_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_DLC2ActionPerformed

	private void CB_FF9_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF9_DLC3ActionPerformed
		TF_FF9_DLC3.setEnabled(CB_FF9_DLC3.isSelected());
		checkBoxTipAL.get(73).setOpacity(CB_FF9_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF9_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF9_DLC3ActionPerformed

	private void TF_FF9_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO1KeyReleased
		if(TF_FF9_ISO1.getText().length() > SongTitleDB.FF9_ISO_BATTLE1.length()) {
			TF_FF9_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO1KeyReleased

	private void TF_FF9_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO2KeyReleased
		if(TF_FF9_ISO2.getText().length() > SongTitleDB.FF9_ISO_BATTLE2.length()) {
			TF_FF9_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO2KeyReleased

	private void TF_FF9_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO3KeyReleased
		if(TF_FF9_ISO3.getText().length() > SongTitleDB.FF9_ISO_THEFINALBATTLE.length()) {
			TF_FF9_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO3KeyReleased

	private void TF_FF9_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO4KeyReleased
		if(TF_FF9_ISO4.getText().length() > SongTitleDB.FF9_ISO_THEDARKNESSOFETERNITY.length()) {
			TF_FF9_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO4KeyReleased

	private void TF_FF9_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_ISO5KeyReleased
		if(TF_FF9_ISO5.getText().length() > SongTitleDB.FF9_ISO_NOTALONE.length()) {
			TF_FF9_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_ISO5KeyReleased

	private void TF_FF9_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_DLC1KeyReleased
		if(TF_FF9_DLC1.getText().length() > 56) {
			TF_FF9_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_DLC1KeyReleased

	private void TF_FF9_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_DLC2KeyReleased
		if(TF_FF9_DLC2.getText().length() > 56) {
			TF_FF9_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_DLC2KeyReleased

	private void TF_FF9_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF9_DLC3KeyReleased
		if(TF_FF9_DLC3.getText().length() > 56) {
			TF_FF9_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF9_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF9_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF9_DLC3KeyReleased

	private void CB_FF10_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO1ActionPerformed
		TF_FF10_ISO1.setEnabled(CB_FF10_ISO1.isSelected());
		checkBoxTipAL.get(74).setOpacity(CB_FF10_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO1ActionPerformed

	private void CB_FF10_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO2ActionPerformed
		TF_FF10_ISO2.setEnabled(CB_FF10_ISO2.isSelected());
		checkBoxTipAL.get(75).setOpacity(CB_FF10_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO2ActionPerformed

	private void CB_FF10_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO3ActionPerformed
		TF_FF10_ISO3.setEnabled(CB_FF10_ISO3.isSelected());
		checkBoxTipAL.get(76).setOpacity(CB_FF10_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);;
	}//GEN-LAST:event_CB_FF10_ISO3ActionPerformed

	private void CB_FF10_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO4ActionPerformed
		TF_FF10_ISO4.setEnabled(CB_FF10_ISO4.isSelected());
		checkBoxTipAL.get(77).setOpacity(CB_FF10_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO4ActionPerformed

	private void CB_FF10_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_ISO5ActionPerformed
		TF_FF10_ISO5.setEnabled(CB_FF10_ISO5.isSelected());
		checkBoxTipAL.get(78).setOpacity(CB_FF10_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_ISO5ActionPerformed

	private void CB_FF10_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_DLC1ActionPerformed
		TF_FF10_DLC1.setEnabled(CB_FF10_DLC1.isSelected());
		checkBoxTipAL.get(79).setOpacity(CB_FF10_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_DLC1ActionPerformed

	private void CB_FF10_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_DLC2ActionPerformed
		TF_FF10_DLC2.setEnabled(CB_FF10_DLC2.isSelected());
		checkBoxTipAL.get(80).setOpacity(CB_FF10_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_DLC2ActionPerformed

	private void CB_FF10_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF10_DLC3ActionPerformed
		TF_FF10_DLC3.setEnabled(CB_FF10_DLC3.isSelected());
		checkBoxTipAL.get(81).setOpacity(CB_FF10_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF10_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF10_DLC3ActionPerformed

	private void TF_FF10_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO1KeyReleased
		if(TF_FF10_ISO1.getText().length() > SongTitleDB.FF10_ISO_BATTLETHEME.length()) {
			TF_FF10_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO1KeyReleased

	private void TF_FF10_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO2KeyReleased
		if(TF_FF10_ISO2.getText().length() > SongTitleDB.FF10_ISO_OTHERWORLD.length()) {
			TF_FF10_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO2KeyReleased

	private void TF_FF10_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO3KeyReleased
		if(TF_FF10_ISO3.getText().length() > SongTitleDB.FF10_ISO_SUMMONEDMONSTERBATTLE.length()) {
			TF_FF10_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO3KeyReleased

	private void TF_FF10_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO4KeyReleased
		if(TF_FF10_ISO4.getText().length() > SongTitleDB.FF10_ISO_FIGHTWITHSEYMOUR.length()) {
			TF_FF10_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO4KeyReleased

	private void TF_FF10_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_ISO5KeyReleased
		if(TF_FF10_ISO5.getText().length() > SongTitleDB.FF10_ISO_AFLEETINGDREAM.length()) {
			TF_FF10_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_ISO5KeyReleased

	private void TF_FF10_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_DLC1KeyReleased
		if(TF_FF10_DLC1.getText().length() > 56) {
			TF_FF10_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_DLC1KeyReleased

	private void TF_FF10_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_DLC2KeyReleased
		if(TF_FF10_DLC2.getText().length() > 56) {
			TF_FF10_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_DLC2KeyReleased

	private void TF_FF10_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF10_DLC3KeyReleased
		if(TF_FF10_DLC3.getText().length() > 56) {
			TF_FF10_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF10_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF10_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF10_DLC3KeyReleased

	private void CB_FF11_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO1ActionPerformed
		TF_FF11_ISO1.setEnabled(CB_FF11_ISO1.isSelected());
		checkBoxTipAL.get(82).setOpacity(CB_FF11_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO1ActionPerformed

	private void CB_FF11_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO2ActionPerformed
		TF_FF11_ISO2.setEnabled(CB_FF11_ISO2.isSelected());
		checkBoxTipAL.get(83).setOpacity(CB_FF11_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO2ActionPerformed

	private void CB_FF11_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO3ActionPerformed
		TF_FF11_ISO3.setEnabled(CB_FF11_ISO3.isSelected());
		checkBoxTipAL.get(84).setOpacity(CB_FF11_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO3ActionPerformed

	private void CB_FF11_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_ISO4ActionPerformed
		TF_FF11_ISO4.setEnabled(CB_FF11_ISO4.isSelected());
		checkBoxTipAL.get(85).setOpacity(CB_FF11_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_ISO4ActionPerformed

	private void CB_FF11_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_DLC1ActionPerformed
		TF_FF11_DLC1.setEnabled(CB_FF11_DLC1.isSelected());
		checkBoxTipAL.get(86).setOpacity(CB_FF11_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_DLC1ActionPerformed

	private void CB_FF11_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_DLC2ActionPerformed
		TF_FF11_DLC2.setEnabled(CB_FF11_DLC2.isSelected());
		checkBoxTipAL.get(87).setOpacity(CB_FF11_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_DLC2ActionPerformed

	private void CB_FF11_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF11_DLC3ActionPerformed
		TF_FF11_DLC3.setEnabled(CB_FF11_DLC3.isSelected());
		checkBoxTipAL.get(88).setOpacity(CB_FF11_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF11_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF11_DLC3ActionPerformed

	private void TF_FF11_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO1KeyReleased
		if(TF_FF11_ISO1.getText().length() > SongTitleDB.FF11_ISO_BATTLEINTHEDUNGEON2.length()) {
			TF_FF11_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO1KeyReleased

	private void TF_FF11_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO2KeyReleased
		if(TF_FF11_ISO2.getText().length() > SongTitleDB.FF11_ISO_AREALMOFEMPTINESS.length()) {
			TF_FF11_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO2KeyReleased

	private void TF_FF11_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO3KeyReleased
		if(TF_FF11_ISO3.getText().length() > SongTitleDB.FF11_ISO_AWAKENING.length()) {
			TF_FF11_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO3KeyReleased

	private void TF_FF11_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_ISO4KeyReleased
		if(TF_FF11_ISO4.getText().length() > SongTitleDB.FF11_ISO_IRONCOLOSSUS.length()) {
			TF_FF11_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_ISO4KeyReleased

	private void TF_FF11_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_DLC1KeyReleased
		if(TF_FF11_DLC1.getText().length() > 56) {
			TF_FF11_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_DLC1KeyReleased

	private void TF_FF11_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_DLC2KeyReleased
		if(TF_FF11_DLC2.getText().length() > 56) {
			TF_FF11_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_DLC2KeyReleased

	private void TF_FF11_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF11_DLC3KeyReleased
		if(TF_FF11_DLC3.getText().length() > 56) {
			TF_FF11_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF11_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF11_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF11_DLC3KeyReleased

	private void CB_FF12_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO1ActionPerformed
		TF_FF12_ISO1.setEnabled(CB_FF12_ISO1.isSelected());
		checkBoxTipAL.get(89).setOpacity(CB_FF12_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO1ActionPerformed

	private void CB_FF12_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO2ActionPerformed
		TF_FF12_ISO2.setEnabled(CB_FF12_ISO2.isSelected());
		checkBoxTipAL.get(90).setOpacity(CB_FF12_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO2ActionPerformed

	private void CB_FF12_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO3ActionPerformed
		TF_FF12_ISO3.setEnabled(CB_FF12_ISO3.isSelected());
		checkBoxTipAL.get(91).setOpacity(CB_FF12_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO3ActionPerformed

	private void CB_FF12_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_ISO4ActionPerformed
		TF_FF12_ISO4.setEnabled(CB_FF12_ISO4.isSelected());
		checkBoxTipAL.get(92).setOpacity(CB_FF12_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_ISO4ActionPerformed

	private void CB_FF12_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_DLC1ActionPerformed
		TF_FF12_DLC1.setEnabled(CB_FF12_DLC1.isSelected());
		checkBoxTipAL.get(93).setOpacity(CB_FF12_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_DLC1ActionPerformed

	private void CB_FF12_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_DLC2ActionPerformed
		TF_FF12_DLC2.setEnabled(CB_FF12_DLC2.isSelected());
		checkBoxTipAL.get(94).setOpacity(CB_FF12_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_DLC2ActionPerformed

	private void CB_FF12_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF12_DLC3ActionPerformed
		TF_FF12_DLC3.setEnabled(CB_FF12_DLC3.isSelected());
		checkBoxTipAL.get(95).setOpacity(CB_FF12_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF12_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF12_DLC3ActionPerformed

	private void TF_FF12_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO1KeyReleased
		if(TF_FF12_ISO1.getText().length() > SongTitleDB.FF12_ISO_BOSSBATTLE.length()) {
			TF_FF12_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO1KeyReleased

	private void TF_FF12_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO2KeyReleased
		if(TF_FF12_ISO2.getText().length() > SongTitleDB.FF12_ISO_ESPERBATTLE.length()) {
			TF_FF12_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO2KeyReleased

	private void TF_FF12_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO3KeyReleased
		if(TF_FF12_ISO3.getText().length() > SongTitleDB.FF12_ISO_FIGHTTOTHEDEATH.length()) {
			TF_FF12_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO3KeyReleased

	private void TF_FF12_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_ISO4KeyReleased
		if(TF_FF12_ISO4.getText().length() > SongTitleDB.FF12_ISO_THEBATTLEFORFREEDOM.length()) {
			TF_FF12_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_ISO4KeyReleased

	private void TF_FF12_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_DLC1KeyReleased
		if(TF_FF12_DLC1.getText().length() > 56) {
			TF_FF12_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_DLC1KeyReleased

	private void TF_FF12_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_DLC2KeyReleased
		if(TF_FF12_DLC2.getText().length() > 56) {
			TF_FF12_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_DLC2KeyReleased

	private void TF_FF12_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF12_DLC3KeyReleased
		if(TF_FF12_DLC3.getText().length() > 56) {
			TF_FF12_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF12_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF12_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF12_DLC3KeyReleased

	private void CB_FF13_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_ISO1ActionPerformed
		TF_FF13_ISO1.setEnabled(CB_FF13_ISO1.isSelected());
		checkBoxTipAL.get(96).setOpacity(CB_FF13_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_ISO1ActionPerformed

	private void CB_FF13_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_ISO2ActionPerformed
		TF_FF13_ISO2.setEnabled(CB_FF13_ISO2.isSelected());
		checkBoxTipAL.get(97).setOpacity(CB_FF13_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_ISO2ActionPerformed

	private void CB_FF13_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_ISO3ActionPerformed
		TF_FF13_ISO3.setEnabled(CB_FF13_ISO3.isSelected());
		checkBoxTipAL.get(98).setOpacity(CB_FF13_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_ISO3ActionPerformed

	private void CB_FF13_DLC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC1ActionPerformed
		TF_FF13_DLC1.setEnabled(CB_FF13_DLC1.isSelected());
		checkBoxTipAL.get(99).setOpacity(CB_FF13_DLC1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_DLC1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC1ActionPerformed

	private void CB_FF13_DLC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC2ActionPerformed
		TF_FF13_DLC2.setEnabled(CB_FF13_DLC2.isSelected());
		checkBoxTipAL.get(100).setOpacity(CB_FF13_DLC2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_DLC2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC2ActionPerformed

	private void CB_FF13_DLC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC3ActionPerformed
		TF_FF13_DLC3.setEnabled(CB_FF13_DLC3.isSelected());
		checkBoxTipAL.get(101).setOpacity(CB_FF13_DLC3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_DLC3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC3ActionPerformed

	private void CB_FF13_DLC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC4ActionPerformed
		TF_FF13_DLC4.setEnabled(CB_FF13_DLC4.isSelected());
		checkBoxTipAL.get(102).setOpacity(CB_FF13_DLC4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_DLC4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC4ActionPerformed

	private void CB_FF13_DLC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FF13_DLC5ActionPerformed
		TF_FF13_DLC5.setEnabled(CB_FF13_DLC5.isSelected());
		checkBoxTipAL.get(103).setOpacity(CB_FF13_DLC5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_FF13_DLC5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_FF13_DLC5ActionPerformed

	private void TF_FF13_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_ISO1KeyReleased
		if(TF_FF13_ISO1.getText().length() > SongTitleDB.FF13_ISO_BLINDEDBYLIGHT.length()) {
			TF_FF13_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_ISO1KeyReleased

	private void TF_FF13_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_ISO2KeyReleased
		if(TF_FF13_ISO2.getText().length() > SongTitleDB.FF13_ISO_SABERSEDGE.length()) {
			TF_FF13_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_ISO2KeyReleased

	private void TF_FF13_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_ISO3KeyReleased
		if(TF_FF13_ISO3.getText().length() > SongTitleDB.FF13_ISO_NASCENTREQUIEM.length()) {
			TF_FF13_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_ISO3KeyReleased

	private void TF_FF13_DLC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC1KeyReleased
		if(TF_FF13_DLC1.getText().length() > 56) {
			TF_FF13_DLC1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_DLC1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_DLC1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC1KeyReleased

	private void TF_FF13_DLC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC2KeyReleased
		if(TF_FF13_DLC2.getText().length() > 56) {
			TF_FF13_DLC2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_DLC2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_DLC2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC2KeyReleased

	private void TF_FF13_DLC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC3KeyReleased
		if(TF_FF13_DLC3.getText().length() > 56) {
			TF_FF13_DLC3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_DLC3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_DLC3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC3KeyReleased

	private void TF_FF13_DLC4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC4KeyReleased
		if(TF_FF13_DLC4.getText().length() > 56) {
			TF_FF13_DLC4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_DLC4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_DLC4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC4KeyReleased

	private void TF_FF13_DLC5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_FF13_DLC5KeyReleased
		if(TF_FF13_DLC5.getText().length() > 56) {
			TF_FF13_DLC5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_FF13_DLC5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_FF13_DLC5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_FF13_DLC5KeyReleased

	private void CB_DDFF_ISO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO1ActionPerformed
		TF_DDFF_ISO1.setEnabled(CB_DDFF_ISO1.isSelected());
		checkBoxTipAL.get(104).setOpacity(CB_DDFF_ISO1.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_DDFF_ISO1.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO1ActionPerformed

	private void CB_DDFF_ISO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO2ActionPerformed
		TF_DDFF_ISO2.setEnabled(CB_DDFF_ISO2.isSelected());
		checkBoxTipAL.get(105).setOpacity(CB_DDFF_ISO2.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_DDFF_ISO2.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO2ActionPerformed

	private void CB_DDFF_ISO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO3ActionPerformed
		TF_DDFF_ISO3.setEnabled(CB_DDFF_ISO3.isSelected());
		checkBoxTipAL.get(106).setOpacity(CB_DDFF_ISO3.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_DDFF_ISO3.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO3ActionPerformed

	private void CB_DDFF_ISO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO4ActionPerformed
		TF_DDFF_ISO4.setEnabled(CB_DDFF_ISO4.isSelected());
		checkBoxTipAL.get(107).setOpacity(CB_DDFF_ISO4.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_DDFF_ISO4.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO4ActionPerformed

	private void CB_DDFF_ISO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO5ActionPerformed
		TF_DDFF_ISO5.setEnabled(CB_DDFF_ISO5.isSelected());
		checkBoxTipAL.get(108).setOpacity(CB_DDFF_ISO5.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_DDFF_ISO5.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO5ActionPerformed

	private void CB_DDFF_ISO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DDFF_ISO6ActionPerformed
		TF_DDFF_ISO6.setEnabled(CB_DDFF_ISO6.isSelected());
		checkBoxTipAL.get(109).setOpacity(CB_DDFF_ISO6.isSelected() ? 0.0f : 1.0f);
		MediaPlayer.playCustomSound(CB_DDFF_ISO6.isSelected()? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_DDFF_ISO6ActionPerformed

	private void TF_DDFF_ISO1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO1KeyReleased
		if(TF_DDFF_ISO1.getText().length() > SongTitleDB.DDFF_ISO_COSMOS.length()) {
			TF_DDFF_ISO1.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_DDFF_ISO1);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_DDFF_ISO1.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO1KeyReleased

	private void TF_DDFF_ISO2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO2KeyReleased
		if(TF_DDFF_ISO2.getText().length() > SongTitleDB.DDFF_ISO_CHAOSLASTBATTLE1.length()) {
			TF_DDFF_ISO2.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_DDFF_ISO2);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_DDFF_ISO2.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO2KeyReleased

	private void TF_DDFF_ISO3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO3KeyReleased
		if(TF_DDFF_ISO3.getText().length() > SongTitleDB.DDFF_ISO_CHAOSLASTBATTLE2.length()) {
			TF_DDFF_ISO3.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_DDFF_ISO3);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_DDFF_ISO3.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO3KeyReleased

	private void TF_DDFF_ISO4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO4KeyReleased
		if(TF_DDFF_ISO4.getText().length() > SongTitleDB.DDFF_ISO_CHAOSLASTBATTLE3.length()) {
			TF_DDFF_ISO4.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_DDFF_ISO4);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_DDFF_ISO4.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO4KeyReleased

	private void TF_DDFF_ISO5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO5KeyReleased
		if(TF_DDFF_ISO5.getText().length() > SongTitleDB.DDFF_ISO_CANTATAMORTISGODINFIRE.length()) {
			TF_DDFF_ISO5.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_DDFF_ISO5);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_DDFF_ISO5.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO5KeyReleased

	private void TF_DDFF_ISO6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DDFF_ISO6KeyReleased
		if(TF_DDFF_ISO6.getText().length() > SongTitleDB.DDFF_ISO_OPENING.length()) {
			TF_DDFF_ISO6.setForeground(Color.RED);
			charLimitBalloonTip.setAttachedComponent(TF_DDFF_ISO6);
			TimingUtils.showTimedBalloon(charLimitBalloonTip, 3000);
		}
		else {
			TF_DDFF_ISO6.setForeground(Color.BLACK);
			charLimitBalloonTip.setVisible(false);
		}
	}//GEN-LAST:event_TF_DDFF_ISO6KeyReleased

	private void P_FF1_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF1_PICMouseClicked
		switch(P_FF1_PIC.getImageID()) {
			case 0:
				P_FF1_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF1_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF1_2), 0, 0) } );
				P_FF1.setGradientColors(P_FF1.getGradientStartColor(), new Color(190, 210, 220));
				P_FF1_PIC.setImageID(1);
				break;
			case 1:
				P_FF1_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF1_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF1_3), 0, 0) } );
				P_FF1.setGradientColors(P_FF1.getGradientStartColor(), new Color(190, 210, 220));
				P_FF1_PIC.setImageID(2);
				break;
			case 2:
				P_FF1_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF1_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF1), 0, 0) } );
				P_FF1.setGradientColors(P_FF1.getGradientStartColor(), new Color(190, 210, 220));
				P_FF1_PIC.setImageID(0);
				break;
		}
		P_FF1.repaint();
		P_FF1_PIC.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF1_PICMouseClicked

	private void P_FF2_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF2_PICMouseClicked
		switch(P_FF2_PIC.getImageID()) {
			case 0:
				P_FF2_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF2_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF2_2), 0, 0) } );
				P_FF2.setGradientColors(P_FF2.getGradientStartColor(), new Color(220, 205, 215));
				P_FF2_PIC.setImageID(1);
				break;
			case 1:
				P_FF2_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF2_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF2), 0, 0) } );
				P_FF2.setGradientColors(P_FF2.getGradientStartColor(), new Color(220, 205, 215));
				P_FF2_PIC.setImageID(0);
				break;
		}
		P_FF2.repaint();
		P_FF2_PIC.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF2_PICMouseClicked

	private void P_FF3_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF3_PICMouseClicked

	}//GEN-LAST:event_P_FF3_PICMouseClicked

	private void P_FF4_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF4_PICMouseClicked
		switch(P_FF4_PIC.getImageID()) {
			case 0:
				P_FF4_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF4_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF4_2), 0, 0) } );
				P_FF4.setGradientColors(P_FF4.getGradientStartColor(), new Color(180, 200, 245));
				P_FF4_PIC.setImageID(1);
				break;
			case 1:
				P_FF4_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF4_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF4_3), 0, 0) } );
				P_FF4.setGradientColors(P_FF4.getGradientStartColor(), new Color(215, 205, 235));
				P_FF4_PIC.setImageID(2);
				break;
			case 2:
				P_FF4_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF4_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF4), 0, 0) } );
				P_FF4.setGradientColors(P_FF4.getGradientStartColor(), new Color(200, 190, 200));
				P_FF4_PIC.setImageID(0);
				break;
		}
		P_FF4_PIC.repaint();
		P_FF4.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF4_PICMouseClicked

	private void P_FF5_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF5_PICMouseClicked

	}//GEN-LAST:event_P_FF5_PICMouseClicked

	private void P_FF6_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF6_PICMouseClicked

	}//GEN-LAST:event_P_FF6_PICMouseClicked

	private void P_FF7_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF7_PICMouseClicked
		switch(P_FF7_PIC.getImageID()) {
			case 0:
				P_FF7_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF7_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF7_2), 0, 0) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(200, 210, 210));
				P_FF7_PIC.setImageID(1);
				break;
			case 1:
				P_FF7_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF7_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF7_3), 0, 0) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(215, 185, 185));
				P_FF7_PIC.setImageID(2);
				break;
			case 2:
				P_FF7_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF7_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF7_4), 0, 0) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(150, 190, 200));
				P_FF7_PIC.setImageID(3);
				break;
			case 3:
				P_FF7_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF7_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF7_5), 0, 0) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(180, 180, 180));
				P_FF7_PIC.setImageID(4);
				break;
			case 4:
				P_FF7_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF7_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF7), 0, 0) } );
				P_FF7.setGradientColors(P_FF7.getGradientStartColor(), new Color(190, 205, 210));
				P_FF7_PIC.setImageID(0);
				break;
		}
		P_FF7_PIC.repaint();
		P_FF7.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF7_PICMouseClicked

	private void P_FF8_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF8_PICMouseClicked

	}//GEN-LAST:event_P_FF8_PICMouseClicked

	private void P_FF9_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF9_PICMouseClicked

	}//GEN-LAST:event_P_FF9_PICMouseClicked

	private void P_FF10_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF10_PICMouseClicked
		switch(P_FF10_PIC.getImageID()) {
			case 0:
				P_FF10_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF10_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF10_2), 0, 0) } );
				P_FF10.setGradientColors(P_FF10.getGradientStartColor(), new Color(220, 210, 240));
				P_FF10_PIC.setImageID(1);
				break;
			case 1:
				P_FF10_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF10_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF10), 0, 0) } );
				P_FF10.setGradientColors(P_FF10.getGradientStartColor(), new Color(190, 195, 215));
				P_FF10_PIC.setImageID(0);
				break;
		}
		P_FF10_PIC.repaint();
		P_FF10.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF10_PICMouseClicked

	private void P_FF11_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF11_PICMouseClicked

	}//GEN-LAST:event_P_FF11_PICMouseClicked

	private void P_FF12_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF12_PICMouseClicked
		switch(P_FF12_PIC.getImageID()) {
			case 0:
				P_FF12_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF12_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF12_2), 0, 0) } );
				P_FF12.setGradientColors(P_FF12.getGradientStartColor(), new Color(190, 210, 220));
				P_FF12_PIC.setImageID(1);
				break;
			case 1:
				P_FF12_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF12_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF12), 0, 0) } );
				P_FF12.setGradientColors(P_FF12.getGradientStartColor(), new Color(190, 195, 200));
				P_FF12_PIC.setImageID(0);
				break;
		}
		P_FF12_PIC.repaint();
		P_FF12.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF12_PICMouseClicked

	private void P_FF13_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_FF13_PICMouseClicked
		switch(P_FF13_PIC.getImageID()) {
			case 0:
				P_FF13_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF13_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF13_2), 0, 0) } );
				P_FF13.setGradientColors(P_FF13.getGradientStartColor(), new Color(210, 190, 200));
				P_FF13_PIC.setImageID(1);
				break;
			case 1:
				P_FF13_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF13_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF13_3), 0, 0) } );
				P_FF13.setGradientColors(P_FF13.getGradientStartColor(), new Color(190, 195, 200));
				P_FF13_PIC.setImageID(2);
				break;
			case 2:
				P_FF13_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF13_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF13), 0, 0) } );
				P_FF13.setGradientColors(P_FF13.getGradientStartColor(), new Color(200, 210, 210));
				P_FF13_PIC.setImageID(0);
				break;
		}
		P_FF13_PIC.repaint();
		P_FF13.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_FF13_PICMouseClicked

	private void P_DDFF_PICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_DDFF_PICMouseClicked
		switch(P_DDFF_PIC.getImageID()) {
			case 0:
				P_DDFF_PIC.setImageItems(new ImagePanel.ImageItem[] { P_DDFF_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_DDFF_2), 0, 0) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(145, 155, 160));
				P_DDFF_PIC.setImageID(1);
				break;
			case 1:
				P_DDFF_PIC.setImageItems(new ImagePanel.ImageItem[] { P_DDFF_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_DDFF_3), 0, 0) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(190, 210, 225));
				P_DDFF_PIC.setImageID(2);
				break;
			case 2:
				P_DDFF_PIC.setImageItems(new ImagePanel.ImageItem[] { P_DDFF_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_DDFF_4), 0, 0) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(215, 195, 195));
				P_DDFF_PIC.setImageID(3);
				break;
			case 3:
				P_DDFF_PIC.setImageItems(new ImagePanel.ImageItem[] { P_DDFF_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_DDFF), 0, 0) } );
				P_DDFF.setGradientColors(P_DDFF.getGradientStartColor(), new Color(170, 170, 150));
				P_DDFF_PIC.setImageID(0);
				break;
		}
		P_DDFF_PIC.repaint();
		P_DDFF.repaint();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_DDFF_PICMouseClicked

	private void B_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ExportActionPerformed
		try {
			generateCheatDB();
		}
		catch(Exception ex) {
			ex.printStackTrace(System.err);
		}
	}//GEN-LAST:event_B_ExportActionPerformed

	private void B_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SaveActionPerformed
		queryForSaveTitleList();
	}//GEN-LAST:event_B_SaveActionPerformed

	private void B_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LoadActionPerformed
		loadTitleList();
	}//GEN-LAST:event_B_LoadActionPerformed

	private void MI_PortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_PortuguesActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		DuodecimRenamer.instance.language = MessageDB.Language.PT;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_PortuguesActionPerformed

	private void MI_EnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_EnglishActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		DuodecimRenamer.instance.language = MessageDB.Language.EN;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_EnglishActionPerformed

		private void MI_DeutschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_DeutschActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		DuodecimRenamer.instance.language = MessageDB.Language.DE;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_DeutschActionPerformed

	private void MI_EspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_EspanolActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		DuodecimRenamer.instance.language = MessageDB.Language.ES;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_EspanolActionPerformed

	private void MI_FrancaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_FrancaiseActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		DuodecimRenamer.instance.language = MessageDB.Language.FR;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_FrancaiseActionPerformed

	private void MI_ItalianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ItalianoActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		DuodecimRenamer.instance.language = MessageDB.Language.IT;
		initComponentsTexts();
		initToolTipsMessages();
	}//GEN-LAST:event_MI_ItalianoActionPerformed

	private void MI_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ExportActionPerformed
		try {
			generateCheatDB();
		}
		catch(Exception ex) {
			ex.printStackTrace(System.err);
		}
	}//GEN-LAST:event_MI_ExportActionPerformed

	private void MI_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SaveActionPerformed
		queryForSaveTitleList();
	}//GEN-LAST:event_MI_SaveActionPerformed

	private void MI_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_LoadActionPerformed
		loadTitleList();
	}//GEN-LAST:event_MI_LoadActionPerformed

	private void MI_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ResetActionPerformed
		
		String message = null;
		Object[] options = null;

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_QUESTION_RESET_PT; options = new String[] { MessageDB.MESSAGE_YES_PT, MessageDB.MESSAGE_NO_PT };  break;
			case EN: message = MessageDB.MESSAGE_QUESTION_RESET_EN; options = new String[] { MessageDB.MESSAGE_YES_EN, MessageDB.MESSAGE_NO_EN };  break;
			case DE: message = MessageDB.MESSAGE_QUESTION_RESET_DE; options = new String[] { MessageDB.MESSAGE_YES_DE, MessageDB.MESSAGE_NO_DE };  break;
			case ES: message = MessageDB.MESSAGE_QUESTION_RESET_ES; options = new String[] { MessageDB.MESSAGE_YES_ES, MessageDB.MESSAGE_NO_ES };  break;
			case FR: message = MessageDB.MESSAGE_QUESTION_RESET_FR; options = new String[] { MessageDB.MESSAGE_YES_FR, MessageDB.MESSAGE_NO_FR };  break;
			case IT: message = MessageDB.MESSAGE_QUESTION_RESET_IT; options = new String[] { MessageDB.MESSAGE_YES_IT, MessageDB.MESSAGE_NO_IT };  break;
		}
		
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		int input = JOptionPane.showOptionDialog(null, message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_QUESTION_BIG), options, null);

		if(input == JOptionPane.YES_OPTION) {
			initFields();
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_UNEQUIP);
		}
	}//GEN-LAST:event_MI_ResetActionPerformed

	private void MI_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_HelpActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_WINDOWUP_2);
		
		helpPanel.setLanguage(DuodecimRenamer.instance.language);
		
		String title = null;
		switch(DuodecimRenamer.instance.language) {
			case PT: title = MessageDB.TITLE_MI_Help_PT; break;
			case EN: title = MessageDB.TITLE_MI_Help_EN; break;
			case DE: title = MessageDB.TITLE_MI_Help_DE; break;
			case ES: title = MessageDB.TITLE_MI_Help_ES; break;
			case FR: title = MessageDB.TITLE_MI_Help_FR; break;
			case IT: title = MessageDB.TITLE_MI_Help_IT; break;
		}
		helpWindow.setTitle(title);
		helpWindow.setContentPane(helpPanel);
		helpWindow.setLocation((DuodecimRenamer.instance.screenSize.width - helpWindow.getSize().width) / 2, ((DuodecimRenamer.instance.screenSize.height - helpWindow.getSize().height) / 2) + 10);
		helpWindow.setVisible(true);
	}//GEN-LAST:event_MI_HelpActionPerformed

	private void MI_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AboutActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_WINDOWUP);
		
		aboutPanel.setLanguage(DuodecimRenamer.instance.language);
		
		String title = null;
		switch(DuodecimRenamer.instance.language) {
			case PT: title = MessageDB.TITLE_MI_About_PT; break;
			case EN: title = MessageDB.TITLE_MI_About_EN; break;
			case DE: title = MessageDB.TITLE_MI_About_DE; break;
			case ES: title = MessageDB.TITLE_MI_About_ES; break;
			case FR: title = MessageDB.TITLE_MI_About_FR; break;
			case IT: title = MessageDB.TITLE_MI_About_IT; break;
		}
		aboutWindow.setTitle(title);
		aboutWindow.setContentPane(aboutPanel);
		aboutWindow.setLocation((DuodecimRenamer.instance.screenSize.width - aboutWindow.getSize().width) / 2,((DuodecimRenamer.instance.screenSize.height - aboutWindow.getSize().height) / 2) + 10);
		aboutWindow.setVisible(true);
	}//GEN-LAST:event_MI_AboutActionPerformed

	private void MI_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ExitActionPerformed
		
		String message = null;
		Object[] options = null;

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_QUESTION_EXIT_PT; options = new String[] { MessageDB.MESSAGE_YES_PT, MessageDB.MESSAGE_NO_PT };  break;
			case EN: message = MessageDB.MESSAGE_QUESTION_EXIT_EN; options = new String[] { MessageDB.MESSAGE_YES_EN, MessageDB.MESSAGE_NO_EN };  break;
			case DE: message = MessageDB.MESSAGE_QUESTION_EXIT_DE; options = new String[] { MessageDB.MESSAGE_YES_DE, MessageDB.MESSAGE_NO_DE };  break;
			case ES: message = MessageDB.MESSAGE_QUESTION_EXIT_ES; options = new String[] { MessageDB.MESSAGE_YES_ES, MessageDB.MESSAGE_NO_ES };  break;
			case FR: message = MessageDB.MESSAGE_QUESTION_EXIT_FR; options = new String[] { MessageDB.MESSAGE_YES_FR, MessageDB.MESSAGE_NO_FR };  break;
			case IT: message = MessageDB.MESSAGE_QUESTION_EXIT_IT; options = new String[] { MessageDB.MESSAGE_YES_IT, MessageDB.MESSAGE_NO_IT };  break;
		}
		
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		int input = JOptionPane.showOptionDialog(null, message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_QUESTION_BIG), options, null);

		if(input == JOptionPane.YES_OPTION) {
			queryForSaveTitleList();
			System.exit(0);
		}
	}//GEN-LAST:event_MI_ExitActionPerformed

	private void MI_Theme_DefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Theme_DefaultActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_START.setImageItemAt(0, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_0A), 0, 0));
		P_MainPanel.setGradientColors(new Color(248, 248, 248), new Color(210, 210, 210));
		P_Options.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		P_Data.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		TP_TabbedPane.setBackground(new Color(200, 210, 210));
		B_Export.setGradientColors(Color.WHITE, new Color(165, 195, 130), new Color(130, 155, 120));
		B_Save.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		B_Load.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		P_START.repaint();
		P_MainPanel.repaint();
		P_Options.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Export.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Theme_DefaultActionPerformed

	private void MI_Theme_DarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Theme_DarkActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_START.setImageItemAt(0, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_0A), 0, 0));
		P_MainPanel.setGradientColors(new Color(51, 51, 51), new Color(220, 220, 220));
		P_Options.setGradientColors(new Color(248, 248, 248), new Color(200, 210, 210));
		P_Data.setGradientColors(new Color(248, 248, 248), new Color(200, 210, 210));
		TP_TabbedPane.setBackground(new Color(220, 225, 225));
		B_Export.setGradientColors(Color.WHITE, new Color(165, 195, 130), new Color(130, 155, 120));
		B_Save.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		B_Load.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(120, 160, 160));
		P_START.repaint();
		P_MainPanel.repaint();
		P_Options.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Export.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Theme_DarkActionPerformed

	private void MI_Theme_CosmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Theme_CosmosActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_START.setImageItemAt(0, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_0C), 0, 0));
		P_MainPanel.setGradientColors(new Color(0, 0, 51), new Color(220, 220, 220));
		P_Options.setGradientColors(new Color(238, 238, 238), new Color(238, 228, 248));
		P_Data.setGradientColors(new Color(238, 238, 238), new Color(238, 228, 248));
		TP_TabbedPane.setBackground(new Color(238, 228, 248));
		B_Export.setGradientColors(Color.WHITE, new Color(150, 175, 225), new Color(90, 110, 130));
		B_Save.setGradientColors(Color.WHITE, new Color(175, 165, 235), new Color(120, 125, 160));
		B_Load.setGradientColors(Color.WHITE, new Color(175, 165, 235), new Color(120, 125, 160));
		P_START.repaint();
		P_MainPanel.repaint();
		P_Options.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Export.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Theme_CosmosActionPerformed

	private void MI_Theme_ChaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Theme_ChaosActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		P_START.setImageItemAt(0, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_0D), 0, 0));
		P_MainPanel.setGradientColors(new Color(51, 0, 0), new Color(220, 220, 220));
		P_Options.setGradientColors(new Color(238, 238, 238), new Color(238, 230, 228));
		P_Data.setGradientColors(new Color(238, 238, 238), new Color(238, 230, 228));
		TP_TabbedPane.setBackground(new Color(248, 240, 238));
		B_Export.setGradientColors(Color.WHITE, new Color(230, 150, 150), new Color(145, 100, 100));
		B_Save.setGradientColors(Color.WHITE, new Color(235, 165, 145), new Color(150, 115, 95));
		B_Load.setGradientColors(Color.WHITE, new Color(235, 165, 145), new Color(150, 115, 95));
		P_START.repaint();
		P_MainPanel.repaint();
		P_Options.repaint();
		P_Data.repaint();
		TP_TabbedPane.repaint();
		B_Export.repaint();
		B_Save.repaint();
		B_Load.repaint();
	}//GEN-LAST:event_MI_Theme_ChaosActionPerformed

	private void MI_Theme_CustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Theme_CustomActionPerformed
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
		colorChooser.setColor(P_MainPanel.getGradientStartColor());
		JDialog ColorDialog = JColorChooser.createDialog(null, "COLOR", true, colorChooser, null, null);
		ColorDialog.setVisible(true);

		if(!colorChooser.getColor().equals(P_MainPanel.getGradientStartColor())) {
			P_START.setImageItemAt(0, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_0B), 0, 0));
			P_MainPanel.setGradientColors(colorChooser.getColor(), new Color(220, 220, 220));
			P_Options.setGradientColors(new Color(238, 238, 238), new Color(210, 210, 210));
			P_Data.setGradientColors(new Color(238, 238, 238), new Color(210, 210, 210));
			TP_TabbedPane.setBackground(new Color(225, 225, 225));
			B_Export.setGradientColors(Color.WHITE, new Color(165, 165, 165), new Color(100, 100, 100));
			B_Save.setGradientColors(Color.WHITE, new Color(190, 190, 190), new Color(150, 150, 150));
			B_Load.setGradientColors(Color.WHITE, new Color(190, 190, 190), new Color(150, 150, 150));
			P_START.repaint();
			P_MainPanel.repaint();
			P_Options.repaint();
			P_Data.repaint();
			TP_TabbedPane.repaint();
			B_Export.repaint();
			B_Save.repaint();
			B_Load.repaint();
		}
	}//GEN-LAST:event_MI_Theme_CustomActionPerformed

	private void MI_Audio_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Audio_ONActionPerformed
		M_Audio.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SOUND_MAX));
		MediaPlayer.setMute(false);
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
	}//GEN-LAST:event_MI_Audio_ONActionPerformed

	private void MI_Audio_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_Audio_OFFActionPerformed
		M_Audio.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SOUND_MUTE));
		MediaPlayer.setMute(true);
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORCHOOSE);
	}//GEN-LAST:event_MI_Audio_OFFActionPerformed

	private void M_FunctionsMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_M_FunctionsMenuSelected
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MENUOPEN);
	}//GEN-LAST:event_M_FunctionsMenuSelected

	private void M_FunctionsMenuDeselected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_M_FunctionsMenuDeselected
		//MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MENUCLOSE);
	}//GEN-LAST:event_M_FunctionsMenuDeselected

	private void MI_ExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ExportMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ExportMouseEntered

	private void MI_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_SaveMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_SaveMouseEntered

	private void MI_LoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_LoadMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_LoadMouseEntered

	private void MI_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ResetMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ResetMouseEntered

	private void M_IdiomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_IdiomMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_M_IdiomMouseEntered

	private void M_AudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_AudioMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_M_AudioMouseEntered

	private void M_ThemeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_ThemeMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_M_ThemeMouseEntered

	private void MI_HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_HelpMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_HelpMouseEntered

	private void MI_AboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_AboutMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_AboutMouseEntered

	private void MI_PortuguesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_PortuguesMouseEntered
		if(MI_Portugues.isEnabled())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_PortuguesMouseEntered

	private void MI_EnglishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_EnglishMouseEntered
		if(MI_English.isEnabled())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_EnglishMouseEntered

	private void MI_DeutschMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_DeutschMouseEntered
		if(MI_Deutsch.isEnabled())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_DeutschMouseEntered

	private void MI_EspanolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_EspanolMouseEntered
		if(MI_Espanol.isEnabled())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_EspanolMouseEntered

	private void MI_FrancaiseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_FrancaiseMouseEntered
		if(MI_Francaise.isEnabled())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_FrancaiseMouseEntered

	private void MI_ItalianoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ItalianoMouseEntered
		if(MI_Italiano.isEnabled())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ItalianoMouseEntered

	private void MI_Audio_ONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Audio_ONMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Audio_ONMouseEntered

	private void MI_Audio_OFFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Audio_OFFMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Audio_OFFMouseEntered

	private void MI_Theme_DefaultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Theme_DefaultMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Theme_DefaultMouseEntered

	private void MI_Theme_DarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Theme_DarkMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Theme_DarkMouseEntered

	private void MI_Theme_CosmosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Theme_CosmosMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Theme_CosmosMouseEntered

	private void MI_Theme_ChaosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Theme_ChaosMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Theme_ChaosMouseEntered

	private void MI_Theme_CustomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_Theme_CustomMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_Theme_CustomMouseEntered

	private void MI_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_ExitMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
	}//GEN-LAST:event_MI_ExitMouseEntered

	private void TP_TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TP_TabbedPaneStateChanged
		if(TP_TabbedPane.isShowing())
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL);
	}//GEN-LAST:event_TP_TabbedPaneStateChanged

	private void B_ExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExportMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE_3);
		B_Export.setButtonHovered(true);
	}//GEN-LAST:event_B_ExportMouseEntered

	private void B_ExportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExportMouseExited
		B_Export.setButtonHovered(false);
	}//GEN-LAST:event_B_ExportMouseExited

	private void B_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SaveMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
		B_Save.setButtonHovered(true);
	}//GEN-LAST:event_B_SaveMouseEntered

	private void B_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SaveMouseExited
		B_Save.setButtonHovered(false);
	}//GEN-LAST:event_B_SaveMouseExited

	private void B_LoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LoadMouseEntered
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE);
		B_Load.setButtonHovered(true);
	}//GEN-LAST:event_B_LoadMouseEntered

	private void B_LoadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LoadMouseExited
		B_Load.setButtonHovered(false);
	}//GEN-LAST:event_B_LoadMouseExited

	private void CB_AutoActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_AutoActivateActionPerformed
		MediaPlayer.playCustomSound(CB_AutoActivate.isSelected() ? MediaPlayer.DISSIDIA_EQUIP : MediaPlayer.DISSIDIA_UNEQUIP);
	}//GEN-LAST:event_CB_AutoActivateActionPerformed

	private void TP_TabbedPaneMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_TP_TabbedPaneMouseWheelMoved
		int index = TP_TabbedPane.getSelectedIndex();
		index += evt.getWheelRotation();
		index = (index < 0) ? 0 : (index > TP_TabbedPane.getTabCount() - 1) ? TP_TabbedPane.getTabCount() - 1 : index;
		TP_TabbedPane.setSelectedIndex(index);
	}//GEN-LAST:event_TP_TabbedPaneMouseWheelMoved

	private void P_STARTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_STARTMouseClicked
		updateStartTab();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_PAGEROLL_2);
	}//GEN-LAST:event_P_STARTMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.convalise.lib.GradientButton B_Export;
    private com.convalise.lib.GradientButton B_Load;
    private com.convalise.lib.GradientButton B_Save;
    private javax.swing.JCheckBox CB_AutoActivate;
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
    private javax.swing.JComboBox<String> CB_Region;
    private javax.swing.JMenuBar MB_MenuBar;
    private javax.swing.JMenuItem MI_About;
    private javax.swing.JMenuItem MI_Audio_OFF;
    private javax.swing.JMenuItem MI_Audio_ON;
    private javax.swing.JMenuItem MI_Deutsch;
    private javax.swing.JMenuItem MI_English;
    private javax.swing.JMenuItem MI_Espanol;
    private javax.swing.JMenuItem MI_Exit;
    private javax.swing.JMenuItem MI_Export;
    private javax.swing.JMenuItem MI_Francaise;
    private javax.swing.JMenuItem MI_Help;
    private javax.swing.JMenuItem MI_Italiano;
    private javax.swing.JMenuItem MI_Load;
    private javax.swing.JMenuItem MI_Portugues;
    private javax.swing.JMenuItem MI_Reset;
    private javax.swing.JMenuItem MI_Save;
    private javax.swing.JMenuItem MI_Theme_Chaos;
    private javax.swing.JMenuItem MI_Theme_Cosmos;
    private javax.swing.JMenuItem MI_Theme_Custom;
    private javax.swing.JMenuItem MI_Theme_Dark;
    private javax.swing.JMenuItem MI_Theme_Default;
    private javax.swing.JMenu M_Audio;
    private javax.swing.JMenu M_Functions;
    private javax.swing.JMenu M_Idiom;
    private javax.swing.JMenu M_Theme;
    private com.convalise.lib.GradientPanel P_DDFF;
    private javax.swing.JPanel P_DDFF_ISO;
    private com.convalise.lib.ImagePanel P_DDFF_PIC;
    private com.convalise.lib.GradientPanel P_Data;
    private com.convalise.lib.GradientPanel P_FF1;
    private com.convalise.lib.GradientPanel P_FF10;
    private javax.swing.JPanel P_FF10_DLC;
    private javax.swing.JPanel P_FF10_ISO;
    private com.convalise.lib.ImagePanel P_FF10_PIC;
    private com.convalise.lib.GradientPanel P_FF11;
    private javax.swing.JPanel P_FF11_DLC;
    private javax.swing.JPanel P_FF11_ISO;
    private com.convalise.lib.ImagePanel P_FF11_PIC;
    private com.convalise.lib.GradientPanel P_FF12;
    private javax.swing.JPanel P_FF12_DLC;
    private javax.swing.JPanel P_FF12_ISO;
    private com.convalise.lib.ImagePanel P_FF12_PIC;
    private com.convalise.lib.GradientPanel P_FF13;
    private javax.swing.JPanel P_FF13_DLC;
    private javax.swing.JPanel P_FF13_ISO;
    private com.convalise.lib.ImagePanel P_FF13_PIC;
    private javax.swing.JPanel P_FF1_DLC;
    private javax.swing.JPanel P_FF1_ISO;
    private com.convalise.lib.ImagePanel P_FF1_PIC;
    private com.convalise.lib.GradientPanel P_FF2;
    private javax.swing.JPanel P_FF2_DLC;
    private javax.swing.JPanel P_FF2_ISO;
    private com.convalise.lib.ImagePanel P_FF2_PIC;
    private com.convalise.lib.GradientPanel P_FF3;
    private javax.swing.JPanel P_FF3_DLC;
    private javax.swing.JPanel P_FF3_ISO;
    private com.convalise.lib.ImagePanel P_FF3_PIC;
    private com.convalise.lib.GradientPanel P_FF4;
    private javax.swing.JPanel P_FF4_DLC;
    private javax.swing.JPanel P_FF4_ISO;
    private com.convalise.lib.ImagePanel P_FF4_PIC;
    private com.convalise.lib.GradientPanel P_FF5;
    private javax.swing.JPanel P_FF5_DLC;
    private javax.swing.JPanel P_FF5_ISO;
    private com.convalise.lib.ImagePanel P_FF5_PIC;
    private com.convalise.lib.GradientPanel P_FF6;
    private javax.swing.JPanel P_FF6_DLC;
    private javax.swing.JPanel P_FF6_ISO;
    private com.convalise.lib.ImagePanel P_FF6_PIC;
    private com.convalise.lib.GradientPanel P_FF7;
    private javax.swing.JPanel P_FF7_DLC;
    private javax.swing.JPanel P_FF7_ISO;
    private com.convalise.lib.ImagePanel P_FF7_PIC;
    private com.convalise.lib.GradientPanel P_FF8;
    private javax.swing.JPanel P_FF8_DLC;
    private javax.swing.JPanel P_FF8_ISO;
    private com.convalise.lib.ImagePanel P_FF8_PIC;
    private com.convalise.lib.GradientPanel P_FF9;
    private javax.swing.JPanel P_FF9_DLC;
    private javax.swing.JPanel P_FF9_ISO;
    private com.convalise.lib.ImagePanel P_FF9_PIC;
    private com.convalise.lib.GradientPanel P_MainPanel;
    private com.convalise.lib.GradientPanel P_Options;
    private com.convalise.lib.ImagePanel P_START;
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

	private boolean checkForWarnings() {

		boolean selectWarning;
		boolean titleWarning;

		selectWarning = true;
		for(JCheckBox jcb : checkBoxAL) {
			if(jcb.isSelected()) {
				selectWarning = false;
				break;
			}
		}

		titleWarning = false;
		for(JTextField jtf : textFieldAL) {
			if(jtf.isEnabled() && jtf.getForeground()==Color.RED) {
				titleWarning = true;
				break;
			}
		}

		String message = null;
		Object[] options = null;
		
		if(selectWarning) {
			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_PT; break;
				case EN: message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_EN; break;
				case DE: message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_DE; break;
				case ES: message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_ES; break;
				case FR: message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_FR; break;
				case IT: message = MessageDB.MESSAGE_ERROR_MUSICNOTSELECTED_IT; break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_ERROR);
			JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_ERROR_BIG));
			return true;
		}

		if(titleWarning) {
			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_PT; options = new String[] { MessageDB.MESSAGE_YES_PT, MessageDB.MESSAGE_NO_PT };  break;
				case EN: message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_EN; options = new String[] { MessageDB.MESSAGE_YES_EN, MessageDB.MESSAGE_NO_EN };  break;
				case DE: message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_DE; options = new String[] { MessageDB.MESSAGE_YES_DE, MessageDB.MESSAGE_NO_DE };  break;
				case ES: message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_ES; options = new String[] { MessageDB.MESSAGE_YES_ES, MessageDB.MESSAGE_NO_ES };  break;
				case FR: message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_FR; options = new String[] { MessageDB.MESSAGE_YES_FR, MessageDB.MESSAGE_NO_FR };  break;
				case IT: message = MessageDB.MESSAGE_WARNING_CHARACTERLIMIT_IT; options = new String[] { MessageDB.MESSAGE_YES_IT, MessageDB.MESSAGE_NO_IT };  break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
			int input = JOptionPane.showOptionDialog(null, message, "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_WARNING_BIG), options, null);
			return (input != JOptionPane.YES_OPTION);
		}

		return false;

	}

	private void generateCheatDB() throws IOException {

		String message = null;
		Object[] options = null;
		
		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_QUESTION_EXPORT_PT; options = new String[] { MessageDB.MESSAGE_YES_PT, MessageDB.MESSAGE_NO_PT };  break;
			case EN: message = MessageDB.MESSAGE_QUESTION_EXPORT_EN; options = new String[] { MessageDB.MESSAGE_YES_EN, MessageDB.MESSAGE_NO_EN };  break;
			case DE: message = MessageDB.MESSAGE_QUESTION_EXPORT_DE; options = new String[] { MessageDB.MESSAGE_YES_DE, MessageDB.MESSAGE_NO_DE };  break;
			case ES: message = MessageDB.MESSAGE_QUESTION_EXPORT_ES; options = new String[] { MessageDB.MESSAGE_YES_ES, MessageDB.MESSAGE_NO_ES };  break;
			case FR: message = MessageDB.MESSAGE_QUESTION_EXPORT_FR; options = new String[] { MessageDB.MESSAGE_YES_FR, MessageDB.MESSAGE_NO_FR };  break;
			case IT: message = MessageDB.MESSAGE_QUESTION_EXPORT_IT; options = new String[] { MessageDB.MESSAGE_YES_IT, MessageDB.MESSAGE_NO_IT };  break;
		}
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		int input = JOptionPane.showOptionDialog(null, message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_QUESTION_BIG), options, null);

		if(input != JOptionPane.YES_OPTION) {
			return;
		}

		if(checkForWarnings()) {
			return;
		}

		File cheatF = new File("cheat.db");

		if(cheatF.exists()) {
			cheatF.delete();
			cheatF.createNewFile();
		}

		RandomAccessFile cheatRA = new RandomAccessFile(cheatF, "rw");

		if(!cheatF.canWrite()) {
			return;
		}

		CheatGenerator.Region region = null;

		switch(CB_Region.getSelectedIndex()) {
			case 0: region = CheatGenerator.Region.USA; break;
			case 1: region = CheatGenerator.Region.EUR; break;
			case 2: region = CheatGenerator.Region.JPN; break;
		}

		cheatRA.writeBytes(CheatGenerator.parseHeader(region));

		String cheat;

		for(int i = 0; i < checkBoxAL.size(); i++) {
			if(checkBoxAL.get(i).isSelected()) {
				cheat = CheatGenerator.parseTitle(bgmOffsetAL.get(i), bgmTitleAL.get(i), textFieldAL.get(i).getText(), CB_AutoActivate.isSelected());
				cheatRA.writeBytes(cheat);
			}
		}

		cheatRA.close();

		message = null;
		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_PT; break;
			case EN: message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_EN; break;
			case DE: message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_DE; break;
			case ES: message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_ES; break;
			case FR: message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_FR; break;
			case IT: message = MessageDB.MESSAGE_SUCCESS_EXPORTCHEAT_IT; break;
		}
		message += '\n' + cheatF.getAbsolutePath();
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CHOCOBO);
		JOptionPane.showMessageDialog(null, message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SUCCESS_BIG));

	}

	private void queryForSaveTitleList() {

		String message = null;
		Object[] options = null;

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_QUESTION_SAVE_PT; options = new String[] { MessageDB.MESSAGE_YES_PT, MessageDB.MESSAGE_NO_PT };  break;
			case EN: message = MessageDB.MESSAGE_QUESTION_SAVE_EN; options = new String[] { MessageDB.MESSAGE_YES_EN, MessageDB.MESSAGE_NO_EN };  break;
			case DE: message = MessageDB.MESSAGE_QUESTION_SAVE_DE; options = new String[] { MessageDB.MESSAGE_YES_DE, MessageDB.MESSAGE_NO_DE };  break;
			case ES: message = MessageDB.MESSAGE_QUESTION_SAVE_ES; options = new String[] { MessageDB.MESSAGE_YES_ES, MessageDB.MESSAGE_NO_ES };  break;
			case FR: message = MessageDB.MESSAGE_QUESTION_SAVE_FR; options = new String[] { MessageDB.MESSAGE_YES_FR, MessageDB.MESSAGE_NO_FR };  break;
			case IT: message = MessageDB.MESSAGE_QUESTION_SAVE_IT; options = new String[] { MessageDB.MESSAGE_YES_IT, MessageDB.MESSAGE_NO_IT };  break;
		}
		
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		int input = JOptionPane.showOptionDialog(null, message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_QUESTION_BIG), options, null);

		if(input != JOptionPane.YES_OPTION) {
			return;
		}

		try {
			ResourceManager.saveTitlesList(textFieldAL);

			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_PT; break;
				case EN: message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_EN; break;
				case DE: message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_DE; break;
				case ES: message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_ES; break;
				case FR: message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_FR; break;
				case IT: message = MessageDB.MESSAGE_SUCCESS_SAVECOMPLETE_IT; break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE_2);
			JOptionPane.showMessageDialog(null, message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SUCCESS_BIG));

		}
		catch(FileNotFoundException ex) {
			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_PT; break;
				case EN: message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_EN; break;
				case DE: message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_DE; break;
				case ES: message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_ES; break;
				case FR: message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_FR; break;
				case IT: message = MessageDB.MESSAGE_ERROR_SAVEFILENOTFOUND_IT; break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_ERROR);
			JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_ERROR_BIG));
		}
		catch(Exception ex) {
			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_PT; break;
				case EN: message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_EN; break;
				case DE: message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_DE; break;
				case ES: message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_ES; break;
				case FR: message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_FR; break;
				case IT: message = MessageDB.MESSAGE_ERROR_SAVENOTCOMPLETE_IT; break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_ERROR);
			JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_ERROR_BIG));
		}

	}

	private void loadTitleList() {

		String message = null;
		Object[] options = null;

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_QUESTION_LOAD_PT; options = new String[] { MessageDB.MESSAGE_YES_PT, MessageDB.MESSAGE_NO_PT };  break;
			case EN: message = MessageDB.MESSAGE_QUESTION_LOAD_EN; options = new String[] { MessageDB.MESSAGE_YES_EN, MessageDB.MESSAGE_NO_EN };  break;
			case DE: message = MessageDB.MESSAGE_QUESTION_LOAD_DE; options = new String[] { MessageDB.MESSAGE_YES_DE, MessageDB.MESSAGE_NO_DE };  break;
			case ES: message = MessageDB.MESSAGE_QUESTION_LOAD_ES; options = new String[] { MessageDB.MESSAGE_YES_ES, MessageDB.MESSAGE_NO_ES };  break;
			case FR: message = MessageDB.MESSAGE_QUESTION_LOAD_FR; options = new String[] { MessageDB.MESSAGE_YES_FR, MessageDB.MESSAGE_NO_FR };  break;
			case IT: message = MessageDB.MESSAGE_QUESTION_LOAD_IT; options = new String[] { MessageDB.MESSAGE_YES_IT, MessageDB.MESSAGE_NO_IT };  break;
		}
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_MOOGLE);
		int input = JOptionPane.showOptionDialog(null, message, "QUESTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_QUESTION_BIG), options, null);

		if(input != JOptionPane.YES_OPTION) {
			return;
		}

		StringBuffer time_pt = new StringBuffer("");
		StringBuffer time_en = new StringBuffer("");

		try {
			ResourceManager.LoadTitleList(textFieldAL, checkBoxAL, checkBoxTipAL, time_pt, time_en);

			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_PT + '\n' + time_pt.toString(); break;
				case EN: message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_EN + '\n' + time_en.toString(); break;
				case DE: message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_DE + '\n' + time_pt.toString(); break;
				case ES: message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_ES + '\n' + time_pt.toString(); break;
				case FR: message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_FR + '\n' + time_pt.toString(); break;
				case IT: message = MessageDB.MESSAGE_SUCCESS_LOADCOMPLETE_IT + '\n' + time_pt.toString(); break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_EQUIP);
			JOptionPane.showMessageDialog(null, message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SUCCESS_BIG));

		}
		catch(FileNotFoundException e) {
			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_PT; break;
				case EN: message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_EN; break;
				case DE: message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_DE; break;
				case ES: message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_ES; break;
				case FR: message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_FR; break;
				case IT: message = MessageDB.MESSAGE_ERROR_LOADFILENOTFOUND_IT; break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_ERROR);
			JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_ERROR_BIG));
		}
		catch(Exception e) {
			switch(DuodecimRenamer.instance.language) {
				case PT: message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_PT; break;
				case EN: message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_EN; break;
				case DE: message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_DE; break;
				case ES: message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_ES; break;
				case FR: message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_FR; break;
				case IT: message = MessageDB.MESSAGE_ERROR_LOADNOTCOMPLETE_IT; break;
			}
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_ERROR);
			JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE, ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_ERROR_BIG));
		}

	}

	private void updateStartTab() {

		int picIndex = 0;
		int randomIndex = new Random().nextInt(31) + 1;

		switch(randomIndex) {
			case 1:  picIndex = ResourceDB.INDEX_PIC_START_01;	break;
			case 2:  picIndex = ResourceDB.INDEX_PIC_START_02;	break;
			case 3:  picIndex = ResourceDB.INDEX_PIC_START_03;	break;
			case 4:  picIndex = ResourceDB.INDEX_PIC_START_04;	break;
			case 5:  picIndex = ResourceDB.INDEX_PIC_START_05;	break;
			case 6:  picIndex = ResourceDB.INDEX_PIC_START_06;	break;
			case 7:  picIndex = ResourceDB.INDEX_PIC_START_07;	break;
			case 8:  picIndex = ResourceDB.INDEX_PIC_START_08;	break;
			case 9:  picIndex = ResourceDB.INDEX_PIC_START_09;	break;
			case 10: picIndex = ResourceDB.INDEX_PIC_START_10;	break;
			case 11: picIndex = ResourceDB.INDEX_PIC_START_11;	break;
			case 12: picIndex = ResourceDB.INDEX_PIC_START_12;	break;
			case 13: picIndex = ResourceDB.INDEX_PIC_START_13;	break;
			case 14: picIndex = ResourceDB.INDEX_PIC_START_14;	break;
			case 15: picIndex = ResourceDB.INDEX_PIC_START_15;	break;
			case 16: picIndex = ResourceDB.INDEX_PIC_START_16;	break;
			case 17: picIndex = ResourceDB.INDEX_PIC_START_17;	break;
			case 18: picIndex = ResourceDB.INDEX_PIC_START_18;	break;
			case 19: picIndex = ResourceDB.INDEX_PIC_START_19;	break;
			case 20: picIndex = ResourceDB.INDEX_PIC_START_20;	break;
			case 21: picIndex = ResourceDB.INDEX_PIC_START_21;	break;
			case 22: picIndex = ResourceDB.INDEX_PIC_START_22;	break;
			case 23: picIndex = ResourceDB.INDEX_PIC_START_23;	break;
			case 24: picIndex = ResourceDB.INDEX_PIC_START_24;	break;
			case 25: picIndex = ResourceDB.INDEX_PIC_START_25;	break;
			case 26: picIndex = ResourceDB.INDEX_PIC_START_26;	break;
			case 27: picIndex = ResourceDB.INDEX_PIC_START_27;	break;
			case 28: picIndex = ResourceDB.INDEX_PIC_START_28;	break;
			case 29: picIndex = ResourceDB.INDEX_PIC_START_29;	break;
			case 30: picIndex = ResourceDB.INDEX_PIC_START_30;	break;
			case 31: picIndex = ResourceDB.INDEX_PIC_START_31;	break;
		}

		P_START.setImageItemAt(1, P_START.new ImageItem(ResourceManager.loadImageResource(picIndex), 0, 0));
		P_START.repaint();

	}

	private void initComponentsCustomization() {

		initPanels();
		initArrays();
		initComponentsTexts();
		initToolTipsMessages();
		initFields();

		UIManager.put("Button.select", new Color(0, 0, 0, 50));

		colorChooser = new JColorChooser();
		AbstractColorChooserPanel[] oldPanels = colorChooser.getChooserPanels();
		for(int i = 1; i < oldPanels.length; i++) {
			colorChooser.removeChooserPanel(oldPanels[i]);
		}
		colorChooser.setPreviewPanel(new JPanel());

		aboutPanel = new AboutPanel();
		aboutPanel.setLanguage(DuodecimRenamer.instance.language);

		aboutWindow = new JDialog();
		aboutWindow.setModal(true);
		aboutWindow.setResizable(false);
		aboutWindow.setType(Type.UTILITY);
		aboutWindow.setSize(new Dimension(606, 384));
		aboutWindow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORBACK);
			}
		});

		
		helpPanel = new HelpPanel();
		helpPanel.setLanguage(DuodecimRenamer.instance.language);

		helpWindow = new JDialog();
		helpWindow.setModal(true);
		helpWindow.setResizable(false);
		helpWindow.setType(Type.UTILITY);
		helpWindow.setSize(new Dimension(826, 594));
		helpWindow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORBACK);
			}
		});

		M_Functions.setFont(new Font("Arial", Font.BOLD, 12));
		M_Idiom.setFont(new Font("Arial", Font.PLAIN, 12));
		M_Theme.setFont(new Font("Arial", Font.PLAIN, 12));
		M_Audio.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Export.setFont(new Font ("Arial", Font.PLAIN, 12));
		MI_Save.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Load.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Reset.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Help.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_About.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Exit.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Portugues.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_English.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Deutsch.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Espanol.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Francaise.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Italiano.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Theme_Default.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Theme_Dark.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Theme_Cosmos.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Theme_Chaos.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Theme_Custom.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Audio_ON.setFont(new Font("Arial", Font.PLAIN, 12));
		MI_Audio_OFF.setFont(new Font("Arial", Font.PLAIN, 12));
		B_Export.setFont(new Font("Arial", Font.PLAIN, 12));
		B_Save.setFont(new Font("Arial", Font.PLAIN, 12));
		B_Load.setFont(new Font("Arial", Font.PLAIN, 12));
		CB_AutoActivate.setFont(new Font("Arial", Font.PLAIN, 12));
		CB_Region.setFont(new Font("Arial", Font.PLAIN, 12));

		M_Theme.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_THEME));
		M_Audio.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SOUND_MAX));
		MI_Export.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_EXPORT));
		MI_Reset.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_RESET));
		MI_Save.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SAVE));
		MI_Load.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_LOAD));
		MI_Help.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_QUESTION));
		MI_About.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_ABOUT));
		MI_Exit.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_EXIT));
		MI_Portugues.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_PT));
		MI_English.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_EN));
		MI_Deutsch.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_DE));
		MI_Espanol.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_ES));
		MI_Francaise.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_FR));
		MI_Italiano.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_IT));
		MI_Theme_Default.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_THEME_DEFAULT));
		MI_Theme_Dark.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_THEME_DARK));
		MI_Theme_Cosmos.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_THEME_COSMOS));
		MI_Theme_Chaos.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_THEME_CHAOS));
		MI_Theme_Custom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_THEME_CUSTOM));
		MI_Audio_ON.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SOUND_MAX));
		MI_Audio_OFF.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_SOUND_MUTE));
		B_Export.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_EXPORT_BIG));

		B_Export.setVerticalTextPosition(SwingConstants.BOTTOM);
		B_Export.setHorizontalTextPosition(SwingConstants.CENTER);

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
		CB_AutoActivate.setOpaque(false);
		
		for(JCheckBox jcb : checkBoxAL) {
			jcb.setOpaque(false);
		}

	}

	private void initPanels() {

		Color defaultColor = new Color(238, 238, 238);

		P_MainPanel.setGradientColors(new Color(248, 248, 248), new Color(210, 210, 210));
		P_Options.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		P_Data.setGradientColors(new Color(200, 210, 210), new Color(248, 248, 248));
		P_START.setGradientColors(new Color(155, 165, 90), Color.BLACK);
		P_FF1.setGradientColors(defaultColor, new Color(190, 210, 220));
		P_FF2.setGradientColors(defaultColor, new Color(220, 205, 215));
		P_FF3.setGradientColors(defaultColor, new Color(190, 200, 190));
		P_FF4.setGradientColors(defaultColor, new Color(200, 190, 200));
		P_FF5.setGradientColors(defaultColor, new Color(215, 210, 230));
		P_FF6.setGradientColors(defaultColor, new Color(200, 190, 190));
		P_FF7.setGradientColors(defaultColor, new Color(190, 205, 210));
		P_FF8.setGradientColors(defaultColor, new Color(210, 195, 190));
		P_FF9.setGradientColors(defaultColor, new Color(220, 215, 190));
		P_FF10.setGradientColors(defaultColor, new Color(190, 195, 215));
		P_FF11.setGradientColors(defaultColor, new Color(200, 215, 235));
		P_FF12.setGradientColors(defaultColor, new Color(190, 195, 200));
		P_FF13.setGradientColors(defaultColor, new Color(200, 210, 210));
		P_DDFF.setGradientColors(defaultColor, new Color(170, 170, 150));

		P_MainPanel.setGradientDirection(GradientPanel.GradientDirection.VERTICAL);
		P_Options.setGradientDirection(GradientPanel.GradientDirection.VERTICAL);
		P_Data.setGradientDirection(GradientPanel.GradientDirection.VERTICAL);
		P_START.setGradientDirection(GradientPanel.GradientDirection.ANTIDIAGONAL);
		P_FF1.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF2.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF3.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF4.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF5.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF6.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF7.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF8.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF9.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF10.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF11.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF12.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_FF13.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);
		P_DDFF.setGradientDirection(GradientPanel.GradientDirection.HORIZONTAL);

		P_START.setImageItems(new ImagePanel.ImageItem[] {
			P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_0A), 0, 0),
			P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_13), 0, 0),
			P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_PT), 0, 0)
		});
		
		updateStartTab();

		P_FF1_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF1_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF1), 0, 0) } );
		P_FF2_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF2_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF2), 0, 0) } );
		P_FF3_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF3_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF3), 0, 0) } );
		P_FF4_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF4_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF4), 0, 0) } );
		P_FF5_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF5_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF5), 0, 0) } );
		P_FF6_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF6_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF6), 0, 0) } );
		P_FF7_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF7_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF7), 0, 0) } );
		P_FF8_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF8_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF8), 0, 0) } );
		P_FF9_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF9_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF9), 0, 0) } );
		P_FF10_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF10_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF10), 0, 0) } );
		P_FF11_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF11_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF11), 0, 0) } );
		P_FF12_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF12_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF12), 0, 0) } );
		P_FF13_PIC.setImageItems(new ImagePanel.ImageItem[] { P_FF13_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_FF13), 0, 0) } );
		P_DDFF_PIC.setImageItems(new ImagePanel.ImageItem[] { P_DDFF_PIC.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_DDFF), 0, 0) } );

		B_Export.setGradientColors(Color.WHITE, new Color(165, 195, 130), new Color(130, 155, 120));
		B_Save.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(55, 130, 145));
		B_Load.setGradientColors(Color.WHITE, new Color(160, 210, 220), new Color(55, 130, 145));

	}

	private void initComponentsTexts() {

		int prevCBIndex = CB_Region.getSelectedIndex();
		
		CB_Region.removeAllItems();

		switch(DuodecimRenamer.instance.language) {
			
			case PT:
				M_Functions.setText(MessageDB.TITLE_M_Functions_PT);
				M_Idiom.setText(MessageDB.TITLE_M_Idiom_PT);
				M_Theme.setText(MessageDB.TITLE_M_Tema_PT);
				M_Audio.setText(MessageDB.TITLE_M_Audio_PT);
				MI_Export.setText(MessageDB.TITLE_MI_Export_PT);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_PT);
				MI_Save.setText(MessageDB.TITLE_MI_Save_PT);
				MI_Load.setText(MessageDB.TITLE_MI_Load_PT);
				MI_Help.setText(MessageDB.TITLE_MI_Help_PT);
				MI_About.setText(MessageDB.TITLE_MI_About_PT);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_PT);
				MI_Theme_Default.setText(MessageDB.TITLE_MI_Theme_Default_PT);
				MI_Theme_Dark.setText(MessageDB.TITLE_MI_Theme_Dark_PT);
				MI_Theme_Cosmos.setText(MessageDB.TITLE_MI_Theme_Cosmos_PT);
				MI_Theme_Chaos.setText(MessageDB.TITLE_MI_Theme_Chaos_PT);
				MI_Theme_Custom.setText(MessageDB.TITLE_MI_Theme_Custom_PT);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_PT);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_PT);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_PT);
				B_Export.setText(MessageDB.TITLE_B_Export_PT);
				B_Save.setText(MessageDB.TITLE_B_Save_PT);
				B_Load.setText(MessageDB.TITLE_B_Load_PT);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_USA_PT);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_EUR_PT);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Region_JPN_PT);
				CB_AutoActivate.setText(MessageDB.TITLE_CB_AutoActivate_PT);

				P_START.setImageItemAt(2, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_PT), 0, 0));
				M_Functions.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_PT));
				M_Idiom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_PT));

				break;
				
			case EN:
				M_Functions.setText(MessageDB.TITLE_M_Functions_EN);
				M_Idiom.setText(MessageDB.TITLE_M_Idiom_EN);
				M_Theme.setText(MessageDB.TITLE_M_Tema_EN);
				M_Audio.setText(MessageDB.TITLE_M_Audio_EN);
				MI_Export.setText(MessageDB.TITLE_MI_Export_EN);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_EN);
				MI_Save.setText(MessageDB.TITLE_MI_Save_EN);
				MI_Load.setText(MessageDB.TITLE_MI_Load_EN);
				MI_Help.setText(MessageDB.TITLE_MI_Help_EN);
				MI_About.setText(MessageDB.TITLE_MI_About_EN);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_EN);
				MI_Theme_Default.setText(MessageDB.TITLE_MI_Theme_Default_EN);
				MI_Theme_Dark.setText(MessageDB.TITLE_MI_Theme_Dark_EN);
				MI_Theme_Cosmos.setText(MessageDB.TITLE_MI_Theme_Cosmos_EN);
				MI_Theme_Chaos.setText(MessageDB.TITLE_MI_Theme_Chaos_EN);
				MI_Theme_Custom.setText(MessageDB.TITLE_MI_Theme_Custom_EN);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_EN);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_EN);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_EN);
				B_Export.setText(MessageDB.TITLE_B_Export_EN);
				B_Save.setText(MessageDB.TITLE_B_Save_EN);
				B_Load.setText(MessageDB.TITLE_B_Load_EN);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_USA_EN);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_EUR_EN);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Region_JPN_EN);
				CB_AutoActivate.setText(MessageDB.TITLE_CB_AutoActivate_EN);

				P_START.setImageItemAt(2, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_EN), 0, 0));
				M_Functions.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_EN));
				M_Idiom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_EN));

				break;
				
			case DE:

				M_Functions.setText(MessageDB.TITLE_M_Functions_DE);
				M_Idiom.setText(MessageDB.TITLE_M_Idiom_DE);
				M_Theme.setText(MessageDB.TITLE_M_Tema_DE);
				M_Audio.setText(MessageDB.TITLE_M_Audio_DE);
				MI_Export.setText(MessageDB.TITLE_MI_Export_DE);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_DE);
				MI_Save.setText(MessageDB.TITLE_MI_Save_DE);
				MI_Load.setText(MessageDB.TITLE_MI_Load_DE);
				MI_Help.setText(MessageDB.TITLE_MI_Help_DE);
				MI_About.setText(MessageDB.TITLE_MI_About_DE);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_DE);
				MI_Theme_Default.setText(MessageDB.TITLE_MI_Theme_Default_DE);
				MI_Theme_Dark.setText(MessageDB.TITLE_MI_Theme_Dark_DE);
				MI_Theme_Cosmos.setText(MessageDB.TITLE_MI_Theme_Cosmos_DE);
				MI_Theme_Chaos.setText(MessageDB.TITLE_MI_Theme_Chaos_DE);
				MI_Theme_Custom.setText(MessageDB.TITLE_MI_Theme_Custom_DE);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_DE);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_DE);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_DE);
				B_Export.setText(MessageDB.TITLE_B_Export_DE);
				B_Save.setText(MessageDB.TITLE_B_Save_DE);
				B_Load.setText(MessageDB.TITLE_B_Load_DE);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_USA_DE);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_EUR_DE);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Region_JPN_DE);
				CB_AutoActivate.setText(MessageDB.TITLE_CB_AutoActivate_DE);

				P_START.setImageItemAt(2, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_DE), 0, 0));
				M_Functions.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_DE));
				M_Idiom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_DE));

				break;
				
			case ES:

				M_Functions.setText(MessageDB.TITLE_M_Functions_ES);
				M_Idiom.setText(MessageDB.TITLE_M_Idiom_ES);
				M_Theme.setText(MessageDB.TITLE_M_Tema_ES);
				M_Audio.setText(MessageDB.TITLE_M_Audio_ES);
				MI_Export.setText(MessageDB.TITLE_MI_Export_ES);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_ES);
				MI_Save.setText(MessageDB.TITLE_MI_Save_ES);
				MI_Load.setText(MessageDB.TITLE_MI_Load_ES);
				MI_Help.setText(MessageDB.TITLE_MI_Help_ES);
				MI_About.setText(MessageDB.TITLE_MI_About_ES);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_ES);
				MI_Theme_Default.setText(MessageDB.TITLE_MI_Theme_Default_ES);
				MI_Theme_Dark.setText(MessageDB.TITLE_MI_Theme_Dark_ES);
				MI_Theme_Cosmos.setText(MessageDB.TITLE_MI_Theme_Cosmos_ES);
				MI_Theme_Chaos.setText(MessageDB.TITLE_MI_Theme_Chaos_ES);
				MI_Theme_Custom.setText(MessageDB.TITLE_MI_Theme_Custom_ES);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_ES);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_ES);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_ES);
				B_Export.setText(MessageDB.TITLE_B_Export_ES);
				B_Save.setText(MessageDB.TITLE_B_Save_ES);
				B_Load.setText(MessageDB.TITLE_B_Load_ES);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_USA_ES);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_EUR_ES);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Region_JPN_ES);
				CB_AutoActivate.setText(MessageDB.TITLE_CB_AutoActivate_ES);
				
				P_START.setImageItemAt(2, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_ES), 0, 0));
				M_Functions.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_ES));
				M_Idiom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_ES));

				break;
				
			case FR:

				M_Functions.setText(MessageDB.TITLE_M_Functions_FR);
				M_Idiom.setText(MessageDB.TITLE_M_Idiom_FR);
				M_Theme.setText(MessageDB.TITLE_M_Tema_FR);
				M_Audio.setText(MessageDB.TITLE_M_Audio_FR);
				MI_Export.setText(MessageDB.TITLE_MI_Export_FR);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_FR);
				MI_Save.setText(MessageDB.TITLE_MI_Save_FR);
				MI_Load.setText(MessageDB.TITLE_MI_Load_FR);
				MI_Help.setText(MessageDB.TITLE_MI_Help_FR);
				MI_About.setText(MessageDB.TITLE_MI_About_FR);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_FR);
				MI_Theme_Default.setText(MessageDB.TITLE_MI_Theme_Default_FR);
				MI_Theme_Dark.setText(MessageDB.TITLE_MI_Theme_Dark_FR);
				MI_Theme_Cosmos.setText(MessageDB.TITLE_MI_Theme_Cosmos_FR);
				MI_Theme_Chaos.setText(MessageDB.TITLE_MI_Theme_Chaos_FR);
				MI_Theme_Custom.setText(MessageDB.TITLE_MI_Theme_Custom_FR);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_FR);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_FR);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_FR);
				B_Export.setText(MessageDB.TITLE_B_Export_FR);
				B_Save.setText(MessageDB.TITLE_B_Save_FR);
				B_Load.setText(MessageDB.TITLE_B_Load_FR);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_USA_FR);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_EUR_FR);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Region_JPN_FR);
				CB_AutoActivate.setText(MessageDB.TITLE_CB_AutoActivate_FR);
				
				P_START.setImageItemAt(2, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_FR), 0, 0));
				M_Functions.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_FR));
				M_Idiom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_FR));

				break;
				
			case IT:

				M_Functions.setText(MessageDB.TITLE_M_Functions_IT);
				M_Idiom.setText(MessageDB.TITLE_M_Idiom_IT);
				M_Theme.setText(MessageDB.TITLE_M_Tema_IT);
				M_Audio.setText(MessageDB.TITLE_M_Audio_IT);
				MI_Export.setText(MessageDB.TITLE_MI_Export_IT);
				MI_Reset.setText(MessageDB.TITLE_MI_Reset_IT);
				MI_Save.setText(MessageDB.TITLE_MI_Save_IT);
				MI_Load.setText(MessageDB.TITLE_MI_Load_IT);
				MI_Help.setText(MessageDB.TITLE_MI_Help_IT);
				MI_About.setText(MessageDB.TITLE_MI_About_IT);
				MI_Exit.setText(MessageDB.TITLE_MI_Exit_IT);
				MI_Theme_Default.setText(MessageDB.TITLE_MI_Theme_Default_IT);
				MI_Theme_Dark.setText(MessageDB.TITLE_MI_Theme_Dark_IT);
				MI_Theme_Cosmos.setText(MessageDB.TITLE_MI_Theme_Cosmos_IT);
				MI_Theme_Chaos.setText(MessageDB.TITLE_MI_Theme_Chaos_IT);
				MI_Theme_Custom.setText(MessageDB.TITLE_MI_Theme_Custom_IT);
				MI_Audio_ON.setText(MessageDB.TITLE_MI_Audio_ON_IT);
				MI_Audio_OFF.setText(MessageDB.TITLE_MI_Audio_OFF_IT);
				TP_TabbedPane.setTitleAt(0, MessageDB.TITLE_TP_0_IT);
				B_Export.setText(MessageDB.TITLE_B_Export_IT);
				B_Save.setText(MessageDB.TITLE_B_Save_IT);
				B_Load.setText(MessageDB.TITLE_B_Load_IT);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_USA_IT);
				CB_Region.addItem(MessageDB.TITLE_CB_Region_EUR_IT);
				//CB_Regiao.addItem(MessageDB.TITLE_CB_Region_JPN_IT);
				CB_AutoActivate.setText(MessageDB.TITLE_CB_AutoActivate_IT);
				
				P_START.setImageItemAt(2, P_START.new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_START_IT), 0, 0));
				M_Functions.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_IT));
				M_Idiom.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_FLAG_IT));

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

		CB_Region.setSelectedIndex(prevCBIndex);
		
		P_START.repaint();

	}

	private void initToolTipsMessages() {

		int tipIndex = 0;
		
		JLabel jLabel = null;
		String message = null;

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_PT; break;
			case EN: message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_EN; break;
			case DE: message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_DE; break;
			case ES: message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_ES; break;
			case FR: message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_FR; break;
			case IT: message = MessageDB.MESSAGE_WARNING_TIP_CHARACTERLIMIT_IT; break;
		}
		
		jLabel = new JLabel(message);
		jLabel.setForeground(new Color(200, 100, 0));
		jLabel.setFont(new Font("Arial", Font.ITALIC, 13));
		jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_WARNING));
		
		BalloonTipStyle baloonStyle = new ModernBalloonStyle(6, 6, new Color(255, 240, 220), Color.WHITE, new Color(200, 100, 0));
		charLimitBalloonTip = new BalloonTip(TF_FF1_ISO1, jLabel, baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 10, 8, false);
		charLimitBalloonTip.setVisible(false);

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_CHECKBOX_IT; break;
		}
		
		for(int i = 0; i < checkBoxAL.size(); i++) {
			jLabel = new JLabel(message);
			jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
			jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
			checkBoxTipAL.get(tipIndex++).setContents(jLabel);
		}

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_SAVE_IT; break;
		}
		
		jLabel = new JLabel(message);
		jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
		jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
		checkBoxTipAL.get(tipIndex++).setContents(jLabel);

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_LOAD_IT; break;
		}
		
		jLabel = new JLabel(message);
		jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
		jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
		checkBoxTipAL.get(tipIndex++).setContents(jLabel);

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_EXPORT_IT; break;
		}
		
		jLabel = new JLabel(message);
		jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
		jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
		checkBoxTipAL.get(tipIndex++).setContents(jLabel);

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_REGION_IT; break;
		}
		
		jLabel = new JLabel(message);
		jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
		jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
		checkBoxTipAL.get(tipIndex++).setContents(jLabel);

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_AUTOACTIVATE_IT; break;
		}
		
		jLabel = new JLabel(message);
		jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
		jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
		checkBoxTipAL.get(tipIndex++).setContents(jLabel);

		switch(DuodecimRenamer.instance.language) {
			case PT: message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_PT; break;
			case EN: message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_EN; break;
			case DE: message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_DE; break;
			case ES: message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_ES; break;
			case FR: message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_FR; break;
			case IT: message = MessageDB.MESSAGE_INFORMATION_TIP_PICPANEL_IT; break;
		}
		
		for(int i = 0; i < 8; i++) {
			jLabel = new JLabel(message);
			jLabel.setFont(new Font("Arial", Font.ITALIC, 11));
			jLabel.setIcon(ResourceManager.loadIconResource(ResourceDB.INDEX_ICON_INFORMATION));
			checkBoxTipAL.get(tipIndex++).setContents(jLabel);
		}

	}

	private void initFields() {

		for(JCheckBox jcb : checkBoxAL) {
			jcb.setSelected(false);
		}
		
		for(BalloonTip bt : checkBoxTipAL) {
			bt.setOpacity(1.0f);
		}

		for(int i = 0; i < textFieldAL.size(); i++) {
			JTextField jtf = textFieldAL.get(i);
			jtf.setFont(new Font("Courier New", Font.PLAIN, 15));
			jtf.setForeground(Color.BLACK);
			jtf.setText(bgmTitleAL.get(i));
			jtf.setEnabled(false);
		}

	}

	private void initArrays() {

		bgmOffsetAL = new ArrayList<>();
		bgmTitleAL = new ArrayList<>();
		checkBoxAL = new ArrayList<>();
		textFieldAL = new ArrayList<>();
		checkBoxTipAL = new ArrayList<>();

		bgmOffsetAL.add(OffsetDB.FF1_ISO_BATTLE);
		bgmOffsetAL.add(OffsetDB.FF1_ISO_DUNGEON);
		bgmOffsetAL.add(OffsetDB.FF1_ISO_CHAOSSHRINE);
		bgmOffsetAL.add(OffsetDB.FF1_ISO_TOWN);
		bgmOffsetAL.add(OffsetDB.FF1_ISO_MTGULG);
		bgmOffsetAL.add(OffsetDB.FF1_DLC_AIRSHIP);
		bgmOffsetAL.add(OffsetDB.FF1_DLC_BATTLE);
		bgmOffsetAL.add(OffsetDB.FF1_DLC_CASTLECORNELIA);
		bgmOffsetAL.add(OffsetDB.FF1_DLC_MENUSCREEN);
		bgmOffsetAL.add(OffsetDB.FF1_DLC_CHAOSSHRINE);
		bgmOffsetAL.add(OffsetDB.FF2_ISO_BATTLETHEME1);
		bgmOffsetAL.add(OffsetDB.FF2_ISO_BATTLETHEME2);
		bgmOffsetAL.add(OffsetDB.FF2_ISO_CASTLEPANDEMONIUM);
		bgmOffsetAL.add(OffsetDB.FF2_ISO_THEREBELARMY);
		bgmOffsetAL.add(OffsetDB.FF2_ISO_THEIMPERIALARMY);
		bgmOffsetAL.add(OffsetDB.FF2_DLC_TOWEROFTHEMAGI);
		bgmOffsetAL.add(OffsetDB.FF2_DLC_THEPRINCESSSSEDUCTION);
		bgmOffsetAL.add(OffsetDB.FF2_DLC_REVIVAL);
		bgmOffsetAL.add(OffsetDB.FF3_ISO_BATTLE1);
		bgmOffsetAL.add(OffsetDB.FF3_ISO_BATTLE2);
		bgmOffsetAL.add(OffsetDB.FF3_ISO_THISISTHELASTBATTLE);
		bgmOffsetAL.add(OffsetDB.FF3_ISO_THECRYSTALTOWER);
		bgmOffsetAL.add(OffsetDB.FF3_ISO_LETMEKNOWTHETHRUTH);
		bgmOffsetAL.add(OffsetDB.FF3_DLC_THEBOUNDLESSOCEAN);
		bgmOffsetAL.add(OffsetDB.FF3_DLC_GOODOLFELLOWS);
		bgmOffsetAL.add(OffsetDB.FF3_DLC_FORBIDDENLAND);
		bgmOffsetAL.add(OffsetDB.FF4_ISO_BATTLE1);
		bgmOffsetAL.add(OffsetDB.FF4_ISO_BATTLE2);
		bgmOffsetAL.add(OffsetDB.FF4_ISO_BATTLEWITHTHEFOURFIENDS);
		bgmOffsetAL.add(OffsetDB.FF4_ISO_THEREDWINGS);
		bgmOffsetAL.add(OffsetDB.FF4_ISO_THEMEOFLOVE);
		bgmOffsetAL.add(OffsetDB.FF4_DLC_GOLBEZCLADINDARKNESS);
		bgmOffsetAL.add(OffsetDB.FF4_DLC_WITHINTHEGIANT);
		bgmOffsetAL.add(OffsetDB.FF4_DLC_THEFINALBATTLE);
		bgmOffsetAL.add(OffsetDB.FF5_ISO_BATTLE1);
		bgmOffsetAL.add(OffsetDB.FF5_ISO_BATTLEATTHEBIGBRIDGE);
		bgmOffsetAL.add(OffsetDB.FF5_ISO_THEFINALBATTLE);
		bgmOffsetAL.add(OffsetDB.FF5_ISO_THEDECISIVEBATTLE);
		bgmOffsetAL.add(OffsetDB.FF5_ISO_HOMESWEETHOME);
		bgmOffsetAL.add(OffsetDB.FF5_DLC_BATTLE2);
		bgmOffsetAL.add(OffsetDB.FF5_DLC_THEEVILLORDXDEATH);
		bgmOffsetAL.add(OffsetDB.FF5_DLC_THEDAWNWARRIORS);
		bgmOffsetAL.add(OffsetDB.FF6_ISO_BATTLE);
		bgmOffsetAL.add(OffsetDB.FF6_ISO_THEDECISIVEBATTLE);
		bgmOffsetAL.add(OffsetDB.FF6_ISO_BATTLETOTHEDEATH);
		bgmOffsetAL.add(OffsetDB.FF6_ISO_DANCINGMAD);
		bgmOffsetAL.add(OffsetDB.FF6_ISO_SEARCHINGFORFRIENDS);
		bgmOffsetAL.add(OffsetDB.FF6_DLC_PHANTOMTRAIN);
		bgmOffsetAL.add(OffsetDB.FF6_DLC_PROTECTTHEESPERS);
		bgmOffsetAL.add(OffsetDB.FF6_DLC_MAGITEKRESEARCHFACILITY);
		bgmOffsetAL.add(OffsetDB.FF7_ISO_FIGHTON);
		bgmOffsetAL.add(OffsetDB.FF7_ISO_JENOVA);
		bgmOffsetAL.add(OffsetDB.FF7_ISO_ONEWINGEDANGEL);
		bgmOffsetAL.add(OffsetDB.FF7_ISO_OPENINGBOMBINGMISSION);
		bgmOffsetAL.add(OffsetDB.FF7_ISO_LETTHEBATTLESBEGIN);
		bgmOffsetAL.add(OffsetDB.FF7_DLC_THECHASE);
		bgmOffsetAL.add(OffsetDB.FF7_DLC_ELETRICDECHOCOBO);
		bgmOffsetAL.add(OffsetDB.FF7_DLC_BIRTHOFAGOD);
		bgmOffsetAL.add(OffsetDB.FF8_ISO_DONTBEAFRAID);
		bgmOffsetAL.add(OffsetDB.FF8_ISO_FORCEYOURWAY);
		bgmOffsetAL.add(OffsetDB.FF8_ISO_THEEXTREME);
		bgmOffsetAL.add(OffsetDB.FF8_ISO_THEMANWITHTHEMACHINEGUN);
		bgmOffsetAL.add(OffsetDB.FF8_ISO_PREMONITION);
		bgmOffsetAL.add(OffsetDB.FF8_DLC_LIBERIFATALI);
		bgmOffsetAL.add(OffsetDB.FF8_DLC_THELANDING);
		bgmOffsetAL.add(OffsetDB.FF8_DLC_SHUFFLEORBOOGIE);
		bgmOffsetAL.add(OffsetDB.FF9_ISO_BATTLE1);
		bgmOffsetAL.add(OffsetDB.FF9_ISO_BATTLE2);
		bgmOffsetAL.add(OffsetDB.FF9_ISO_THEFINALBATTLE);
		bgmOffsetAL.add(OffsetDB.FF9_ISO_THEDARKNESSOFETERNITY);
		bgmOffsetAL.add(OffsetDB.FF9_ISO_NOTALONE);
		bgmOffsetAL.add(OffsetDB.FF9_DLC_SWORDSOFFURY);
		bgmOffsetAL.add(OffsetDB.FF9_DLC_FESTIVALOFTHEHUNT);
		bgmOffsetAL.add(OffsetDB.FF9_DLC_ROSESOFMAY);
		bgmOffsetAL.add(OffsetDB.FF10_ISO_BATTLETHEME);
		bgmOffsetAL.add(OffsetDB.FF10_ISO_OTHERWORLD);
		bgmOffsetAL.add(OffsetDB.FF10_ISO_SUMMONEDMONSTERBATTLE);
		bgmOffsetAL.add(OffsetDB.FF10_ISO_FIGHTWITHSEYMOUR);
		bgmOffsetAL.add(OffsetDB.FF10_ISO_AFLEETINGDREAM);
		bgmOffsetAL.add(OffsetDB.FF10_DLC_ENEMYATTACK);
		bgmOffsetAL.add(OffsetDB.FF10_DLC_ASSAULT);
		bgmOffsetAL.add(OffsetDB.FF10_DLC_FINALBATTLE);
		bgmOffsetAL.add(OffsetDB.FF11_ISO_BATTLEINTHEDUNGEON2);
		bgmOffsetAL.add(OffsetDB.FF11_ISO_AREALMOFEMPTINESS);
		bgmOffsetAL.add(OffsetDB.FF11_ISO_AWAKENING);
		bgmOffsetAL.add(OffsetDB.FF11_ISO_IRONCOLOSSUS);
		bgmOffsetAL.add(OffsetDB.FF11_DLC_VANADIELMARCH);
		bgmOffsetAL.add(OffsetDB.FF11_DLC_RAGNAROK);
		bgmOffsetAL.add(OffsetDB.FF11_DLC_FIGHTERSOFTHECRYSTAL);
		bgmOffsetAL.add(OffsetDB.FF12_ISO_BOSSBATTLE);
		bgmOffsetAL.add(OffsetDB.FF12_ISO_ESPERBATTLE);
		bgmOffsetAL.add(OffsetDB.FF12_ISO_FIGHTTOTHEDEATH);
		bgmOffsetAL.add(OffsetDB.FF12_ISO_THEBATTLEFORFREEDOM);
		bgmOffsetAL.add(OffsetDB.FF12_DLC_FLASHOFSTEEL);
		bgmOffsetAL.add(OffsetDB.FF12_DLC_DISCORD);
		bgmOffsetAL.add(OffsetDB.FF12_DLC_RESPITE);
		bgmOffsetAL.add(OffsetDB.FF13_ISO_BLINDEDBYLIGHT);
		bgmOffsetAL.add(OffsetDB.FF13_ISO_SABERSEDGE);
		bgmOffsetAL.add(OffsetDB.FF13_ISO_NASCENTREQUIEM);
		bgmOffsetAL.add(OffsetDB.FF13_DLC_DUSTTODUST);
		bgmOffsetAL.add(OffsetDB.FF13_DLC_EIDOLONS);
		bgmOffsetAL.add(OffsetDB.FF13_DLC_FIGHTINGFATE);
		bgmOffsetAL.add(OffsetDB.FF13_DLC_CHOCOBOSOFCOCOON);
		bgmOffsetAL.add(OffsetDB.FF13_DLC_EDENUNDERSIEGE);
		bgmOffsetAL.add(OffsetDB.DDFF_ISO_COSMOS);
		bgmOffsetAL.add(OffsetDB.DDFF_ISO_CHAOSLASTBATTLE1);
		bgmOffsetAL.add(OffsetDB.DDFF_ISO_CHAOSLASTBATTLE2);
		bgmOffsetAL.add(OffsetDB.DDFF_ISO_CHAOSLASTBATTLE3);
		bgmOffsetAL.add(OffsetDB.DDFF_ISO_CANTATAMORTISGODINFIRE);
		bgmOffsetAL.add(OffsetDB.DDFF_ISO_OPENING);

		bgmTitleAL.add(SongTitleDB.FF1_ISO_BATTLE);
		bgmTitleAL.add(SongTitleDB.FF1_ISO_DUNGEON);
		bgmTitleAL.add(SongTitleDB.FF1_ISO_CHAOSSHRINE);
		bgmTitleAL.add(SongTitleDB.FF1_ISO_TOWN);
		bgmTitleAL.add(SongTitleDB.FF1_ISO_MTGULG);
		bgmTitleAL.add(SongTitleDB.FF1_DLC_AIRSHIP);
		bgmTitleAL.add(SongTitleDB.FF1_DLC_BATTLE);
		bgmTitleAL.add(SongTitleDB.FF1_DLC_CASTLECORNELIA);
		bgmTitleAL.add(SongTitleDB.FF1_DLC_MENUSCREEN);
		bgmTitleAL.add(SongTitleDB.FF1_DLC_CHAOSSHRINE);
		bgmTitleAL.add(SongTitleDB.FF2_ISO_BATTLETHEME1);
		bgmTitleAL.add(SongTitleDB.FF2_ISO_BATTLETHEME2);
		bgmTitleAL.add(SongTitleDB.FF2_ISO_CASTLEPANDEMONIUM);
		bgmTitleAL.add(SongTitleDB.FF2_ISO_THEREBELARMY);
		bgmTitleAL.add(SongTitleDB.FF2_ISO_THEIMPERIALARMY);
		bgmTitleAL.add(SongTitleDB.FF2_DLC_TOWEROFTHEMAGI);
		bgmTitleAL.add(SongTitleDB.FF2_DLC_THEPRINCESSSSEDUCTION);
		bgmTitleAL.add(SongTitleDB.FF2_DLC_REVIVAL);
		bgmTitleAL.add(SongTitleDB.FF3_ISO_BATTLE1);
		bgmTitleAL.add(SongTitleDB.FF3_ISO_BATTLE2);
		bgmTitleAL.add(SongTitleDB.FF3_ISO_THISISTHELASTBATTLE);
		bgmTitleAL.add(SongTitleDB.FF3_ISO_THECRYSTALTOWER);
		bgmTitleAL.add(SongTitleDB.FF3_ISO_LETMEKNOWTHETHRUTH);
		bgmTitleAL.add(SongTitleDB.FF3_DLC_THEBOUNDLESSOCEAN);
		bgmTitleAL.add(SongTitleDB.FF3_DLC_GOODOLFELLOWS);
		bgmTitleAL.add(SongTitleDB.FF3_DLC_FORBIDDENLAND);
		bgmTitleAL.add(SongTitleDB.FF4_ISO_BATTLE1);
		bgmTitleAL.add(SongTitleDB.FF4_ISO_BATTLE2);
		bgmTitleAL.add(SongTitleDB.FF4_ISO_BATTLEWITHTHEFOURFIENDS);
		bgmTitleAL.add(SongTitleDB.FF4_ISO_THEREDWINGS);
		bgmTitleAL.add(SongTitleDB.FF4_ISO_THEMEOFLOVE);
		bgmTitleAL.add(SongTitleDB.FF4_DLC_GOLBEZCLADINDARKNESS);
		bgmTitleAL.add(SongTitleDB.FF4_DLC_WITHINTHEGIANT);
		bgmTitleAL.add(SongTitleDB.FF4_DLC_THEFINALBATTLE);
		bgmTitleAL.add(SongTitleDB.FF5_ISO_BATTLE1);
		bgmTitleAL.add(SongTitleDB.FF5_ISO_BATTLEATTHEBIGBRIDGE);
		bgmTitleAL.add(SongTitleDB.FF5_ISO_THEFINALBATTLE);
		bgmTitleAL.add(SongTitleDB.FF5_ISO_THEDECISIVEBATTLE);
		bgmTitleAL.add(SongTitleDB.FF5_ISO_HOMESWEETHOME);
		bgmTitleAL.add(SongTitleDB.FF5_DLC_BATTLE2);
		bgmTitleAL.add(SongTitleDB.FF5_DLC_THEEVILLORDXDEATH);
		bgmTitleAL.add(SongTitleDB.FF5_DLC_THEDAWNWARRIORS);
		bgmTitleAL.add(SongTitleDB.FF6_ISO_BATTLE);
		bgmTitleAL.add(SongTitleDB.FF6_ISO_THEDECISIVEBATTLE);
		bgmTitleAL.add(SongTitleDB.FF6_ISO_BATTLETOTHEDEATH);
		bgmTitleAL.add(SongTitleDB.FF6_ISO_DANCINGMAD);
		bgmTitleAL.add(SongTitleDB.FF6_ISO_SEARCHINGFORFRIENDS);
		bgmTitleAL.add(SongTitleDB.FF6_DLC_PHANTOMTRAIN);
		bgmTitleAL.add(SongTitleDB.FF6_DLC_PROTECTTHEESPERS);
		bgmTitleAL.add(SongTitleDB.FF6_DLC_MAGITEKRESEARCHFACILITY);
		bgmTitleAL.add(SongTitleDB.FF7_ISO_FIGHTON);
		bgmTitleAL.add(SongTitleDB.FF7_ISO_JENOVA);
		bgmTitleAL.add(SongTitleDB.FF7_ISO_ONEWINGEDANGEL);
		bgmTitleAL.add(SongTitleDB.FF7_ISO_OPENINGBOMBINGMISSION);
		bgmTitleAL.add(SongTitleDB.FF7_ISO_LETTHEBATTLESBEGIN);
		bgmTitleAL.add(SongTitleDB.FF7_DLC_THECHASE);
		bgmTitleAL.add(SongTitleDB.FF7_DLC_ELETRICDECHOCOBO);
		bgmTitleAL.add(SongTitleDB.FF7_DLC_BIRTHOFAGOD);
		bgmTitleAL.add(SongTitleDB.FF8_ISO_DONTBEAFRAID);
		bgmTitleAL.add(SongTitleDB.FF8_ISO_FORCEYOURWAY);
		bgmTitleAL.add(SongTitleDB.FF8_ISO_THEEXTREME);
		bgmTitleAL.add(SongTitleDB.FF8_ISO_THEMANWITHTHEMACHINEGUN);
		bgmTitleAL.add(SongTitleDB.FF8_ISO_PREMONITION);
		bgmTitleAL.add(SongTitleDB.FF8_DLC_LIBERIFATALI);
		bgmTitleAL.add(SongTitleDB.FF8_DLC_THELANDING);
		bgmTitleAL.add(SongTitleDB.FF8_DLC_SHUFFLEORBOOGIE);
		bgmTitleAL.add(SongTitleDB.FF9_ISO_BATTLE1);
		bgmTitleAL.add(SongTitleDB.FF9_ISO_BATTLE2);
		bgmTitleAL.add(SongTitleDB.FF9_ISO_THEFINALBATTLE);
		bgmTitleAL.add(SongTitleDB.FF9_ISO_THEDARKNESSOFETERNITY);
		bgmTitleAL.add(SongTitleDB.FF9_ISO_NOTALONE);
		bgmTitleAL.add(SongTitleDB.FF9_DLC_SWORDSOFFURY);
		bgmTitleAL.add(SongTitleDB.FF9_DLC_FESTIVALOFTHEHUNT);
		bgmTitleAL.add(SongTitleDB.FF9_DLC_ROSESOFMAY);
		bgmTitleAL.add(SongTitleDB.FF10_ISO_BATTLETHEME);
		bgmTitleAL.add(SongTitleDB.FF10_ISO_OTHERWORLD);
		bgmTitleAL.add(SongTitleDB.FF10_ISO_SUMMONEDMONSTERBATTLE);
		bgmTitleAL.add(SongTitleDB.FF10_ISO_FIGHTWITHSEYMOUR);
		bgmTitleAL.add(SongTitleDB.FF10_ISO_AFLEETINGDREAM);
		bgmTitleAL.add(SongTitleDB.FF10_DLC_ENEMYATTACK);
		bgmTitleAL.add(SongTitleDB.FF10_DLC_ASSAULT);
		bgmTitleAL.add(SongTitleDB.FF10_DLC_FINALBATTLE);
		bgmTitleAL.add(SongTitleDB.FF11_ISO_BATTLEINTHEDUNGEON2);
		bgmTitleAL.add(SongTitleDB.FF11_ISO_AREALMOFEMPTINESS);
		bgmTitleAL.add(SongTitleDB.FF11_ISO_AWAKENING);
		bgmTitleAL.add(SongTitleDB.FF11_ISO_IRONCOLOSSUS);
		bgmTitleAL.add(SongTitleDB.FF11_DLC_VANADIELMARCH);
		bgmTitleAL.add(SongTitleDB.FF11_DLC_RAGNAROK);
		bgmTitleAL.add(SongTitleDB.FF11_DLC_FIGHTERSOFTHECRYSTAL);
		bgmTitleAL.add(SongTitleDB.FF12_ISO_BOSSBATTLE);
		bgmTitleAL.add(SongTitleDB.FF12_ISO_ESPERBATTLE);
		bgmTitleAL.add(SongTitleDB.FF12_ISO_FIGHTTOTHEDEATH);
		bgmTitleAL.add(SongTitleDB.FF12_ISO_THEBATTLEFORFREEDOM);
		bgmTitleAL.add(SongTitleDB.FF12_DLC_FLASHOFSTEEL);
		bgmTitleAL.add(SongTitleDB.FF12_DLC_DISCORD);
		bgmTitleAL.add(SongTitleDB.FF12_DLC_RESPITE);
		bgmTitleAL.add(SongTitleDB.FF13_ISO_BLINDEDBYLIGHT);
		bgmTitleAL.add(SongTitleDB.FF13_ISO_SABERSEDGE);
		bgmTitleAL.add(SongTitleDB.FF13_ISO_NASCENTREQUIEM);
		bgmTitleAL.add(SongTitleDB.FF13_DLC_DUSTTODUST);
		bgmTitleAL.add(SongTitleDB.FF13_DLC_EIDOLONS);
		bgmTitleAL.add(SongTitleDB.FF13_DLC_FIGHTINGFATE);
		bgmTitleAL.add(SongTitleDB.FF13_DLC_CHOCOBOSOFCOCOON);
		bgmTitleAL.add(SongTitleDB.FF13_DLC_EDENUNDERSIEGE);
		bgmTitleAL.add(SongTitleDB.DDFF_ISO_COSMOS);
		bgmTitleAL.add(SongTitleDB.DDFF_ISO_CHAOSLASTBATTLE1);
		bgmTitleAL.add(SongTitleDB.DDFF_ISO_CHAOSLASTBATTLE2);
		bgmTitleAL.add(SongTitleDB.DDFF_ISO_CHAOSLASTBATTLE3);
		bgmTitleAL.add(SongTitleDB.DDFF_ISO_CANTATAMORTISGODINFIRE);
		bgmTitleAL.add(SongTitleDB.DDFF_ISO_OPENING);

		checkBoxAL.add(CB_FF1_ISO1);
		checkBoxAL.add(CB_FF1_ISO2);
		checkBoxAL.add(CB_FF1_ISO3);
		checkBoxAL.add(CB_FF1_ISO4);
		checkBoxAL.add(CB_FF1_ISO5);
		checkBoxAL.add(CB_FF1_DLC1);
		checkBoxAL.add(CB_FF1_DLC2);
		checkBoxAL.add(CB_FF1_DLC3);
		checkBoxAL.add(CB_FF1_DLC4);
		checkBoxAL.add(CB_FF1_DLC5);
		checkBoxAL.add(CB_FF2_ISO1);
		checkBoxAL.add(CB_FF2_ISO2);
		checkBoxAL.add(CB_FF2_ISO3);
		checkBoxAL.add(CB_FF2_ISO4);
		checkBoxAL.add(CB_FF2_ISO5);
		checkBoxAL.add(CB_FF2_DLC1);
		checkBoxAL.add(CB_FF2_DLC2);
		checkBoxAL.add(CB_FF2_DLC3);
		checkBoxAL.add(CB_FF3_ISO1);
		checkBoxAL.add(CB_FF3_ISO2);
		checkBoxAL.add(CB_FF3_ISO3);
		checkBoxAL.add(CB_FF3_ISO4);
		checkBoxAL.add(CB_FF3_ISO5);
		checkBoxAL.add(CB_FF3_DLC1);
		checkBoxAL.add(CB_FF3_DLC2);
		checkBoxAL.add(CB_FF3_DLC3);
		checkBoxAL.add(CB_FF4_ISO1);
		checkBoxAL.add(CB_FF4_ISO2);
		checkBoxAL.add(CB_FF4_ISO3);
		checkBoxAL.add(CB_FF4_ISO4);
		checkBoxAL.add(CB_FF4_ISO5);
		checkBoxAL.add(CB_FF4_DLC1);
		checkBoxAL.add(CB_FF4_DLC2);
		checkBoxAL.add(CB_FF4_DLC3);
		checkBoxAL.add(CB_FF5_ISO1);
		checkBoxAL.add(CB_FF5_ISO2);
		checkBoxAL.add(CB_FF5_ISO3);
		checkBoxAL.add(CB_FF5_ISO4);
		checkBoxAL.add(CB_FF5_ISO5);
		checkBoxAL.add(CB_FF5_DLC1);
		checkBoxAL.add(CB_FF5_DLC2);
		checkBoxAL.add(CB_FF5_DLC3);
		checkBoxAL.add(CB_FF6_ISO1);
		checkBoxAL.add(CB_FF6_ISO2);
		checkBoxAL.add(CB_FF6_ISO3);
		checkBoxAL.add(CB_FF6_ISO4);
		checkBoxAL.add(CB_FF6_ISO5);
		checkBoxAL.add(CB_FF6_DLC1);
		checkBoxAL.add(CB_FF6_DLC2);
		checkBoxAL.add(CB_FF6_DLC3);
		checkBoxAL.add(CB_FF7_ISO1);
		checkBoxAL.add(CB_FF7_ISO2);
		checkBoxAL.add(CB_FF7_ISO3);
		checkBoxAL.add(CB_FF7_ISO4);
		checkBoxAL.add(CB_FF7_ISO5);
		checkBoxAL.add(CB_FF7_DLC1);
		checkBoxAL.add(CB_FF7_DLC2);
		checkBoxAL.add(CB_FF7_DLC3);
		checkBoxAL.add(CB_FF8_ISO1);
		checkBoxAL.add(CB_FF8_ISO2);
		checkBoxAL.add(CB_FF8_ISO3);
		checkBoxAL.add(CB_FF8_ISO4);
		checkBoxAL.add(CB_FF8_ISO5);
		checkBoxAL.add(CB_FF8_DLC1);
		checkBoxAL.add(CB_FF8_DLC2);
		checkBoxAL.add(CB_FF8_DLC3);
		checkBoxAL.add(CB_FF9_ISO1);
		checkBoxAL.add(CB_FF9_ISO2);
		checkBoxAL.add(CB_FF9_ISO3);
		checkBoxAL.add(CB_FF9_ISO4);
		checkBoxAL.add(CB_FF9_ISO5);
		checkBoxAL.add(CB_FF9_DLC1);
		checkBoxAL.add(CB_FF9_DLC2);
		checkBoxAL.add(CB_FF9_DLC3);
		checkBoxAL.add(CB_FF10_ISO1);
		checkBoxAL.add(CB_FF10_ISO2);
		checkBoxAL.add(CB_FF10_ISO3);
		checkBoxAL.add(CB_FF10_ISO4);
		checkBoxAL.add(CB_FF10_ISO5);
		checkBoxAL.add(CB_FF10_DLC1);
		checkBoxAL.add(CB_FF10_DLC2);
		checkBoxAL.add(CB_FF10_DLC3);
		checkBoxAL.add(CB_FF11_ISO1);
		checkBoxAL.add(CB_FF11_ISO2);
		checkBoxAL.add(CB_FF11_ISO3);
		checkBoxAL.add(CB_FF11_ISO4);
		checkBoxAL.add(CB_FF11_DLC1);
		checkBoxAL.add(CB_FF11_DLC2);
		checkBoxAL.add(CB_FF11_DLC3);
		checkBoxAL.add(CB_FF12_ISO1);
		checkBoxAL.add(CB_FF12_ISO2);
		checkBoxAL.add(CB_FF12_ISO3);
		checkBoxAL.add(CB_FF12_ISO4);
		checkBoxAL.add(CB_FF12_DLC1);
		checkBoxAL.add(CB_FF12_DLC2);
		checkBoxAL.add(CB_FF12_DLC3);
		checkBoxAL.add(CB_FF13_ISO1);
		checkBoxAL.add(CB_FF13_ISO2);
		checkBoxAL.add(CB_FF13_ISO3);
		checkBoxAL.add(CB_FF13_DLC1);
		checkBoxAL.add(CB_FF13_DLC2);
		checkBoxAL.add(CB_FF13_DLC3);
		checkBoxAL.add(CB_FF13_DLC4);
		checkBoxAL.add(CB_FF13_DLC5);
		checkBoxAL.add(CB_DDFF_ISO1);
		checkBoxAL.add(CB_DDFF_ISO2);
		checkBoxAL.add(CB_DDFF_ISO3);
		checkBoxAL.add(CB_DDFF_ISO4);
		checkBoxAL.add(CB_DDFF_ISO5);
		checkBoxAL.add(CB_DDFF_ISO6);

		textFieldAL.add(TF_FF1_ISO1);
		textFieldAL.add(TF_FF1_ISO2);
		textFieldAL.add(TF_FF1_ISO3);
		textFieldAL.add(TF_FF1_ISO4);
		textFieldAL.add(TF_FF1_ISO5);
		textFieldAL.add(TF_FF1_DLC1);
		textFieldAL.add(TF_FF1_DLC2);
		textFieldAL.add(TF_FF1_DLC3);
		textFieldAL.add(TF_FF1_DLC4);
		textFieldAL.add(TF_FF1_DLC5);
		textFieldAL.add(TF_FF2_ISO1);
		textFieldAL.add(TF_FF2_ISO2);
		textFieldAL.add(TF_FF2_ISO3);
		textFieldAL.add(TF_FF2_ISO4);
		textFieldAL.add(TF_FF2_ISO5);
		textFieldAL.add(TF_FF2_DLC1);
		textFieldAL.add(TF_FF2_DLC2);
		textFieldAL.add(TF_FF2_DLC3);
		textFieldAL.add(TF_FF3_ISO1);
		textFieldAL.add(TF_FF3_ISO2);
		textFieldAL.add(TF_FF3_ISO3);
		textFieldAL.add(TF_FF3_ISO4);
		textFieldAL.add(TF_FF3_ISO5);
		textFieldAL.add(TF_FF3_DLC1);
		textFieldAL.add(TF_FF3_DLC2);
		textFieldAL.add(TF_FF3_DLC3);
		textFieldAL.add(TF_FF4_ISO1);
		textFieldAL.add(TF_FF4_ISO2);
		textFieldAL.add(TF_FF4_ISO3);
		textFieldAL.add(TF_FF4_ISO4);
		textFieldAL.add(TF_FF4_ISO5);
		textFieldAL.add(TF_FF4_DLC1);
		textFieldAL.add(TF_FF4_DLC2);
		textFieldAL.add(TF_FF4_DLC3);
		textFieldAL.add(TF_FF5_ISO1);
		textFieldAL.add(TF_FF5_ISO2);
		textFieldAL.add(TF_FF5_ISO3);
		textFieldAL.add(TF_FF5_ISO4);
		textFieldAL.add(TF_FF5_ISO5);
		textFieldAL.add(TF_FF5_DLC1);
		textFieldAL.add(TF_FF5_DLC2);
		textFieldAL.add(TF_FF5_DLC3);
		textFieldAL.add(TF_FF6_ISO1);
		textFieldAL.add(TF_FF6_ISO2);
		textFieldAL.add(TF_FF6_ISO3);
		textFieldAL.add(TF_FF6_ISO4);
		textFieldAL.add(TF_FF6_ISO5);
		textFieldAL.add(TF_FF6_DLC1);
		textFieldAL.add(TF_FF6_DLC2);
		textFieldAL.add(TF_FF6_DLC3);
		textFieldAL.add(TF_FF7_ISO1);
		textFieldAL.add(TF_FF7_ISO2);
		textFieldAL.add(TF_FF7_ISO3);
		textFieldAL.add(TF_FF7_ISO4);
		textFieldAL.add(TF_FF7_ISO5);
		textFieldAL.add(TF_FF7_DLC1);
		textFieldAL.add(TF_FF7_DLC2);
		textFieldAL.add(TF_FF7_DLC3);
		textFieldAL.add(TF_FF8_ISO1);
		textFieldAL.add(TF_FF8_ISO2);
		textFieldAL.add(TF_FF8_ISO3);
		textFieldAL.add(TF_FF8_ISO4);
		textFieldAL.add(TF_FF8_ISO5);
		textFieldAL.add(TF_FF8_DLC1);
		textFieldAL.add(TF_FF8_DLC2);
		textFieldAL.add(TF_FF8_DLC3);
		textFieldAL.add(TF_FF9_ISO1);
		textFieldAL.add(TF_FF9_ISO2);
		textFieldAL.add(TF_FF9_ISO3);
		textFieldAL.add(TF_FF9_ISO4);
		textFieldAL.add(TF_FF9_ISO5);
		textFieldAL.add(TF_FF9_DLC1);
		textFieldAL.add(TF_FF9_DLC2);
		textFieldAL.add(TF_FF9_DLC3);
		textFieldAL.add(TF_FF10_ISO1);
		textFieldAL.add(TF_FF10_ISO2);
		textFieldAL.add(TF_FF10_ISO3);
		textFieldAL.add(TF_FF10_ISO4);
		textFieldAL.add(TF_FF10_ISO5);
		textFieldAL.add(TF_FF10_DLC1);
		textFieldAL.add(TF_FF10_DLC2);
		textFieldAL.add(TF_FF10_DLC3);
		textFieldAL.add(TF_FF11_ISO1);
		textFieldAL.add(TF_FF11_ISO2);
		textFieldAL.add(TF_FF11_ISO3);
		textFieldAL.add(TF_FF11_ISO4);
		textFieldAL.add(TF_FF11_DLC1);
		textFieldAL.add(TF_FF11_DLC2);
		textFieldAL.add(TF_FF11_DLC3);
		textFieldAL.add(TF_FF12_ISO1);
		textFieldAL.add(TF_FF12_ISO2);
		textFieldAL.add(TF_FF12_ISO3);
		textFieldAL.add(TF_FF12_ISO4);
		textFieldAL.add(TF_FF12_DLC1);
		textFieldAL.add(TF_FF12_DLC2);
		textFieldAL.add(TF_FF12_DLC3);
		textFieldAL.add(TF_FF13_ISO1);
		textFieldAL.add(TF_FF13_ISO2);
		textFieldAL.add(TF_FF13_ISO3);
		textFieldAL.add(TF_FF13_DLC1);
		textFieldAL.add(TF_FF13_DLC2);
		textFieldAL.add(TF_FF13_DLC3);
		textFieldAL.add(TF_FF13_DLC4);
		textFieldAL.add(TF_FF13_DLC5);
		textFieldAL.add(TF_DDFF_ISO1);
		textFieldAL.add(TF_DDFF_ISO2);
		textFieldAL.add(TF_DDFF_ISO3);
		textFieldAL.add(TF_DDFF_ISO4);
		textFieldAL.add(TF_DDFF_ISO5);
		textFieldAL.add(TF_DDFF_ISO6);

		BalloonTip balloonTip;
		BalloonTipStyle baloonStyle;

		baloonStyle = new ToolTipBalloonStyle(new Color(230, 240, 220), Color.BLACK);

		for(JCheckBox jcb : checkBoxAL) {
			balloonTip = new BalloonTip(jcb, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
			ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
			checkBoxTipAL.add(balloonTip);
		}

		balloonTip = new BalloonTip(B_Save, new JLabel(), baloonStyle, Orientation.RIGHT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(B_Load, new JLabel(), baloonStyle, Orientation.RIGHT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(B_Export, new JLabel(), baloonStyle, Orientation.RIGHT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(CB_Region, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(CB_AutoActivate, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.ALIGNED, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF1_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF2_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF4_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF7_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF10_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF12_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_FF13_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

		balloonTip = new BalloonTip(P_DDFF_PIC, new JLabel(), baloonStyle, Orientation.LEFT_ABOVE, AttachLocation.CENTER, 0, 0, false);
		ToolTipUtils.balloonToToolTip(balloonTip, 500, 10000);
		checkBoxTipAL.add(balloonTip);

	}

}
