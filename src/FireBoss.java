import java.util.ArrayList;
import java.util.List;

public class FireBoss extends Boss { //Definierar Fireboss-klassen som en subklass till boss.
    public FireBoss(String name, Range attackDamage, int health) {
        super(name, attackDamage, health, createFireBossAbilities());
    } // Konstruktor som skapar en FireBoss med givet namn, attackskada och hälsa, samt en lista av FireBossens förmågor som skapas av createFireBossAbilities-metoden.
    // Anropar superklassens konstruktor.

    private static List<Ability> createFireBossAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Inferno", 15));
        abilities.add(new Ability("Fireball Barrage", 8));
        return abilities;
    } // Metod som skapar och returnerar en lista av Ability-objekt för FireBossens förmågor,
    // inklusive "Inferno" och "Fireball Barrage" med deras respektive extra skada.

}
