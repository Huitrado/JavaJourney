public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorAuto = new Persona("David", "Martinez");


        //Esto es una entidad
        Automovil auto =  new Automovil("Dabid", "Valorant");


        auto.setColor(Color.NEGRO);
        auto.setMotor(new Motor(2.2, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque(50));
        auto.setTipo(TipoAutomovil.STATION_WAGON);
        auto.setPropietario(conductorAuto);
        //auto.setRuedas(ruedasAuto);
        Rueda[] ruedasAuto = new Rueda[5];
        for (int i = 0; i < ruedasAuto.length; i++){
            auto.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        System.out.println("Velocidad Maxima carretera" + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad Maxima ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);


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

        Rueda[] ruedasMazda = new Rueda[5];

        for (int i = 0; i < ruedasMazda.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }


        Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(45), bea, ruedasNissan);

        Persona huitrao = new Persona("Luis", "Huitrao");
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));
        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.3, TipoMotor.DIESEL), new Estanque(35), huitrao, ruedasNissan2);
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


        //Mostrando las ruedas del auto
        System.out.println(auto.verDetalle());




    }
}
