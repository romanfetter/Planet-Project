package ru.planet.earth;

public class Predator {
    private String type;
    private float avgMeatAppetite;
    private float avgWaterAppetite;
    private int speed;
    private int population;

    public Predator(String type, float avgMeatAppetite, float avgWaterAppetite, int speed, int population) {
        this.type = type;
        this.avgMeatAppetite = avgMeatAppetite;
        this.avgWaterAppetite = avgWaterAppetite;
        this.speed = speed;
        this.population = population;
    }

    public void eat(HerbsEater herbsEater, WaterResources waterResources) {
        herbsEater.decrease((int)(population * avgMeatAppetite));
        waterResources.decrease(population * avgWaterAppetite);
    }

    public void simulate(HerbsEater herbsEater, WaterResources waterResources) {
        eat(herbsEater, waterResources);
    }

    public void info() {
        System.out.println("Predators  Population: " + population);
    }
}
