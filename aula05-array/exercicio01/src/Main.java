import java.util.Random;
import java.util.Scanner;

public class Main {

    Bomba[][] campoMinado = new Bomba[2][2];

    public void main(){

        Random rand = new Random();
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        boolean tentandoAtravesar = true;

        System.out.println("Coordenada X: " + x + " Coordenada Y: " + y);
        campoMinado[x][y] = new Bomba();
        campoMinado[x][y].temBomba = true;

        for(int i = 0; i < campoMinado.length; i++){
            for (int j = 0; j < campoMinado.length; j++){
                if (campoMinado[i][j] == null){
                    campoMinado[i][j] = new Bomba();
                    campoMinado[i][j].temBomba = false;
                }
            }
        }

        for(int i = 0; i < campoMinado.length; i++){
            for (int j = 0; j < campoMinado.length; j++){
                System.out.println(campoMinado[i][j].temBomba);
            }
        }

        Scanner entrada = new Scanner(System.in);

        int passosCorretos = 0;

        while (tentandoAtravesar){

            while (passosCorretos < 3){
                System.out.println("Digite as coordenadas -> ");
                int digitadoX = entrada.nextInt();
                int digitadoY = entrada.nextInt();

                if (campoMinado[digitadoX][digitadoY].temBomba){
                    System.out.println("Voce perdeu!");
                    campoMinado[digitadoX][digitadoY].explodir();
                    System.out.println("JOGO RECOMEÇANDO!");
                    passosCorretos = 0;
                }else{
                    System.out.println("Caminho limpo.");
                    passosCorretos++;
                }
            }

            System.out.println("Você atravesou!");
            tentandoAtravesar = false;
        }

    }

}
