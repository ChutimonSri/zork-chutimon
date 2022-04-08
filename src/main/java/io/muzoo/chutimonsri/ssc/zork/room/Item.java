package io.muzoo.chutimonsri.ssc.zork.room;

public class Item {

    private String ItemName;
    private int attackPower;

    public Item(String itemName, int attackPower) {
        ItemName = itemName;
        this.attackPower = attackPower;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
