package ParcialFila2.ejercicio3;

public interface IPaginaWeb {
    void attach(IUsuario usuario);
    void deattach(IUsuario usuario);
    void notifyObserver(Publicacion publicacion);
}
