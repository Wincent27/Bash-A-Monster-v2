import java.util.ArrayList;
import java.util.List;

   //Definierar klassen IceBoss som en subklass till boss.
    public class IceBoss extends Boss {


        public IceBoss(String name, Range attackDamage, int health) {
            super(name, attackDamage, health, createIceBossAbilities());
        }
       // Konstruktor som skapar en IceBoss med givet namn, attackskada och hälsa.
       // Samt en lista av IceBossens förmågor som skapas av createIceBossAbilities-metoden.
       // Anropar superklassens konstruktor.

        private static List<Ability> createIceBossAbilities() {
            List<Ability> abilities = new ArrayList<>();
            abilities.add(new Ability("Frostbite", 10));
            abilities.add(new Ability("Ice Shield", 5));
            return abilities;
            // Metod som skapar och returnerar en lista av Ability-objekt för IceBossens förmågor.
            // Inklusive "Frostbite" och "Ice Shield" med deras respektive extra skada.
        }
    }

