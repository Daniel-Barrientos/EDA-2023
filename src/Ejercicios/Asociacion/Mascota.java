package Ejercicios.Asociacion;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Mascota {

    private String id;
    private String nombre;
    private int edad;
    private String cedula;

    public Mascota() {
    }

    public Mascota(String id, String nombre, int edad, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
