public class Monster {
    private String name;
    private Range attackDamage;
    private int health;

    public Monster(String name, Range attackDamage, int health){
        this.name = name;
        this.attackDamage = attackDamage;
        this.health = health;
    }

    public Range getAttackDamage(){
        return attackDamage;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0){
            health = 0;
        }
    }

    public boolean isDefeated() {
        return health <= 0;
    }
}
