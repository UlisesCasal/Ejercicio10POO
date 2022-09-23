public class Pago {
    private int montoAPagar;
    private boolean estaPago;

    public void Pago(int montoAPagar) {
        this.montoAPagar = montoAPagar;
        estaPago = false;
    }

    public void pagar(int montoQuePagara) {
        this.montoAPagar -= montoQuePagara;
        if (this.montoAPagar <= 0){
            this.estaPago = true;
        }
    }
}
