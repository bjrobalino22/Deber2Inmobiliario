public class CasaRural extends Casa {
    private double valorArea;
    private int distanciaCabecera;
    private int altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
                     double valorArea, int distanciaCabecera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorArea = valorArea;
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    @Override
    public void imprimir() {
        System.out.println("Casa Rural con ID: " + identificadorInmobiliario);
    }
}