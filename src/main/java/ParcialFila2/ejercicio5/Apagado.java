package ParcialFila2.ejercicio5;

public class Apagado implements IComputadora {
    @Override
    public void handler(Computadora computadora) {
        computadora.setConsumoMemoriaRam(0);
        computadora.setConsumoEnCPU(0);
        System.out.println("****Apagado****");
        System.out.println("No hay programas abiertos");
        computadora.showInfo();
    }
}
