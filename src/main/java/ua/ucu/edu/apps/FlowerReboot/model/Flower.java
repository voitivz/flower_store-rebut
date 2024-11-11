package ua.ucu.edu.apps.FlowerReboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Data
@Entity@Table(name="flowers")
public class Flower extends Item {
    private String name;
    private String color;
    private double price;
    private boolean available;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public Flower(String name, String color, double price, boolean available){
        this.name = name;
        this.color = color;
        this.price = price;
        this.available = available;
    }

    public Flower() {}

    @Override
    public String toString() {
        return "Flower{"
                + "name=" + name
                + ", color=" + color
                + ", price=" + price
                + ", available=" + available
                + '}';
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Flower of type " + name
        + " with color " + color
        + ", available " + available;
    }
}


