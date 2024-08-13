package Ejercicio7;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private String anioPublicacion;
    private String editorial;
    private int numPaginas;
    private String categoria;

    public Libro(int ISBN, String titulo, String autor, String anioPublicacion, String editorial, int numPaginas, String categoria) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.categoria = categoria;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
