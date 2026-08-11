public class Zumbi {

    double vida = 80;
    String nome;
    boolean statusTransferencia = false;

    void mostrarVida(){
        System.out.println("Vida atual do " + nome + " = "  + vida);
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        if(quantia >= this.vida){
            statusTransferencia = false;
        }else{
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            this.vida  = vida - quantia;
            statusTransferencia = true;
        }
    }
}
