package Strategy;

public class CarroParticularStrategy implements RutaEstrategia {
    @Override
    public String construirRuta(String a, String b) {
        return "Para llegar a "+b+ " desde tu localizacion "+a
                +" dirigete a la avenida Cali, entonces toma la trasversal conjunta a "+a
                +" y gira a la derecha, lograste llagar a  "+ b ;
    }
}
