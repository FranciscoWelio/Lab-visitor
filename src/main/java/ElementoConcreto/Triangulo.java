package ElementoConcreto;

import Interface.ElementoIF;
import Interface.VisitorIF;
import Exception.Exceptions;

public class Triangulo implements ElementoIF {
    double base;
    double altura;
    double lado1;
    double lado2;
    public Triangulo(double base, double altura, double lado1, double lado2) throws Exceptions{
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws Exceptions{
        if (altura<=0){
            throw new Exceptions("Valor inválido para altura");
        }
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws Exceptions{
        if (base<=0){
            throw new Exceptions("Valor inválido para base");
        }
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws Exceptions{
        if (lado1<=0){
            throw new Exceptions("Valor inválido para lado1");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws Exceptions{
        if (lado2<=0){
            throw new Exceptions("Valor inválido para lado2");
        }
        this.lado2 = lado2;
    }


    @Override
    public void aceitarVisita(VisitorIF visitor) throws Exceptions {
        visitor.visitarTriangulo(this);
    }
}
