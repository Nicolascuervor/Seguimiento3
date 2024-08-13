package Ejercicio7;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro(123,"El señor de los anillos","yo","1/23/2003","MN",500,"Fantasia");
        Libro libro2 = new Libro(453,"IT","el","5/12/2007","Br",120,"Fantasia");
        Libro libro3 = new Libro(485,"Harry Potter","el","5/12/2007","Br",120,"Fantasia");
        Libro libro4 = new Libro(924,"El guarda bosques","el","5/12/2007","Br",120,"Fantasia");
        Libro libro5 = new Libro(294,"Satanas","el","5/12/2007","Br",120,"Fantasia");


        Usuario usuario = new Usuario("Nicolas","2234",354023234);
        Gestion gestion = new Gestion();

        gestion.prestamoLibro(libro1,libro2,libro3,libro4,libro5,usuario);
        gestion.devolucion(usuario,libro1,libro2,libro3,libro4,libro5);
        gestion.librosPrestado(usuario);

    }
}
