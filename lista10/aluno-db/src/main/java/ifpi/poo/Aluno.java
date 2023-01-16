package ifpi.poo;

public class Aluno {
    private long id;
    private String nome;
    private String curso;
    private double media;

    public Aluno() {
    }

    public Aluno(String nome, String curso, double media) {
        this.nome = nome;
        this.curso = curso;
        this.media = media;
    }

    public Aluno(long id, String nome, String curso, double media) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.media = media;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", curso=" + curso + ", media=" + media + '}';
    }

}
