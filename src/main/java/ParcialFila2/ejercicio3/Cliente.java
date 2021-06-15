package ParcialFila2.ejercicio3;

public class Cliente {
    public static void main (String []args){
        PaginaWeb paginaWeb = new PaginaWeb();

        Suscritos user1= new Suscritos(new Cuenta("Kevin","20/09/1998"),"Video");
        Suscritos user2= new Suscritos(new Cuenta("Abel","30/05/1993"),"Cualquiera");
        Suscritos user3= new Suscritos(new Cuenta("Juan","9/01/2000"),"Video");
        Suscritos user4= new Suscritos(new Cuenta("Cain","30/05/1993"),"Video");
        Suscritos user5= new Suscritos(new Cuenta("Patricia","9/01/2000"),"Cualquiera");

        paginaWeb.attach(user1);
        paginaWeb.attach(user2);
        paginaWeb.attach(user3);
        paginaWeb.attach(user4);
        paginaWeb.attach(user5);

        paginaWeb.anadirPublicacion(new Publicacion("Video","Presentacion musical"));
        paginaWeb.anadirPublicacion(new Publicacion("Imagen","Nuevos elementos en la tienda"));
        paginaWeb.anadirPublicacion(new Publicacion("Video","Suscribete a esta página"));
        paginaWeb.anadirPublicacion(new Publicacion("Imagen","Gracias por estar presente"));
        paginaWeb.anadirPublicacion(new Publicacion("Programa","Photoshop 15% descuento"));
    }
}
