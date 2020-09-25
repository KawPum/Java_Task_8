package Furniture;

public class Sofa extends Furniture{
    private int pillows;
    private boolean transformable; //может ли складываться/раскладываться

    public Sofa(int width, int length, int height, String material, int legsQuantity, int price, int pillows, boolean transformable) {
        super(width, length, height, material, legsQuantity, price);
        this.pillows = pillows;
        this.transformable = transformable;
    }

    @Override
    public String toString() {
        return "This sofa has " + this.pillows + " pillows and is " + (transformable ? "" : "not ") + "transformable. It has " + super.getLegsQuantity() +
                " legs and is made of " + super.getMaterial() + " material. It's size is "  + this.getWidth() +
                "x" + this.getLength() + "x" + this.getHeight() + ". It costs " + this.getPrice() + ".";
    }

    @Override
    public String getSelf() {
        return "Sofa";
    }
}
