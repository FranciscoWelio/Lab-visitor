import ElementoConcreto.Circulo;
import ElementoConcreto.Retangulo;
import ElementoConcreto.Trapezio;
import ElementoConcreto.Triangulo;
import Interface.ElementoIF;
import Interface.VisitorIF;
import Visitantes.AreaVisitor;
import Visitantes.DesenharVisitor;
import Visitantes.PerimetroVisitor;
import Exception.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElementoIF> figuras = new ArrayList<>();
        try{
            figuras.add(new Circulo(10));
            figuras.add(new Retangulo(2,6));
            figuras.add(new Triangulo(-1, 6,7,7));
            figuras.add(new Trapezio(10, 9, 6,4,4));

        } catch (Exceptions e) {
            System.out.println("Erro na criação de figuras: "+e.getMessage());
        }
        VisitorIF desenharEL = new DesenharVisitor();
        VisitorIF areaEL = new AreaVisitor();
        VisitorIF perimetroEL = new PerimetroVisitor();
        VisitorIF maximizarEL = new DesenharVisitor();

        for (ElementoIF figura : figuras){
            try {
                figura.aceitarVisita(desenharEL);
                figura.aceitarVisita(areaEL);
                figura.aceitarVisita(perimetroEL);
                figura.aceitarVisita(maximizarEL);
                System.out.println("----------------");
            }catch (Exceptions e){
                System.out.println("Erro no tratamento dos valores: " +e.getMessage());
            }
        }
    }
}
