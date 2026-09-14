package inatel.br.cliente;

import inatel.br.computador.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] listaComputadores;

    public Cliente(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;

        this.listaComputadores = new Computador[50];
    }

    public float calculaTotalCompra() {
        float total = 0;

        for(int i = 0; i < listaComputadores.length; i++){
            if (listaComputadores[i] != null){
                total += listaComputadores[i].getPreco();
            }
        }

        return total;
    }

    public void adicionarComputador(Computador pc) {
        for (int i = 0; i < listaComputadores.length; i++) {
            if (listaComputadores[i] == null) {
                listaComputadores[i] = pc;
                break;
            }

        }
        System.out.println("PC adicionado! " + pc.getPreco());
    }

    public void mostraClienteInfos() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    }

    public Computador[] getComputadores() {
        return listaComputadores;
    }


}
