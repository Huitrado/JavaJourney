public class Receta {
    private String nombre;
    private int dificultad;
    private String[] ingredientes;
    private static int totalRecetas = 0;


    //Constructor sin argumentos
    Receta(){
        nombre = "Enchiladas";
    }

    //Sobrecarga de constructor
    Receta(String nombre){
        this.nombre = nombre;
        totalRecetas++;
    }

    //Esto es un setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setDificultad (int dificultad){
        this.dificultad = dificultad;
    }

    public void setIngredientes(String[] ingredientes){
        this.ingredientes = ingredientes;
    }

    private static int getTotalRecetas(){
        return totalRecetas;
    }

    public void mostrarIngredientes(){
        System.out.println("Los ingredientes de la receta " +this.nombre +" son: ");
        for (String ingrediente: ingredientes){
            System.out.println(ingrediente);
        }
    }

    //Metodo estatico, ya que no necesito acceder a algun atributo de la clase, en cambio si es una accion general
    public static boolean validarNombre(String nombre){
        return !nombre.isBlank() && nombre != null;
    }


}
