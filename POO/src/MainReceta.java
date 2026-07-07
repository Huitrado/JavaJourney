public class MainReceta {
    public static void main(String[] args) {
        Receta recetaEnchiladas = new Receta();
        //Aqui usamos la sobrecarga de constructor para pasarle un argumento
        Receta recetaTacosDorados = new Receta("Tacos Dorados");
        //Primero se debe crear un array para pasarlo como referencia
        String[] ingredientesEnchiladas = {"1 kg de Tortilla", "500ml de aceite", "Queso adobera", "1/4 de Tomate verde", "1/2 kg de pollo"};


        //Seteamos los atributos del objeto enchiladas
        recetaEnchiladas.setNombre("Enchiladas");
        recetaEnchiladas.setDificultad(5);
        recetaEnchiladas.setIngredientes(ingredientesEnchiladas);

        //Llamamos al metodo mostrar ingredientes
        recetaEnchiladas.mostrarIngredientes();

    }
}
