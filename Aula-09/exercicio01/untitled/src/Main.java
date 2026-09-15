public class Main {

    BrownieCafe bwCafe = new BrownieCafe("Brownie Cafe", 50, "Cafe");
    BrownieNutella bwNutella = new BrownieNutella("Brownie Nutella", 60, "Nutella");
    BrownieDoceDeLeite bwDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 70, "Doce de leite");

    Comprador comprador = new Comprador("Gabirel", 100);

    public void main(){

        bwCafe.mostraInfo();
        bwNutella.mostraInfo();
        bwDoceDeLeite.mostraInfo();
        System.out.println(" --- ");
        bwCafe.calculaValorTotalCompra();
        bwNutella.calculaValorTotalCompra();
        bwDoceDeLeite.calculaValorTotalCompra();
        System.out.println(" --- ");
        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();
        comprador.efetuarCompraBrownie(bwNutella);
    }
}
