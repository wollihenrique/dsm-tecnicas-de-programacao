public class PagamentoPix extends Pagamento {
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }
    
    @Override 
    public void processar() {
        System.out.println("Forma de pagamento: Pix");
        System.out.println("Taxa: " + calcularTaxa());
        System.out.println("Total: " + calcularTotal());
    }

}
