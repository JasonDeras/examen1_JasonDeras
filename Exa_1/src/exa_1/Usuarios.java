package exa_1;

import java.util.*;

public class Usuarios {

    private String nombre_u;
    private String contraseña;
    private Date fecha_nace;
    private String numero_t;
    private String correo;
    private String nombre_c;
    private String genero_f;
    private ArrayList<String> amigos = new ArrayList();
    private ArrayList<Libros> libros = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre_u, String contraseña, Date fecha_nace, String numero_t, String correo, String nombre_c, String genero_f) {
        this.nombre_u = nombre_u;
        this.contraseña = contraseña;
        this.fecha_nace = fecha_nace;
        this.numero_t = numero_t;
        this.correo = correo;
        this.nombre_c = nombre_c;
        this.genero_f = genero_f;
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha_nace() {
        return fecha_nace;
    }

    public void setFecha_nace(Date fecha_nace) {
        this.fecha_nace = fecha_nace;
    }

    public String getNumero_t() {
        return numero_t;
    }

    public void setNumero_t(String numero_t) {
        this.numero_t = numero_t;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getGenero_f() {
        return genero_f;
    }

    public void setGenero_f(String genero_f) {
        this.genero_f = genero_f;
    }

    public ArrayList<String> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<String> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "libros= " + libros + '}';
    }

}
