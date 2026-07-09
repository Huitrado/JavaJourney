import java.sql.SQLOutput;

public class EjemploAutomovilEnum {
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
        //Usando ENUM con switch case
        TipoAutomovil tipoMazda = mazda.getTipo();

        switch(tipoMazda){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, con maleta grande...");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values(); //.values() regresa

        //Los enums se pueden usar para constantes que nunca cambian de nombre, como los nombres de los planetas o los dias de las semanas.
        for (TipoAutomovil tipoAuto :tipos){
            System.out.print(tipoAuto + "=> " + tipoAuto.name() + ", " +
                    tipoAuto.getNombre() + ", " +
                    tipoAuto.getDescripcion() + ", " +
                    tipoAuto.getNumeroPuertas());
        }
    }
}
