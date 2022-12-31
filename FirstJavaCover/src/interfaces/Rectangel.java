package interfaces;

public class Rectangel implements Shape{
    @Override
    public void draw() {
        System.out.println("Dikdortgen sekli ciziliyor");
    }

    public void makeShadow(){
        System.out.println("Dikdortgen golge ciziliyor");
    }

    @Override
    public int getHeightOfShape() {
        return 5;
    }

    @Override
    public void pickColor() {
        System.out.println("Dikdortgen renk ciziliyor");

    }
}
