package io.muzoo.chutimonsri.ssc.zork.room;

public class Monster {

    private int maxHP;
    private int currentHP;
    private int attackPower;
    private boolean isAlive;

    public Monster(int maxHP, int currentHP, int attackPower, boolean isAlive){
        this.maxHP = 100;
        this.currentHP = this.maxHP;
        this.attackPower = 25;
        this.isAlive = true;
    }

    // Monster get attack by player
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

    public int getAttack() {
        return attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }
}