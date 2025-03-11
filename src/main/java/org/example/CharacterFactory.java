package org.example;

public class CharacterFactory {

    public static Character createCharacter(String type, String name) {
        if (type.equalsIgnoreCase("Player")) {
            return new Player(name);
        }
        else if (type.equalsIgnoreCase("Enemy")) {
            Enemy goblin = new Goblin(name);
            return new GoblinEnemyAdapter(goblin);
        }
        throw new IllegalArgumentException("Unknown character type: " + type);
    }
}
