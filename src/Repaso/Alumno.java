package Repaso;

public class Alumno extends Persona {
    private int nia;

    public Alumno(String nombre, String apellido1, String apellido2, String rol, int edad, int nia) {
        super(nombre, apellido1, apellido2, rol, edad);
        this.nia = nia;
    }

    @Override
    public void saludar(){
        System.out.println("Hola, me llamo " + getNombre() + " " + getApellido1() +
                " " + getApellido2() + " y soy " + getRol() + ". Tengo " +
                getEdad() +" años y mi nia es el siguiente: " + getNia());
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }
}
