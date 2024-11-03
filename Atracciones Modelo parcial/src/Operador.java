import javax.swing.*;

public class Operador {
    //Atributos
    private String nombre;

    //Constructor


    public Operador(String nombre) {
        this.nombre = nombre;
    }

    // get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public void verificarAcceso(Visitante visitante,Atraccion atraccion){
        if(visitante.getEntrada().isValida()){
            JOptionPane.showMessageDialog(null,"La entrada es valida");
            atraccion.verificarRequisitos(visitante);
        }else{
            JOptionPane.showMessageDialog(null,"Comprate una entrada primero che!!");
        }
    }
}
