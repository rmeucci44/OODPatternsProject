package org.example;

public class Heal implements Command {
    private Player player;
    private int amount;

    public Heal(Player player, int amount){
        this.player = player;
        this.amount = amount;
    }
    @Override
    public void execute(){
        player.heal(amount);
    }
}
