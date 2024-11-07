public class Main {
    public static void main(String[] args) {
        // Creando instancias de diferentes tipos de inmuebles

        // Casa Rural
        CasaRural casaRural = new CasaRural(
                1, 150, "Calle 123, Pueblo", 3, 2, 1, 200.0, 5, 1200
        );
        casaRural.imprimir();

        // Casa en Conjunto Cerrado
        CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(
                2, 200, "Calle 456, Ciudad", 4, 3, 2, 20.0, true, true
        );
        casaConjunto.imprimir();

        // Casa Independiente
        CasaIndependiente casaIndependiente = new CasaIndependiente(
                3, 180, "Avenida 789, Ciudad", 4, 3, 1, 150.0
        );
        casaIndependiente.imprimir();

        // Apartamento Familiar
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(
                4, 80, "Edificio A, Piso 5, Ciudad", 3, 2, 100.0
        );
        apartamentoFamiliar.imprimir();

        // Apartaestudio
        Apartaestudio apartaestudio = new Apartaestudio(
                5, 40, "Edificio B, Piso 10, Ciudad", 1, 1
        );
        apartaestudio.imprimir();

        // Local Comercial
        LocalComercial localComercial = new LocalComercial(
                6, 100, "Centro Comercial X, Local 45", Local.TipoLocal.INTERNO, 400.0, "Centro Comercial X"
        );
        localComercial.imprimir();

        // Oficina
        Oficina oficina = new Oficina(
                7, 120, "Edificio Z, Piso 15, Ciudad", Local.TipoLocal.CALLE, 450.0, true
        );
        oficina.imprimir();
    }
}
