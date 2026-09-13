public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao(100.0, 3);
        pagamentoCartao.processar();

        Pagamento pagamentoPix = new PagamentoPix(100.0);
        pagamentoPix.processar();
    }
}