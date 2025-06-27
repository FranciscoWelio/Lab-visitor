package Interface;
import Exception.Exceptions;
public interface ElementoIF {
    void aceitarVisita(VisitorIF visitor) throws Exceptions;
}
