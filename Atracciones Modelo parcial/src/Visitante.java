public class Visitante {
    //Atributos
    private int edad;
    private double altura;
    private boolean estadoSalud;
    private Entrada entrada;

    //Constructor

    public Visitante(int edad, double altura, boolean estadoSalud, Entrada entrada) {
        this.edad = edad;
        this.altura = altura;
        this.estadoSalud = estadoSalud;
        this.entrada = entrada;
    }


    //Get y sett

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(boolean estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
}
