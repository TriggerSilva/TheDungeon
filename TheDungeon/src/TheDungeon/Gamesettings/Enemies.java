package TheDungeon.Gamesettings;

public class Enemies {
    
    //All enemies will be here
    private String[] monsters = {"Skeleton", "Zombie", "Warrior", "Assassin", "wolf"};
    private int maxEnemyHealth = 80;
    private int enemyAttackDamage = 30;

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
