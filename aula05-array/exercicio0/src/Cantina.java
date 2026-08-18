public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[3];

    public Cantina(String nome){
        this.nome = nome;
    }

    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Cantina: " + this.nome);
        System.out.println("Salgados:");
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] != null) {
                System.out.println("- " + salgados[i].nome);
            }
        }
    }


}
