package Exercises2;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String c, boolean f) {
		super(side, side, c, f);
	}
	
	
	@Override
	public double getArea() {
		return super.getWidth()*super.getWidth();
	}
	
	@Override
	public double getPerimeter() {
		return super.getWidth()*4;
	}
	
	@Override
	public String toString() {
		return "A Square with side = "+super.getWidth()+", which is a subclass of"+super.toString();
	}
}
