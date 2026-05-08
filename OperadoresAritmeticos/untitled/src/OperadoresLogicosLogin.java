import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[10]; //Reserva en memoria el espacio para ese arreglo
        String[] passwords = new String[10];
        usernames[0] = "Andres";
        passwords[0] = "1234";
        usernames[1] = "David Yoel";
        passwords[1] = "12345";*/

        String[] usernames = {"andres", "David", "Luis"}; //Reserva en memoria el espacio para ese arreglo
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el username");

        String u = scanner.next();

        System.out.println("Ingresa el password");

        String p = scanner.next();

        boolean isAuthenticated = false;

        for(int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)){
                isAuthenticated = true;
                break;
            }
        }


        if(isAuthenticated){
            System.out.println("Bienvenido usuario: " + u + "!");
        }  else {
            System.out.println("Usuario o contraseña incorrectos");
            System.out.println("Lo siento requiere autenticacion.");
        }
    }
}
