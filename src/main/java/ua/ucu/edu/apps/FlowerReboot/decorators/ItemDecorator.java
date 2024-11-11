package ua.ucu.edu.apps.FlowerReboot.decorators;

import ua.ucu.edu.apps.FlowerReboot.model.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public abstract String getDescription();
}
