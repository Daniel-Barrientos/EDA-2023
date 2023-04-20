package TablaHash;

/**
 *
 * @author Daniel
 */
public class Alumno {

    private String nombre;
    private String codigo;
    private String apellido;
    private String direccion;

    public Alumno() {
    }

    public Alumno(String nombre, String codigo, String apellido, String direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{Nombre= " + nombre + ", codigo= " + codigo + ", Apellido= " + apellido + ", Direccion= " + direccion + "}";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
