public class Conta {

    private float saldo = 0;
    private int numero;
    private float limite;

    Cliente cliente = new Cliente("Gabriel", 123456789);

    public void sacar(float quantia){
        if(saldo >= quantia){
            setSaldo(-1 * quantia);
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    private void setSaldo(float quantia){
        this.saldo = saldo + quantia;
    }

    private float getSaldo(){
        return this.saldo;
    }

    public void verSaldo(){
        System.out.println(getSaldo());
    }


    public void deposita(float quantia){
        setSaldo(quantia);
        System.out.println("Deposito feito com sucesso");
    }


}
