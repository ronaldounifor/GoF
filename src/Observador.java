public class Observador {
    public void avisoOrca(float lati, float longi, String tempo){
        System.out.println("ORCA!");
        System.out.println("Latitude: "+lati);
        System.out.println("Longitude: "+longi);
        System.out.println("Tempo: "+tempo);
    }
    
    public void temperaturaMudou() {}
}
