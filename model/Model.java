package app.tachi.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.Arrays;

public class Model {
	
	private String[] parole;
    private int duration;
    private Font font;
    private Color color;
    private Point position;
    private int grandezza;
	
    
    
    public String[] getWord() {
		return parole;
	}
	public void setWord(String[] parole) {
		this.parole = parole;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Font getFont() {
		return font;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public int getGrandezza() {
		return grandezza;
	}
	public void setGrandezza(int grandezza) {
		this.grandezza = grandezza;
	}
	
	@Override
	public String toString() {
		return "Model [parole=" + Arrays.toString(parole) + ", duration=" + duration + ", font=" + font + ", color="
				+ color + ", position=" + position + ", grandezza=" + grandezza + "]";
	}
	
	
}
