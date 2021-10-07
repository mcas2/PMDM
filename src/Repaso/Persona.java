package Repaso;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String rol;
    private int edad;

    public Persona(String nombre, String apellido1, String apellido2, String rol, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, me llamo " + getNombre() + " " + getApellido1() +
                " " + getApellido2() + " y soy " + getRol());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
