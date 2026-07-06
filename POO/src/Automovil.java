class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindros;
    private int capacidadTanque = 40;
    static String colorPatente = "Naranja";
    private static int capacidadTanqueEstatico = 50;
    private static int ultimoId;

    //COnstructor vacio, esto se le llama sobrecarga de constructor
    public Automovil(){
        this.id = ++ultimoId;
    }

    //Constructor con dos parametro
    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Constructor que reutiliza el anterior constructor
    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        this.color = color;
    }

    //Constructor que reutiliza el anterior constructor
    public Automovil(String fabricante, String modelo, String color, double cilindros){
        this(fabricante, modelo, color);
        this.cilindros = cilindros;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindros, int capacidadTanque){
        this(fabricante, modelo, color, cilindros);
        this.capacidadTanque = capacidadTanque;
    }


    //Getter y setter por el ocultamiento de los atributos
    public int getId(){
        return id;
    }

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

    public static int getCapacidadTanqueEstatico(){
        return Automovil.capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico){
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
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

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente; //Como es un atributo static se hace referencia al atributo con el nombre de la clase
    }

    //No es tan buena idea imprimir datos en terminal, sino trabajar con ellos y retornarlos
    public String verDetalle(){ //Cuando se quiere acceder a un atributo de la misma clase, se usa el operador
        StringBuilder sb = new StringBuilder();
        sb.append("ID = " + this.getId());
        sb.append("\nfabricante = " +this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilindros = " + this.cilindros);
        sb.append("\ncolor patente = " + colorPatente); //Como es una variable static no es necesario referirnos al objeto como tal, ya que es una variable general que se comparte en todas las instancias de esa clase
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

    public static double calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/((porcentajeBencina / 100f) * Automovil.capacidadTanqueEstatico);
    }


    @Override //NO hace nada, pero sirve como documentacion
    //Polimorfismo
    public boolean equals(Object obj){
        Automovil a = (Automovil) obj; //Estamos casteando el objeto de tipo Objeto a Automovil para que pueda ser comparado

        return this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()); //Estamos comparando el fabricante
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindros=" + cilindros +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}

//Se recomienda una clase por archivo y con el mismo nombre del archivo
