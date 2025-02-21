package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

// Messy Turn-Based Battle Game with AI Strategies and Storyline
public class BattleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerHealth = 20;
        int enemyHealth = 20;

        // Randomly assign enemy strategy
        boolean isAggressive = random.nextBoolean();
        String enemyStrategy = isAggressive ? "Aggressive" : "Patient";

        // Story introduction
        System.out.println("Welcome, traveler. You have wandered into the cursed lands of Eldoria.");
        System.out.println("Dark forces roam these lands, and you must fight to survive.");
        System.out.println("A shadowy figure emerges from the fog...");
        System.out.println("You are fighting a Goblin, a minion of the Dark Lord!");

        while (playerHealth > 0 && enemyHealth > 0) {
            System.out.println("\nYour Turn:");
            System.out.println("Choose an action: (1) Attack (2) Defend (3) Heal");
            int choice = scanner.nextInt();

            if (choice == 1) {
                int damage = random.nextInt(5) + 1;
                enemyHealth -= damage;
                System.out.println("You slashed the Goblin for " + damage + " damage.");
            } else if (choice == 2) {
                System.out.println("You raise your shield, bracing for impact.");
            } else if (choice == 3) {
                int heal = random.nextInt(3) + 1;
                playerHealth += heal;
                System.out.println("You drink a potion, restoring " + heal + " HP.");
            }

            if (enemyHealth <= 0) {
                System.out.println("With a final strike, you vanquish the Goblin!");
                System.out.println("The path ahead is uncertain, but you have survived... for now.");
                break;
            }
        }

        System.out.println("Game Over.");
        scanner.close();
    }
}