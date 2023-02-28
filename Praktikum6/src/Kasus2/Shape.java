package Kasus2;

abstract public class Shape {
    private String shapeName;
    
    public Shape(String namaShape)
    {
        shapeName = namaShape;
    }
    
    public abstract double area();
    @Override
    public String toString()
    {
        return " Name of Shape " + shapeName;
    }
}