package TheDungeon.Gamesettings;

/**
 * @author Victor Silva - 18265 Student Number: 18265 - Final project The
 * Dungeon 05/15/2020
 */
import java.util.Random;

public class Characters {

    //The whole Character attribute is here.
    private int health = 100;
    private String[] weapon = {"Knife", "Pipe", "Staff", "Whip"};
    private String weapon1;
    private int attackDamage = 50;
    private int numHealthPotions = 3;
    private int healthPotionsHealAmount = 35;
    private int healthPotionsDropChance = 30; //Porcentage to drop something

    public Characters() {
        setWeapon(weapon);
    }

    //Below - All Getters and Setters
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
