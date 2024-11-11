package ua.ucu.edu.apps.FlowerReboot;

import static org.junit.jupiter.api.Assertions.*;

import ua.ucu.edu.apps.FlowerReboot.decorators.BacketDecorator;
import ua.ucu.edu.apps.FlowerReboot.decorators.PaperDecorator;
import ua.ucu.edu.apps.FlowerReboot.decorators.RibbonDecorator;
import ua.ucu.edu.apps.FlowerReboot.model.Flower;
import ua.ucu.edu.apps.FlowerReboot.model.Item;

import org.junit.jupiter.api.Test;

public class DecoratorTests {

    @Test
    public void testPaperDecorator() {
        Item flower = new Flower("Rose", "Red", 10.0, true);
        Item decoratedFlower = new PaperDecorator(flower);
        assertEquals("Flower of type Rose with color Red, available true",
                    decoratedFlower.getDescription());
        assertEquals(23.0, decoratedFlower.price());
    }

    @Test
    public void testRibbonDecorator() {
        Item flower = new Flower("Tulip", "Yellow", 12.0, true);
        Item decoratedFlower = new RibbonDecorator(flower);
        assertEquals("Flower of type Tulip with color Yellow, available true",
                    decoratedFlower.getDescription());
        assertEquals(52.0, decoratedFlower.price());
    }

    @Test
    public void testBasketDecorator() {
        Item flower = new Flower("Lily", "White", 15.0, true);
        Item decoratedFlower = new BacketDecorator(flower);
        assertEquals("Flower of type Lily with color White, available true",
                    decoratedFlower.getDescription());
        assertEquals(19.0, decoratedFlower.price());
    }

    @Test
    public void testMultipleDecorators() {
        Item flower = new Flower("Orchid", "Purple", 20.0, true);
        Item decoratedFlower = new PaperDecorator(new RibbonDecorator(new BacketDecorator(flower)));
        assertEquals("Flower of type Orchid with color Purple, available true",
                    decoratedFlower.getDescription());
        assertEquals(77.0, decoratedFlower.price());
    }
}
