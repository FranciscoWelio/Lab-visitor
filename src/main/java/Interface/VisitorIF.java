package Interface;

import ElementoConcreto.Circulo;
import ElementoConcreto.Retangulo;
import ElementoConcreto.Trapezio;
import ElementoConcreto.Triangulo;
import Exception.Exceptions;

public interface VisitorIF {
    void visitarCirculo(Circulo c) throws Exceptions;
    void visitarRetangulo(Retangulo r) throws Exceptions;
    void visitarTriangulo(Triangulo t) throws Exceptions;
    void visitarTrapezio(Trapezio tz) throws Exceptions;
}
