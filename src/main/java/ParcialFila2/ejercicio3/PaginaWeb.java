package ParcialFila2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb {

    private List<IUsuario> listaUsuarios= new ArrayList<>();
    private List<Publicacion> publicaciones = new ArrayList<>();

    public void anadirPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion);
        this.notifyObserver(publicacion);
    }

    @Override
    public void attach(IUsuario usuario) {
        listaUsuarios.add(usuario);
    }

    @Override
    public void deattach(IUsuario usuario) {
        listaUsuarios.remove(usuario);
    }

    @Override
    public void notifyObserver(Publicacion publicacion) {
        for (IUsuario usuario:listaUsuarios) {
            if (usuario.getTipo().equals(publicacion.getTipo())){
                usuario.update("Notificacion. Nueva publicación: "+publicacion.getTipo(),publicacion);
            }else if(usuario.getTipo().equals("Cualquiera")){
                usuario.update("Notificacion. Nueva publicación: "+publicacion.getTipo(),publicacion);
            }

        }
    }
}
