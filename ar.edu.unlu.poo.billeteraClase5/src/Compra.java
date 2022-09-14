import java.time.LocalDate;

public class Compra {

    private boolean estaPago = false;
    private int idCompra;
    private double monto;
    private LocalDate fecha;
    private static int i = 0;

    public Compra(double monto, LocalDate fecha) {
        this.monto = monto;
        this.fecha = fecha;
        i ++;
        this.idCompra = i;
    }

    public void abonarCompra() {
        this.estaPago = true;

    }

    public double getMonto() {
        return monto;
    }
}
