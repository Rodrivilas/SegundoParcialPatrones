package ParcialFila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[]args){
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        List<Usuario> l = new ArrayList<>();

        l.add(new Usuario(12332838,"n1","09/05/1983","doctor"));
        l.add(new Usuario(11234023,"n2","06/09/1992","zoologo"));
        l.add(new Usuario(10294833,"n3","23/01/1989","ingeniero"));
        l.add(new Usuario(20294833,"n4","11/02/1997","licenciado"));

        baseDeDatos.setListaUsuario(l);

        baseDeDatos.setOrdenamiento(new Estrategia1());
        baseDeDatos.execute();

        baseDeDatos.setOrdenamiento(new Estrategia2());
        baseDeDatos.execute();

        baseDeDatos.setOrden("nacimiento");
        baseDeDatos.setOrdenamiento(new Estrategia3());
        baseDeDatos.execute();

        baseDeDatos.setOrden("profesión");
        baseDeDatos.setOrdenamiento(new Estrategia3());
        baseDeDatos.execute();

    }
}
