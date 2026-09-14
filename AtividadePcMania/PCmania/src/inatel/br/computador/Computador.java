package inatel.br.computador;

public class Computador {
    private String marca;
    private float preco;

    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwareBasicos;

    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, String nomeSO, int tipoSO, String h1Nome, float h1Cap, String h2Nome, float h2Cap,  String h3Nome, float h3Cap){
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSO, tipoSO);
        this.hardwareBasicos = new HardwareBasico[3];
        this.hardwareBasicos[0] = new HardwareBasico(h1Nome, h1Cap);
        this.hardwareBasicos[1] = new HardwareBasico(h2Nome, h2Cap);
        this.hardwareBasicos[2] = new HardwareBasico(h3Nome, h3Cap);
    }

    public float getPreco(){
         return preco;
    }

    public void mostraPCConfigs(){
        System.out.println("--- Configurações do Computador ---");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Sistema: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        System.out.println("Hardwares:");

        for (int i = 0; i < hardwareBasicos.length; i++) {
            if (hardwareBasicos[i] != null) {
                System.out.println(" - " + hardwareBasicos[i].getNome() + " de capacidade " + hardwareBasicos[i].getCapacidade());
            }
        }
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + (memoriaUSB.getNome().equals("HD Externo") ? " Tb" : " Gb"));
        }
        System.out.println("-----------------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }


}
