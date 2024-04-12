package entitites;

public class Fisica extends Tax {

    private double health;
    public Fisica(String name, Double anualIncome, Double health) {
        super(name, anualIncome);
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() > 20000) {
            return  getAnualIncome() * 0.15 - health * 0.5;
        }
        else {
            return getAnualIncome() * 0.25 - health * 0.5;
        }
    }
}
