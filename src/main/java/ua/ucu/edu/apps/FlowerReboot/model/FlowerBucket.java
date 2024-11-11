package ua.ucu.edu.apps.FlowerReboot.model;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<Flower> flowers = new ArrayList<>();

    public void add(Flower flower) {
        flowers.add(flower);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder(
            "Flower Bucket containing: ");
        for (Flower flower : flowers) {
            description.append(flower.getDescription()).append("; ");
        }
        return description.toString();
    }

    @Override
    public double price() {
        return flowers.stream()
                        .mapToDouble(Flower::price).sum();
    }
}
