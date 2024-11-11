package ua.ucu.edu.apps.FlowerReboot.decorators;

import ua.ucu.edu.apps.FlowerReboot.model.Item;

public class PaperDecorator extends ItemDecorator {
    
    public PaperDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price(){
        return 13 + item.price();
    }
}
