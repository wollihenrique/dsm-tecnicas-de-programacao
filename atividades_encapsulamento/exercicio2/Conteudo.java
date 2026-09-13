public class Conteudo {
    private String titulo;
    private double duracao;

    public Conteudo(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String exibirResumo() {
        return "Título: " + titulo + "\nDuração: " + duracao;
    }
}
