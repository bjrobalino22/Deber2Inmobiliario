public class CasaConjuntoCerrado extends CasaUrbana {
    private double valorAdministracion;
    private boolean tienePiscina;
    private boolean tieneCampoDeportivo;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos,
                               double valorAdministracion, boolean tienePiscina, boolean tieneCampoDeportivo) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public void imprimir() {
        System.out.println("Casa en Conjunto Cerrado con ID: " + identificadorInmobiliario);
    }
}
