package Visitantes;

import ElementoConcreto.Circulo;
import ElementoConcreto.Retangulo;
import ElementoConcreto.Trapezio;
import ElementoConcreto.Triangulo;
import Interface.VisitorIF;

public class PerimetroVisitor implements VisitorIF {
    @Override
    public void visitarCirculo(Circulo c) {
        double perimetro = 2 *3.14* c.getRaio();
        System.out.println("Perimetro do círculo de: " +perimetro);
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        double perimetro = 2 *(r.getLargura() + r.getAltura());
        System.out.println("Perimetro do retângulo de: " +perimetro);
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        double perimetro = t.getBase()+t.getLado2()+t.getLado1();
        System.out.println("Perimetro do triângulo de: " +perimetro);
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        double perimetro = tz.getBaseMaior()+tz.getBaseMenor()+tz.getLado2()+tz.getLado1();
        System.out.println("Perimetro do trapézio de: " +perimetro);
    }
}
