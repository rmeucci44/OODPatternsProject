package org.example;

public class Defend implements Command {
    private Player player;

    public Defend(Player player){
        this.player = player;
    }
    @Override
    public void execute(){
        player.defend();
    }
}
