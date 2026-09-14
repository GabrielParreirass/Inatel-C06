import inatel.br.cliente.Cliente;
import inatel.br.computador.Computador;
import inatel.br.computador.MemoriaUSB;

import java.util.Scanner;

public class Main {

    int matricula = 644;

    Computador pc1 = new Computador("Apple", matricula, "macOS Sequoia", 64, "Pentium Core i5", 2200, "Memória RAM", 8, "HD", 500);
    Computador pc2 = new Computador("Samsung", matricula + 1, "Windows 8", 64, "Pentium Core i7", 3370, "Memória RAM", 16, "HD", 1000);
    Computador pc3 = new Computador("Dell", matricula + 2, "Windows 10", 64, "Pentium Core i7", 4500, "Memória RAM", 32, "HD", 2000);
    Cliente cliente = new Cliente("Gabriel", "1234");

    public void main(){
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0){
            System.out.println("\n===== BEM-VINDO À PC MANIA =====");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha sua opção: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                pc1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));
                cliente.adicionarComputador(pc1);
                System.out.println("PC da Promoção 1 adicionado ao carrinho!");
            } else if (opcao == 2) {
                pc2.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));
                cliente.adicionarComputador(pc2);
                System.out.println("PC da Promoção 2 adicionado ao carrinho!");
            } else if (opcao == 3) {
                pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1));
                cliente.adicionarComputador(pc3);
                System.out.println("PC da Promoção 3 adicionado ao carrinho!");
            } else if (opcao == 0) {
                System.out.println("\nFinalizando compra...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("\n===== RESUMO DO PEDIDO =====");
        cliente.mostraClienteInfos();
        System.out.println("\nLista de PCs adquiridos:");
        Computador[] pcComprados = cliente.getComputadores();
        for (int i = 0; i < pcComprados.length; i++) {
            if (pcComprados[i] != null) {
                pcComprados[i].mostraPCConfigs();
            }
        }
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

        ProcessarPedido.processarPedido(cliente.getComputadores());
    }


}
