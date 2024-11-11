package ua.ucu.edu.apps.FlowerReboot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ua.ucu.edu.apps.FlowerReboot.delivery.Delivery;
import ua.ucu.edu.apps.FlowerReboot.model.Item;
import ua.ucu.edu.apps.FlowerReboot.payment.Payment;
import ua.ucu.edu.apps.FlowerReboot.user.User;


public class Order {
    private List<User> users = new ArrayList<>();
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items != null ? items : new LinkedList<>();
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public float calculateTotalPrice() {
        float total = 0;
        for(Item item : items) {
            total += item.price();
        }
        return total;
    }

    public String processOrder() {
        float price = calculateTotalPrice();
        String pay = ((payment==null)? "null":payment.toString());
        String del = ((delivery==null)? "null":delivery.toString());
        return items.toString()+ pay + del+ price;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    private void notifyUsers() {
        for (User user : users) {
            user.update("Order notification");
        }
    }

    public void order() {
        notifyUsers();
    }
}
