package io.muzoo.chutimonsri.ssc.zork.room;

public class Item {

    private String itemName;
    private int attackPower;

    public Item(String itemName, int attackPower) {
        this.itemName = itemName;
        this.attackPower = attackPower;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getAttackPower() {
        return this.attackPower;
    }
}
