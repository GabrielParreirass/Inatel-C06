public class Zumbi {

    double vida = 80;
    String nome;

    void mostrarVida(){
        System.out.println("Vida atual do " + nome + " = "  + vida);
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida  = vida - quantia;
        zumbiAlvo.vida = zumbiAlvo.vida + quantia;
    }


}
