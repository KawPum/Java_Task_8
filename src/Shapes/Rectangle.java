package Shapes;

public class Rectangle extends Shape{
    protected double length;
    protected double width;

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

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.width + this.length;
    }

    @Override
    public String toString() {
        return String.format("This rectangle has a size of %.3fx%.3f , area of %.3f , and a perimeter of %.3f",
                this.length, this.width, this.getArea(), this.getPerimeter());
    }
}
