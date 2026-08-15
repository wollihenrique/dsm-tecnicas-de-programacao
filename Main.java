public class Main {
    public static void main(String[] args) {
       float distancia_perc = 79, quantidade_combust = 4.2f, media = distancia_perc / quantidade_combust;

       System.out.println("Distância Percorrida: " + distancia_perc);
       System.out.println("Combustível gasto: " + quantidade_combust);
       System.out.println("O veículo faz aproximadamente " + media + " Km/l");
    }
}