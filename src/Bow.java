import java.util.List;

public class Bow extends Weapon { //Definierar Bow-klassen som en subklass till Weapon.
    public Bow(){
        super("Bow", new Range(10,20)); // Konstruktor som skapar en Bow med namnet "Bow" och ett attackområde på 10 till 20 (inklusive). Anropar superklassens konstruktor.

    }
}
