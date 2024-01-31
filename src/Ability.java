public class Ability { // Definierar Java-klassen med namnet "Ability".
    private String name;
    private int extraDamage;
    // ^ Privata instansvariabler för namn och extra skada.

    // Konstruktor för instansiering av Ability med namn och extra skada.
    public Ability(String name, int extraDamage){
        this.name = name;
        this.extraDamage = extraDamage;
    }

    // Getter-metod för att hämta extra skada.
    public int getExtraDamage() {
        return extraDamage;
    }
}
