public class EjemploAutomovil {
    public static void main(String[] args) {
        //Esto es una entidad
        Automovil auto =  new Automovil();

        auto.setFabricante("Dabid");
        auto.setModelo("Valorant");
        auto.setColor("Negro");
        auto.setCilindros(200);
        auto.setCapacidadTanque(500);

        //Esto es una entidad
        Automovil mazda = new Automovil();
        mazda.setColor("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindros(200);
        mazda.setFabricante("Popo");
        mazda.setCapacidadTanque(500);

        System.out.println("=====Detalle del auto de David Yoel=====");
        System.out.println(auto.verDetalle());
        System.out.println(auto.acelerar(4000));
        System.out.println(auto.frenar());
        System.out.println("=====Detalle del auto Mazda=====");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 60));

        //Para hacer apuntes Operador this, sobrecarga en objetos, ocultacion
        //Ocultacion, los atributos siempre deben ser privados, y solo mediante metodos locales se pueden leer o modificar
    }
}
