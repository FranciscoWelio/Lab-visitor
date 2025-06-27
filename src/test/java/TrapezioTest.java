import ElementoConcreto.Trapezio;
import Visitantes.MaximizarVisitor;
import org.junit.jupiter.api.Test;
import Exception.Exceptions;
import static org.junit.jupiter.api.Assertions.*;
public class TrapezioTest {

    @Test
    public void testCriarTrapezioValido() throws Exceptions {
        Trapezio t = new Trapezio(8, 4, 3, 5, 5);
        assertEquals(8, t.getBaseMaior());
        assertEquals(4, t.getBaseMenor());
    }

    @Test
    public void testCriarTrapezioInvalido() {
        assertThrows(Exceptions.class, () -> new Trapezio(-1, 4, 3, 5, 5));
    }

    @Test
    public void testMaximizarTrapezio() throws Exceptions {
        Trapezio t = new Trapezio(2, 1, 3, 4, 5);
        new MaximizarVisitor().visitarTrapezio(t);
        assertEquals(4, t.getBaseMaior());
        assertEquals(2, t.getBaseMenor());
        assertEquals(6, t.getAltura());
        assertEquals(8, t.getLado1());
        assertEquals(10, t.getLado2());
    }
}