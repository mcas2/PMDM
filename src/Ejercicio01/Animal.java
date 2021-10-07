package Ejercicio01;

public class Animal extends SerVivo {
    private double peso;
    private double altura;

    public Animal(double peso, double altura, String nombreCientifico,
                  String nombreComun, String alimento) {
        super(nombreCientifico, nombreComun, alimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
