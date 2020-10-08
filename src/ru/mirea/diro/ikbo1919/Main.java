package ru.mirea.diro.ikbo1919;

import Furniture.FurnitureShop;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;

public class Main {

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        shop.showShop();
        Circle circle = new Circle("red",true,2);
        Rectangle rect = new Rectangle("green",true,5,2);
        Square square = new Square("none",false,10);
        System.out.printf(circle + "\n" + rect + "\n" + square);
    }
}
