import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hero {
    private String name;
    private int health;
    private Weapon weapon;
    private List<Ability> abilities;

    public Hero(String name, int health, Weapon weapon, List<Ability> abilities){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.abilities = abilities;
    }

    public Range attack() {
        Range baseDamage = weapon.attack();
        int totalDamage = baseDamage.getMax() + calculateExtraDamage();
        return new Range(totalDamage, totalDamage);
    }

    private int calculateExtraDamage() {
        int extraDamage = 0;
        for(Ability ability : abilities) {
            extraDamage += ability.getExtraDamage();
        }
            return extraDamage;
    }
}
