public class Oficina extends Local {
    private double valorArea;
    private boolean esGobierno;

    public Oficina(int identificadorInmobiliario, int area, String direccion, TipoLocal tipoLocal, double valorArea, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.valorArea = valorArea;
        this.esGobierno = esGobierno;
    }

    @Override
    public void imprimir() {
        System.out.println("Oficina con ID: " + identificadorInmobiliario);
    }
}