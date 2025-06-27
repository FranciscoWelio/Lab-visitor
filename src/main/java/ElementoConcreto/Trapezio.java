package ElementoConcreto;

import Interface.ElementoIF;
import Interface.VisitorIF;
import Exception.Exceptions;

public class Trapezio implements ElementoIF {
    double baseMaior;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) throws Exceptions{
        setBaseMaior(baseMaior);
        setBaseMenor(baseMenor);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) throws Exceptions{
        if (baseMaior<=0){
            throw new Exceptions("Valor inválido para baseMaior");
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) throws Exceptions{
        if (baseMenor<=0){
            throw new Exceptions("Valor inválido para baseMenor");
        }
        this.baseMenor = baseMenor;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws Exceptions {
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
        visitor.visitarTrapezio(this);
    }
}
