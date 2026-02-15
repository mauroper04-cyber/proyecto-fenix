
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class EjemploPrueba {

    @Test
    public void testProcesarListaComportamientoActual() {
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();
        List<String> lista = java.util.Arrays.asList("Ana:1", "Luis:2", "Eva:1", "Juan:99");
        String resultado = procesador.procesarLista(lista);
        assertEquals("Admins: Ana,Eva, | Invitados: Luis,", resultado);
    }
}