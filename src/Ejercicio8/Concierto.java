package Ejercicio8;

public class Concierto {
    private int asientosVip;
    private int asientosGeneral;
    private int voletasVendidas;
    private int personasIngresadas;

    public Concierto(int asientosGeneral, int asientosVip) {
        this.asientosGeneral = asientosGeneral;
        this.asientosVip = asientosVip;
    }

    public int getPersonasIngresadas() {
        return personasIngresadas;
    }

    public void setPersonasIngresadas(int personasIngresadas) {
        this.personasIngresadas = personasIngresadas;
    }

    public int getAsientosVip() {
        return asientosVip;
    }

    public void setAsientosVip(int asientosVip) {
        this.asientosVip = asientosVip;
    }

    public int getAsientosGeneral() {
        return asientosGeneral;
    }

    public void setAsientosGeneral(int asientosGeneral) {
        this.asientosGeneral = asientosGeneral;
    }

    public int getVoletasVendidas() {
        return voletasVendidas;
    }

    public void setVoletasVendidas(int voletasVendidas) {
        this.voletasVendidas = voletasVendidas;
    }
}
