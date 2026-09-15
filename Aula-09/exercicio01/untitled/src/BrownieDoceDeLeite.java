public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando doce de leite...");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Carrinho de compras - Brownie Doce de Leite");
    }
}
