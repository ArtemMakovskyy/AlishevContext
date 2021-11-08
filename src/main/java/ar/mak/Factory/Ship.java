package ar.mak.Factory;

public class Ship implements Delivery{
    @Override
    public void deliveryFrom() {
        System.out.println("delivering by ships");
    }
}
