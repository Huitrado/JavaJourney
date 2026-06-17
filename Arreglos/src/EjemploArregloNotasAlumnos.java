import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];
        int sumaMates = 0, sumaHistoria = 0, sumaLenguaje = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiante para matematicas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = scanner.nextDouble();
        }

        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumaMates += claseMatematicas[i];
            sumaHistoria += claseHistoria[i];
            sumaLenguaje += claseLenguaje[i];
        }
        double promedioMatematicas = sumaMates/claseMatematicas.length;
        double promedioHistoria = sumaHistoria/claseHistoria.length;
        double promedioLenguaje = sumaLenguaje/claseLenguaje.length;
        double promedioTotal =  (promedioLenguaje + promedioHistoria + promedioMatematicas) / 3;
        System.out.println("Promedio clase Matematicas : " + promedioMatematicas);
        System.out.println("Promedio clase Lenguaje : " + promedioLenguaje);
        System.out.println("Promedio clase Historia : " + promedioHistoria);
        System.out.println("Promedio Total del curso: " + promedioTotal);

        System.out.println(" Ingresa el id del alumno: ");
        int id = scanner.nextInt();
        int promedioAlumno = (int) ((claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3);

    }
}
