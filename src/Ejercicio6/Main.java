package Ejercicio6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zapato[] zapato = new Zapato[5];

        zapato[0] = new Zapato("Nike32","Cuero","Blanco",1200,"Limitada2023");
        zapato[1] = new Zapato("PumaB","Tela","Verdes",3000,"Invierno");
        zapato[2] = new Zapato("Adidas12","Polimero","Negro",2000,"Verano");
        zapato[3] = new Zapato("AirJordan","Caucho","Anaranjado",1500,"Old");
        zapato[4] = new Zapato("VansBMX","Piel","Morado",65000,"Ultimate");


        Inventario[] inventarios = new Inventario[5];
        inventarios[0] = new Inventario(zapato[0], new int[]{10, 5, 8, 12, 3});
        inventarios[1] = new Inventario(zapato[1], new int[]{15, 6, 9, 10, 2});
        inventarios[2] = new Inventario(zapato[2], new int[]{20, 8, 7, 9, 5});
        inventarios[3] = new Inventario(zapato[3], new int[]{18, 10, 5, 11, 7});
        inventarios[4] = new Inventario(zapato[4], new int[]{12, 9, 6, 14, 4});



        ArrayList<Venta> ventas = new ArrayList<>();

        ventas.add(new Venta("2024/08/13", zapato[0], 2, 3));
        ventas.add(new Venta("2024/08/14", zapato[2], 0, 2));


        inventarios[0].registrarVenta(2, 3);
        inventarios[2].registrarVenta(0, 2);


        System.out.println("Inventario Actual:");
        for (Inventario inventario : inventarios) {
            inventario.mostrarInventario();
            System.out.println();
        }


        System.out.println("Ventas Realizadas:");
        for (Venta venta : ventas) {
            venta.imprimirDetalle();
        }



    }
}

