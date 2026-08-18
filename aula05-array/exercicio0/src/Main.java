public class Main {

    Cantina cantina = new Cantina("Cantina do Inatel");
    Salgado salgado1 = new Salgado();
    Salgado salgado2 = new Salgado();
    Salgado salgado3 = new Salgado();


    public void main(){
        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfirra de Carne";
        salgado3.nome = "Enroladinho de Presunto e Queijo";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();

    }
}
