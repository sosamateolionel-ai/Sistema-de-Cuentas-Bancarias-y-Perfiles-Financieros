public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println(numeroCuenta + ": el monto a depositar debe ser positivo.");
            return;
        }
        saldo += monto;
        System.out.println(numeroCuenta + ": depósito de $" + String.format("%.2f", monto) + " realizado.");
    }

    // Devuelve true si la extracción se concretó
    public boolean extraer(double monto) {
        if (monto <= 0) {
            System.out.println(numeroCuenta + ": el monto a extraer debe ser positivo.");
            return false;
        }
        if (monto > saldo) {
            System.out.println(numeroCuenta + ": fondos insuficientes para extraer $" +
                    String.format("%.2f", monto) + ".");
            return false;
        }
        saldo -= monto;
        System.out.println(numeroCuenta + ": extracción de $" + String.format("%.2f", monto) + " realizada.");
        return true;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    @Override
    public String toString() {
        return "Cuenta N° " + numeroCuenta +
                " | Titular: " + titular +
                " | Saldo: $" + String.format("%.2f", saldo);
    }
}