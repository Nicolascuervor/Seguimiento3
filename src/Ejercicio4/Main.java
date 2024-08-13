package Ejercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Propiedad propiedad = new Propiedad("112352","calle 3 # 12-4", "34", "1200", "4","2","NO","Vendida");

        String[] almacenar = new String[8];

        almacenar[0] = propiedad.getPropiedadId();
        almacenar[1] = propiedad.getDirección();
        almacenar[2] = propiedad.getAreaM2();
        almacenar[3] = propiedad.getPrecio();
        almacenar[4] = propiedad.getCantidadHabitaciones();
        almacenar[5] = propiedad.getCantidadBaños();
        almacenar[6] = propiedad.getGaraje();
        almacenar[7] = propiedad.getEstado();



        Propiedad propiedad2 = new Propiedad("045212","calle 12 # 2-22", "20", "4200", "2","3","NO","Rentada");
        String[] almacenar2 = new String[8];

        almacenar2[0] = propiedad2.getPropiedadId();
        almacenar2[1] = propiedad2.getDirección();
        almacenar2[2] = propiedad2.getAreaM2();
        almacenar2[3] = propiedad2.getPrecio();
        almacenar2[4] = propiedad2.getCantidadHabitaciones();
        almacenar2[5] = propiedad2.getCantidadBaños();
        almacenar2[6] = propiedad2.getGaraje();
        almacenar2[7] = propiedad2.getEstado();

        Propiedad propiedad3 = new Propiedad("564738","calle 54 #43-12", "100", "1200000", "5","4","SI","Disponible");

        String[] almacenar3 = new String[8];

        almacenar3[0] = propiedad3.getPropiedadId();
        almacenar3[1] = propiedad3.getDirección();
        almacenar3[2] = propiedad3.getAreaM2();
        almacenar3[3] = propiedad3.getPrecio();
        almacenar3[4] = propiedad3.getCantidadHabitaciones();
        almacenar3[5] = propiedad3.getCantidadBaños();
        almacenar3[6] = propiedad3.getGaraje();
        almacenar3[7] = propiedad3.getEstado();



       for (int i = 8; i <= almacenar.length; i++) {
           propiedad.mostrarDatos();
       }



        for (int i = 8; i <= almacenar2.length; i++) {
            propiedad2.mostrarDatos();
        }


        for (int i = 8; i <= almacenar3.length; i++) {
            propiedad3.mostrarDatos();
        }

        propiedad3 = new Propiedad("5212348","calle 2 #1-78", "500", "12000000", "6","5","SI","Disponible");

        for (int i = 8; i <= almacenar3.length; i++) {
            propiedad3.mostrarDatos();
        }

    }
}
