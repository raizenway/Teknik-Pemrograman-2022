package Exercises1;
/**
 * The Circle class models a circle with a radius and color.
 *  */
public class Circle {
	private double radius;
	private String color;
	
	//Constructor overloaded
	//Construct a Circle instance with default value for radius and color
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	/*Construct a Circle instance with the given radius and default color*/
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	/* Return the radius */
	public double getRadius() {
		return radius;
	}
	
	/* Return the area of this circle */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/* Getter and Setter for color */
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/* Return a self-descriptive string of this instance in the form of Circle[radius=?. color=?]*/
	public String toString() {
		return "Circle[radius = " + radius + " color " + color + "]";
	}
	
}
