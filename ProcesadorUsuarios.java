import java.util.List;

public class ProcesadorUsuarios {
    public String procesarLista(List<String> dataList) {
        String admins = "";
        String invitados = "";

        for (String u : dataList) {
            String[] parts = u.split(":");
            if (parts.length == 2) {
                String nombre = parts[0];
                int rol = Integer.parseInt(parts[1]);

                if (rol == 1) {
                    admins += nombre + ",";
                } else if (rol == 2) {
                    invitados += nombre + ",";
                }
            }
        }
        return "Admins: " + admins + " | Invitados: " + invitados;
    }
}