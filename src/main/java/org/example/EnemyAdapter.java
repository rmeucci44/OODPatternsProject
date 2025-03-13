package org.example;

public class EnemyAdapter extends Character {
    private final Enemy enemy;

    public EnemyAdapter(Enemy enemy) {
        super(enemy.getName(), enemy.getHealth());
        this.enemy = enemy;
    }

    @Override
    public void attack(Character target) {
        if (enemy instanceof Goblin) {
            ((Goblin) enemy).attack(target);
        }
        //Can add other enemies here later such as Orc
    }

    @Override
    public void takeDamage(int damage) {
        enemy.receiveDamage(damage);
    }

    @Override
    public boolean isAlive() {
        return enemy.checkIfAlive();
    }
}
