package LIBRARY;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagePanel extends GradientPanel {

	private BufferedImage[] BackgroundImageA;
	private int[] PosXA;
	private int[] PosYA;
	private int ID;

	public ImagePanel() {
		this(null, null, null);
	}

	public ImagePanel(File[] ImgFileA) {
		this(ImgFileA, null, null);
	}

	public ImagePanel(File[] ImageFileA, int[] PosXA, int[] PosYA) {
		this.BackgroundImageA = null;
		this.PosXA = PosXA;
		this.PosYA = PosYA;
		this.ID = 0;

		if(ImageFileA != null) {
			this.BackgroundImageA = new BufferedImage[ImageFileA.length];
			try {
				for(int i=0; i<ImageFileA.length; i++)
					this.BackgroundImageA[i] = ImageIO.read(ImageFileA[i]);
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
			}

			if(PosXA == null || PosYA == null || PosXA.length != ImageFileA.length || PosYA.length != ImageFileA.length) {
				this.PosXA = new int[ImageFileA.length];
				this.PosYA = new int[ImageFileA.length];
				for(int i=0; i<ImageFileA.length; i++) {
					PosXA[i] = 0;
					PosYA[i] = 0;
				}
			}
		}
	}

	public ImagePanel(ImagePanel Panel) {
		this.BackgroundImageA = Panel.getImageBackground();
		this.PosXA = Panel.getImagePosX();
		this.PosYA = Panel.getImagePosY();
		this.ID = Panel.getImageID();
	}

	public void setImageBackground(File[] ImageFileA) {
		BackgroundImageA = new BufferedImage[ImageFileA.length];
		try {
			for(int i=0; i<ImageFileA.length; i++)
				this.BackgroundImageA[i] = ImageIO.read(ImageFileA[i]);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if(PosXA == null || PosYA == null || PosXA.length != ImageFileA.length || PosYA.length != ImageFileA.length) {
			this.PosXA = new int[ImageFileA.length];
			this.PosYA = new int[ImageFileA.length];
			for(int i=0; i<ImageFileA.length; i++) {
				PosXA[i] = 0;
				PosYA[i] = 0;
			}
		}
	}

	public void setImageBackgroundAt(int Layer, File ImageFile) {
		if(Layer > BackgroundImageA.length)
			return;
		try {
			this.BackgroundImageA[Layer] = ImageIO.read(ImageFile);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void setImagePosition(int[] PosXA, int[] PosYA) {
		if(PosXA.length != BackgroundImageA.length || PosYA.length != BackgroundImageA.length)
			return;
		this.PosXA = PosXA;
		this.PosYA = PosYA;
	}

	public void setImagePositionAt(int Layer, int PosX, int PosY) {
		if(Layer > BackgroundImageA.length)
			return;
		if(PosXA == null || PosYA == null) {
			this.PosXA = new int[BackgroundImageA.length];
			this.PosYA = new int[BackgroundImageA.length];
			for(int i=0; i<BackgroundImageA.length; i++) {
				PosXA[i] = 0;
				PosYA[i] = 0;
			}
		}
		this.PosXA[Layer] = PosX;
		this.PosYA[Layer] = PosY;
	}

	public void setImageID(int ID) {
		this.ID = ID;
	}

	public BufferedImage[] getImageBackground() {
		return this.BackgroundImageA;
	}

	public BufferedImage getImageBackgroundAt(int Layer) {
		return this.BackgroundImageA[Layer];
	}

	public int[] getImagePosX() {
		return this.PosXA;
	}

	public int getImagePosXAt(int Layer) {
		return this.PosXA[Layer];
	}

	public int[] getImagePosY() {
		return this.PosYA;
	}

	public int getImagePosYAt(int Layer) {
		return this.PosYA[Layer];
	}

	public int getImageID() {
		return this.ID;
	}

	public void addImage(File ImageFile) {
		addImage(ImageFile, 0, 0);
	}

	public void addImage(File ImageFile, int PosX, int PosY) {
		BufferedImage[] TempImageA = BackgroundImageA.clone();
		int[] TempXA = PosXA.clone();
		int[] TempYA = PosYA.clone();
		BackgroundImageA = new BufferedImage[TempImageA.length+1];
		PosXA = new int[TempXA.length+1];
		PosYA = new int[TempYA.length+1];
		System.arraycopy(TempImageA, 0, BackgroundImageA, 0, TempImageA.length);
		System.arraycopy(TempXA, 0, PosXA, 0, TempXA.length);
		System.arraycopy(TempYA, 0, PosYA, 0, TempYA.length);
		setImageBackgroundAt(TempImageA.length, ImageFile);
		setImagePositionAt(TempImageA.length, PosX, PosY);
	}

	public void removeImageAt(int Layer) {
		if(Layer >= BackgroundImageA.length)
			return;
		BackgroundImageA[Layer] = null;
		PosXA[Layer] = 0;
		PosYA[Layer] = 0;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D) g.create();

		if(BackgroundImageA != null)
			for(int i=0; i<BackgroundImageA.length; i++)
				if(BackgroundImageA[i] != null)
					g2D.drawImage(BackgroundImageA[i], PosXA[i], PosYA[i], null);

		g2D.dispose();

	}

}