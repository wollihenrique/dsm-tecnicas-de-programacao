public class VideoAula extends Conteudo {
    public String plataforma;

    public VideoAula(String titulo, double duracao, String plataforma) {
        super(titulo, duracao);
        this.plataforma = plataforma;
    }

    public void reproduzirVideo() {
        System.out.println("Reproduzindo VideoAula...");
    }
}