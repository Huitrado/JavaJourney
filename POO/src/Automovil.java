class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindros;

    //No es tan buena idea imprimir datos en terminal, sino trabajar con ellos y retornarlos
    public String detalle(){ //Cuando se quiere acceder a un atributo de la misma clase, se usa el operador
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = " +this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilindros = " + this.cilindros);
        return sb.toString();
    }
}

//Se recomienda una clase por archivo y con el mismo nombre del archivo
