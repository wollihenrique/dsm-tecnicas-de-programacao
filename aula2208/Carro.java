package aula2208;

public class Carro {
    String marca;
    String cor;
    String modelo;
    int velocidade;

    void acelerar(){
        velocidade = velocidade + 10;
        System.out.println(velocidade);
    }

    void frear(){
        velocidade = velocidade - 10;
        System.out.println(velocidade);
    }
    
    void MostrarDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);

    }
}
