import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de gasolina de tu tanque: ");
        Double litrosGasolina = scanner.nextDouble();


        if(litrosGasolina == 70){
            System.out.println("Estanque lleno");
        } else if (litrosGasolina >= 60 && litrosGasolina < 70) {
            System.out.println("Estanque casi lleno");
        } else if (litrosGasolina >= 40 && litrosGasolina < 60) {
            System.out.println("Estanque 3/4");
        }else if (litrosGasolina >= 35 && litrosGasolina < 40) {
            System.out.println("Medio estanque");
        } else if (litrosGasolina >= 20 && litrosGasolina < 35) {
            System.out.println("Suficiente");
        }else if (litrosGasolina >= 1 && litrosGasolina < 20) {
            System.out.println("Insuficiente");
        }
    }
}
