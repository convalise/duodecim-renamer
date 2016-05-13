
package com.convalise.lib;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class ImagePanel extends GradientPanel {

	public class ImageItem {
		
		private String filePath;
		private int posX;
		private int posY;

		private BufferedImage backgroundImage;
		private boolean isVisible;
		
		private File loadedFile;
		
		public ImageItem(String filePath, int posX, int posY) {
			this.filePath = filePath;
			this.posX = posX;
			this.posY = posY;
			this.isVisible = true;
		}
		
		public ImageItem(File loadedFile, int posX, int posY) {
			this(loadedFile.getAbsolutePath(), posX, posY);
			this.loadedFile = loadedFile;
		}
		
		public void setImageFilePath(String filePath) {
			this.filePath = filePath;
			this.backgroundImage = null;
		}

		public void setImagePosX(int posX) {
			this.posX = posX;
		}

		public void setImagePosY(int posY) {
			this.posY = posY;
		}

		public void setImageVisible(boolean isVisible) {
			this.isVisible = isVisible;
		}

		public void setBackgroundImage(BufferedImage backgroundImage) {
			this.backgroundImage = backgroundImage;
		}

		public void setImageFile(File loadedFile) {
			this.loadedFile = loadedFile;
		}
	
		public String getImageFilePath() {
			return this.filePath;
		}

		public int getImagePosX() {
			return this.posX;
		}

		public int getImagePosY() {
			return this.posY;
		}

		public boolean isImageVisible() {
			return this.isVisible;
		}

		public BufferedImage getBackgroundImage() {
			return backgroundImage;
		}
		
		public File getImageFile() {
			if(loadedFile == null) {
				loadedFile = new File(this.filePath);
			}
			return loadedFile;
		}
		
		public void setImagePosition(int posX, int posY) {
			setImagePosX(posX);
			setImagePosY(posY);
		}

	}
	
	private ArrayList<ImageItem> imageItemAL;
	private int imageID;
	
	public ImagePanel() {
		this.imageItemAL = new ArrayList<>();
	}

	public ImagePanel(ImageItem[] imageItemA) {
		this();
		imageItemAL.addAll(Arrays.asList(imageItemA));
	}

	public ImagePanel(ImagePanel other) {
		this((ImageItem[]) other.getImageItems().toArray());
	}

	public void setImageItems(ImageItem[] imageItemA) {
		imageItemAL = new ArrayList<>(Arrays.asList(imageItemA));
	}
	
	public void setImageItemAt(int index, ImageItem imageItem) {
		if((index >= 0) && (index < imageItemAL.size())) {
			this.imageItemAL.set(index, imageItem);
		}
	}

	public ArrayList<ImageItem> getImageItems() {
		return imageItemAL;
	}
	
	public ImageItem getImageItemAt(int index) {
		return ((index >= 0) && (index < imageItemAL.size())) ? imageItemAL.get(index) : null;
	}

	public int getImageID() {
		return imageID;
	}

	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D) g.create();
		
		for(ImageItem item : imageItemAL) {

			if(!item.isVisible) {
				continue;
			}

			if(item.backgroundImage == null) {
				try {
					item.backgroundImage = ImageIO.read(item.getImageFile());
				}
				catch(IOException ex) {
					ex.printStackTrace(System.err);
					return;
				}
			}

			g2D.drawImage(item.backgroundImage, item.posX, item.posY, null);
			
		}

		g2D.dispose();
		
	}

}
