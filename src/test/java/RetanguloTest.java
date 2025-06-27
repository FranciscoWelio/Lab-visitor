import ElementoConcreto.Retangulo;
import Visitantes.MaximizarVisitor;
import org.junit.jupiter.api.Test;
import Exception.Exceptions;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testCriarRetanguloValido() throws Exceptions {
        Retangulo r = new Retangulo(3, 4);
        assertEquals(3, r.getAltura());
        assertEquals(4, r.getLargura());
    }

    @Test
    public void testCriarRetanguloInvalido() {
        assertThrows(Exceptions.class, () -> new Retangulo(0, 4));
    }

    @Test
    public void testMaximizarRetangulo() throws Exceptions {
        Retangulo r = new Retangulo(2, 5);
        new MaximizarVisitor().visitarRetangulo(r);
        assertEquals(10, r.getLargura());
        assertEquals(4, r.getAltura());
    }
}