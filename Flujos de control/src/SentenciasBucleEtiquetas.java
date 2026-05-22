public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        //Etiquetas que siempre van justo pegados al for
        bucle1: for (int i = 0; i < 5; i ++){

            System.out.println();
            for (int j = 0; j < 5; j++){
                if(i == 2){
                    continue bucle1; //Aqui se salta completamente la iteracion del for anidado al usar la etiqueta bucle1
                }
                System.out.println("i = " + i + ", j = "+ j);
            }

        }

        //Etiqueta en for pero usando break
        etiqueta: for (int i = 0; i < 5; i ++){

            System.out.println();
            for (int j = 0; j < 5; j++){
                if(i == 2){
                    break etiqueta; //Aqui se salta completamente la iteracion del for anidado al usar la etiqueta bucle1
                }
                System.out.println("i = " + i + ", j = "+ j);
            }

        }

        bucle: for (int i = 0; i <= 7; i ++){

            System.out.println();
            for (int j = 0; j <= 8; j++){
                if(i == 7 || i == 6){
                    System.out.println("Dia "+ i + ": descanso de fin de semana");
                    break bucle; //Aqui se salta completamente la iteracion del for anidado al usar la etiqueta bucle1
                }
                System.out.println("Dia " + i + ": trabajando a las " + j + " horas.");
            }

        }
    }
}
