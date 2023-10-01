package ra.bt2.shape;

import ra.bt2.colorable.Colorable;

public class Square implements Colorable {
    private int size ;
    private boolean colorable ;

    public Square() {

    }

    public Square(int size, boolean colorable) {
        this.size = size;
        this.colorable = colorable;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public int dienTich() {
        return size*size;
    }

    public void printSquara() {
        System.out.println("Dien tich hinh vuong co canh " + size + " = " + dienTich() );
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
