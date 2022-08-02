package org.fasttrackit;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fruits> fruitsList=new LinkedList<>();
        fruitsList.add(new Fruits("Banana", 2, "onSale"));
        fruitsList.add(new Fruits("Apricot", 3, "new"));
        fruitsList.add(new Fruits("Peach", 1, "onSale"));
        fruitsList.add(new Fruits("Apple", 2, "new"));
        fruitsList.add(new Fruits("Strawberry", 5, "onSale"));
        fruitsList.add(new Fruits("Pineapple", 4, "new"));
        fruitsList.add(new Fruits("Grape", 6, "onSale"));

        Shop shop = new Shop(fruitsList);
        System.out.println(shop);
        shop.addItem(new Fruits("Orange", 1, "new"));
        System.out.println(shop);
        System.out.println(shop.findByCategory(Category.NEW));
        System.out.println(shop.findWithLowerPrice(4));
        System.out.println(shop.findByName("Peach"));
        System.out.println(shop.removeItem("Banana"));
        System.out.println(shop);
        System.out.println(shop.findByPrice(2));
        System.out.println(shop.groupByPrice());
        System.out.println(shop.groupByCategory());


        List<Electronics> electronicsList=new LinkedList<>();
        electronicsList.add(new Electronics("Laptop", 600, "onSale"));
        electronicsList.add(new Electronics("TV-OLED", 700, "new"));
        electronicsList.add(new Electronics("Sandwich-maker", 50, "refurbished"));
        electronicsList.add(new Electronics("Toaster", 65, "new"));
        electronicsList.add(new Electronics("Vacuum-cleaner", 45, "onSale"));
        electronicsList.add(new Electronics("Dish-washer", 350, "new"));
        electronicsList.add(new Electronics("TV", 500, "refurbished"));

        Shop electronicsShop = new Shop(electronicsList);
        System.out.println();
        System.out.println(electronicsShop);
        electronicsShop.addItem(new Electronics("MacBook", 1000, "new"));
        System.out.println(electronicsShop);
        System.out.println(electronicsShop.findByCategory(Category.REFURBISHED));
        System.out.println(electronicsShop.findWithLowerPrice(100));
        System.out.println(electronicsShop.findByName("TV"));
        System.out.println(electronicsShop.removeItem("Toaster"));
        System.out.println(electronicsShop);


    }
}
