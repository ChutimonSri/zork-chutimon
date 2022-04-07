package io.muzoo.chutimonsri.ssc.zork.room;

public class Monster {

    private int maxHP;
    private int currentHP;
    private int attack;
    private boolean isAlive;

    public Monster(){
        this.maxHP = 100;
        this.currentHP = this.maxHP;
        this.attack = 20;
        this.isAlive = true;
    }

    public void decreasingHP(int currentHP){
        this.currentHP = this.currentHP-attack;
    }

    public void increasingHP(int currentHP){
        this.currentHP++;
        if (currentHP > attack){
            this.currentHP=maxHP;
        }
    }

    public void survive(int alive){
        this.currentHP--;
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
        return attack;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
