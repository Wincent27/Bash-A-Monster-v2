public class Weapon { // Definierar Weapon-klassen.
    private String name;
    private Range damageRange;
    // Privata instansvariabler för vapnets namn och skada (ett Range-objekt som representerar skaderäckvidden).

        public Weapon(String name, Range damageRange){
            this.name = name;
            this.damageRange = damageRange;
        } // Konstruktor som skapar ett Weapon-objekt med givet namn och skaderäckvidd.

        public Range attack() {
            return damageRange;
        }// Metod som utför ett vapenangrepp och returnerar skaderäckvidden.
}
