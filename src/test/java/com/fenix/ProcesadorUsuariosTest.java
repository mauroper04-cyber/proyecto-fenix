package com.fenix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class ProcesadorUsuariosTest {
    @Test
    public void testProcesarLista() {
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();
        List<String> lista = Arrays.asList("Ana:1", "Luis:2");
        String resultado = procesador.procesarLista(lista);
        assertEquals("Admins: Ana | Invitados: Luis", resultado);
    }
}