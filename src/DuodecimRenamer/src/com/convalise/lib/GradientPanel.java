package LIBRARY;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public class GradientPanel extends javax.swing.JPanel {

	public static final Color DefaultColor = new Color(238, 238, 238);

	public static final int DIR_HORIZONTAL = 0;
	public static final int DIR_VERTICAL = 1;
	public static final int DIR_DIAGONAL = 2;
	public static final int DIR_DIAGONALINVERSE = 3;

	private Color StartColor;
	private Color EndColor;
	private int Direction;
	private boolean isTranslucent;

	public GradientPanel() {
		this(DefaultColor, DefaultColor, DIR_VERTICAL, false);
	}

	public GradientPanel(Color StartColor, Color EndColor) {
		this(StartColor, EndColor, DIR_VERTICAL, false);
	}

	public GradientPanel(Color StartColor, Color EndColor, int Direction) {
		this(StartColor, EndColor, Direction, false);
	}

	public GradientPanel(Color StartColor, Color EndColor, int Direction, boolean isTranslucent) {
		this.StartColor = StartColor;
		this.EndColor = EndColor;
		this.Direction = Direction;
		this.isTranslucent = isTranslucent;
	}

	public GradientPanel(GradientPanel Panel) {
		this(Panel.getGradientStartColor(), Panel.getGradientEndColor(), Panel.getGradientDirection(), Panel.isGradientTranslucent());
	}

	public void setGradientColors(Color StartColor, Color EndColor) {
		this.StartColor = StartColor;
		this.EndColor = EndColor;
	}

	public void setGradientDirection(int Direction) {
		this.Direction = Direction;
	}

	public void setGradientTranslucent(boolean isTranslucent) {
		this.isTranslucent = isTranslucent;
	}

	public Color getGradientStartColor() {
		return this.StartColor;
	}

	public Color getGradientEndColor() {
		return this.EndColor;
	}

	public int getGradientDirection() {
		return this.Direction;
	}

	public boolean isGradientTranslucent() {
		return this.isTranslucent;
	}

	public void setGradientDefaultColors() {
		this.StartColor = new Color(248, 248, 248);
		this.EndColor = new Color(228, 228, 228);
	}

	public void ReverseGradientColors() {
		Color AuxColor;
		AuxColor = StartColor;
		StartColor = EndColor;
		EndColor = AuxColor;
	}

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2D = (Graphics2D) g.create();

		if(!isTranslucent)
			super.paintComponent(g);

		int StartX = 0;
		int StartY = 0;
		int EndX = 0;
		int EndY = 0;

		switch(Direction) {
			case DIR_HORIZONTAL:
				StartX = 0;
				StartY = 0;
				EndX = getWidth();
				EndY = 0;
				break;
			case DIR_VERTICAL:
				StartX = 0;
				StartY = 0;
				EndX = 0;
				EndY = getHeight();
				break;
			case DIR_DIAGONAL:
				StartX = getWidth();
				StartY = 0;
				EndX = 0;
				EndY = getHeight();
				break;
			case DIR_DIAGONALINVERSE:
				StartX = 0;
				StartY = 0;
				EndX = getWidth();
				EndY = getHeight();
				break;
		}

		Point2D StartPoint = new Point2D.Float(StartX, StartY);
		Point2D EndPoint = new Point2D.Float(EndX, EndY);

		g2D.setPaint(new GradientPaint(StartPoint, StartColor, EndPoint, EndColor));
		g2D.fillRect(0, 0, getWidth(), getHeight());

		g2D.dispose();

	}

	@Override
	public void paintBorder(Graphics g) {

		if(!isTranslucent)
			super.paintBorder(g);

	}

}