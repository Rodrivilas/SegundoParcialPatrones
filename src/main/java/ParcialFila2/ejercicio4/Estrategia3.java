package ParcialFila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Estrategia3 implements IOrdenamiento{
    List<Usuario>u=new ArrayList<>();
    @Override
    public void execute(List<Usuario> usuarios, String orden) {
        if(orden.equals("nacimiento")){
            System.out.println("*************************");
            System.out.println("*Estrategia 3 nacimiento:");
        }else if(orden.equals("profesión")){
            System.out.println("*************************");
            System.out.println("*Estrategia 3 profesion:");
        }
    }
}
