package Ejercicio6;

public class Inventario {
    private String referencia;
    private int talla;
    private int cantidad;

    public void entradaSalidaStock(){

    }

    private Zapato zapato;
    private int[] stockPorTalla;

    public Inventario(Zapato zapato, int[] stockPorTalla) {
        this.zapato = zapato;
        this.stockPorTalla = stockPorTalla;
    }


    public boolean registrarVenta(int talla, int cantidad) {
        if (stockPorTalla[talla] >= cantidad) {
            stockPorTalla[talla] -= cantidad;
            return true;
        }
        return false;
    }

    public void mostrarInventario() {
        System.out.println(zapato);
        for (int i = 0; i < stockPorTalla.length; i++) {
            System.out.println("Talla " + (i + 38) + ": " + stockPorTalla[i] + " unidades en stock.");
        }
    }





    public Inventario(String referencia, int talla, int cantidad) {
        this.referencia = referencia;
        this.talla = talla;
        this.cantidad = cantidad;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}