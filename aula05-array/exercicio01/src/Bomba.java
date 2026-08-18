public class Bomba {
    boolean temBomba;

    void explodir(){
        if(temBomba){
            System.out.println("Bomba explodiu");
        }else{
            System.out.println("Caminho livre");
        }
    }
}
