public class Main {

    Personagem personagem = new Personagem();
    Arma arma = new Arma();

    public void main(){

        personagem.pontos = 100;
        personagem.arma = arma;

        arma.descricao = "Arma de fogo";
        arma.nome = "Revolver";
        arma.poder = 90;
        arma.resistencia = 50;

        personagem.tomarDano();
        personagem.usarArma();
        personagem.usarArma();
        arma.mostraInfoArma();

    }

}
