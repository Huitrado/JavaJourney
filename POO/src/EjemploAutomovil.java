import java.sql.SQLOutput;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //Esto es una entidad
        Automovil auto =  new Automovil("Dabid", "Valorant");


        auto.setColor(Color.NEGRO);
        auto.setMotor(new Motor(2.2, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque(50));
        auto.setTipo(TipoAutomovil.STATION_WAGON);
        System.out.println("Velocidad Maxima carretera" + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad Maxima ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);


        //Esto es una entidad
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        mazda.setFabricante("Popo");
        mazda.setEstanque(new Estanque(45));
        mazda.setColor(Color.BLANCO);
        mazda.setTipo(TipoAutomovil.HATCHBACK);


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(45));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.3, TipoMotor.DIESEL), new Estanque(35));
        Automovil auto1 = new Automovil();
        System.out.println(nissan.equals(nissan2));
        System.out.println("=====Detalle del auto de David Yoel=====");
        System.out.println(auto.verDetalle());
        System.out.println(auto.acelerar(4000));
        System.out.println(auto.frenar());
        System.out.println("=====Detalle del auto Mazda=====");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println(auto.equals(nissan));
        System.out.println(nissan);

        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro " + Automovil.calcularConsumoEstatico(300, 60));

        TipoAutomovil tipoMazda = mazda.getTipo();
        System.out.println("Tipo del Mazda: " + tipoMazda.getNombre());
        System.out.println("Tipo descripcion del Mazda: " + tipoMazda.getDescripcion());
        //Para hacer apuntes Operador this, sobrecarga en objetos, ocultacion
        //Ocultacion, los atributos siempre deben ser privados, y solo mediante metodos locales se pueden leer o modificar
    }
}
