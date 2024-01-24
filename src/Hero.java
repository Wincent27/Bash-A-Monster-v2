import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hero {
    private String name;
    private int health;
    private Weapon weapon;
    private List<Ability> abilities;

    public String getName() {
        return name;
    }
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

    public void chooseAbility(Ability ability) {
        abilities.add(ability);
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
        System.out.println(name + "har bytt till" + newWeapon.getClass().getSimpleName());
    }
    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if(health < 0){
            health = 0;
        }
    }

    public boolean isDefeated(){
        return health <= 0;
    }

    public static Hero createHero(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ange hjältens namn: ");
        String heroName = scan.nextLine();

        System.out.println("Välj vapen till din hjälte: ");
        System.out.println("1. Svärd");
        System.out.println("2. Pilbåge");

        int weaponChoice = scan.nextInt();
        Weapon selectedWeapon;

        if(weaponChoice == 1){
            selectedWeapon = new Sword();
        } else if (weaponChoice == 2){
            selectedWeapon = new Bow();
        } else{
            System.out.println("Ogiltigt val. Standardvapnet Svärd används!");
            selectedWeapon = new Sword();
        }

        return new Hero(heroName, 100, selectedWeapon, new ArrayList<>());

    }
}
