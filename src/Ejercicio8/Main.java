package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Concierto concierto = new Concierto(2,2);

        Entrada entrada1 = new Entrada(3,"General",10000);
        Entrada entrada2 = new Entrada(2,"General",10000);
        Entrada entrada3 = new Entrada(8,"General",10000);


        entrada1.marcarVendida(concierto);
        entrada1.marcarIngreso(concierto);

        entrada2.marcarVendida(concierto);
        entrada2.marcarIngreso(concierto);

        entrada3.marcarVendida(concierto);
        entrada3.marcarIngreso(concierto);






    }
}
