public class Main {
    Piloto piloto = new Piloto("Gabriel", false);
    Kart kart = new Kart("kart01");


    public void main(){

        kart.piloto = piloto;

        kart.piloto.soltaSuperPoder();

        kart.fazerDrift();
        kart.pular();
        kart.soltarTurbo();

        kart.motor.mostraInfo();

        kart.piloto.infoPiloto();

    }
}
