package Visitantes;

import ElementoConcreto.Circulo;
import ElementoConcreto.Retangulo;
import ElementoConcreto.Trapezio;
import ElementoConcreto.Triangulo;
import Interface.VisitorIF;
import Exception.Exceptions;

public class MaximizarVisitor implements VisitorIF {
    @Override
    public void visitarCirculo(Circulo c) throws Exceptions{
        if (c.getRaio()<=0){
            throw new Exceptions("Valor invalido para maximizar: ");
        }
        c.setRaio(c.getRaio()*2);
        System.out.println("Máxizar círculo: " +c.getRaio());
    }

    @Override
    public void visitarRetangulo(Retangulo r) throws Exceptions{
        if (r.getAltura() <=0 || r.getLargura() <=0){
            throw new Exceptions("Valores invalidos para maximizar: ");
        }
        r.setAltura(r.getAltura() * 2);
        r.setLargura(r.getLargura() *2);
        System.out.println("Máxizar retangulo: \nlargura: " + r.getLargura() +" e altura: " + r.getAltura());
    }

    @Override
    public void visitarTriangulo(Triangulo t) throws Exceptions{
        if (t.getAltura() <=0 || t.getBase() <=0||t.getLado1()<=0|| t.getLado2() <=0){
            throw new Exceptions("Valores invalidos para maximizar: ");
        }
        t.setAltura(t.getAltura()*2);
        t.setBase(t.getBase()*2);
        t.setLado1(t.getLado1()*2);
        t.setLado2(t.getLado2()*2);
        System.out.println("Máxizar Triângulo: \nAltura: "+t.getAltura() + " ,Base: " + t.getBase() + ", lado 1: "+t.getLado1() + " e lado2: " +t.getLado2());
    }

    @Override
    public void visitarTrapezio(Trapezio tz) throws Exceptions {
        if (tz.getAltura() <=0 || tz.getBaseMaior() <=0||tz.getBaseMenor()<=0||tz.getLado1()<=0|| tz.getLado2() <=0){
            throw new Exceptions("Valores invalidos para maximizar: ");
        }
        tz.setAltura(tz.getAltura()*2);
        tz.setLado1(tz.getLado1()*2);
        tz.setLado2(tz.getLado2()*2);
        tz.setBaseMenor(tz.getBaseMenor()*2);
        tz.setBaseMaior(tz.getBaseMaior()*2);
        System.out.println("Máxizar Trapézio: \nAltura: "+ tz.getAltura() +" ,base Menor: "+ tz.getBaseMenor() + " ,base Maior: "+ tz.getBaseMaior() +" ,lado1: "+tz.getLado1() + " ,lado2: "+tz.getLado2());
    }
}
