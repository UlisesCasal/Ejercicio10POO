public class Inversion {
    private int inversion;
    private int porcentajeGanancia;
    private int tiempoInversion;
    private int gananciaFinal = 0;

    public void Inversion(int inversion, int porcentajeGanancia, int tiempoInversion) {
        this.inversion = inversion;
        this.porcentajeGanancia = porcentajeGanancia;
        this.tiempoInversion = tiempoInversion;
    }

    private int obtenerGanancia() {
       return (int) (inversion * 0.5);
    }

    public int cerrarInversion() {
        this.gananciaFinal = this.obtenerGanancia();
        return inversion + gananciaFinal;
    }
}
