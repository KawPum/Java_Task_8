package Furniture;

public class Cupboard extends Furniture{
    private int cabinets;
    private int drawers;

    public Cupboard(int width, int length, int height, String material, int legsQuantity, int price, int cabinets, int drawers) {
        super(width, length, height, material, legsQuantity, price);
        this.cabinets = cabinets;
        this.drawers = drawers;
    }

    public int getCabinets() {
        return cabinets;
    }

    public void setCabinets(int cabinets) {
        this.cabinets = cabinets;
    }

    public int getDrawers() {
        return drawers;
    }

    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }

    @Override
    public String toString() {
        return "This cupboard has " + this.cabinets + " cabinets and " + this.drawers + " drawers. It has " + super.getLegsQuantity() +
                " legs and is made of " + super.getMaterial() + " material. It's size is "  + this.getWidth() +
                "x" + this.getLength() + "x" + this.getHeight() + ". It's price is " + this.getPrice();
    }

    @Override
    public String getSelf() {
        return "Cupboard";
    }
}
