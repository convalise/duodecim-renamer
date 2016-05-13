
package com.convalise.duodecimrenamer.ui;

import com.convalise.duodecimrenamer.database.MessageDB;
import com.convalise.duodecimrenamer.database.ResourceDB;
import com.convalise.duodecimrenamer.engine.MediaPlayer;
import com.convalise.duodecimrenamer.engine.ResourceManager;
import com.convalise.lib.ImagePanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.SwingConstants;

public class AboutPanel extends ImagePanel {

	public AboutPanel() {

		initComponents();
		initComponentsCustomization();

	}

	public void setLanguage(MessageDB.Language language) {

		int picIndex = -1;
		
		switch(language) {
			case PT: picIndex = ResourceDB.INDEX_PIC_ABOUT_PT; break;
			case EN: picIndex = ResourceDB.INDEX_PIC_ABOUT_EN; break;
			case DE: picIndex = ResourceDB.INDEX_PIC_ABOUT_DE; break;
			case ES: picIndex = ResourceDB.INDEX_PIC_ABOUT_ES; break;
			case FR: picIndex = ResourceDB.INDEX_PIC_ABOUT_FR; break;
			case IT: picIndex = ResourceDB.INDEX_PIC_ABOUT_IT; break;
		}

		if(picIndex != -1) {
			super.setImageItemAt(1, new ImageItem(ResourceManager.loadImageResource(picIndex), 0, 0));
		}
		
		repaint();

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Credit_conrado = new javax.swing.JLabel();
        L_Credit_eldi = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 360));

        L_Credit_conrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Credit_conrado.setText("L_Credit_conrado");
        L_Credit_conrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Credit_conradoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_Credit_conradoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_Credit_conradoMouseExited(evt);
            }
        });

        L_Credit_eldi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Credit_eldi.setText("L_Credit_eldi");
        L_Credit_eldi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Credit_eldiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_Credit_eldiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_Credit_eldiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_Credit_eldi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Credit_conrado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(L_Credit_conrado)
                .addGap(71, 71, 71)
                .addComponent(L_Credit_eldi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void L_Credit_conradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_conradoMouseClicked
		try {
			Desktop.getDesktop().browse(new URI("https://github.com/convalise"));
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_STAIRS);
		}
		catch(URISyntaxException | IOException ex) {
			ex.printStackTrace(System.err);
		}
	}//GEN-LAST:event_L_Credit_conradoMouseClicked

	private void L_Credit_conradoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_conradoMouseEntered
		L_Credit_conrado.setCursor(new Cursor(Cursor.HAND_CURSOR));
		L_Credit_conrado.setForeground(Color.ORANGE);
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE_2);
	}//GEN-LAST:event_L_Credit_conradoMouseEntered

	private void L_Credit_conradoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_conradoMouseExited
		L_Credit_conrado.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		L_Credit_conrado.setForeground(Color.WHITE);
	}//GEN-LAST:event_L_Credit_conradoMouseExited

	private void L_Credit_eldiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_eldiMouseClicked
		try {
			Desktop.getDesktop().browse(new URI("http://eldi13.deviantart.com/"));
			MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_STAIRS);
		}
		catch(URISyntaxException | IOException ex) {
			ex.printStackTrace(System.err);
		}
	}//GEN-LAST:event_L_Credit_eldiMouseClicked

	private void L_Credit_eldiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_eldiMouseEntered
		L_Credit_eldi.setCursor(new Cursor(Cursor.HAND_CURSOR));
		L_Credit_eldi.setForeground(Color.MAGENTA);
		MediaPlayer.playCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE_2);
	}//GEN-LAST:event_L_Credit_eldiMouseEntered

	private void L_Credit_eldiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_eldiMouseExited
		L_Credit_eldi.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		L_Credit_eldi.setForeground(Color.WHITE);
	}//GEN-LAST:event_L_Credit_eldiMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Credit_conrado;
    private javax.swing.JLabel L_Credit_eldi;
    // End of variables declaration//GEN-END:variables

	private void initComponentsCustomization() {

		super.setImageItems(new ImageItem[] {
			new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_ABOUT_01), 0, 0),
			new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_ABOUT_PT), 0, 0)
		});

		L_Credit_conrado.setFont(new Font("Courier New", Font.PLAIN, 16));
		L_Credit_conrado.setText("-> github.com/convalise <-");
		L_Credit_conrado.setForeground(Color.WHITE);
		L_Credit_conrado.setHorizontalAlignment(SwingConstants.CENTER);

		L_Credit_eldi.setFont(new Font("Courier New", Font.PLAIN, 16));
		L_Credit_eldi.setText("-> eldi13.deviantart.com <-");
		L_Credit_eldi.setForeground(Color.WHITE);
		L_Credit_eldi.setHorizontalAlignment(SwingConstants.CENTER);

	}

}
