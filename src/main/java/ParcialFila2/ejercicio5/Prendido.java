package ParcialFila2.ejercicio5;
import java.util.Random;

public class Prendido implements IComputadora {
    Random r=new Random();
    int v= r.nextInt(20);
    String[] arrayProgramas= new String[]{"Word","Steam","Discord","Chrome","Panel De Control","Firefox","TeamViewer",
            "Internet explorer","AdminDeTareas","Sonido","Epic","Excel","Drive","Photoshop","Whatsapp","YouTube","Minecraft","CSGO","PDFReader","IntelliJ"};

    @Override
    public void handler(Computadora computadora) {
        System.out.println("****Computadora encendida****");
        System.out.println("****Programas abiertos:");
        recorrerLista(v);

        computadora.setConsumoMemoriaRam(v);
        computadora.setConsumoEnCPU(v);
        computadora.showInfo();
    }

    public void recorrerLista(int n){
        for(int i=0; i<n ;i++){
            System.out.println(arrayProgramas[(int)(Math.random()*n+1)]);
        }
    }
}
