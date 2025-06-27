package ElementoConcreto;

import Interface.ElementoIF;
import Interface.VisitorIF;
import Exception.Exceptions;

public class Retangulo implements ElementoIF {
    double largura;
    double altura;

    public Retangulo(double altura, double largura)throws Exceptions {
        setAltura(altura) ;
        setLargura(largura);
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

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws Exceptions{
        if (largura<=0){
            throw new Exceptions("Valor inválido para largura");
        }
        this.largura = largura;
    }



    @Override
    public void aceitarVisita(VisitorIF visitor) throws Exceptions {
        visitor.visitarRetangulo(this);
    }
}
