public class Kart {
    String nomeKart;
    Motor motor = new Motor("150", 130);
    Piloto piloto;

    public Kart(String nomeKart){
        this.nomeKart = nomeKart;
    }

    void pular(){
        System.out.println("Kart pulando");
    };

    void soltarTurbo(){
        System.out.println("Kart soltando turbo");
    };

    void fazerDrift(){
        System.out.println("Kart fazendo drift");
    };
}
