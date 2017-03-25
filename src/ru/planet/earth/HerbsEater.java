package ru.planet.earth;

public class HerbsEater {
    private String type;
    private float avgHerbAppetite;
    private float avgWaterAppetite;
    private int speed;
    private int population;
    private float popGrowK;

    public HerbsEater(String type, float avgHerbAppetite, float avgWaterAppetite, int speed, int population, float popGrowK) {
        this.type = type;
        this.avgHerbAppetite = avgHerbAppetite;
        this.avgWaterAppetite = avgWaterAppetite;
        this.speed = speed;
        this.population = population;
        this.popGrowK = popGrowK;
    }

    public void decrease(int n) {
        population -= n;
        if (population < 0) population = 0;
    }

    public void eat(Herbs herbs, WaterResources waterResources) {
        herbs.decrease(population * avgHerbAppetite);
        waterResources.decrease(population * avgWaterAppetite);
    }

    public void simulate(Herbs herbs, WaterResources waterResources) {
        eat(herbs, waterResources);
        System.out.println(population);
        population += (int) (population * popGrowK);
        System.out.println(population);
    }

    public void info() {
        System.out.println("HerbsEaters  Population: " + population);
    }
}
