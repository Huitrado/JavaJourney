//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Son una especia de contenedor que nos permiten organizar nuestras clases por una jerarquia

        Agrupan  organizan nuestras clases
        Ademas evitan conflictos de nombre entre clases
        Segun los modificadores pueden ocultar el acceso a sus clases y/o miembros


        Deben estar escritos en minusculas y los subpackage debe estar separado con punto
        Tipicamente la empresa utiliza la estension de su dominio com.google, com.facebook

        Definiendo el package en nuestra clases
        package com.lhuitrado.datos; // cada nombre seguido de un punto es un directorio

        public class Persona{

        }

        Luego para utilizar la clase debemos importar con import

        import com.lhuitrado.Persona;

        Para importar todas las clases
        import com.lhuitrado.*;

        EL modificador public permite que usemos clases y atributos desde otros paquetes o contextos
        Cuando no tenemos un modificador es el default que solo permite ser usando dentro del mismo contexto/nivel, a no ser que lo importemos
    }
}