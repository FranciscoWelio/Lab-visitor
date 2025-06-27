package Visitantes;

import ElementoConcreto.Circulo;
import ElementoConcreto.Retangulo;
import ElementoConcreto.Trapezio;
import ElementoConcreto.Triangulo;
import Interface.VisitorIF;

public class DesenharVisitor implements VisitorIF {
    @Override
    public void visitarCirculo(Circulo c) {
        System.out.println("Desenhando círculo de Raio: " +c.getRaio());
    }

    @Override
    public void visitarRetangulo(Retangulo r) {
        System.out.println("Desenhando retângulo de altura: "+ r.getAltura() + " e largura: "+r.getLargura());
    }

    @Override
    public void visitarTriangulo(Triangulo t) {
        System.out.println("Desenhando triângulo de base: " +t.getBase()+", lado1: " + t.getLado1() +" e lado2: "+t.getLado2());
    }

    @Override
    public void visitarTrapezio(Trapezio tz) {
        System.out.println("Desenhando trapézio de bases: "+ tz.getBaseMaior() + " e "+tz.getBaseMenor() +" lado1: "  + tz.getLado1() + " e lado2: " +tz.getLado2());
    }
}
