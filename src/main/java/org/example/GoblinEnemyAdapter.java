package org.example;

import java.util.Random;

public class GoblinEnemyAdapter extends Character{
    private boolean isAggressive;

    public GoblinEnemyAdapter(Enemy enemy){
        super(enemy.getName(), enemy.getHealth());
        this.isAggressive = new Random().nextBoolean();
    }

    @Override
    public void attack(Character target){
        int damage = isAggressive ? (new Random().nextInt(3) + 3) : (new Random().nextInt(3) + 1);
        System.out.println(name + " Strategy: " + getStrategy() + " attacks for " + damage);
        target.takeDamage(damage);
    }

    public String getStrategy(){
        return isAggressive ? "Aggressive" : "Patient";
    }

    public boolean isAggressive() {
        return isAggressive();
    }

}
