package org.example;

import java.util.Random;
import java.util.Scanner;

public class BattleGameNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Player player = (Player) CharacterFactory.createCharacter("Player", "Hero");
        Enemy enemy = (Enemy) CharacterFactory.createCharacter("Enemy", "Goblin");

        System.out.println("Welcome, traveler. You have wandered into the cursed lands of Eldoria.");
        System.out.println("Dark forces roam these lands, and you must fight to survive.");
        System.out.println("A shadowy figure emerges from the fog...");
        System.out.println("You are fighting a " + enemy.getName() + "  a minion of the Dark Lord!");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nYour Turn:");
            System.out.println("Choose an action: (1) Attack (2) Defend (3) Heal");
            int choice = scanner.nextInt();

            Command command = null;

            switch (choice){
                case 1:
                    command = new Attack(player, enemy);
                    break;
                case 2:
                    command = new Defend(player);
                    break;
                case 3:
                    int heal = random.nextInt(3) + 1;
                    command = new Heal(player, heal);
                    break;
                default:
                    System.out.println("Invalid choice please pick again.");
                    continue;
            }

            command.execute();

            if (!enemy.isAlive()){
                System.out.println("With a final strike, you vanquish the " + enemy.getName());
                break;
            }

            System.out.println("\nEnemy's Turn: ");
            new Attack(enemy, player).execute();

            if (!player.isAlive()){
                System.out.println("You have been defeated by the " + enemy.getName());
                break;
            }
        }
        System.out.println("Game Over.");
        scanner.close();
    }
}