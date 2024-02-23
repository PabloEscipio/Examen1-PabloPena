package bancoAsata;

public class CuentaCorriente {
    // Atributos
    private Persona titular;
    private double saldo;
    private double limite;
    private static double saldoBanco;
    private static int numCuenta;

    // Constructor
    public CuentaCorriente(String pNombre, String pDNI, short pAñoNacimiento) {
        this.titular = new Persona(pNombre, pDNI, pAñoNacimiento);
        this.saldo = 0;
        this.limite = 100;
    }

    public CuentaCorriente(String pNombre, String pDNI, short pAñoNacimiento, double pSaldo) {
        this.titular = new Persona(pNombre, pDNI, pAñoNacimiento);
        this.saldo = pSaldo;
        this.limite = 200;
    }

    // Getters & Setters


    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // toString
    public String toString() {
        return titular.toString() + "\nSaldo: " + this.saldo;
    }

    // Metodos
    public void sacarDinero(double pCantidad) {
        if (this.saldo - pCantidad >= (-this.limite)) {
            this.saldo -= pCantidad;
        }
    }

    public void ingresarDinero(double pCantidad) {
        if (pCantidad > 3) {
            this.saldo += pCantidad - 3;
        }
    }

    public void bizum50() {
        for (int i = 0; i < 10; i++) {
            this.saldo -= 5;
        }
    }

    public void comision() {
        this.saldo *= 0.95;
    }

    public void intereses() {
        this.saldo *= 1.03;
    }
} // class end