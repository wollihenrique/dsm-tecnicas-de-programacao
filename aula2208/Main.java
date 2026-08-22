public class Main {
    public static void main(String[] args)
    {
        Carro carro1 = new Carro();
        carro1.marca = "Chevrolet";
        carro1.modelo = "S10";
        carro1.cor = "Branca";
        carro1.combustivel = "etanol";
        carro1.ano = 2010;
        carro1.velocidade = 0;
        carro1.ligado = false;

        System.out.println("Estado incial: ");
        carro1.MostrarDados();

        carro1.ligar();
        carro1.buzinar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.desligar();
    }

}
