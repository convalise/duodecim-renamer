
package com.convalise.duodecimrenamer.ui;

import com.convalise.duodecimrenamer.database.MessageDB;
import com.convalise.duodecimrenamer.database.ResourceDB;
import com.convalise.duodecimrenamer.engine.ResourceManager;
import com.convalise.lib.ImagePanel;

public class HelpPanel extends ImagePanel {

	public HelpPanel() {

		initComponents();
		initComponentsCustomization();

	}

	public void setLanguage(MessageDB.Language language) {

		int picIndex = -1;
		
		switch(language) {
			case PT: picIndex = ResourceDB.INDEX_PIC_HELP_PT; break;
			case EN: picIndex = ResourceDB.INDEX_PIC_HELP_EN; break;
			case DE: picIndex = ResourceDB.INDEX_PIC_HELP_DE; break;
			case ES: picIndex = ResourceDB.INDEX_PIC_HELP_ES; break;
			case FR: picIndex = ResourceDB.INDEX_PIC_HELP_FR; break;
			case IT: picIndex = ResourceDB.INDEX_PIC_HELP_IT; break;
		}

		if(picIndex != -1) {
			super.setImageItemAt(1, new ImageItem(ResourceManager.loadImageResource(picIndex), 0, 0));
		}
		
		repaint();

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

	private void initComponentsCustomization() {

		super.setImageItems(new ImageItem[] {
			new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_HELP_01), 0, 0),
			new ImageItem(ResourceManager.loadImageResource(ResourceDB.INDEX_PIC_HELP_PT), 0, 0)
		});
		
	}

}
