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
    private Point position = new Point(10, 10);
    private int grandezza;
    private boolean posFissa = true;
	
    
    
    
    
    public String[] getParole() {
		return parole;
	}
	public void setParole(String[] parole) {
		this.parole = parole;
	}
	public boolean isPosFissa() {
		return posFissa;
	}
	public void setPosFissa(boolean posFissa) {
		this.posFissa = posFissa;
	}
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
		if (posFissa==true) {
			return position;
		}
		if (posFissa==false) {
			Point posCasuale = generateRandomPoint(10, 10, 10, 10);
			return posCasuale;
		}
		
		
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public void setRandomPosition() {
		posFissa = false;
	}
	
	public int getGrandezza() {
		return grandezza;
	}
	public void setGrandezza(int grandezza) {
		this.grandezza = grandezza;
	}
	
	
	
	    public static Point generateRandomPoint(int minX, int maxX, int minY, int maxY) {
	        // Genera coordinate casuali all'interno dell'intervallo specificato
	        int randomX = (int) (Math.random() * (maxX - minX + 1)) + minX;
	        int randomY = (int) (Math.random() * (maxY - minY + 1)) + minY;
	        
	        // Crea e restituisce un nuovo oggetto Point con le coordinate generate
	        return new Point(randomX, randomY);
	    }
	
	@Override
	public String toString() {
		return "Model [parole=" + Arrays.toString(parole) + ", duration=" + duration + ", font=" + font + ", color="
				+ color + ", position=" + position + ", grandezza=" + grandezza + "]";
	}
	
	
}
