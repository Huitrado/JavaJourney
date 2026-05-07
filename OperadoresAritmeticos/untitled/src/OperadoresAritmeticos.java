import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4;
        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        float div =  i / (float)j;
        System.out.println("div = " + div);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero % 2 == 0){
            System.out.println("numero par: " + numero);
        }else{
            System.out.println("numero impar" + numero );
        }
    }
}
