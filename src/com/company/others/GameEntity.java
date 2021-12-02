package com.company.others;

public abstract class GameEntity {
    protected int health;
    protected int damage;

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int putDamage(int damage){
        this.health = this.health - damage;
        if (health <=0 ){
            health = 0;
        }
        return this.health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
            this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
