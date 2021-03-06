package io.muzoo.chutimonsri.ssc.zork.room;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int maxHP;
    private int currentHP;
    private int attackPower;
    private boolean isAlive;
    private Item item;
    private List<String> itemList = new ArrayList<>();

    public Player(int maxHP, int attackPower, boolean isAlive){
        this.maxHP = maxHP;
        this.currentHP = this.maxHP;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    // As player moves from room to room, HP will increase
    public void increaseHP(){
        this.currentHP += 5;
        if (currentHP > maxHP){
            this.maxHP = this.currentHP;
        }
    }

    // Player attack power will increase if he/she can defeat a monster
    public void increaseAttackPower(){
        this.attackPower += 5;
    }

    // Player get attack by monster
    public void getAttack(int attack){
        this.currentHP -= attack;
        if (currentHP <= 0){
            this.isAlive = false;
        }
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        itemList.add(item.toString());
    }

    public boolean hasItem(){
        return item != null;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void removeItem(){
        this.item = null;
    }
}
