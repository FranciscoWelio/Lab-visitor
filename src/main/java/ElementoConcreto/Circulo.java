package ElementoConcreto;

import Interface.ElementoIF;
import Interface.VisitorIF;
import Exception.Exceptions;

public class Circulo implements ElementoIF {
    double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws Exceptions {
        if (raio<=0){
            throw new Exceptions("Valor inválido para raio");
        }
        this.raio = raio;
    }

    public Circulo(double raio) throws Exceptions{
        setRaio(raio);
    }



    @Override
    public void aceitarVisita(VisitorIF visitor) throws Exceptions {
        visitor.visitarCirculo(this);
    }
}
