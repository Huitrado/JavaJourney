import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorAuto = new Persona("David", "Martinez");


        //Esto es una entidad
        Automovil auto =  new Automovil("Dabid", "Valorant");


        auto.setColor(Color.NEGRO);
        auto.setMotor(new Motor(2.2, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque(50));
        auto.setTipo(TipoAutomovil.STATION_WAGON);
        auto.setPropietario(conductorAuto);




        //Esto es una entidad
        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        mazda.setFabricante("Popo");
        mazda.setEstanque(new Estanque(45));
        mazda.setColor(Color.BLANCO);
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setPropietario(pato);
        //mazda.setRuedas(ruedasMazda);





        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(45));
        nissan.setPropietario(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona huitrao = new Persona("Luis", "Huitrao");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.BENCINA), new Estanque(35));
        suzuki.setPropietario(huitrao);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);


        Automovil audi = new Automovil("Audi", "A3");
        audi.setPropietario(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = auto;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil automovil: autos){
            System.out.println(automovil);
        }









    }
}
