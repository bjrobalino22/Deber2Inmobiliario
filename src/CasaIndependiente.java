public class CasaIndependiente extends CasaUrbana {
    private double valorArea;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
                             double valorArea) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorArea = valorArea;
    }

    @Override
    public void imprimir() {
        System.out.println("Casa Independiente con ID: " + identificadorInmobiliario);
    }
}