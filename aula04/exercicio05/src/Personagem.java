public class Personagem {
    String nome;
    int pontos;

    Arma arma;

    void usarArma(){
        arma.usar();
    }

    void tomarDano(){
        pontos = pontos - 5;
        System.out.println("Tomou 5 de dano! Vida atual: " + pontos);
    }


}
