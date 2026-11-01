public class CajaAhorro extends CuentaBancaria {
    private double tasaInteresMensual; // por ejemplo, 0.02 = 2% mensual

    public CajaAhorro(String numeroCuenta, String titular, double saldoInicial,
                      double tasaInteresMensual) {
        super(numeroCuenta, titular, saldoInicial);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public void aplicarIntereses() {
        double interes = saldo * tasaInteresMensual;
        saldo += interes;
        System.out.println(getNumeroCuenta() + ": intereses acreditados: $" +
                String.format("%.2f", interes) + ".");
    }

    @Override
    public String toString() {
        return "[CAJA DE AHORRO] " + super.toString() +
                " | Tasa mensual: " + String.format("%.1f", tasaInteresMensual * 100) + "%";
    }
}