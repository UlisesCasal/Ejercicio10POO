import java.time.LocalDate;

public class CuentaNormal {
    private double saldoDisponible = 0;
    private double montoInvertido = 0;
    private double montoTotal = 0;
    private final double LIMITEGIROENDESCUBIERTO;
    private LocalDate fechaDevolucion;
    private Cliente titular;

    public CuentaNormal(Cliente titular, Double limiteGiro) {
        this.titular = titular;
        this.LIMITEGIROENDESCUBIERTO = limiteGiro;
    }


    public void depositar(int deposito) {
        saldoDisponible += deposito;
    }

    public boolean retirar(int retiro) {
        if (saldoDisponible < retiro) return false;
        else {
            saldoDisponible -= retiro;
            return true;
        }
    }

    public boolean invertir(double cantidadAInvertir) {

        if ((montoInvertido == 0) && (cantidadAInvertir <= saldoDisponible)) {
            saldoDisponible -= cantidadAInvertir;
            montoInvertido += cantidadAInvertir;
            return true;
        }else
                return false;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

}
