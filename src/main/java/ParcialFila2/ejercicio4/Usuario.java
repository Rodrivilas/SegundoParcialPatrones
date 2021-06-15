package ParcialFila2.ejercicio4;

public class Usuario {
    private int ci;
    private String nombre;
    private String fechaNacimiento;
    private String profesion;

    public Usuario(int ci, String nombre, String fechaNacimiento, String profesion){
        this.ci=ci;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.profesion=profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void showInfo(){
        System.out.println("CI:"+ci);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
        System.out.println("Profesión: "+profesion);
    }
}
