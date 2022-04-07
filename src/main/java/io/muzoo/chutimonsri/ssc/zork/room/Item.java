package io.muzoo.chutimonsri.ssc.zork.room;

public class Item {

    private String ItemName;
    private int attack;

    public Item(String itemName, int attack) {
        ItemName = itemName;
        this.attack = attack;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getAttack() {
        return attack;
    }
}
