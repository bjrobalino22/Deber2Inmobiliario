public abstract class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public abstract void imprimir();
}