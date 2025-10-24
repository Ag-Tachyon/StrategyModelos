import Strategy.*;

import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);
    Navegador navegador = new Navegador();
    System.out.println("Hola ingresa los valor de salida");
    String a = scan.nextLine();
    System.out.println("Ingresa el destino seleccionado");
    String b = scan.nextLine();

    System.out.println("""
            Tipo de transporte 
            1.Cicla
            2.Tramilenio
            3.A pie 
            4.Carro
            """);
    int opt = scan.nextInt();


    switch (opt) {

        case 1:
            navegador.setRutaEstrategia(new CiclaStrategy());
            System.out.println(navegador.construirRuta(a, b));
            break;
        case 2:
            navegador.setRutaEstrategia(new TrasmilenioStrategy());
            System.out.println(navegador.construirRuta(a, b));
            break;
        case 3:
            navegador.setRutaEstrategia(new PeatonalStrategy());
            System.out.println(navegador.construirRuta(a, b));
            break;
        case 4:
            navegador.setRutaEstrategia(new CarroParticularStrategy());
            System.out.println(navegador.construirRuta(a, b));
            break;
        default:
            break;
    }

}
