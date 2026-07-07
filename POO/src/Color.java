public enum Color {
    //Un enum es una coleccion de constantes
    ROJO("Rojo"),
    NEGRO("Negro"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranja");

    //Para personalizar
    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return this.color;
    }
}
