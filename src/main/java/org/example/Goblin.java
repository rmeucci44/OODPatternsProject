package org.example;

import java.util.Random;

public class Goblin implements Enemy {
    private String name;
    private int health;
    private final boolean isAggressive;
    private final Random random = new Random();

    public Goblin(String name) {
        this.name = name;
        this.health = 20;
        this.isAggressive = random.nextBoolean();
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

    public void attack(Character target) {
        int damage = isAggressive ? (random.nextInt(3) + 3) : (random.nextInt(3) + 1);
        String strategy = isAggressive ? "Aggressive" : "Patient";

        System.out.println(name + " Strategy: " + strategy + " attacks for " + damage);
        target.takeDamage(damage);
    }
}
