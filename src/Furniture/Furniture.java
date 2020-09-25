package Furniture;

public abstract class Furniture {
    private int width;
    private int length;
    private int height;
    private String material;
    private int legsQuantity;
    private double volume;
    private int price;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLegsQuantity() {
        return legsQuantity;
    }

    public void setLegsQuantity(int legsQuantity) {
        this.legsQuantity = legsQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Furniture(int width, int length, int height, String material, int legsQuantity, int price) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.material = material;
        this.legsQuantity = legsQuantity;
        this.price = price;
        calcVolume();
    }

    public void calcVolume(){
        volume = width*height*length;
    }

    public String getSelf(){
        return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
