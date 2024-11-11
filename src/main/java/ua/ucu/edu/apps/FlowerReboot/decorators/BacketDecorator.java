package ua.ucu.edu.apps.FlowerReboot.decorators;

import ua.ucu.edu.apps.FlowerReboot.model.Item;

public class BacketDecorator extends ItemDecorator {
    public BacketDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double price(){
        return 4 + item.price();
    }
    
}
