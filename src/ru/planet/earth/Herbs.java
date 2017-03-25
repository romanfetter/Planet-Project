package ru.planet.earth;

public class Herbs {
    private boolean allWeather;
    private float amount;
    private float growRate;
    private float avgWaterConsume;

    public Herbs(boolean allWeather, float amount, float growRate, float avgWaterConsume) {
        this.allWeather = allWeather;
        this.amount = amount;
        this.growRate = growRate;
        this.avgWaterConsume = avgWaterConsume;
    }

    public void decrease(float n) {
        amount -= n;
    }

    public void simulate(WaterResources waterResources) {
        amount += growRate;
        waterResources.decrease(amount * avgWaterConsume);
    }

    public void info() {
        System.out.println("Herbs: " + amount);
    }
}
