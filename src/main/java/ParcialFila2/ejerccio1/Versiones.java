package ParcialFila2.ejerccio1;

import java.util.HashMap;
import java.util.Map;

public class Versiones {
    private Map<String,Memento> guardadoState=new HashMap<>();

    public void createVersion(String version,Memento memento){
        guardadoState.put(version,memento);
    }
    public Memento getMemento(String numVersion){
        return guardadoState.get(numVersion);
    }
}
