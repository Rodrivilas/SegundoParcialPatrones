package ParcialFila2.ejercicio2;

public class Cliente {
    public static void main (String[] args){
        ChatEducativo chatEducativo=new ChatEducativo();

        Estudiante e =new Estudiante(chatEducativo,1234,"Raul","todos");
        Administrativo a=new Administrativo(chatEducativo,"Joel","admin");
        Docente d=new Docente(chatEducativo,12345,"Patricio");

        chatEducativo.setEstudiante(e);
        chatEducativo.setAdministrativo(a);
        chatEducativo.setDocente(d);

        e.send("Buenos dias a todos");
        System.out.println("");
        a.send("Hola a todos");
        System.out.println("");
        d.send("buenos dias maestros y estudiantes");
        System.out.println("");
        Estudiante e2 =new Estudiante(chatEducativo,1234,"javier","docentes");
        chatEducativo.setEstudiante(e2);

        e2.send("buenos dias docente");

        Estudiante e3 =new Estudiante(chatEducativo,1234,"manuel","administrativos");
        chatEducativo.setEstudiante(e3);

        e3.send("buenos dias administrador");

    }
}
