public class ApartamentoFamiliar extends Apartamento {
    private double valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos,
                               double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public void imprimir() {
        System.out.println("Apartamento Familiar con ID: " + identificadorInmobiliario);
    }
}