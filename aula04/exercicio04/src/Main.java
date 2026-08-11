public class Main {

    Zumbi zumbi1 = new Zumbi();
    Zumbi zumbi2 = new Zumbi();

    public void main(){

        zumbi1.nome = "Zumbi1";
        zumbi2.nome = "Zumbi2";

        zumbi1.mostrarVida();
        zumbi2.mostrarVida();

        zumbi1.transfereVida(zumbi2, 100);

        if(zumbi1.statusTransferencia){
            System.out.println("Transferencia realizada com sucesso!");
        }else{
            System.out.println("O zumbi " + zumbi1.nome + " irá morrer se transferir essa quantidade de vida!");
            System.out.println("Transferencia cancelada!!");
        }

        zumbi1.mostrarVida();
        zumbi2.mostrarVida();

    }

}
