package ParcialFila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Estrategia2 implements IOrdenamiento{
    List<Usuario>u=new ArrayList<>();
    @Override
    public void execute(List<Usuario> usuarios, String orden) {
        System.out.println("*************************");
        System.out.println("*Estrategia 2 Nombre:");
    }
}
