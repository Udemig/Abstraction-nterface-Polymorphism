package interfaces;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Daire sekli ciziliyor");
    }
    public void makeShadow(){
        System.out.println("Daire golge ciziliyor");
    }

    @Override
    public int getHeightOfShape() {
        return 10;
    }

    @Override
    public void pickColor() {
        System.out.println("Daire renk ciziliyor");
    }
}
