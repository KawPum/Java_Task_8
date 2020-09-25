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

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < new Random().nextInt(10); i++){
            switch(new Random().nextInt(3)){
                case 1: items.add(i, new Cupboard(100,50,200,"wood", 4, 11599, 4, 12));
                case 2: items.add(i, new Sofa(100,50,200,"wood", 4, 5799, 4, new Random().nextBoolean()));
                case 3: items.add(i, new Wardrobe(100,50,200,"wood", 4, 2359));
            }
        }
    }

    public void showShop(){
        int a;
        for (int i = 0; i < items.size(); i++){
            System.out.println(i + ". " + items.get(i).getSelf() + " " + items.get(i).getPrice());
        }

        System.out.println("What item do you want? Input it's number");

        do{
            a = new Scanner(System.in).nextInt();
            if (a < items.size()){
                try {
                    Runtime.getRuntime().exec("clear");
                }catch(final Exception e){

                }
                System.out.println(items.get(a).toString() + "\nWill you buy it? Y/N");
                if (new Scanner(System.in).nextLine() == "N") this.showShop();
                else if(new Scanner(System.in).nextLine() == "Y"){
                    System.out.println("Congrats! Here's your purchase.");
                    items.remove(a);
                    this.showShop();
                }

            }
            else System.out.println("Input correct number");
        } while(a >= items.size());
    }
}
