package INTERFACE;

import DATABASE.*;
import ENGINE.*;
import LIBRARY.*;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class AboutPanel extends ImagePanel {

	public AboutPanel() {

		initComponents();
		initComponentsCustomization();

	}

	public void setLanguage(int Idioma) {

		switch(Idioma) {
			case MessageDB.IDIOMA_PT:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_pt));
				break;
			case MessageDB.IDIOMA_EN:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_en));
				break;
			case MessageDB.IDIOMA_DE:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_de));
				break;
			case MessageDB.IDIOMA_ES:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_es));
				break;
			case MessageDB.IDIOMA_FR:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_fr));
				break;
			case MessageDB.IDIOMA_IT:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_it));
				break;
		}
		repaint();

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Credit = new javax.swing.JLabel();
        L_Credit_2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 360));

        L_Credit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Credit.setText("L_Credit");
        L_Credit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_CreditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_CreditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_CreditMouseExited(evt);
            }
        });

        L_Credit_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Credit_2.setText("L_Credit_2");
        L_Credit_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Credit_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_Credit_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_Credit_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_Credit_2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(L_Credit)
                .addGap(71, 71, 71)
                .addComponent(L_Credit_2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void L_CreditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_CreditMouseClicked
		try {
			Desktop.getDesktop().browse(new URI("http://convalise.deviantart.com"));
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_STAIRS);
		} catch (URISyntaxException | IOException e) {
			System.out.println(e.getMessage());
		}
	}//GEN-LAST:event_L_CreditMouseClicked

	private void L_CreditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_CreditMouseEntered
		L_Credit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		L_Credit.setForeground(Color.ORANGE);
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE_2);
	}//GEN-LAST:event_L_CreditMouseEntered

	private void L_CreditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_CreditMouseExited
		L_Credit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		L_Credit.setForeground(Color.WHITE);
	}//GEN-LAST:event_L_CreditMouseExited

	private void L_Credit_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_2MouseClicked
		try {
			Desktop.getDesktop().browse(new URI("http://eldi13.deviantart.com/"));
			MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_STAIRS);
		} catch (URISyntaxException | IOException e) {
			System.out.println(e.getMessage());
		}
	}//GEN-LAST:event_L_Credit_2MouseClicked

	private void L_Credit_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_2MouseEntered
		L_Credit_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		L_Credit_2.setForeground(Color.MAGENTA);
		MediaPlayer.PlayCustomSound(MediaPlayer.DISSIDIA_CURSORMOVE_2);
	}//GEN-LAST:event_L_Credit_2MouseEntered

	private void L_Credit_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Credit_2MouseExited
		L_Credit_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		L_Credit_2.setForeground(Color.WHITE);
	}//GEN-LAST:event_L_Credit_2MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Credit;
    private javax.swing.JLabel L_Credit_2;
    // End of variables declaration//GEN-END:variables

	private void initComponentsCustomization() {

		setImageBackground(new java.io.File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_01), ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_ABOUT_pt) } );

		L_Credit.setFont(new Font("Courier New", Font.PLAIN, 16));
		L_Credit.setText("-> convalise.deviantart.com <-");
		L_Credit.setForeground(Color.WHITE);
		L_Credit.setHorizontalAlignment(SwingConstants.CENTER);

		L_Credit_2.setFont(new Font("Courier New", Font.PLAIN, 16));
		L_Credit_2.setText("-> eldi13.deviantart.com <-");
		L_Credit_2.setForeground(Color.WHITE);
		L_Credit_2.setHorizontalAlignment(SwingConstants.CENTER);

	}

}
