package Ejercicio01;

public class Vegetal extends SerVivo {
    private double altura;

    public Vegetal(String nombreCientifico, String nombreComun, String alimento, double altura) {
        super(nombreCientifico, nombreComun, alimento);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
