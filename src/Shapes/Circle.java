package Shapes;

public class Circle extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("This circle has a radius of %.3f ,area of %.3f and a perimeter of %.3f",
                this.radius, this.getArea(), this.getPerimeter());
    }
}
