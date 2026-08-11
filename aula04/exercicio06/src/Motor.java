public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima){
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void mostraInfo(){
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Velocidade Maxima: " + velocidadeMaxima);
    }

}
