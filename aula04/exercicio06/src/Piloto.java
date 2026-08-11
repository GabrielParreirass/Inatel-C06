public class Piloto {

    String nome;
    boolean vilao;

    public Piloto(String nome, boolean vilao){
        this.nome = nome;
        this.vilao = vilao;
    }

    void soltaSuperPoder(){
        System.out.println("Soltando super poder");
    }

    void infoPiloto(){
        System.out.println("Nome: " + nome);
        System.out.println("É vilao: "+ vilao);
    }
}
