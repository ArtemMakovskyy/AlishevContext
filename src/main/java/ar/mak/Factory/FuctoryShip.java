package ar.mak.Factory;

public class FuctoryShip implements Fuctory{
    @Override
    public Delivery getDelivery() {
        return new Ship();
    }
}
