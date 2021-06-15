package ParcialFila2.ejercicio2;

public class ChatEducativo implements IMediator{
    private Estudiante estudiante;
    private Docente docente;
    private Administrativo administrativo;

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == administrativo){
            estudiante.messageReceived(message);
            docente.messageReceived(message);
            administrativo.messageReceived(message);
        }else if(colleague == docente){
            estudiante.messageReceived(message);
            docente.messageReceived(message);
        }else if(colleague== estudiante){
            if(estudiante.getMensaje().equals("todos")){
                estudiante.messageReceived(message);
                docente.messageReceived(message);
                administrativo.messageReceived(message);
            }else if(estudiante.getMensaje().equals("docentes")){
                docente.messageReceived(message);
            }else if(estudiante.getMensaje().equals("administrativos")){
                administrativo.messageReceived(message);
            }

        }
    }
}
