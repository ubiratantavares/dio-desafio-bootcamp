package one.digitalinnovation.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    private Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void adicionarConteudosInscritos(Conteudo conteudo) {
        this.conteudosInscritos.add(conteudo);
    }

    public void adicionarConteudosConcluidos(Conteudo conteudo) {
        this.conteudosConcluidos.add(conteudo);
    }

    public void exibirConteudosInscritos() {
        for (Conteudo conteudo: this.getConteudosInscritos()) {
            System.out.println(conteudo);
        }
    }

    public void exibirConteudosConcluidos() {
        for (Conteudo conteudo: this.getConteudosConcluidos()) {
            System.out.println(conteudo);
        }
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
