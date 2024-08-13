package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Toby",10,"labrador","blanco");
        System.out.println("mascota 1:\nNombre = " + mascota1.getNombre() + "\nEdad = " + mascota1.getEdad() + " años\nRaza = " + mascota1.getRaza() + "\nColor = " + mascota1.getColor());

        Mascota mascota2 = new Mascota("Luna",3,"pug","gris");
        System.out.println("\nmascota 2:\nNombre = " + mascota2.getNombre() + "\nEdad = " + mascota2.getEdad() + " años\nRaza = " + mascota2.getRaza() + "\nColor = " + mascota2.getColor());

        Mascota mascota3 = new Mascota("g",2,"pug","negro");
        System.out.println("\nmascota 3:\nNombre = " + mascota3.getNombre() + "\nEdad = " + mascota3.getEdad() + " años\nRaza = " + mascota3.getRaza() + "\nColor = " + mascota3.getColor());

        mascota3.setNombre("Lu");
        mascota3.setEdad(15);
        mascota3.setRaza("beagle");
        mascota3.setColor("blanco");
        System.out.println("\nmascota 3 (cambio):\nNombre = " + mascota3.getNombre() + "\nEdad = " + mascota3.getEdad() + " años\nRaza = " + mascota3.getRaza() + "\nColor = " + mascota3.getColor());

    }
}
