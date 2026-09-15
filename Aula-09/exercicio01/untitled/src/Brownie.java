public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Teste");

    }

    public void calculaValorTotalCompra(){
        System.out.println("Preço do brownie de " + this.sabor + ": " + this.preco);
    }

    void mostraInfo(){
        System.out.println(this.nome);
    }


}
