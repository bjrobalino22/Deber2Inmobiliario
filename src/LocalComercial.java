public class LocalComercial extends Local {
    private double valorArea;
    private String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int area, String direccion, TipoLocal tipoLocal, double valorArea, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir() {
        System.out.println("Local Comercial con ID: " + identificadorInmobiliario);
    }
}