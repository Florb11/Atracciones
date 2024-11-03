import javax.swing.*;

public class Parque {
    //Atributos
    private String nombre;
    private Operador operador;

    //Constructor

    public Parque(String nombre, Operador operador) {
        this.nombre = nombre;
        this.operador = operador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Parque{" +
                "nombre='" + nombre + '\'' +
                ", operador=" + operador +
                '}';
    }
    public void asignarOperador(Operador operador){
        if(this.operador == null){
            this.setOperador(operador);
            JOptionPane.showMessageDialog(null,"Operador asignado correctamente, lo atendera: "+operador.getNombre());
        }else{
            JOptionPane.showMessageDialog(null,"Ya hay operador asignado: "+this.operador.getNombre());

        }


    }
}
