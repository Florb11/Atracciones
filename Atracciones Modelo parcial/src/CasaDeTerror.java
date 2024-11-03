import javax.swing.*;

public class CasaDeTerror extends Atraccion {
    //Atributo
    private boolean tieneEfectosEspeciales;

    //Constructor

    public CasaDeTerror(String nombre) {
        super(nombre, 18);
        this.tieneEfectosEspeciales = true;
    }

    //Get y set

    public boolean istieneEfectosEspeciales() {
        return tieneEfectosEspeciales;
    }

    public void settieneEfectosEspeciales(boolean tieneEfectosEspeciales) {
        this.tieneEfectosEspeciales = tieneEfectosEspeciales;
    }

    @Override
    public void verificarRequisitos(Visitante visitante) {
        if(visitante.getEdad()< this.getEdadPermitida()){
            JOptionPane.showMessageDialog(null,"Debe ser mayor de edad para ingresar a la Casa del terror");
        }else if (!visitante.isEstadoSalud() && this.tieneEfectosEspeciales){
            JOptionPane.showMessageDialog(null,"Esta atraccion no se recomienda para personas con problemas de salud");

        }else{
            JOptionPane.showMessageDialog(null,"Puede ingresar! Disfruteee");
        }
    }
}
