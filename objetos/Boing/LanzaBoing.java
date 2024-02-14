import boing.*;
import boing.objs.*;
import java.util.ArrayList;

public class LanzaBoing {

        public static void main(String[] args) {

        ArrayList<Objeto> objs = new ArrayList<Objeto>();

        Campo camp = new Campo(50, 30);

        objs.add(new Cuadrado(new Posicion(5, 5), 1, 1));
        objs.add(new Cuadrado(new Posicion(20, 20), 1, -1));
        objs.add(new Cuadrado(new Posicion(30, 20), 1, -1));
        objs.add(new Cuadrado(new Posicion(40, 25), -1, 1));
        objs.add(new Cuadrado(new Posicion(35, 10), -1, -1));
        objs.add(new Rectangulo(new Posicion(40, 15), 1, 1));
        objs.add(new Rectangulo(new Posicion(5, 10), 1, -1));
        objs.add(new Triangulo(new Posicion(30, 15), 1, 1));
        objs.add(new Triangulo(new Posicion(30, 10), 1, -1));

        Boing.boing(camp, objs);

    }

}