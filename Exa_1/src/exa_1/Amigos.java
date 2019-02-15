package exa_1;

import java.util.Date;

public class Amigos extends Usuarios {

    public Amigos() {
        super();
    }

    public Amigos(String nombre_u, String contraseña, Date fecha_nace, String numero_t, String correo, String nombre_c, String genero_f) {
        super(nombre_u, contraseña, fecha_nace, numero_t, correo, nombre_c, genero_f);
    }

}
