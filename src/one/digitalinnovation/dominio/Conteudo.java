package one.digitalinnovation.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    protected String titulo;
    protected String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{}";
    }
}
