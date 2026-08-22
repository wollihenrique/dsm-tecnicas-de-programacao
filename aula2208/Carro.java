public class Carro {
    String marca;
    String cor;
    String modelo;
    Boolean ligado;
    String combustivel;
    int ano;
    int velocidade;

    void ligar(){
        if(ligado == true){
            System.out.println("O carro já está ligado!");
            System.out.println();
        } else{
            System.out.println("Ligando o carro...");
            System.out.println("Carro ligado.");
            System.out.println();
        }
    }

    void desligar(){
        if(ligado == true){
            System.out.println("Desligando o carro...");
            System.out.println("Carro desligado.");
            System.out.println();
        } else {
            System.out.println("O carro já está desligado");
            System.out.println();
        }
    }

    void acelerar(){
        if(ligado == false){
            System.out.println("Ligue o carro primeiro!");
            System.out.println();
        } else {
            velocidade = velocidade + 10;
        }
    }

    void frear(){
        velocidade = velocidade - 10;
    }

    void buzinar(){
        System.out.println("Biiiiiiip!");
        System.out.println();
    }
    
    void MostrarDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Ligado: " + ligado);
        System.out.println();
    }
}
