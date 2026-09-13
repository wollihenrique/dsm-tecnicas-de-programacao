public class PagamentoCartao extends Pagamento {
    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }
    
    @Override 
    public double calcularTaxa() {
        return getValor() * 0.03;
    }
    
    @Override 
    public void processar() {
        System.out.println("Forma de pagamento: Cartão");
        System.out.println("Taxa: " + calcularTaxa());
        System.out.println("Parcelas: " + this.parcelas);
        System.out.println("Total: " + calcularTotal());
    }

}