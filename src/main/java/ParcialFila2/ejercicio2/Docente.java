package ParcialFila2.ejercicio2;

public class Docente extends Colleague{
    private int ci;
    private String nombre;

    public Docente(IMediator mediator, int ci,String nombre) {
        super(mediator);
        this.ci=ci;
        this.nombre=nombre;
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received Docente > "+message);
    }
}
