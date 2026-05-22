import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {
        String[] nombres = new String[6];
        String[] nombres2 =  {"Andres", "Pepe", "Maria", "Pepa", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres2.length;

        for(int i = 0; i < count; i++){
            if (nombres2[i].equalsIgnoreCase("andres") ||
                    nombres2[i].equalsIgnoreCase("Pepa")){ //IgnoreCase utiliza
                continue;
            }
            System.out.println(i + " " +nombres2[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres2[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " no fue encontrado");
        }

    }
}
