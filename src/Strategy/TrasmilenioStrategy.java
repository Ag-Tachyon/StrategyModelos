package Strategy;

public class TrasmilenioStrategy implements RutaEstrategia {
    @Override
    public String construirRuta(String a, String b) {
            return "Para llegar a "+b+ " desde tu localizacion "+a
                    +" dirigete a la estacion de trasmilenio, Tm: "+a
                    +" y coge el ruta facil y baja en la estacion "+ b ;
    }
}
