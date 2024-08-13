package Ejercicio8;

import javax.swing.*;

public class Entrada {
    private int numEntrada;
    private String zona;
    private int valor;
    public int rechazados = 0;




    public void marcarVendida(Concierto concierto){


        if (concierto.getAsientosVip() > 0 && zona == "Vip") {
            JOptionPane.showMessageDialog(null,"Se ha vendido la boleta con los siguientes datos: \nNumero de entrada: " + numEntrada + "\nZona: " + zona + "\nCon un valor de: " + valor);
            concierto.setAsientosVip(concierto.getAsientosVip() - 1);
            concierto.setVoletasVendidas(concierto.getVoletasVendidas() + 1);
            rechazados += 1;
            System.out.println("\nVoletas vendidas: " + concierto.getVoletasVendidas());


        }
        else if (concierto.getAsientosGeneral() != 0 && zona == "General") {
            JOptionPane.showMessageDialog(null,"Se ha vendido la boleta con los siguientes datos: \nNumero de entrada: " + numEntrada + "\nZona: " + zona + "\nCon un valor de: " + valor);
            concierto.setAsientosGeneral(concierto.getAsientosGeneral() - 1);
            concierto.setVoletasVendidas(concierto.getVoletasVendidas() + 1);
            rechazados += 1;
            System.out.println("\nVoletas vendidas: " + concierto.getVoletasVendidas());


        }
        else{
            JOptionPane.showMessageDialog(null,"Se han agotado todas las voletas para Vip y General :(");
            rechazados += 0;

        }

    }


    public void marcarIngreso(Concierto concierto){
        if (!(rechazados != 0)) {
            JOptionPane.showMessageDialog(null,"No puede ingresar al concierto");
        }
        else {
            int desicion = JOptionPane.showConfirmDialog(null,"Desea ingresar el concierto? ");
            if (desicion == JOptionPane.YES_OPTION && concierto.getAsientosVip() != 0 && zona == "Vip"){
                JOptionPane.showMessageDialog(null,"Disfrute el concierto :D");
                concierto.setPersonasIngresadas(concierto.getPersonasIngresadas() + 1);
                System.out.println("Personas ingresadas: " + concierto.getPersonasIngresadas());
            }
            else if (desicion == JOptionPane.YES_OPTION &&  zona == "General" && rechazados != 0){
                JOptionPane.showMessageDialog(null,"Disfrute el concierto :D");
                concierto.setPersonasIngresadas(concierto.getPersonasIngresadas() + 1);
                System.out.println("Personas ingresadas: " + concierto.getPersonasIngresadas());

            }

            else if (desicion == JOptionPane.NO_OPTION && concierto.getAsientosVip() != 0 && zona == "Vip"){
                JOptionPane.showMessageDialog(null,"Su asiento quedara reservado");
                System.out.println("Personas ingresadas: " + concierto.getPersonasIngresadas());
            }
            else if (desicion == JOptionPane.NO_OPTION  && rechazados != 0 &&  zona == "General") {
                JOptionPane.showMessageDialog(null,"Su asiento quedara reservado");
                System.out.println("Personas ingresadas: " + concierto.getPersonasIngresadas());
            }
            else {System.out.println("Error");
            }
        }
    }


    public Entrada(int numEntrada, String zona, int valor) {
        this.numEntrada = numEntrada;
        this.zona = zona;
        this.valor = valor;
    }

    public int getNumEntrada() {
        return numEntrada;
    }

    public void setNumEntrada(int numEntrada) {
        this.numEntrada = numEntrada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
