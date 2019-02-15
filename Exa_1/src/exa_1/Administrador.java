package exa_1;

import java.util.Date;

public class Administrador extends Usuarios {

    public Administrador() {
        super();
    }

    public Administrador(String nombre_u, String contraseña, Date fecha_nace, String numero_t, String correo, String nombre_c, String genero_f) {
        super(nombre_u, contraseña, fecha_nace, numero_t, correo, nombre_c, genero_f);
    }

}
