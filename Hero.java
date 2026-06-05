package model;

import datastore.*;

public abstract class Hero implements CSVStorable {

    final String name;
    final String team;
    final int maxHP;
    public int currentHP;

    public Hero(String name, String team, int maxHP) {
        this.name = name;
        this.team = team;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }

    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }

    public int getMaxHealth() {
        return this.maxHP;
    }

    public int getCurrentLife() {
        return (this.currentHP);
    }

    void takeDamage(int damage) {
        System.out.println("Took " + damage + " damage.");
    }
}