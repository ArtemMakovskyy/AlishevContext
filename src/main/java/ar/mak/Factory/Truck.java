package ar.mak.Factory;

public class Truck implements Delivery{
    @Override
    public void deliveryFrom() {
        System.out.println("delivering by truck");
    }
}
