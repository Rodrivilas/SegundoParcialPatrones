package ParcialFila2.ejercicio2;

public class Estudiante extends Colleague {
    private int numeroMatricula;
    private String nombre;
    private String mensaje;

    public Estudiante(IMediator mediator,int numeroMatricula,String nombre,String mensaje) {
        super(mediator);
        this.numeroMatricula=numeroMatricula;
        this.nombre=nombre;
        this.mensaje=mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received Estudiante > "+message);
    }

}
