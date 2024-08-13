package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Nicolas","Cuervo",11,17,4.3,"Ana","xxxxx");
        System.out.println("Datos del estudiante 1:\n" + "Nombre: " + estudiante1.getNombre() + "\n" +
                "Apellido: " + estudiante1.getApellido() + "\n" +
                "Grado: " + estudiante1.getGrado() + "\n" +
                "Edad: " + estudiante1.getEdad() + "\n" +
                "Promedio: " + estudiante1.getPromedio() + "\n" +
                "Nombre de la madre: " + estudiante1.getNombreMadre() + "\n" +
                "Nombre del padre: " + estudiante1.getNombrePadre());

        Estudiante estudiante2 = new Estudiante("Jose","Martinez",9,14,4,"Maria","Carlos",123465523);

        System.out.println("\n Datos del estudiante 2:\n" + "Nombre: " + estudiante2.getNombre() + "\n" +
                "Apellido: " + estudiante2.getApellido() + "\n" +
                "Grado: " + estudiante2.getGrado() + "\n" +
                "Edad: " + estudiante2.getEdad() + "\n" +
                "Promedio: " + estudiante2.getPromedio() + "\n" +
                "Nombre de la madre: " + estudiante2.getNombreMadre() + "\n" +
                "Nombre del padre: " + estudiante2.getNombrePadre() + "\n" +
                "Numero de los padres: " + estudiante2.getNumPadres());


        Estudiante estudiante3 = new Estudiante("Pedro","Rios",3,8,3,"Camila","Juan",43627473,12432423);
        System.out.println("\nDatos del estudiante 3:\n" + "Nombre: " + estudiante3.getNombre() + "\n" +
                "Apellido: " + estudiante3.getApellido() + "\n" +
                "Grado: " + estudiante3.getGrado() + "\n" +
                "Edad: " + estudiante3.getEdad() + "\n" +
                "Promedio: " + estudiante3.getPromedio() + "\n" +
                "Nombre de la madre: " + estudiante3.getNombreMadre() + "\n" +
                "Nombre del padre: " + estudiante3.getNombrePadre() + "\n" +
                "Numero de los padres: " + estudiante3.getNumPadres() + "\n" +
                "Numero de la madre: " + estudiante3.getNumMadre());



    }
}
