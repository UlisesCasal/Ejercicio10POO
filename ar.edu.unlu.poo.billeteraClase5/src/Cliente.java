public class Cliente {

    private String nombre;
    private int id;
    private CuentaNormal cuentaN;
    private CuentaCredito cuentaC;
    private static int i = 0;

    public Cliente(CuentaNormal cN, CuentaCredito cC) {
        this.cuentaN = cN;
        this.cuentaC = cC;
        i++;
        this.id = i;
    }

    public Cliente (CuentaNormal cN) {
        this(cN, null);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoAFavor() {
        double saldo = this.cuentaN.getSaldoDisponible();
        if (this.cuentaC != null) {
            saldo -= this.cuentaC.getSaldoDeudor();
        }

        return saldo;
    }


}
