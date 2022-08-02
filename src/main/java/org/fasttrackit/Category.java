package org.fasttrackit;

public enum Category {
    ON_SALE("onSale"),
    NEW("new"),
    REFURBISHED("refurbished");

    private String name;
    Category(String name) {
        this.name=name;
    }

    public static Category fromSymbol(String name){
        Category[] category = Category.values();
        for(Category c : category){
            if(c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }
}
