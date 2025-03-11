package org.example;

public interface Enemy {
    String getName();
    void receiveDamage(int damage);
    boolean checkIfAlive();
}
