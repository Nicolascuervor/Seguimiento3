package Ejercicio3;

import javax.swing.*;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private boolean estado;
    private int claveSeguridad;


    public CuentaBancaria(int numeroCuenta, double saldo, boolean estado, int claveSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.claveSeguridad = claveSeguridad;
    }



    public void consultarSaldo(){
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo + "$ pesos");
    }



    public void retirarEfectivo(){
        int desicion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que desee retirar: "));

        if(desicion <= saldo){
            var total = saldo -= desicion;
            JOptionPane.showMessageDialog(null, "Se han retirado de su cuenta:  " + desicion + "$ pesos, saldo actual es de: " + total);
        }
        else JOptionPane.showMessageDialog(null , "Error no puede retirar mas dinero del que tenga disponible en su cuenta");
    }


    public void ingresarEfectivo(){
        int desicion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que desee ingresar: "));
            var total = saldo += desicion;
            JOptionPane.showMessageDialog(null, "Se han ingresado de su cuenta:  " + desicion + "$ pesos, saldo actual es de: " + total);

    }

    public void cambioClave(){

        int desicion = Integer.parseInt(JOptionPane.showInputDialog(null,"Antes de cambiar la clave ingrese la clave actual:  "));

        if(desicion == claveSeguridad){
            int decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nueva clave: "));
            claveSeguridad = decision;

            JOptionPane.showMessageDialog(null,"Su nueva clave es:  " + claveSeguridad);

        }

        else JOptionPane.showMessageDialog(null , "Error. Clave erronea ingresada");

    }

    public void menuCajero(){
        boolean check = false;

        while (!check){
            int decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su clave de seguridad: "));
            if(decision == claveSeguridad){
                check = !false;
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienbenido ingrese un numero para realizar una accion:  \n1. Retirar \n2. Ingresar \n3. Cambiar clave \n4. Consultar saldo \n5. Salir"));
                while(menu != 5){
                   if(menu == 1){
                       retirarEfectivo();
                       menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienbenido ingrese un numero para realizar una accion:  \n1. Retirar \n2. Ingresar \n3. Cambiar clave \n4. Consultar saldo \n5. Salir"));
                   }
                   else if(menu == 2){
                       ingresarEfectivo();
                       menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienbenido ingrese un numero para realizar una accion:  \n1. Retirar \n2. Ingresar \n3. Cambiar clave \n4. Consultar saldo \n5. Salir"));

                   }
                   else if(menu == 3){
                       cambioClave();
                       menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienbenido ingrese un numero para realizar una accion:  \n1. Retirar \n2. Ingresar \n3. Cambiar clave \n4. Consultar saldo \n5. Salir"));
                   }
                   else if ( menu == 4) {
                       consultarSaldo();
                       menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienbenido ingrese un numero para realizar una accion:  \n1. Retirar \n2. Ingresar \n3. Cambiar clave \n4. Consultar saldo \n5. Salir"));

                   }
                   else if(menu == 5){
                       menu = 5;
                   }
                }
            }
            else JOptionPane.showMessageDialog(null , "Clave erronea ingresada");
        }

    }





    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }
}
