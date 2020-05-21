package TheDungeon.Gamesettings;

import java.util.Random;

/**
 * @author Victor Silva - 18265 Student Number: 18265 - Final project The
 * Dungeon 05/15/2020
 */

    //This class will create and manager the whole game control
public class GameControl {

    Random rand = new Random(); // Random used to interaction.
    Characters player = new Characters();
    Enemies enemy = new Enemies();
    public String attackResult = "";

    
    private int enemyHealth; //Create the Random HP to the enemies.
    private String monster; //The Enemie's HP goes to receive a Random.
    private String boss; // Boss = Name / Attack
    private int bossHealth; //Boss HP
    
    
    //# Enimies will randomly appear
    public String enemyAppears() {

        this.enemyHealth = rand.nextInt(enemy.getMaxEnemyHealth()); //Create the Random HP to the enemies. 
        this.monster = enemy.getMonsters()[rand.nextInt(enemy.getMonsters().length)]; //The Enemie's HP goes to receive a Random.
        return monster + " has appeared!\nMonster HP: " + enemyHealth;
    }
    
     public String bossAppers() {
        this.bossHealth = enemy.getBossHealth(); 
        this.boss = enemy.getBossName();
        return boss + " HAS APPERARED, NOOOOOOOOOOOOO!\n\nDARK LEPRECHAUN HP: " + bossHealth;
    }
    
     // BOOS FIGHT method
    public String bossFight() {

        String result = "";
        int damageDealt = rand.nextInt(player.getAttackDamage()); //Create the Random Attack on your enemies. 
        int damageTaken = rand.nextInt(enemy.getBossAttackDamege()); //Create the Random Attack from your enemies on you. 

        bossHealth -= damageDealt; //It goes to get the DARK minus the RandomDamage.
        player.setHealth(player.getHealth() - damageTaken); //It goes to get the Player HP minus the RandomDamage.
        //it shows your damaged taken by the enemy.
        //it shows to the player the hit on their enemies.
        result = "You strike the " + boss + " for " + damageDealt + " damage. "
                + "\nYou recieve " + damageTaken + " in retaliation!\n"
                + "\n " + boss + " has " + bossHealth + " HP left.";
        result += ContinueBossBattle();
        return result;
    }
     
    //it will appear if the player Won BOOS BATTLE.
    public void WonBossBattle() {

        System.out.println("\n" + boss + " was defeated! \n"
                + "HOW IT IS POSSIBLEEE\n\n"
                + "Congratulations PLAYER");
    }
    
    // BOSS choiceAction
    public String BosschoiceAction(String action) {
        this.enemyHealth = rand.nextInt(enemy.getMaxEnemyHealth()); //reset the HP of enemy 
        attackResult = "";
        String result = "";
        switch (action) {
            case "Attack":
                result = bossFight();
                // code block
                break;
            case "Drink Portion":
                result = drinkPortion();
                break;
            case "Run":
                result = run();
                break;
            default:
        }
        return result;
    }
    
    
    //choiceAction Enemies
    public String choiceAction(String action) {
        String result = "";
        switch (action) {
            case "Attack":
                result = attack();
                // code block
                break;
            case "Drink Portion":
                result = drinkPortion();
                break;
            case "Run":
                result = run();
                break;
            default:
        }
        return result;
    }
    
    //Attack method
    public String attack() {

        String result = "";
        int damageDealt = rand.nextInt(player.getAttackDamage()); //Create the Random Attack on your enemies. 
        int damageTaken = rand.nextInt(enemy.getEnemyAttackDamage()); //Create the Random Attack from your enemies on you. 

        enemyHealth -= damageDealt; //It goes to get the enemyHP minus the RandomDamage.
        player.setHealth(player.getHealth() - damageTaken); //It goes to get the Player HP minus the RandomDamage.
        //it shows your damaged taken by the enemy.
        //it shows to the player the hit on their enemies.
        result = "You strike the " + monster + " for " + damageDealt + " damage. "
                + "\nYou recieve " + damageTaken + " in retaliation!\n";
        result += ContinueBattle();
        return result;
    }

    //This method will run If the player has Potion.
    public String drinkPortion() {

        String result;
        if (player.getNumHealthPotions() > 0) { //If the number of potions is greater than 0.
            player.setHealth(player.getHealthPotionsHealAmount() + player.getHealth()); //HP + POTIONS.
            player.setNumHealthPotions(player.getNumHealthPotions() - 1);//IT SHOWS THE NUMBER THE POTIONS LESS 1.
            result = "\nYou drink a health portion \nfor healing yourself for " + player.getHealthPotionsHealAmount() + "."
                    //IT SHOWS THE NUMBER THE POTIONS LESS 1.
                    + "\n\t> You now have " + player.getHealth() + " HP."
                    + "\n\t> You have " + player.getNumHealthPotions() + " health portions left.\n";
        } else {
            result = " You have no health potions left! Defeat enemies for a chance to get one!!! ";
        }
        return result;
    }

    //run method
    public String run() {
        return "COWARD COWARD COWARD\n\nYou run away from the " + monster + ".";
    }

    //it will appear if the player Won the battle.
    public void WonBattle() {

        System.out.println("\n" + monster + " was defeated! ");
        System.out.println("\n You have " + player.getHealth() + " HP left.");
        if (rand.nextInt(100) < player.getHealthPotionsDropChance()) { //DROP CHANCE RANDOM CHANCE
            player.setNumHealthPotions(player.getNumHealthPotions() + 1);
            System.out.println("  The " + monster + " Dropped a health potion!");
            System.out.println("  You now have " + player.getNumHealthPotions() + " health potion(s).  ");
        }
    }

    //Continue Battle will run if the game is not over
    public String ContinueBattle() {
        String result = "";
        attackResult = "";

        if (player.getHealth() < 1) { // IT GOES TO APPEAR IF THE HP IS LESS THAN 1. 
            result = "\n\t<< GAME OVER >>\n\nYou have taken too much damage,\nyou are too weak to go on!";
            attackResult = "gameOver";
        } else if (enemyHealth <= 0) {
            result = monster + " was defeated!\n\n\t < You have " + player.getHealth() + " HP left.>\n";
            attackResult = "wonBattle";
            if (rand.nextInt(100) < player.getHealthPotionsDropChance()) { //DROP CHANCE RANDOM CHANCE
                player.setNumHealthPotions(player.getNumHealthPotions() + 1);
                result += "The " + monster + " Dropped a health portion!\n ";
                result += "You now have " + player.getNumHealthPotions() + " health portion(s).";
            }
        }
        return result;
    }

     //Continue Battle will run if the game is not over
    public String ContinueBossBattle() {
        String result = "";
        attackResult = "";

        if (player.getHealth() < 1) { // IT GOES TO APPEAR IF THE HP IS LESS THAN 1. 
            result = "\n\t<< GAME OVER >>\n\nYou have taken too much damage,\nyou are too weak to go on!";
            attackResult = "gameOver";
        } else if (bossHealth <= 0) {
            result = "\n"+ boss + " was defeated!\n\n\t < You have " + player.getHealth() + " HP left.>\n";
            attackResult = "wonBossBattle";
            if (rand.nextInt(100) < player.getHealthPotionsDropChance()) { //DROP CHANCE RANDOM CHANCE
                player.setNumHealthPotions(player.getNumHealthPotions() + 1);
                result += "The " + boss + " Dropped a health portion!\n ";
                result += "You now have " + player.getNumHealthPotions() + " health portion(s).";
            }
        }
        return result;
    }
}
