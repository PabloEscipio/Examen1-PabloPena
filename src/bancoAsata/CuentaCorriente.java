package bancoAsata;

public class CuentaCorriente {
    // Atributos
    private Persona titular;
    private double saldo;
    private double limite;
    public static double saldoBanco = 0;
    public static int numCuenta = 0;

    // Constructor
    public CuentaCorriente(String pNombre, String pDNI, short pAñoNacimiento) {
        this.titular = new Persona(pNombre, pDNI, pAñoNacimiento);
        this.saldo = 0;
        this.limite = 100;
        numCuenta++;
    }

    public CuentaCorriente(String pNombre, String pDNI, short pAñoNacimiento, double pSaldo) {
        this.titular = new Persona(pNombre, pDNI, pAñoNacimiento);
        this.saldo = pSaldo;
        this.limite = 200;
        numCuenta++;
        saldoBanco += pSaldo;
    }

    // Getters & Setters
    public Persona getTitular() {
        return titular;
    }

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
            saldoBanco -= pCantidad;
        }
    }

    public void ingresarDinero(double pCantidad) {
        if (pCantidad > 3) {
            this.saldo += pCantidad - 3;
            saldoBanco += pCantidad;
        }
    }

    public void bizum50() {
        for (int i = 0; i < 10; i++) {
            this.saldo -= 5;
            saldoBanco -= 5;
        }
    }

    public void comision() {
        this.saldo *= 0.95;
    }

    public void intereses() {
        this.saldo *= 1.03;
    }
} // class end