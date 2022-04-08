package io.muzoo.chutimonsri.ssc.zork.room;

public class Player {

    private int maxHP;
    private int currentHP;
    private int attackPower;
    private boolean isAlive;
    private Item item;

    public Player(int maxHP, int currentHP, int attackPower, boolean isAlive){
        this.maxHP = 100;
        this.currentHP = this.maxHP;
        this.attackPower = 10;
        this.isAlive = true;
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

    public boolean isAlive() {
        return isAlive;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean hasItem(){
        return item != null;
    }
}
