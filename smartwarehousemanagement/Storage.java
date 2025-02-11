package com.tit.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WareHouseItem>{
    List<T> items = new ArrayList<>();

    public void itemsAdd(T item){
        items.add(item);
    }

    public List<T> getItem(){
        return items;
    }

    public void display(){
        for(T item: items){
            item.display();
        }
    }
}
