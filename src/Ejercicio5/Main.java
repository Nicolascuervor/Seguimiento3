package Ejercicio5;

public class Main   {
    public static void main(String[] args) {

        Habitacion habitacion1 = new Habitacion(123, 120, true, "3");
        Object[] guardado1 = new Object[4];


        guardado1[0] = habitacion1.getNumeroHabitación();
        guardado1[1] = habitacion1.getPrecioNoche();
        guardado1[2] = habitacion1.isDisponibilidad();
        guardado1[3] = habitacion1.getHuespedesAlojados();


        Habitacion habitacion2 = new Habitacion(321, 30, true, "1");
        Object[] guardado2 = new Object[4];


        guardado2[0] = habitacion2.getNumeroHabitación();
        guardado2[1] = habitacion2.getPrecioNoche();
        guardado2[2] = habitacion2.isDisponibilidad();
        guardado2[3] = habitacion2.getHuespedesAlojados();


        Habitacion habitacion3 = new Habitacion(768, 50, false, "2");
        Object[] guardado3 = new Object[4];

        guardado3[0] = habitacion3.getNumeroHabitación();
        guardado3[1] = habitacion3.getPrecioNoche();
        guardado3[2] = habitacion3.isDisponibilidad();
        guardado3[3] = habitacion3.getHuespedesAlojados();


        Habitacion habitacion4 = new Habitacion(987, 200, true, "5");
        Object[] guardado4 = new Object[4];


        guardado4[0] = habitacion4.getNumeroHabitación();
        guardado4[1] = habitacion4.getPrecioNoche();
        guardado4[2] = habitacion4.isDisponibilidad();
        guardado4[3] = habitacion4.getHuespedesAlojados();


        Habitacion habitacion5 = new Habitacion(196, 10, false, "1");
        Object[] guardado5 = new Object[4];

        guardado5[0] = habitacion5.getNumeroHabitación();
        guardado5[1] = habitacion5.getPrecioNoche();
        guardado5[2] = habitacion5.isDisponibilidad();
        guardado5[3] = habitacion5.getHuespedesAlojados();


        System.out.println("Habitacion 1: ");
        for (int i = 0; i < guardado1.length; i++) {
            if (i == 0) {
                System.out.print("Numero de habitacion:  " + guardado1[i] + "\n");
            } else if (i == 1) {
                System.out.print("Valor por noche: " + guardado1[i] + "$ dolares \n");
            } else if (i == 2) {
                System.out.print("Disponibilidad: " + guardado1[i] + "\n");
            } else if (i == 3) {
                System.out.print("Huespedes: " + guardado1[i] + "\n");
            }

        }


        System.out.println("\nHabitacion 2: ");
        for (int i = 0; i < guardado2.length; i++) {
            if (i == 0) {
                System.out.print("Numero de habitacion: " + guardado2[i] + "\n");
            } else if (i == 1) {
                System.out.print("Valor por noche: " + guardado2[i] + "$ dolares \n");
            } else if (i == 2) {
                System.out.print("Disponibilidad: " + guardado2[i] + "\n");
            } else if (i == 3) {
                System.out.print("Huespedes: " + guardado2[i] + "\n");
            }
        }

        System.out.println("\nHabitacion 3: ");
        for (int i = 0; i < guardado3.length; i++) {
            if (i == 0) {
                System.out.print("Numero de habitacion: " + guardado3[i] + "\n");
            } else if (i == 1) {
                System.out.print("Valor por noche: " + guardado3[i] + "$ dolares \n");
            } else if (i == 2) {
                System.out.print("Disponibilidad: " + guardado3[i] + "\n");
            } else if (i == 3) {
                System.out.print("Huespedes: " + guardado3[i] + "\n");
            }
        }

        System.out.println("\nHabitacion 4: ");
        for (int i = 0; i < guardado2.length; i++) {
            if (i == 0) {
                System.out.print("Numero de habitacion: " + guardado4[i] + "\n");
            } else if (i == 1) {
                System.out.print("Valor por noche: " + guardado4[i] + "$ dolares \n");
            } else if (i == 2) {
                System.out.print("Disponibilidad: " + guardado4[i] + "\n");
            } else if (i == 3) {
                System.out.print("Huespedes: " + guardado4[i] + "\n");
            }
        }

        System.out.println("\nHabitacion 5: ");
        for (int i = 0; i < guardado2.length; i++) {
            if (i == 0) {
                System.out.print("Numero de habitacion: " + guardado5[i] + "\n");
            } else if (i == 1) {
                System.out.print("Valor por noche: " + guardado5[i] + "$ dolares \n");
            } else if (i == 2) {
                System.out.print("Disponibilidad: " + guardado5[i] + "\n");
            } else if (i == 3) {
                System.out.print("Huespedes: " + guardado5[i] + "\n");
            }
        }

        habitacion5 = new Habitacion(16, 20, true, "2");
        Object[] guardado5Nuevo = new Object[4];



        System.out.println("\nHabitacion 5 (cambio): ");
        for (int i = 0; i < guardado2.length; i++) {
            if (i == 0) {
                System.out.print("Numero de habitacion: " + guardado5Nuevo[i] + "\n");
            } else if (i == 1) {
                System.out.print("Valor por noche: " + guardado5Nuevo[i] + "$ dolares \n");
            } else if (i == 2) {
                System.out.print("Disponibilidad: " + guardado5Nuevo[i] + "\n");
            } else if (i == 3) {
                System.out.print("Huespedes: " + guardado5Nuevo[i] + "\n");
            }
        }



    }
}
