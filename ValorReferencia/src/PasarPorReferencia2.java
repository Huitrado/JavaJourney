class Persona{
    private String nombre;//Estos solo pueden ser modificados en la misma clase o metodos de la propia clase
    //Un atributo consta de visibilidad, tipo de dato y nombre
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("David Yoel y Kuauhtli");



        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Iniciamos el metodo test");
        test(persona);
        System.out.println("Despues de llamar el metodo test");
        System.out.println("persona = " + persona.leerNombre());
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }
}
