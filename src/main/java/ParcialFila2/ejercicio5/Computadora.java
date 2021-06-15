package ParcialFila2.ejercicio5;


public class Computadora {
    private IComputadora state;
    private int consumoMemoriaRam;
    private int consumoEnCPU;


    public IComputadora getState(){
        return state;
    }

    public void setState(IComputadora state){
        this.state = state;
    }
    public void request(){
        this.state.handler(this);
    }

    public int getConsumoMemoriaRam() {
        return consumoMemoriaRam;
    }

    public void setConsumoMemoriaRam(int consumoMemoriaRam) {
        this.consumoMemoriaRam = consumoMemoriaRam;
    }

    public int getConsumoEnCPU() {
        return consumoEnCPU;
    }

    public void setConsumoEnCPU(int consumoEnCPU) {
        this.consumoEnCPU = consumoEnCPU;
    }


}
