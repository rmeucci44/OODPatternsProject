package org.example;

public class Attack implements Command {
    private Character attacker;
    private Character target;

    public Attack(Character attacker, Character target){
        this.attacker = attacker;
        this.target = target;
    }
    @Override
    public void execute(){
        attacker.attack(target);
    }
}

//Do heal and defend still
