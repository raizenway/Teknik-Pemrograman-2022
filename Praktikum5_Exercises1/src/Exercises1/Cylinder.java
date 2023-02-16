package Exercises1;

public class Cylinder extends Circle {
	private double height;
	
	// Constructor with default color, radius, and height
	
	public Cylinder() {
		super(); //call superclass no-argument constructor Circle(
		height = 1.0;
	}
	
	//Constructor with default radius, color buy given height
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	//Constructor with default color, but given radius and height
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	// A public method for retrieving the height
	public double getHeight() {
		return height;
	}
	/*
	 * a public method for computing the volume of cylinder
	 * use superclass method getArea() to get base area	 */
	public double getVolume() {
		return super.getArea()*height;
	}
	
	/* OVERRIDING getArea()*/
	@Override
	public double getArea() {
		return 2*Math.PI*super.getRadius()*height+ 2*super.getArea();
	}
	
	/* OVERRIDING A toString()*/
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString()+" height = "+ height;
	}
}
