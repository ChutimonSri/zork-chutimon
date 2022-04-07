package io.muzoo.chutimonsri.ssc.zork.room;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {

    public static List<Item> itemList = new ArrayList<>();

    public ItemFactory(){
        itemList.add(new Item("knife", 10));
        itemList.add(new Item("sword", 20));
        itemList.add(new Item("sniper",30));
        itemList.add(new Item("bazooka", 40));

    }
//        add(new Item("Sniper", 20));
//        add(new Item("Sword",30));
//        add(new Item("Katana", 40));
}
