public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando nutella...");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Carrinho de compras - Brownie Nutella");

    }
}
