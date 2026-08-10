import java.util.Scanner;

public class Lanche {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int lanche1 = entrada.nextInt();
        int lanche2 = entrada.nextInt();
        int lanche3 = entrada.nextInt();

        int soma = lanche1 + lanche2 + lanche3;

        if (soma > 10){
            System.out.printf("O número de lanches foi maior que 10!");
        }else{
            System.out.printf("O número de lanches foi menor ou igual a 10!");
        }


    }

}
