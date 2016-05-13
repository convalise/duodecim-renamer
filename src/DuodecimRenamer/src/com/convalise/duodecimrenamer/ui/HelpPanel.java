package INTERFACE;

import DATABASE.*;
import ENGINE.*;
import LIBRARY.*;

public class HelpPanel extends ImagePanel {

	public HelpPanel() {

		initComponents();
		initComponentsCustomization();

	}

	public void setLanguage(int Idioma) {

		switch(Idioma) {
			case MessageDB.IDIOMA_PT:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_pt));
				break;
			case MessageDB.IDIOMA_EN:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_en));
				break;
			case MessageDB.IDIOMA_DE:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_de));
				break;
			case MessageDB.IDIOMA_ES:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_es));
				break;
			case MessageDB.IDIOMA_FR:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_fr));
				break;
			case MessageDB.IDIOMA_IT:
				setImageBackgroundAt(01, ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_it));
				break;
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
		setImageBackground(new java.io.File[] { ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_01), ResourceManager.GetImgFile(ResourceDB.INDEX_PIC_AJUDA_pt) } );
	}

}
