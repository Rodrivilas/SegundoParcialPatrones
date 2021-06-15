package ParcialFila2.ejerccio1;

public class Originator {

    private Texto state;
    private int version=1;

    public Originator(){}

    public void versionAuto(Texto state, Versiones versiones){
        int numeroPalabras=0;
        for(String palabras : state.getTexto().split(" ")){
            numeroPalabras++;
        }
        setState(state);
        if(numeroPalabras>=5){
            versiones.createVersion("version"+ version++, createMemento());
        }
    }

    public void setState(Texto state) {
        System.out.println("**** Set state *****");
        System.out.println(state.getTexto());
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("*********************");
        System.out.println("**** Versionado(Create State) *****");
        System.out.println(state.getTexto());
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** Restore state *****");
        System.out.println(state.getTexto());
    }

}
