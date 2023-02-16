package Exercises2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		color = "Green";
		filled = true;
	}

	public Shape(String c, boolean f) {
		this.color = c;
		this.filled = f;
	}

	/* GETTER AND SETTER */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
	return "A Shape with color of "+color+" and "+filled;
	}
}

	
	
	

