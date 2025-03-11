package org.example;

import java.util.Random;

public class GoblinEnemyAdapter extends Character {
    private final Enemy enemy;
    private final boolean isAggressive;

    public GoblinEnemyAdapter(Enemy enemy) {
        super(enemy.getName(), 20);  // Default health for compatibility
        this.enemy = enemy;
        this.isAggressive = new Random().nextBoolean();
    }

    @Override
    public void attack(Character target) {
        int damage = isAggressive ? (random.nextInt(3) + 3) : (random.nextInt(3) + 1);
        System.out.println(enemy.getName() + " Strategy: " + getStrategy() + " attacks for " + damage);
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        enemy.receiveDamage(damage); // Delegate to the real enemy implementation.
    }

    @Override
    public boolean isAlive() {
        return enemy.checkIfAlive();
    }

    public String getStrategy() {
        return isAggressive ? "Aggressive" : "Patient";
    }
}
