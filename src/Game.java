import java.util.Random;
import java.util.Scanner;

public class Game {
    private Hero currentHero;
    private Monster currentMonster;
    private int defeatedMonsters;

    public void startGame() {
        System.out.println("Spelet har startat!");
    }

    public void chooseHero(Hero hero) {
        currentHero = hero;
        System.out.println("Du har valt hjälten " + currentHero.getName() + ".");
    }

    public void battle() {

        if (currentHero != null && currentMonster != null) {
            Range heroAttack = currentHero.attack();
            Range monsterAttack = currentMonster.getAttackDamage();

            int heroDamage = generateRandomDamage(heroAttack);
            int monsterDamage = generateRandomDamage(monsterAttack);

            currentHero.takeDamage(monsterDamage);
            currentMonster.takeDamage(heroDamage);

            System.out.println("Hjälten gör " + heroDamage + " skada.");
            System.out.println("Monstret gör " + monsterDamage + " skada.");

            if (currentHero.isDefeated()) {
                System.out.println("Hjälten besegrad! Spelet avslutas.");
                endGame();
            } else if (currentMonster.isDefeated()) {
                defeatedMonsters++;
                System.out.println("Monstret besegrat! Du har nu besegrat " + defeatedMonsters + " monster.");
                spawnNewMonster(); // Slumpmässigt generera ett nytt monster
            }
        }
    }

    private int generateRandomDamage(Range damageRange) {
        return new Random().nextInt(damageRange.getMax() - damageRange.getMin() + 1) + damageRange.getMin();
    }

    private void spawnNewMonster() {
        currentMonster = createRandomMonster();
        System.out.println("Ett nytt monster har dykt upp: " + currentMonster.getName());
    }

    private Monster createRandomMonster() {

        return new Monster("RandomMonster", new Range(10, 20), 50);
    }
    public void endGame() {
        System.out.println("Spelet har avslutats.");
    }
}
