package Ejercicios.Equipo;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Jugador {

    private String nombre;
    private int edad;
    private double Estatura;
    private String cedula;
    private Integer puntos;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, double Estatura, String cedula, Integer puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.Estatura = Estatura;
        this.cedula = cedula;
        this.puntos = puntos;
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

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

}
