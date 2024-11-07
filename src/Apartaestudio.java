public class Apartaestudio extends Apartamento {
    private double valorArea;
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorArea = 0;
    }

    @Override
    public void imprimir() {
        System.out.println("Apartaestudio con ID: " + identificadorInmobiliario);
    }
}