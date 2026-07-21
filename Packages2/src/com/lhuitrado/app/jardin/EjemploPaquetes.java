package com.lhuitrado.app.jardin;

import com.lhuitrado.app.hogar.*;
import static com.lhuitrado.app.hogar.Persona.saludar; //import static com.lhuitrado.app.hogar.Persona.*; Alternativa a importar todos los metodos y atributos y constantes estaticas;
import static com.lhuitrado.app.hogar.Persona.GENERO_MASCULINO;
import static com.lhuitrado.app.hogar.Persona.GENERO_FEMENINO;
import static com.lhuitrado.app.hogar.ColorPelo.*;
public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Davil");
        p.setApellido("Aguilar");
        p.setColorPelo(ROJO);
        System.out.println(p.getNombre());
        Perro perro1 =  new Perro(); //Solo es necesario importar cuando estan en diferente contexto
        perro1.nombre = "Puppy";
        perro1.raza = "NOse";

        String jugando = perro1.jugar(p);
        System.out.println(jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
    }
}
