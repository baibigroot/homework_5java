package com.company;

public class Boss {
    private String health;
    private String damage;
    private String defenseType;


    public int getHealth() {
        return Integer.parseInt(health);
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}

