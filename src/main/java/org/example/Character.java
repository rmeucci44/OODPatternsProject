package org.example;

import java.util.Random;

public abstract class Character {
    protected int health;
    protected String name;
    protected Random random = new Random();

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health " + health);
    }

    public void attack (Character target){
        int damage = random.nextInt(5) + 1;
        System.out.println(name + " attacks for " + damage + " damage.");
        target.takeDamage(damage);
    }

    public int getHealth() {
        return health;
    }
}
