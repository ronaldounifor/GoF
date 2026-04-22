public class BlackFriday implements DescontoStrategy {

    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal*0.6;
    }
    
}
