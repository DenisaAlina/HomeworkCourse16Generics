package org.fasttrackit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Fruits implements ShopItem{
    private String name;
    private int price;
    private String category;

    public Fruits(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return Category.fromSymbol(category);
    }
}
