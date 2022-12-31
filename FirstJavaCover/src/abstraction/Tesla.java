package abstraction;

public class Tesla extends Bike{
    @Override
    public void run() {
        System.out.println("Tesla guvenli sekilde suruluyor");
    }

    @Override
    public int getRateOfInterestForBike() {
        return 7;
    }

    public void frontWindow(){
        System.out.println("Tesla frontWindow gorsel hizmet sagliyor");

    }

}
