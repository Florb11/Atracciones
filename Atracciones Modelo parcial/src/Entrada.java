public class Entrada {
    //Atributo
    private boolean valida;

    //constructor

    public Entrada(boolean valida) {
        this.valida = valida;
    }


    //get y set


    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                ", valida=" + valida +
                '}';
    }
}
