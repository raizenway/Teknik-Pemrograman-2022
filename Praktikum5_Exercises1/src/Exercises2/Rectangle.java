package Exercises2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() {
		width = 12.0;
		length = 2.0;
	}
	
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}
	
	public Rectangle(double w, double l, String c, boolean f) {
		super(c, f);
		this.width = w;
		this.length = l;
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "A Rectangle with width = "+width+" and length = "+length+", which is a subclass of"+super.toString();
	}
}