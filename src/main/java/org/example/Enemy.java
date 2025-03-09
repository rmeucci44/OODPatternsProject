package org.example;

import java.util.Random;

public class Enemy extends Character {
    private boolean isAggressive;

    public Enemy(String name){
        super(name, 20);
        this.isAggressive = new Random().nextBoolean();
    }

    public String getStrategy(){
        return isAggressive ? "Aggressive" : "Patient";
    }

    @Override
    public void attack (Character target) {
        int damage = isAggressive ? (new Random().nextInt(3) + 3) : (new Random().nextInt(3) + 1);
        target.takeDamage(damage);
        System.out.println(name + " Strategy: " + getStrategy() + " attacks for " + damage);
    }
}
