public class DescontoPlatina implements DescontoStrategy {

    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal*0.9;
    }
    
}
