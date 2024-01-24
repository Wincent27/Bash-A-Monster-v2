import java.util.ArrayList;
import java.util.List;

public class FireBoss extends Boss {
    public FireBoss(String name, Range attackDamage, int health) {
        super(name, attackDamage, health, createFireBossAbilities());
    }

    private static List<Ability> createFireBossAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Inferno", 15));
        abilities.add(new Ability("Fireball Barrage", 8));
        return abilities;
    }

}
