// Clase intermedia: InmuebleVivienda
public abstract class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBanos;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    @Override
    public abstract void imprimir();
}