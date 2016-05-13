
package com.convalise.lib;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public class GradientPanel extends javax.swing.JPanel {
	
	public static final Color DEFAULT_COLOR = new Color(238, 238, 238);

	public enum GradientDirection {
		HORIZONTAL, VERTICAL, DIAGONAL, ANTIDIAGONAL;
	}

	private Color startColor;
	private Color endColor;
	private GradientDirection direction;
	
	private boolean isTranslucent;
	private boolean isBorderVisible;
	private boolean isReverse;

	public GradientPanel() {
		this(DEFAULT_COLOR, DEFAULT_COLOR, GradientDirection.VERTICAL, false);
	}

	public GradientPanel(Color startColor, Color endColor) {
		this(startColor, endColor, GradientDirection.VERTICAL, false);
	}

	public GradientPanel(Color startColor, Color endColor, GradientDirection direction) {
		this(startColor, endColor, direction, false);
	}

	public GradientPanel(Color startColor, Color endColor, GradientDirection direction, boolean isTranslucent) {
		this.startColor = startColor;
		this.endColor = endColor;
		this.direction = direction;
		this.isTranslucent = isTranslucent;
	}

	public GradientPanel(GradientPanel other) {
		this(other.getGradientStartColor(), other.getGradientEndColor(), other.getGradientDirection(), other.isGradientTranslucent());
		this.isBorderVisible = other.isBorderVisible;
		this.isReverse = other.isReverse;
	}

	public void setGradientStartColor(Color startColor) {
		this.startColor = startColor;
	}
	
	public void setGradientEndColor(Color endColor) {
		this.endColor = endColor;
	}
	
	public void setGradientDirection(GradientDirection direction) {
		this.direction = direction;
	}

	public void setGradientTranslucent(boolean isTranslucent) {
		this.isTranslucent = isTranslucent;
	}

	public void setGradientBorderVisible(boolean isBorderVisible) {
		this.isBorderVisible = isBorderVisible;
	}

	public void setGradientReverse(boolean isReverse) {
		this.isReverse = isReverse;
	}

	public Color getGradientStartColor() {
		return this.startColor;
	}

	public Color getGradientEndColor() {
		return this.endColor;
	}

	public GradientDirection getGradientDirection() {
		return this.direction;
	}

	public boolean isGradientTranslucent() {
		return this.isTranslucent;
	}

	public boolean isGradientBorderVisible() {
		return this.isBorderVisible;
	}

	public boolean isGradientReverse() {
		return this.isReverse;
	}

	public void setGradientColors(Color startColor, Color endColor) {
		setGradientStartColor(startColor);
		setGradientEndColor(endColor);
	}

	@Override
	public void paintComponent(Graphics g) {

		if(!isTranslucent) {
			super.paintComponent(g);
		}

		int startX = 0;
		int startY = 0;
		int endX = 0;
		int endY = 0;

		switch(direction) {
			
			case HORIZONTAL:
				startX = 0;
				startY = 0;
				endX = super.getWidth();
				endY = 0;
				break;
				
			case VERTICAL:
				startX = 0;
				startY = 0;
				endX = 0;
				endY = super.getHeight();
				break;
				
			case DIAGONAL:
				startX = 0;
				startY = 0;
				endX = super.getWidth();
				endY = super.getHeight();
				break;
				
			case ANTIDIAGONAL:
				startX = super.getWidth();
				startY = 0;
				endX = 0;
				endY = super.getHeight();
				break;
				
		}

		Color paintStartColor = isReverse ? endColor : startColor;
		Color paintEndColor = isReverse ? startColor : endColor;
		
		Point2D paintStartPoint = new Point2D.Float(startX, startY);
		Point2D paintEndPoint = new Point2D.Float(endX, endY);

		Graphics2D g2D = (Graphics2D) g.create();
		g2D.setPaint(new GradientPaint(paintStartPoint, paintStartColor, paintEndPoint, paintEndColor));
		g2D.fillRect(0, 0, super.getWidth(), super.getHeight());

		g2D.dispose();

	}

	@Override
	public void paintBorder(Graphics g) {

		if(!isBorderVisible) {
			return;
		}

		if(!isTranslucent) {
			super.paintBorder(g);
		}

		Graphics2D g2D = (Graphics2D) g.create();
		g2D.setColor(Color.BLACK);
		g2D.drawRect(0, 0, super.getWidth() - 1, super.getHeight() - 1);
		g2D.dispose();

	}

}
