package Furniture;

public class Wardrobe extends Furniture{
    public Wardrobe(int width, int length, int height, String material, int legsQuantity, int price) {
        super(width, length, height, material, legsQuantity, price);
    }

    @Override
    public String getSelf() {
        return "Wardrobe";
    }

    @Override
    public String toString() {
        return "This wardrobe is made out of " + this.getMaterial() + " and it has " + this.getLegsQuantity() + " legs. It's size is " + this.getWidth() +
                "x" + this.getLength() + "x" + this.getHeight() + ". It's price is " + this.getPrice() + ".";
    }
}
