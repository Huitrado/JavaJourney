import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingresa el segundo nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingresa el tercer nombre: ");
        String nombre3 = scanner.nextLine();

        String nombre1Mayuscula = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2); // Cuando usamos + para concatenar string java hace la conversion automatica de un char a string
        //String nombre1Mayuscula = Character.toString(Character.toUpperCase(nombre1.charAt(1))).concat("." + nombre1.substring((nombre1.length() - 2))); Mientras que aqui como usamos un metodo .concat() es necesario convertirlo manualmente a string con Character.toString()
        String nombre2Mayuscula = Character.toString(Character.toUpperCase(nombre2.charAt(1))).concat("." + nombre2.substring(nombre2.length() - 2));
        String nombre3Mayuscula = Character.toString(Character.toUpperCase(nombre3.charAt(1))).concat("." + nombre3.substring(nombre3.length() - 2));

        String nombresCompletos = nombre1Mayuscula.concat("_" + nombre2Mayuscula).concat("_" + nombre3Mayuscula);

        System.out.println("nombresCompletos = " + nombresCompletos);




        scanner.close();
    }
}
