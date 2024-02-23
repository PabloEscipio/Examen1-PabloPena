package bancoAsata;

public class CuentaCorriente {
    // Atributos
    private Persona titular;
    private double saldo;
    private double limite;
    private static double saldoBanco;
    private static int numCuenta;

    // Constructor
    public CuentaCorriente(Persona pTitular) {
        this.titular = pTitular;
        this.saldo = 0;
        this.limite = 100;
    }

    public CuentaCorriente(Persona pTitular, double pSaldo) {
        this.titular = pTitular;
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

} // class end