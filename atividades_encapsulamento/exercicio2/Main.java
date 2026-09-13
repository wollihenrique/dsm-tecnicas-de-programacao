public class Main {
    public static void main(String[] args) {
        Podcast meuPodcast = new Podcast("O diabo de cada dia",  126.38, "Léo e Miguel"); 
        VideoAula minhaVideoAula = new VideoAula("Java POO",  60.00, "Alura Cursos");

        System.out.println(minhaVideoAula.exibirResumo());
        System.out.println(meuPodcast.exibirResumo());

        minhaVideoAula.reproduzirVideo();
        meuPodcast.ouvirPodcast();

    }
}
