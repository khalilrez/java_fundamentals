package objects;

public class Rectangle {
    // default, private , protected , public ,
    private double length;
    private double width;
    private final Double sides = 4.0; // Double = double but with methods  ( wrapper )

    // CONSTRUCTOR ( constructors exist by default with no parameters and without a body )
    public Rectangle(double length,double width){
        setLength(width);
        setWidth(length);
    }

    public Rectangle() {
        setWidth(0);
        setLength(0);
    }

    // BEHAVIOURS
    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public double calculateArea(){
        return length*width;
    }



    // GETTERS & SETTERS
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }
}