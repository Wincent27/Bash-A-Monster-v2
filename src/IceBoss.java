import java.util.ArrayList;
import java.util.List;

    public class IceBoss extends Boss {
        public IceBoss(String name, Range attackDamage, int health) {
            super(name, attackDamage, health, createIceBossAbilities());
        }

        private static List<Ability> createIceBossAbilities() {
            List<Ability> abilities = new ArrayList<>();
            abilities.add(new Ability("Frostbite", 10));
            abilities.add(new Ability("Ice Shield", 5));
            return abilities;
        }
    }

