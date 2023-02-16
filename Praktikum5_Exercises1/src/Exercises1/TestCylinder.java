package Exercises1;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder:"
				+ " radius = " + c1.getRadius()
				+ " height = " + c1.getHeight()
				+ " base area = "+ c1.getArea()
				+ " volume = "+ c1.getVolume()
				+ "color = "+ c1.getColor()
				+ "\n"+ c1.toString()+"\n");
		
		Cylinder c2 = new Cylinder(10.0);
		System.out.println("Cylinder:"
				+ " radius = " + c2.getRadius()
				+ " height = " + c2.getHeight()
				+ " base area = "+ c2.getArea()
				+ " volume = "+ c2.getVolume()
				+ "color = "+ c2.getColor()
				+ "\n"+ c2.toString()+"\n");
		
		Cylinder c3 = new Cylinder(2.0, 10.0, "yellow");
		System.out.println("Cylinder:"
				+ " radius = " + c3.getRadius()
				+ " height = " + c3.getHeight()
				+ " base area = "+ c3.getArea()
				+ " volume = "+ c3.getVolume()
				+ "color = "+ c3.getColor()
				+ "\n" + c3.toString()+"\n");
		
		
		
		
	}

}
