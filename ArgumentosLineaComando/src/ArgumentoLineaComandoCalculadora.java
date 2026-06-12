public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("Por favor ingresa bien los datos");
            System.exit(-1);
        }
        String operacion = args[0].toLowerCase();
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.0;
        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if (b == 0){
                    System.out.println("No se puede dividir entre cero");
                    System.exit(-1);
                }else{
                    resultado = (double)(a/b);
                    break;
                }
            default:
                resultado = a + b;

        }
        System.out.println("Resultado de la operacion " + operacion + "es " + operacion);
    }
}
