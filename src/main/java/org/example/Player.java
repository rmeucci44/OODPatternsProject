package org.example;

public class Player extends Character {
        private boolean defending = false;

        public Player(String name){
            super(name, 20);
        }

        public void heal(int amount) {
            health += amount;
            System.out.println(name + " heals for " + amount + " HP. Current health: " + health);
        }

        public void defend(){
            defending = true;
            System.out.println(name + " raises shield, reducing incoming damage.");
        }

        public void takeDamage(int damage){
            if (defending){
                damage /= 2;
                System.out.println(name + " blocks some of the damage. Only takes " + damage + ".");
                defending = false;
            }
            super.takeDamage(damage);


        }
    }

