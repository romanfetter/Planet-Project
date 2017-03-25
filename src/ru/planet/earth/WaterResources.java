package ru.planet.earth;

public class WaterResources {
    private float amount;
    private float addRate;

    public WaterResources(float amount, float addRate) {
        this.amount = amount;
        this.addRate = addRate;
    }

    public void simulate() {
        amount += addRate;
    }

    public void decrease(float n) {
        amount -= n;
    }

    public void info() {
        System.out.println("Water Resources: " + amount);
    }
}
