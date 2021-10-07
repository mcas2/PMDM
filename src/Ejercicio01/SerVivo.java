package Ejercicio01;

public class SerVivo {
    private String nombreCientifico;
    private String nombreComun;
    private String alimento;

    public SerVivo(String nombreCientifico, String nombreComun, String alimento) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.alimento = alimento;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
