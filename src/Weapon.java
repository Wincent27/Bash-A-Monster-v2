public class Weapon {
    private String name;
    private Range damageRange;

        public Weapon(String name, Range damageRange){
            this.name = name;
            this.damageRange = damageRange;
        }

        public Range attack() {
            return damageRange;
        }
}
