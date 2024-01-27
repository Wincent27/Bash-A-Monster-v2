import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ability heroAbility = new Ability("Fireball", 5);
        List<Ability> heroAbilities = new ArrayList<>();
        heroAbilities.add(heroAbility);

        Weapon sword = new Sword();
        Weapon bow = new Bow();

        Hero hero = createHero(); // Låt användaren välja vapen
        hero.chooseAbility(heroAbility); // Låt hjälten välja en förmåga

        Monster monster = new Monster("MonsterName", new Range(5, 15), 100);

        IceBoss iceBoss = new IceBoss("IceBoss", new Range(15, 25), 200);
        FireBoss fireBoss = new FireBoss("FireBoss", new Range(20, 30), 250);

        Game game = new Game();
        game.startGame();
        game.chooseHero(hero);
        game.battle();
        game.chooseHero(IceBoss);
        game.battle();
        game.chooseHero(FireBoss);
        game.battle();
        game.endGame();

    }


    private static Hero createHero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange hjältens namn:");
        String heroName = scanner.nextLine();

        System.out.println("Välj vapen för hjälten:");
        System.out.println("1. Svärd");
        System.out.println("2. Båge");

        int weaponChoice = scanner.nextInt();
        Weapon selectedWeapon;

        if (weaponChoice == 1) {
            selectedWeapon = new Sword();
        } else if (weaponChoice == 2) {
            selectedWeapon = new Bow();
        } else {
            System.out.println("Ogiltigt val. Standardvapen (Svärd) används.");
            selectedWeapon = new Sword();
        }

        return new Hero(heroName, 100, selectedWeapon, new ArrayList<>());
    }
}
