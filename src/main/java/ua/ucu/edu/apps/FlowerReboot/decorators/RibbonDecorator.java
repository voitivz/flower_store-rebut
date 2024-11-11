package ua.ucu.edu.apps.FlowerReboot.decorators;

import ua.ucu.edu.apps.FlowerReboot.model.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double price(){
        return 40 + item.price();
    }
}
