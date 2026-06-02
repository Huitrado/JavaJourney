import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        double nota, promedioMayor5 = 0, promedioMenor4 = 0, notas1 = 0, promedioTotal;
        double[] calificaciones = new double[20]; //write down as a note
        int contadorMayor5 = 0, contadorMenor4 = 0, contador1 = 0;
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Ingresa la nota numero " + (i + 1));
            nota = scan.nextDouble();
            if(nota < 1){
                System.out.println("Error, nota de 0 no es valor valido.");
                break;
            }
            calificaciones[i] = nota;
            if(nota >= 5){
                contadorMayor5 += 1;
                promedioMayor5 += nota;
            } else if (nota <= 4 && nota > 1) {
                contadorMenor4 += 1;
                promedioMenor4 += nota;
            }else if (nota == 1){
                contador1 += 1;
                notas1 += nota;
            }

        }

        promedioTotal = (promedioMayor5 + promedioMenor4 + notas1)/ calificaciones.length;
        promedioMayor5 /= contadorMayor5;
        promedioMenor4 /= contadorMenor4;

        System.out.println("El promedio de las notas mayores a 5 es: " + promedioMayor5);
        System.out.println("El promedio de las notas menores a 4 y mayores a 1 es: " + promedioMenor4);
        System.out.println("La cantidad de notas con 1 son: " + contador1);
        System.out.println("El promedio total es: " + promedioTotal);

    }
}
