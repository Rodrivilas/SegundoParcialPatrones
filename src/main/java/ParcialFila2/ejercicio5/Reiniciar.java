package ParcialFila2.ejercicio5;

public class Reiniciar implements IComputadora {
    @Override
    public void handler(Computadora computadora) {
        computadora.setConsumoMemoriaRam(0);
        computadora.setConsumoEnCPU(0);
        System.out.println("****Reiniciando****");
        System.out.println("Ningún programa abierto");
        computadora.showInfo();
    }
}
