public class Main {

    Conta conta = new Conta();

    public void main(){
        conta.deposita(100);
        conta.verSaldo();
        conta.sacar(90);
        conta.verSaldo();
        conta.sacar(20);
        conta.verSaldo();
    }
}
