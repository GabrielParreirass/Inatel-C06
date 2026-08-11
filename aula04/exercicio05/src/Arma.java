public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma(){
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Descricao: " + descricao);
    }

    void usar(){
        resistencia = resistencia - 2;
        System.out.println("Arma utilizada, resistencia atual: " + resistencia);
    }
}
