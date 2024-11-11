package ua.ucu.edu.apps.FlowerReboot.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Payment method : PayPal");
        System.out.println("Grand total : " + price);
    }

    @Override
    public String toString() {
        return "PayPalPaymentStrategy{}";
    }
}
