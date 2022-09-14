import java.util.ArrayList;

public class CuentaCredito {
    private final double LIMITEGASTO;
    private double saldoDeudor = 0;
    private Cliente titular;
    private ArrayList Compra;

    public CuentaCredito(double limiteGasto, Cliente titular) {
        this.LIMITEGASTO= limiteGasto;
        this.titular = titular;
    }

    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    //public boolean abonarCompra(int idCompra) {
    //}

    public boolean nuevaCompra(Compra compra) {
        if ((compra.getMonto() + this.saldoDeudor) <= LIMITEGASTO) {
            saldoDeudor += compra.getMonto();
            return true;
        }else return false;
    }
}
