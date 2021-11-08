package ar.mak.Factory;

public class FuctoryTruck implements Fuctory{
    @Override
    public Delivery getDelivery() {
        return new Truck();
    }
}
