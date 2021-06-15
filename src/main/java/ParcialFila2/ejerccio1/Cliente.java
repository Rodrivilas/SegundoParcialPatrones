package ParcialFila2.ejerccio1;

public class Cliente {

    public static void main(String[] args){
        Versiones versiones = new Versiones();
        Originator o= new Originator();

        Texto archivo;
        archivo= new Texto("este documento es una prueba");
        o.versionAuto(archivo, versiones);
        archivo= new Texto("el exito solo depende de tu esfuerzo");
        o.versionAuto(archivo, versiones);
        archivo= new Texto("prologo");
        o.versionAuto(archivo, versiones);
        archivo= new Texto("este documento fue realizado satisfactoriamente");
        o.versionAuto(archivo, versiones);

        o.restoreFromMemento(versiones.getMemento("version1"));
    }

}
