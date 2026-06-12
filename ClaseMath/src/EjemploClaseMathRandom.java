import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        //Generamos un numero aleatorio entre 0 y 1 sin incluir el 1

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;
        System.out.println("random = " + random);


        random = Math.floor(random); //Usamos floor para que no acceda a un indice que no existe
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        //Creamos una instancia de la clase random
        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15); //Si quieres generar un rango aleatorio se le suma x numero y dentro del nextInt() restarle el mismo numero
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
