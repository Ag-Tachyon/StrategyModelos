package Strategy;

public class Navegador {
    private RutaEstrategia rutaEstrategia;

    public void setRutaEstrategia(RutaEstrategia rutaEstrategia) {
        this.rutaEstrategia = rutaEstrategia;
    }
    public String construirRuta (String a, String b) {
        return rutaEstrategia.construirRuta(a, b);
    }
}
