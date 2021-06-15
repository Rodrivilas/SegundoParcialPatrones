package ParcialFila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private IOrdenamiento ordenamiento;
    private List<Usuario> listaUsuario = new ArrayList<>();
    private String orden;

    public BaseDeDatos(){}

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public void add(Usuario usuario){
        listaUsuario.add(usuario);
    }
    public IOrdenamiento getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(IOrdenamiento ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public void execute(){
        this.ordenamiento.execute(this.listaUsuario, orden);
    }
}
