
package com.convalise.lib;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;

public class GradientButton extends JButton {

	public static final Color DEFAULT_START_COLOR = Color.WHITE;
	public static final Color DEFAULT_END_COLOR = new Color(185, 210, 230);
	public static final Color DEFAULT_BORDER_COLOR = new Color(122, 138, 153);

	private Color startColor;
	private Color endColor;
	private Color borderColor;

	private boolean isHovered;

	public GradientButton() {
		this(DEFAULT_START_COLOR, DEFAULT_END_COLOR);
	}

	public GradientButton(Color startColor, Color endColor) {
		this(startColor, endColor, DEFAULT_BORDER_COLOR);
	}

	public GradientButton(Color startColor, Color endColor, Color borderColor) {
		this.startColor = startColor;
		this.endColor = endColor;
		this.borderColor = borderColor;
		this.isHovered = false;
	}

	public GradientButton(GradientButton Button) {
		this(Button.getGradientStartColor(), Button.getGradientEndColor(), Button.getGradientBorderColor());
	}

	public void setGradientStartColor(Color startColor) {
		this.startColor = startColor;
	}

	public void setGradientEndColor(Color endColor) {
		this.endColor = endColor;
	}

	public void setGradientBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public void setButtonHovered(boolean isHovered) {
		this.isHovered = isHovered;
	}

	public Color getGradientStartColor() {
		return this.startColor;
	}

	public Color getGradientEndColor() {
		return this.endColor;
	}

	public Color getGradientBorderColor() {
		return this.borderColor;
	}

	public boolean getButtonHovered() {
		return this.isHovered;
	}

	public void setGradientColors(Color startColor, Color endColor) {
		setGradientStartColor(startColor);
		setGradientEndColor(endColor);
	}
	
	public void setGradientColors(Color startColor, Color endColor, Color borderColor) {
		setGradientColors(startColor, endColor);
		setGradientBorderColor(borderColor);
	}

	@Override
	public void paintComponent(Graphics g) {

		float startX = 0;
		float startY = super.getHeight() * 0.3f;
		float endX = 0;
		float endY = super.getHeight();

		Point2D paintStartPoint = new Point2D.Float(startX, startY);
		Point2D paintEndPoint = new Point2D.Float(endX, endY);

		Graphics2D g2D = (Graphics2D) g.create();

		g2D.setPaint(new GradientPaint(paintStartPoint, startColor, paintEndPoint, endColor, true));
		g2D.fill(new Rectangle2D.Double(0, 0, super.getWidth(), super.getHeight()));

		this.setBackground(new Color(0, 0, 0, 0));
		this.setBorderPainted(true);

		if(isHovered) {

			this.setBorderPainted(false);
			
			Color[] colors = { new Color(0, 0, 0, 0), Color.WHITE };
			float[] fractions = { 0.6f, 1.0f };
			
			g2D.setPaint(new RadialGradientPaint(new Point2D.Float(super.getWidth() / 2, super.getHeight() / 2), super.getWidth() / 2, fractions, colors));
			g2D.fill(new Rectangle2D.Double(0, 0, super.getWidth(), super.getHeight()));

		}
		
		super.paintComponent(g);

		g2D.dispose();

	}

	@Override
	public void paintBorder(Graphics g) {
		super.paintBorder(g);

		Graphics2D g2D = (Graphics2D) g.create();

		g2D.setColor(borderColor);
		g2D.drawRect(0, 0, super.getWidth() - 1, super.getHeight() - 1);
		g2D.dispose();

	}

}
