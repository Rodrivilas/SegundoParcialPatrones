package ParcialFila2.ejerccio1;

public class Memento {
    private Texto state;
    public Memento(Texto stateSaved){
        this.state=stateSaved;
    }
    public Texto getState() {
        return state;
    }
}
