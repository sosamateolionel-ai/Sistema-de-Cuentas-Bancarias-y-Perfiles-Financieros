//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CajaAhorro caja = new CajaAhorro("CA-001", "Laura Gómez", 100000, 0.02);
    CuentaCorriente cc = new CuentaCorriente("CC-001", "Carlos Pérez", 50000, 30000);

    System.out.println("=== OPERACIONES CAJA DE AHORRO ===");
    caja.depositar(20000);
    caja.extraer(150000);   // fondos insuficientes
    caja.extraer(40000);
    caja.aplicarIntereses();

    System.out.println("\n=== OPERACIONES CUENTA CORRIENTE ===");
    cc.depositar(10000);
    cc.extraer(80000);      // usa sobregiro (saldo queda en -20000)
    cc.extraer(15000);      // excede el límite
    cc.depositar(25000);    // sale del descubierto

    System.out.println("\n=== SALDOS FINALES ===");
    CuentaBancaria[] cuentas = { caja, cc };
    for (CuentaBancaria c : cuentas) {
        System.out.println(c);
    }

}
