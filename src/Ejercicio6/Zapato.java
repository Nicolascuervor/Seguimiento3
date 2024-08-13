package Ejercicio6;

import java.util.ArrayList;

public class Zapato {
   private String nombre;
   private String material;
   private String color;
   private int precio;
   private String coleccion;





    public Zapato(String nombre, String material, String color, int precio, String coleccion) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.precio = precio;
        this.coleccion = coleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}




