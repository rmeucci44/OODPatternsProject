package org.example;

public class Goblin implements Enemy {
    private String name;
    private int health;

    public Goblin(String name) {
        this.name = name;
        this.health = 20;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
    }

    @Override
    public boolean checkIfAlive() {
        return health > 0;
    }
}
