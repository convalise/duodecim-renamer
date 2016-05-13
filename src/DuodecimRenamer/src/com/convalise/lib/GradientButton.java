package LIBRARY;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;

public class GradientButton extends JButton {

	private Color StartColor;
	private Color EndColor;
	private Color BorderColor;

	private boolean isHovered;

	public GradientButton() {
		this(Color.WHITE, new Color(185, 210, 230), new Color(120, 140, 155));
	}

	public GradientButton(Color StartColor, Color EndColor) {
		this(StartColor, EndColor, new Color(122, 138, 153));
	}

	public GradientButton(Color StartColor, Color EndColor, Color BorderColor) {
		this.StartColor = StartColor;
		this.EndColor = EndColor;
		this.BorderColor = BorderColor;
		this.isHovered = false;
	}

	public GradientButton(GradientButton Button) {
		this(Button.getGradientStartColor(), Button.getGradientEndColor(), Button.getGradientBorderColor());
	}

	public void setGradientColors(Color StartColor, Color EndColor, Color BorderColor) {
		this.StartColor = StartColor;
		this.EndColor = EndColor;
		this.BorderColor = BorderColor;
	}

	public void setGradientDefaultColors() {
		this.StartColor = Color.WHITE;
		this.EndColor = new Color(185, 210, 230);
		this.BorderColor = new Color(120, 140, 155);
	}

	public void setHovered(boolean isHovered) {
		this.isHovered = isHovered;
	}

	public Color getGradientStartColor() {
		return this.StartColor;
	}

	public Color getGradientEndColor() {
		return this.EndColor;
	}

	public Color getGradientBorderColor() {
		return this.BorderColor;
	}

	public boolean getHovered() {
		return this.isHovered;
	}

	@Override
	public void paintComponent(Graphics g) {

		float StartX = 0;
		float StartY = (0.3f)*getHeight();
		float EndX = 0;
		float EndY = getHeight();

		Point2D StartPoint = new Point2D.Float(StartX, StartY);
		Point2D EndPoint = new Point2D.Float(EndX, EndY);

		Graphics2D g2D = (Graphics2D) g.create();

		g2D.setPaint(new GradientPaint(StartPoint, StartColor, EndPoint, EndColor, true));
		g2D.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));

		setBackground(new Color(0, 0, 0, 0));
		setBorderPainted(true);


		if(isHovered) {

			setBorderPainted(false);
			//Color[] cores = {  new Color(0, 0, 0, 0), new Color(0, 0, 0, 50) };
			Color[] cores = {  new Color(0, 0, 0, 0), Color.WHITE };
			float[] floats = { 0.6f, 1.0f };
			g2D.setPaint(new RadialGradientPaint(new Point2D.Float(getWidth()/2, getHeight()/2), getWidth()/2, floats, cores));
			//g2D.setPaint(new GradientPaint(StartPoint, new Color(0, 0, 0, 150), EndPoint, EndColor, true));
			g2D.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));

		}
		super.paintComponent(g);

		g2D.dispose();

	}

	@Override
	public void paintBorder(Graphics g) {
		super.paintBorder(g);

		Graphics2D g2D = (Graphics2D) g.create();

		g2D.setColor(BorderColor);
		g2D.drawRect(0, 0, getWidth()-1, getHeight()-1);

		g2D.dispose();

	}

}
