package ParcialFila2.ejercicio3;

public class Cuenta {
    private String nombre;

    private String fechaDeNacimiento;

    public Cuenta(String nombre,String fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento=fechaDeNacimiento;
    }

    public void showInfo(){
        System.out.println("********************");
        System.out.println("Nombre cuenta:"+nombre);
        System.out.println("Fecha de nacimiento:"+ fechaDeNacimiento);
    }
}
