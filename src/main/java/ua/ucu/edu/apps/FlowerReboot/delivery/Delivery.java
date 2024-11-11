package ua.ucu.edu.apps.FlowerReboot.delivery;

import java.util.List;

import ua.ucu.edu.apps.FlowerReboot.model.Item;

public interface Delivery {
    void deliver(List<Item> items);
}
