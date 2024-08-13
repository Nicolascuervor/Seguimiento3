package Ejercicio7;

public class Prestamo {
    private int ISBN;
    private int identificacioUsuario;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(int ISBN, int identificacioUsuario, String fechaPrestamo, String fechaDevolucion) {
        this.ISBN = ISBN;
        this.identificacioUsuario = identificacioUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getIdentificacioUsuario() {
        return identificacioUsuario;
    }

    public void setIdentificacioUsuario(int identificacioUsuario) {
        this.identificacioUsuario = identificacioUsuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
