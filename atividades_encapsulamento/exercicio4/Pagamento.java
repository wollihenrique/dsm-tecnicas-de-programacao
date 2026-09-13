public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. O valor deve ser maior que zero.");
        } else {
            this.valor = valor;
        }
    }

    public double getValor() {
        return valor;
    }

    public double calcularTaxa() {
        return 0;
    }

    public double calcularTotal() {
        return valor + calcularTaxa();
    }

    public void processar() {
        System.out.println("Total: R$" + calcularTotal());
    }
}

