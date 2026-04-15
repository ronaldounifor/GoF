import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Boia {
    private int id;
    private float lati;
    private float longi;
    private float temperatura;
    private List<Observador> inscritos;

    public Boia() {
        lati = 36.34f;
        longi = 5.15f;
        temperatura = 20;
        inscritos = new ArrayList<>();
    }

    public void inscrever(Observador observador) {
        inscritos.add(observador);
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void alertarPresencaOrca() {
        for (Observador observador : inscritos)
            observador.avisoOrca(lati, longi, getTempo());
    }

    private String getTempo() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        return agora.format(formato);
    }
}
