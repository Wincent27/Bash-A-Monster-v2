public class Sword extends Weapon { // Definierar Sword-klassen som en subklass till Weapon.
    public Sword() {
        super ("Sword", new Range(15,25));
    } // Konstruktor som skapar ett Sword-objekt med namnet "Sword" och ett attackområde på 15 till 25 (inklusive).
    // Anropar superklassens konstruktor.

}
