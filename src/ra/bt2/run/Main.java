package ra.bt2.run;

import ra.bt2.shape.Square;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[4] ;
        Square square1 = new Square(5, true);
        Square square2 = new Square(6, false);
        Square square3 = new Square(7, true);
        Square square4 = new Square(8, false);
        squares[0] = square1;
        squares[1] = square2;
        squares[2] = square3;
        squares[3] = square4;
        for (int i = 0; i < squares.length; i++) {
            if ( squares[i].isColorable() == true) {
                squares[i].howToColor();
                squares[i].printSquara();
            }
        }
    }
}
