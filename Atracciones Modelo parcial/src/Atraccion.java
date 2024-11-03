abstract class Atraccion {
    //Atributos
    private String nombre;
    private int edadPermitida;

    //Constructor


    public Atraccion(String nombre, int edadPermitida) {
        this.nombre = nombre;
        this.edadPermitida = edadPermitida;
    }

    // get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadPermitida() {
        return edadPermitida;
    }

    public void setEdadPermitida(int edadPermitida) {
        this.edadPermitida = edadPermitida;
    }

    public abstract void verificarRequisitos(Visitante visitante);


}
