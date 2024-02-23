package bancoAsata;

public class Persona {
    // Atributos
    private String nombre;
    private String dni;
    private short añoNacimiento;

    // Constructores
    public Persona(String pDNI) {
        this.nombre = "";
        this.dni = pDNI;
        this.añoNacimiento = -1;
    }

    public Persona(String pNombre, String pDNI, short pAñoNacimiento) {
        this.nombre = pNombre;
        this.dni = pDNI;
        this.añoNacimiento = pAñoNacimiento;
    }

    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public short getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(short añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    // toString
    public String toString() {
        return "Nombre: " + this.nombre + "\nDNI: " + this.dni + "\nAño de nacimiento: " + this.añoNacimiento;
    }
    // Metodos
} // class end
