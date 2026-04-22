public class DescontoOuro implements DescontoStrategy {

    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal*0.95;
    }
    
}
