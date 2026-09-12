

public class Main {
    public static void main(String[] args) {
        Cofrinho meuCofre = new Cofrinho("Viagem de férias");
        System.out.println("Objetivo: " + meuCofre.getObjetivo());
        System.out.println("Saldo Inicial: R$ " + meuCofre.getSaldo());

        meuCofre.depositar(500.00);
        meuCofre.depositar(200.00);
        meuCofre.retirar(150.00);
        meuCofre.retirar(1000.00);
        meuCofre.depositar(-200.00);
        meuCofre.mostrarResumo();
    }
    
}
