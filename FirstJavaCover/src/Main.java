import abstraction.Bike;
import abstraction.Tesla;
import abstraction.Volvo;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1 ABSTRACT
    //Abstract metotlardaki idea(Genel mantik) uygulanmalidir, 1 tane uygulanir max
    //Metot abstract degilse size bagli,
        // ilk yontem
        Volvo volvo = new Volvo();
        volvo.run();
        volvo.brakeSystem();
        Tesla tesla = new Tesla();
        tesla.run();
        tesla.changeGear();
        System.out.println("Tesla faiz Orani: " + tesla.getRateOfInterestForBike());

        // 2. yontem
        Bike volvoBike = new Volvo();
        volvoBike.run();
        volvo.changeGear();

        System.out.println("volvoBike faiz Orani: " + volvoBike.getRateOfInterestForBike());


        // 2 INTERFACES bir grup abstract metot barindirir, 1 den cok uygulanabilinir
        // 1. yontem
        Circle circle = new Circle();
        circle.draw();
        circle.makeShadow();
        circle.pickColor();
        System.out.println("circle shape: " + circle.getHeightOfShape());


        // 2. yontem
        Shape rectangel = new Rectangel();
        rectangel.draw();
        rectangel.pickColor();
        System.out.println("rectangel shape: " + rectangel.getHeightOfShape());

        Drawable triangel = new Triangel();
        triangel.draw();


        FilmList filmList = new FilmList();
        filmList.watchFilm();
        filmList.refreshScreen();

    }
}