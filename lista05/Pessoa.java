/**
 * Pessoa
 */
public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String toString() {
        return nome + " " + sobrenome;
    }
}