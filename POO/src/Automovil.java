class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindros;
    private int capacidadTanque = 40;


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindros() {
        return cilindros;
    }

    public void setCilindros(double cilindros) {
        this.cilindros = cilindros;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    //No es tan buena idea imprimir datos en terminal, sino trabajar con ellos y retornarlos
    public String verDetalle(){ //Cuando se quiere acceder a un atributo de la misma clase, se usa el operador
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = " +this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilindros = " + this.cilindros);
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + "acelerando a " + "rpm " + rpm;
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar(); //El this tambien se usa para referirnos a metodos de la propia clase
        return acelerar + "\n " + frenar;
    }

    public double calcularConsumo(int km, double porcentajeBencina){ //Sobre carga de metodos
        return km/(porcentajeBencina * this.capacidadTanque);
    }

    public double calcularConsumo(int km, int porcentajeBencina){ //Sobre carga de metodos
        return km/((porcentajeBencina / 100f) * this.capacidadTanque); //Es necesario dividirlo entre 100f ya que el resultado
    }
}

//Se recomienda una clase por archivo y con el mismo nombre del archivo
