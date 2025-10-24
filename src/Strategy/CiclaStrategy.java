package Strategy;

public class CiclaStrategy implements  RutaEstrategia {
    @Override
    public String construirRuta(String a, String b) {
        return "Para llegar a "+b+ " desde tu localizacion "+a
                +" dirigete a la ciclovia del portal del dorado " +
                " y  ve hacia el norte por 10 km, llegaste a "+ b ;
    }
}
