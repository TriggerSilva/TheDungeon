package TheDungeon.Gamesettings;

import java.util.Random;

/**
 * @author Victor Silva - 18265 Student Number: 18265 - Final project The
 * Dungeon 05/15/2020
 */
public class Enemies {

    //The whole enemies attribute is here.
    private String[] monsters = {"Skeleton", "Zombie", "Warrior", "Assassin", "wolf"};
    private int maxEnemyHealth = 80;
    private int enemyAttackDamage = 30;
    
    private String bossName = "DARK Leprechaun";
    private int bossHealth = 999;
    private int BossAttackDamege = 40;
    
    
    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }
   

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossAttackDamege() {
        return BossAttackDamege;
    }

    public void setBossAttackDamege(int BossAttackDamege) {
        this.BossAttackDamege = BossAttackDamege;
    }
   

    //Below - All Getters and Setters
    public String[] getMonsters() {
        return monsters;
    }

    public void setMonsters(String[] monsters) {
        this.monsters = monsters;
    }

    public int getMaxEnemyHealth() {
        return maxEnemyHealth;
    }

    public void setMaxEnemyHealth(int maxEnemyHealth) {
        this.maxEnemyHealth = maxEnemyHealth;
    }

    public int getEnemyAttackDamage() {
        return enemyAttackDamage;
    }

    public void setEnemyAttackDamage(int enemyAttackDamage) {
        this.enemyAttackDamage = enemyAttackDamage;
    }

}
