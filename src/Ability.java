public class Ability {
    private String name;
    private int extraDamage;

    public Ability(String name, int extraDamage){
        this.name = name;
        this.extraDamage = extraDamage;
    }

    public int getExtraDamage() {
        return extraDamage;
    }
}
