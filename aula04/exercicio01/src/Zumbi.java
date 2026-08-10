public class Zumbi {
    boolean fome = true;
    String nome;
    int idade;
    int vida = 50;

    void alimentar(){
        if(fome){
            fome = false;
            vida = vida + 10;
            System.out.println("Alimentado! Vida = " + vida);
        }else{
            System.out.println("Ja esta alimentado!");
        }
    }

    void sofrerDano(int dano){

        vida = vida - dano;

        if(vida <= 0 ){
            System.out.println("Dano de: " + dano + " sofrido!");
            System.out.println("Zumbi morto!");
        }else{
            System.out.println("Dano de: " + dano + " sofrido!");
            System.out.println("Vida atual: " + vida);
        }




    }


}
