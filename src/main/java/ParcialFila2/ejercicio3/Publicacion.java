package ParcialFila2.ejercicio3;

public class Publicacion {
    private String tipo;
    private String descripcion;

    public Publicacion(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return "Descripción de la publicación: "+descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
