public class Receta {
    private String nombre;
    private int dificultad;
    private String[] ingredientes;

    //Constructor sin argumentos
    Receta(){
        nombre = "Enchiladas";
    }
    //Sobrecarga de constructor
    Receta(String nombre){
        this.nombre = nombre;
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

    public void mostrarIngredientes(){
        System.out.println("Los ingredientes de la receta " +this.nombre +" son: ");
        for (String ingrediente: ingredientes){
            System.out.println(ingrediente);
        }
    }
}
