package Ejercicio5;

public class Habitacion {
    private int numeroHabitación;
    private int precioNoche;
    private Boolean disponibilidad;
    private String huespedesAlojados;


    public Habitacion(int numeroHabitación, int precioNoche, Boolean disponibilidad, String huespedesAlojados) {
        this.numeroHabitación = numeroHabitación;
        this.precioNoche = precioNoche;
        this.disponibilidad = disponibilidad;
        this.huespedesAlojados = huespedesAlojados;
    }


    public int getNumeroHabitación() {
        return numeroHabitación;
    }

    public void setNumeroHabitación(int numeroHabitación) {
        this.numeroHabitación = numeroHabitación;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }
}
