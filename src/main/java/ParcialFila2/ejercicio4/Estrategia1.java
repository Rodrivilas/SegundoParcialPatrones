package ParcialFila2.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Estrategia1 implements IOrdenamiento{
List<Usuario>u2=new ArrayList<>();
    @Override
    public void execute(List<Usuario> usuarios, String orden) {
        System.out.println("*************************");
        System.out.println("*Estrategia 1 CI:");
        for(Usuario u :usuarios){
            u.showInfo();
        }

    }
}
