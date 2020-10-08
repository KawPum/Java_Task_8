package Furniture;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FurnitureShop {
    private ArrayList<Furniture> items;

    public FurnitureShop() {
        this.items = new ArrayList<Furniture>();
        int b = new Random().nextInt(9);
        for (int i = 0; i <= b; i++){
            int a = new Random().nextInt(2);
            switch(a){
                case 0: {
                    items.add(i, new Cupboard(100,50,200,"wood", 4, 11599, 4, 12));
                    break;
                }
                case 1: {
                    items.add(i, new Sofa(100,50,200,"wood", 4, 5799, 4, new Random().nextBoolean()));
                    break;
                }
                case 2: {
                    items.add(i, new Wardrobe(100,50,200,"wood", 4, 2359));
                    break;
                }
            }
        }
    }

    public void showShop(){
        int a;
        for (int i = 0; i < items.size(); i++){
            System.out.println(i + ". " + items.get(i).getSelf() + " " + items.get(i).getPrice());
        }

        System.out.println(items.size() + "\nWhat item do you want? Input it's number. Input size of elements to quit.");

        do{
            a = new Scanner(System.in).nextInt();
            if (a == items.size()) return;
            if (a < items.size()){
                try {
                    Runtime.getRuntime().exec("clear");
                }catch(final Exception e){

                }
                System.out.println(items.get(a).toString() + "\nWill you buy it? Y/N");
                String b = new Scanner(System.in).nextLine();
                if (b.equals("N")) {
                    this.showShop();
                    return;
                }
                else if(b.equals("Y")){
                    System.out.println("Congrats! Here's your purchase.");
                    items.remove(a);
                    this.showShop();
                    return;
                }

            }
            else System.out.println("Input correct number");
        } while(a >= items.size());
        return;
    }
}
