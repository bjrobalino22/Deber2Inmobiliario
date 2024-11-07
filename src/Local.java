public abstract class Local extends Inmueble {
    public enum TipoLocal {
        INTERNO, CALLE
    }

    protected TipoLocal tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, TipoLocal tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public abstract void imprimir();
}
