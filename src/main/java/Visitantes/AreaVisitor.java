package Visitantes;

import ElementoConcreto.Circulo;
import ElementoConcreto.Retangulo;
import ElementoConcreto.Trapezio;
import ElementoConcreto.Triangulo;
import Interface.VisitorIF;

public class AreaVisitor implements VisitorIF {
    @Override
    public void visitarCirculo(Circulo c) {
        double area = 3.14 * (c.getRaio() * c.getRaio());
        System.out.println("Área do círculo: " + area);
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        double area = r.getAltura() *r.getLargura();
        System.out.println("Área do retângulo: " + area);
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        double area = (t.getBase() * t.getAltura())/2;
        System.out.println("Área do triângulo: " + area);
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        double area =( (tz.getBaseMaior() + tz.getBaseMenor())*tz.getAltura())/2;
        System.out.println("Área do trapézio: " + area);
    }
}
