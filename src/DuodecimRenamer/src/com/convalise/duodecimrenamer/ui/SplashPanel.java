
package com.convalise.duodecimrenamer.ui;

import com.convalise.duodecimrenamer.database.ResourceDB;
import com.convalise.duodecimrenamer.engine.ResourceManager;
import com.convalise.lib.ImagePanel;

public class SplashPanel extends ImagePanel {

	public SplashPanel() {

		initComponents();
		initComponentsCustomization();

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PB_LoadBar = new javax.swing.JProgressBar();

        setPreferredSize(new java.awt.Dimension(600, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(PB_LoadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(PB_LoadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PB_LoadBar;
    // End of variables declaration//GEN-END:variables

	private void initComponentsCustomization() {

		super.setImageItems(new ImageItem[] {
			new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_SPLASH), 0, 0)
		});
		
		PB_LoadBar.setForeground(java.awt.Color.WHITE);
		PB_LoadBar.setBorderPainted(false);
		PB_LoadBar.setIndeterminate(true);
		PB_LoadBar.setOpaque(false);

	}

}
