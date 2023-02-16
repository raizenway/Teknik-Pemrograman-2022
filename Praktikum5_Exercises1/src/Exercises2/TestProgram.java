package Exercises2;

public class TestProgram {

	public static void main(String[] args) {
		/* DEFAULT SHAPE */
		Shape shape = new Shape();
		System.out.println("Warna = "+shape.getColor()
				+"\nTerisi =  "+shape.isFilled()
				+"\n"+shape.toString()+"\n");
		
		/* CUSTOM SHAPE */
		Shape shape2 = new Shape("Yellow", false);
		System.out.println("Warna = "+shape2.getColor()
		+"\nTerisi =  "+shape2.isFilled()
		+"\n"+shape2.toString()+"\n");
		
		/* DEFAULT CIRCLE */
		Circle circle = new Circle();
		System.out.println("Warna = "+circle.getColor()
		+"\nTerisi = "+circle.isFilled()
		+"\nJari-jari = "+circle.getRadius()
		+"\nLuas = "+circle.getArea()
		+"\nKeliling = "+circle.getPerimeter()
		+"\n"+circle.toString()+"\n");
			
		/* CUSTOM RADIUS CIRCLE */
		Circle circle2 = new Circle(3.0);
		System.out.println("Warna = "+circle2.getColor()
		+"\nTerisi = "+circle2.isFilled()
		+"\nJari-jari = "+circle2.getRadius()
		+"\nLuas = "+circle2.getArea()
		+"\nKeliling = "+circle2.getPerimeter()
		+"\n"+circle2.toString()+"\n");
		
		/* CUSTOM COLOR RADIUS CIRCLE */
		Circle circle3 = new Circle(5.0, "Pink", false);
		System.out.println("Warna = "+circle3.getColor()
		+"\nTerisi = "+circle3.isFilled()
		+"\nJari-jari = "+circle3.getRadius()
		+"\nLuas = "+circle3.getArea()
		+"\nKeliling = "+circle3.getPerimeter()
		+"\n"+circle3.toString()+"\n");
		
		/* DEFAULT RECTANGLE */
		Rectangle rect = new Rectangle();
		System.out.println("Warna = "+rect.getColor()
		+"\nTerisi = "+rect.isFilled()
		+"\nLebar = "+rect.getWidth()
		+"\nPanjang = "+rect.getLength()
		+"\nLuas = "+rect.getArea()
		+"\nKeliling = "+rect.getPerimeter()
		+"\n"+rect.toString()+"\n");
		
		/* CUSTOM LENGTH AND WIDTH RECTANGLE */
		Rectangle rect2 = new Rectangle(5.0, 8.0);
		System.out.println("Warna = "+rect2.getColor()
		+"\nTerisi = "+rect2.isFilled()
		+"\nLebar = "+rect2.getWidth()
		+"\nPanjang = "+rect2.getLength()
		+"\nLuas = "+rect2.getArea()
		+"\nKeliling = "+rect2.getPerimeter()
		+"\n"+rect2.toString()+"\n");

		/* CUSTOM COLOR RECTANGLE */
		Rectangle rect3 = new Rectangle(5.0, 8.0, "Magenta", true);
		System.out.println("Warna = "+rect3.getColor()
		+"\nTerisi = "+rect3.isFilled()
		+"\nLebar = "+rect3.getWidth()
		+"\nPanjang = "+rect3.getLength()
		+"\nLuas = "+rect3.getArea()
		+"\nKeliling = "+rect3.getPerimeter()
		+"\n"+rect3.toString()+"\n");
		
		/* DEFAULT SQUARE */
		Square sq = new Square();
		System.out.println("Warna = "+sq.getColor()
		+"\nTerisi = "+sq.isFilled()
		+"\nSisi ="+sq.getWidth()
		+"\nLuas = "+sq.getArea()
		+"\nKeliling = "+sq.getPerimeter()
		+"\n"+sq.toString()+"\n");
		
		/* CUSTOM SIDE SQUARE */
		Square sq2 = new Square(10.0);
		System.out.println("Warna = "+sq2.getColor()
		+"\nTerisi = "+sq2.isFilled()
		+"\nSisi ="+sq2.getWidth()
		+"\nLuas = "+sq2.getArea()
		+"\nKeliling = "+sq2.getPerimeter()
		+"\n"+sq2.toString()+"\n");
		
		/* CUSTOM COLOR SQUARE */
		Square sq3 = new Square(15.0, "Cyan", true);
		System.out.println("Warna = "+sq3.getColor()
		+"\nTerisi = "+sq3.isFilled()
		+"\nSisi ="+sq3.getWidth()
		+"\nLuas = "+sq3.getArea()
		+"\nKeliling = "+sq3.getPerimeter()
		+"\n"+sq3.toString()+"\n");
	}
}
