package abstraction;

public class Volvo extends Bike{
    @Override
    public void run() {
        System.out.println("volvo guvenli sekilde suruluyor");
    }

    @Override
    public int getRateOfInterestForBike() {
        return 5;
    }

    public void brakeSystem(){
        System.out.println("volvo brakeSystem duzgun calisti");

    }

    @Override
    public void changeGear() {
        System.out.println(" Volvo sistemi otomatiktir siz degistiremezsiniz");
    }
}
