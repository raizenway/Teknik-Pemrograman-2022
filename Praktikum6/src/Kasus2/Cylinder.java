package Kasus2;

public class Cylinder extends Shape 
{
    private double radius;  //radius in feet
    private double height;
    //----------------------------------
    //  Constructor: Sets up the Cylinder.
    //----------------------------------
    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    //-----------------------------------------
    //  Returns the surface area of the cylinder.
    //-----------------------------------------
    @Override
    public double area(){
        return Math.PI*(radius*radius)*height;
    }
    //-----------------------------------------
    //  Returns the cylinder as a String.
    //-----------------------------------------
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius + " and of height " + height;
    }
}