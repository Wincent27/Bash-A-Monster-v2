import java.util.List;

public class Boss extends Monster { //Definierar klassen Boss som en subklass till Monster.
    private List<Ability> bossAbilities; // Privat variabel för bossens förmågor (en lista av Ability-objekt).

    // Konstruktor som tar emot namn, attackskada, hälsa och bossens förmågor.
    // Anropar superklassens konstruktor och tilldelar bossAbilities.
    public Boss(String name, Range attackDamage, int health, List<Ability> bossAbilities){
        super(name, attackDamage, health);
        this.bossAbilities = bossAbilities;
    }

    // Getter för bossens förmågor.
    public List<Ability> getBossAbilities(){
        return bossAbilities;
    }

    // Metod för en speciell attack. Skriver ut ett meddelande till konsolen.
    public void spceialAttack() {
        System.out.println("Bossen gör en spedcial attack!");
    }
}
