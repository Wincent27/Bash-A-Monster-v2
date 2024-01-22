import java.util.List;

public class Boss extends Monster {
    private List<Ability> bossAbilities;

    public Boss(String name, Range attackDamage, int health, List<Ability> bossAbilities){
        super(name, attackDamage, health);
        this.bossAbilities = bossAbilities;
    }

    public List<Ability> getBossAbilities(){
        return bossAbilities;
    }
    public void spceialAttack() {

        //Skapa specialattacks logiken
        System.out.println("Bossen gör en spedcial attack!");
    }
}
