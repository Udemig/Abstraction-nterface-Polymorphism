package interfaces;

import java.awt.*;

public class Triangel implements Drawable {
    @Override
    public void draw() {
        System.out.println("Ucgen ciizliyor");
    }

    public void makeOver(){
        System.out.println("Ucgen yeniden yapiliyor");
    }
}
