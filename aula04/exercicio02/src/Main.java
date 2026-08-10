public class Main {

    Zumbi zumbi1 = new Zumbi();
    Zumbi zumbi2 = new Zumbi();



    public void main(){

        zumbi1.nome = "Zumbi1";
        zumbi2.nome = "Zumbi2";

        zumbi1.mostrarVida();
        zumbi2.mostrarVida();

        zumbi1.transfereVida(zumbi2, 10);

        zumbi1.mostrarVida();
        zumbi2.mostrarVida();

    }

}
