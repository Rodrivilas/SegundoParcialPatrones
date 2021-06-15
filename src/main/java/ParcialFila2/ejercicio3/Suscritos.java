package ParcialFila2.ejercicio3;

public class Suscritos implements IUsuario{

    private Cuenta cuenta;
    private String suscripcion;

    public Suscritos(Cuenta cuenta, String suscripcion) {
        this.cuenta = cuenta;
        this.suscripcion = suscripcion;
    }

    @Override
    public void update(String message, Publicacion publicacion) {
        cuenta.showInfo();
        System.out.println(message);
        System.out.println(publicacion.getDescripcion());
    }
    @Override
    public String getTipo() {
        return this.suscripcion;
    }
}
