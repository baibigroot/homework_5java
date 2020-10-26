package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth("Health - 700 ");
        boss.setDamage("Damage - 550 ");
        boss.setDefenseType("Defence type - Terminator");
        System.out.println(boss.getDamage() + "" + boss.getDamage() + ""
                + boss.getDefenseType());

    }
}
