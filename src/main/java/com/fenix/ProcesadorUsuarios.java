package com.fenix;

import java.util.List;

public class ProcesadorUsuarios {
    // Definimos CONSTANTES para evitar el "código sucio"
    private static final String SEPARADOR = " | ";
    private static final String PREFIJO_ADMIN = "Admins: ";
    private static final String PREFIJO_INVITADO = "Invitados: ";

    public String procesarLista(List<String> usuarios) {
        StringBuilder admins = new StringBuilder(PREFIJO_ADMIN);
        StringBuilder invitados = new StringBuilder(PREFIJO_INVITADO);

        for (String u : usuarios) {
            String[] partes = u.split(":");
            if (partes[1].equals("1")) {
                admins.append(partes[0]).append(", ");
            } else {
                invitados.append(partes[0]).append(", ");
            }
        }
        // Unimos ambos usando el SEPARADOR constante
        return admins.toString().replaceAll(", $", "") + SEPARADOR + invitados.toString().replaceAll(", $", "");
    }
}