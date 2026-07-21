package com.lhuitrado.app.jardin;

import com.lhuitrado.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza; //Cuando un atributo esta protected significa que solo puede ser usando dentro del contexto que se encuentra
    // en este caso jardin

    String jugar(Persona persona){
        return persona.lanzarPelota();

    }
}
