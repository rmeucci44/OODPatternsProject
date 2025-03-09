package org.example;

public class Player extends Character {
        public Player(String name){
            super(name, 20);
        }

        public void heal(int amount) {
            health += amount;
            System.out.println(name + " heals for " + amount + " HP. Current health: " + health);
        }

        public void defend(){
            System.out.println(name + " raises shield, reducing incoming damage.");
        }
    }

