public class Cofrinho {
    private String objetivo;
    private double saldo;

    public Cofrinho(String objetivo) {
        this.objetivo = objetivo;
        this.saldo = 0;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setObjetivo (String novoObjetivo) {
        this.objetivo = novoObjetivo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public void mostrarResumo(){
        System.out.println("Objetivo: " + objetivo + "\nSaldo: R$ " + saldo);
    }
}