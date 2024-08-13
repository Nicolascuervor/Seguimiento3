package Ejercicio4;

import javax.swing.*;

public class Propiedad {
    private String propiedadId;
    private String dirección;
    private String areaM2;
    private String precio;
    private String cantidadHabitaciones;
    private String cantidadBaños;
    private String garaje;
    private String estado;

    public Propiedad(String propiedadId, String dirección, String areaM2, String precio, String cantidadHabitaciones, String cantidadBaños, String garaje, String estado) {
        this.propiedadId = propiedadId;
        this.dirección = dirección;
        this.areaM2 = areaM2;
        this.precio = precio;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadBaños = cantidadBaños;
        this.garaje = garaje;
        this.estado = estado;
    }


    public String getPropiedadId() {
        return propiedadId;
    }

    public void setPropiedadId(String propiedadId) {
        this.propiedadId = propiedadId;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(String areaM2) {
        this.areaM2 = areaM2;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(String cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(String cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"Datos de la propiedad: " +
                "\nId de la propiedad = " + propiedadId + "\nDirreccion = " + dirección +
                "\nArea = " + areaM2 + " Metros cuadrados \nPrecio = " + precio + "$ dolares \nCantidad de habitaciones = " + cantidadHabitaciones
                + "\nCatidad de baños = " + cantidadBaños + "\nGaraje = " + garaje + "\nEstado = " + estado);
    }
}
