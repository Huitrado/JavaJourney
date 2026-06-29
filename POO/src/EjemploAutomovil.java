public class EjemploAutomovil {
    public static void main(String[] args) {
        //Esto es una entidad
        Automovil auto =  new Automovil();

        auto.fabricante = "David Yoel";
        auto.modelo = "Valorant";
        auto.color = "Negro";
        auto.cilindros = 200;

        //Esto es una entidad
        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindros = 200;
        mazda.color = "rojo";

        System.out.println("=====Detalle del auto de David Yoel=====");
        System.out.println(auto.detalle());
        System.out.println("=====Detalle del auto Mazda=====");
        System.out.println(mazda.detalle());
    }
}
