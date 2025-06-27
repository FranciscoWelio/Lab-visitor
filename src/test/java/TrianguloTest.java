import ElementoConcreto.Triangulo;
import Visitantes.MaximizarVisitor;
import org.junit.jupiter.api.Test;
import Exception.Exceptions;
import static org.junit.jupiter.api.Assertions.*;
public class TrianguloTest {

    @Test
    public void testCriarTrianguloValido() throws Exceptions {
        Triangulo t = new Triangulo(3, 4, 5, 5);
        assertEquals(3, t.getBase());
        assertEquals(4, t.getAltura());
    }

    @Test
    public void testCriarTrianguloInvalido() {
        assertThrows(Exceptions.class, () -> new Triangulo(0, 4, 5, 5));
    }

    @Test
    public void testMaximizarTriangulo() throws Exceptions {
        Triangulo t = new Triangulo(2, 3, 4, 5);
        new MaximizarVisitor().visitarTriangulo(t);
        assertEquals(4, t.getBase());
        assertEquals(6, t.getAltura());
        assertEquals(8, t.getLado1());
        assertEquals(10, t.getLado2());
    }
}