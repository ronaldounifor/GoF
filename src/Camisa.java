public class Camisa {
    private String corPrimaria;
    private String corSecundaria;
    
    public Camisa() {
    }
    public Camisa(String corPrimaria, String corSecundaria) {
        this.corPrimaria = corPrimaria;
        this.corSecundaria = corSecundaria;
    }
    public String getCorPrimaria() {
        return corPrimaria;
    }
    public void setCorPrimaria(String corPrimaria) {
        this.corPrimaria = corPrimaria;
    }
    public String getCorSecundaria() {
        return corSecundaria;
    }
    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }

    public Camisa clone() {
        Camisa novaCamisa = new Camisa();

        novaCamisa.setCorPrimaria(this.getCorPrimaria());
        novaCamisa.setCorSecundaria(this.getCorSecundaria());

        return novaCamisa;
    }
    
    @Override
    public String toString() {
        return "Camisa [Cor Primária: " + corPrimaria + ", Secundária: " + corSecundaria + "]";
    }
}
