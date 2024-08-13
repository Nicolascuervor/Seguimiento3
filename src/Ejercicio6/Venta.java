package Ejercicio6;

class Venta{
    private String fecha;
    private String modelo;
    private int talla;
    private int cantidad;
    private int valor;



    public Venta(String fecha, Zapato modelo, int talla, int cantidad) {
        this.fecha = fecha;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valor = cantidad * modelo.getPrecio();
    }


    public void calcularTotal(){
        var total = valor*cantidad;
    }

    public void imprimirDetalle(){
        System.out.println("Venta realizada el " + fecha);
        System.out.println("Modelo: " + modelo);
        System.out.println("Talla: " + talla);
        System.out.println("Cantidad: " + cantidad);

    }



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }




}
