public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.1);
    }


    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил суперспособность " + getSuperAbilityType());
    }


    public void increaseHealingExperience() {
    }
}




