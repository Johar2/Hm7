public class Main {
    public static void main(String[] args) {
        //3 hero
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 10, "Телепортация");
        heroes[1] = new Medic(120, 5, "Лечение");
        heroes[2] = new Warrior(150, 15, "Критический удар");
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic)
                ((Medic) hero).increaseExperience();
        }
    }
}
