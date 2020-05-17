package TheDungeon.Gamesettings;

import java.util.Random;

public class Characters {

    //All Characters will be here
    private int health = 100;
    private String[] weapon = {"Knife", "Long Sword", "Pipe", "Staff", "Whip"};
    private String weapon1;
    private int attackDamage = 50;
    private int numHealthPotions = 3;
    private int healthPotionsHealAmount = 35;
    private int healthPotionsDropChance = 30; //Porcentage to drop something

    public Characters() {
        setWeapon(weapon);
    }

    public String getWeapon() {
        return weapon1;
    }

    public void setWeapon(String[] weapon) {
        
        this.weapon1 = weapon[new Random().nextInt(weapon.length)];
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }

    public int getHealthPotionsHealAmount() {
        return healthPotionsHealAmount;
    }

    public void setHealthPotionsHealAmount(int healthPotionsHealAmount) {
        this.healthPotionsHealAmount = healthPotionsHealAmount;
    }

    public int getHealthPotionsDropChance() {
        return healthPotionsDropChance;
    }

    public void setHealthPotionsDropChance(int healthPotionsDropChance) {
        this.healthPotionsDropChance = healthPotionsDropChance;
    }
    
    

}
