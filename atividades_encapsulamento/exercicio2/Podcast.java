public class Podcast extends Conteudo{
    public String apresentador;

    public Podcast(String titulo, double duracao, String apresentador) {
        super(titulo, duracao);
        this.apresentador = apresentador;
    }

    public void ouvirPodcast() {
        System.out.println("Reproduzindo Podcast...");
    }
}
