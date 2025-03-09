package org.example;

import java.util.Random;

public class CommandFactory {
    public static Command createCommand(int choice, Player player, Enemy enemy, Random random){
        return switch (choice){
            case 1 -> new Attack(player, enemy);
            case 2 -> new Defend(player);
            case 3 -> new Heal(player, random.nextInt(3) + 1);
            default -> null;
        };
    }
}
