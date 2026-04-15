
public class Front {
    public static void main(String[] args) {
        Boia exemploBoia = new Boia();

        Instituto salveMergulhadores = new Instituto();
        Pesquisador christianoRonaldo = new Pesquisador();
        Pesquisador messi = new Pesquisador();
        Dispositivo sensorOndas = new Dispositivo();

        exemploBoia.inscrever(salveMergulhadores);
        exemploBoia.inscrever(christianoRonaldo);
        exemploBoia.inscrever(messi);
        exemploBoia.inscrever(sensorOndas);

        exemploBoia.alertarPresencaOrca();
    }
}