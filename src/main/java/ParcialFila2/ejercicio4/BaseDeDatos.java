package ParcialFila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private String orden;
    private IOrdenamiento ordenamiento;
    private List<Usuario> list = new ArrayList<>();

    public BaseDeDatos(){}

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public IOrdenamiento getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(IOrdenamiento ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }

    public void add(Usuario usuario){
        list.add(usuario);
    }

    public void ordenar(){

    }

}
