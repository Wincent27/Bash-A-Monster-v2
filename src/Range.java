public class Range { // Definierar Range-klassen.
    private int min;
    private int max;
    // Privata instansvariabler för minsta och största värdena i ett intervall.

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    } // Konstruktor som skapar ett Range-objekt med givna minsta och största värden.

    public int getMin() {
        return min;
    }// Getter-metod för att hämta det minsta värdet i intervallet.

    public int getMax() {
        return max;
    } // Getter-metod för att hämta det största värdet i intervallet.
}
