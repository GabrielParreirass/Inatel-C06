public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompraBrownie(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Comprando um brownie " + brownie.nome);


    }
}
