import ElementoConcreto.Circulo;
import Interface.ElementoIF;
import Visitantes.MaximizarVisitor;
import org.junit.jupiter.api.Test;
import Exception.Exceptions;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    public void testCriarCirculoValido() throws Exceptions {
        Circulo c = new Circulo(10);
        assertEquals(10, c.getRaio());
    }

    @Test
    public void testCriarCirculoInvalido() {
        assertThrows(Exceptions.class, () -> new Circulo(-5));
    }

    @Test
    public void testMaximizarCirculo() throws Exceptions {
        Circulo c = new Circulo(2);
        MaximizarVisitor max = new MaximizarVisitor();
        c.aceitarVisita(max);
        assertEquals(4, c.getRaio());
    }
}