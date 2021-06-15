package ParcialFila2.ejercicio2;



public class Administrativo extends Colleague{
    private String nombre;
    private String cargo;

    public Administrativo(IMediator mediator,String nombre,String cargo) {
        super(mediator);
        this.nombre=nombre;
        this.cargo=cargo;
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received Administrativo > "+message);
    }
}
