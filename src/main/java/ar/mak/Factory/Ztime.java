package ar.mak.Factory;

public class Ztime {
    public static void main(String[] args) {
        System.out.println("https://refactoring.guru/ru/design-patterns/factory-method");
        Fuctory f = new FuctoryTruck();
        Delivery d = f.getDelivery();
        d.deliveryFrom();

    }
}
