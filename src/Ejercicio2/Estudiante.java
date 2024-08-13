package Ejercicio2;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int grado;
    private int edad;
    private double promedio;
    private String nombreMadre;
    private String nombrePadre;
    private int numPadres;
    private int numPadre;
    private int numMadre;

    public Estudiante(String nombre, String apellido, int grado, int edad, double promedio, String nombreMadre, String nombrePadre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
    }

    public Estudiante(String nombre, String apellido, int grado, int edad, double promedio, String nombreMadre, String nombrePadre, int numPadres) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.numPadres = numPadres;
    }

    public Estudiante(String nombre, String apellido, int grado, int edad, double promedio, String nombreMadre, String nombrePadre, int numPadres, int numMadre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.numPadres = numPadres;
        this.numMadre = numMadre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public int getNumPadres() {
        return numPadres;
    }

    public void setNumPadres(int numPadres) {
        this.numPadres = numPadres;
    }

    public int getNumPadre() {
        return numPadre;
    }

    public void setNumPadre(int numPadre) {
        this.numPadre = numPadre;
    }

    public int getNumMadre() {
        return numMadre;
    }

    public void setNumMadre(int numMadre) {
        this.numMadre = numMadre;
    }
}
