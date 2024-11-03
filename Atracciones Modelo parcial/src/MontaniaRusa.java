import javax.swing.*;

public class MontaniaRusa extends Atraccion{
    //Atributos
    private double alturaMin;

    //Constructor

    public MontaniaRusa(String nombre) {
        super(nombre, 16);
        this.alturaMin = 1.50;
    }

    //Get y set


    public double getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(double alturaMin) {
        this.alturaMin = alturaMin;
    }

    @Override
    public boolean verificarRequisitos(Visitante visitante) {
        if(visitante.getEdad()< this.getEdadPermitida()){
            JOptionPane.showMessageDialog(null,"Debe ser mayor de 16 para ingresar a la Montaña rusa");
            return false;
        }else if (visitante.getAltura() < this.alturaMin){
            JOptionPane.showMessageDialog(null,"Requisito minimo de altura: "+ this.alturaMin + "\n" + "NO PUEDE INGRESAR");
            return false;
        }else{
            JOptionPane.showMessageDialog(null,"Puede ingresar! Disfruteee");
            return true;
        }
    }

}
