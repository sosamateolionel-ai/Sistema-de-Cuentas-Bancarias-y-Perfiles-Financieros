public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro; // monto máximo que se puede quedar en descubierto

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial,
                           double limiteSobregiro) {
        super(numeroCuenta, titular, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public boolean extraer(double monto) {
        if (monto <= 0) {
            System.out.println(getNumeroCuenta() + ": el monto a extraer debe ser positivo.");
            return false;
        }
        // Disponible = saldo + margen de sobregiro autorizado
        if (monto > saldo + limiteSobregiro) {
            System.out.println(getNumeroCuenta() + ": excede el límite de sobregiro. Disponible: $" +
                    String.format("%.2f", saldo + limiteSobregiro) + ".");
            return false;
        }
        saldo -= monto;
        System.out.println(getNumeroCuenta() + ": extracción de $" + String.format("%.2f", monto) +
                " realizada" + (saldo < 0 ? " (en descubierto)." : "."));
        return true;
    }

    public double getLimiteSobregiro() { return limiteSobregiro; }

    @Override
    public String toString() {
        return "[CUENTA CORRIENTE] " + super.toString() +
                " | Sobregiro autorizado: $" + String.format("%.2f", limiteSobregiro);
    }
}