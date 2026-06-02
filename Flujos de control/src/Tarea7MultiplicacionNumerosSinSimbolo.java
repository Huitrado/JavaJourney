import java.util.Scanner;

public class Tarea7MultiplicacionNumerosSinSimbolo {
    public static void main(String[] args) {Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numeros positivo o negativo: ");
        int num1 = scan.nextInt();
        System.out.println("Ingresa un segundo numero positivo o negativo");
        int num2 = scan.nextInt();
        int resultado = 0;
        int iterador;
        int numeroPositivo1, numeroPositivo2;

        //Convertimos el num1 en positivo
        if (num1 < 0){
            numeroPositivo1 = -(num1);
            System.out.println("numeroPositivo1 = " + numeroPositivo1);
        }else{
            numeroPositivo1 = num1;
        }

        //Convertimos el num2 en positivo
        if (num2 < 0){
            numeroPositivo2 = -(num2);
        }else{
            numeroPositivo2 = num2;
        }

        iterador = (numeroPositivo1 > numeroPositivo2) ? numeroPositivo1 : numeroPositivo2;



        for (int i = 0; i < iterador - 1; i++){
            if(num1 < 0 && num2 < 0){
                resultado += numeroPositivo1;
            } else if (num1 == 0 || num2 == 0) {
                resultado = 0;
                break;
            } else if (num1 < 0){
                resultado += num1;
            } else if (num2 < 0){
                resultado += num2;
            }else {
                resultado += num1;
            }

        }
        System.out.println("resultado = " + resultado);

    }
}



