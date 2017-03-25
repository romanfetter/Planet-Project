package ru.planet.earth;

public class Land {
    private Herbs herbs;
    private HerbsEater herbsEaters;
    private WaterResources waterResources;
    private Predator predators;

    public Land() {
        herbs = new Herbs(true, 1000.0f, 150.0f, 0.05f);
        herbsEaters = new HerbsEater("Zebra", 1.0f, 0.5f, 40, 200, 0.16f);
        waterResources = new WaterResources(1000.0f, 200.0f);
        predators = new Predator("Lion", 1.0f, 1.0f, 80, 30);
    }

    public void simulate() {
        for (int i = 0; i < 120; i++) {
            System.out.println("MONTH #" + (i + 1));
            waterResources.simulate();
            herbs.simulate(waterResources);
            herbsEaters.simulate(herbs, waterResources);
            predators.simulate(herbsEaters, waterResources);
            waterResources.info();
            herbs.info();
            herbsEaters.info();
            predators.info();
            System.out.println("-----------------");
        }
    }
}
