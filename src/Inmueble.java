public abstract class Inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calculaPrecioVenta(double valorArea) {
        return area * valorArea;
    }

    public abstract void imprimir();
}
