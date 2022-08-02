package org.fasttrackit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@ToString
public class Shop<T extends ShopItem> {
    private List<T> list;

    public Shop(List<T> list) {
        this.list = list;
    }

    public void addItem(T item) {
        list.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new LinkedList<>();
        for (T t : list) {
            if (t.category().equals(cat)) {
                result.add(t);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new LinkedList<>();
        for (T t : list) {
            if (t.price() < maxPrice) {
                result.add(t);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {
        for (T t : list) {
            if (t.name().equals(name)) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
        for (T t : list) {
            if (t.name().equals(name)) {
                list.remove(t);
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }


    //ExtraMile

    public List<T> findByPrice(int price) {
        List<T> result = new LinkedList<>();
        for (T t : list) {
            if (t.price() == (price)) {
                result.add(t);
            }
        }
        return result;
    }

    public Map<Integer,List<T>> groupByPrice(){
        Map<Integer, List<T>> result= new HashMap<>();
        for(T t : list){
            List<T> listOfItems=result.get(t.price());
            if(listOfItems==null){
                listOfItems=new LinkedList<>();
                result.put(t.price(), listOfItems);
            }
            listOfItems.add(t);
        }
        return result;
    }


    public Map<Category,List<T>> groupByCategory(){
        Map<Category, List<T>> result= new HashMap<>();
        for(T t : list){
            List<T> listOfItems=result.get(t.category());
            if(listOfItems==null){
                listOfItems=new LinkedList<>();
                result.put(t.category(), listOfItems);
            }
            listOfItems.add(t);
        }
        return result;
    }
}
