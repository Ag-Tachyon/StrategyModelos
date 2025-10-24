package Strategy;

public class PeatonalStrategy implements RutaEstrategia{
    @Override
    public String construirRuta(String a, String b) {
        return "Para llegar a "+b+ " desde tu localizacion "+a
                +" camina un aproximado de 15 metros,gira hacia la izquierda" +
                " y camina por 3 minutos, lograste llegar a "+b;
    }
}
