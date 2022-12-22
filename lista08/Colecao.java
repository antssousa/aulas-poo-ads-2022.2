public interface Colecao {
    public boolean inserir(Pessoa p);

    public boolean remover(Pessoa p);

    public boolean atualizar(Pessoa p);

    public boolean pesquisar(Pessoa p);

    public Pessoa pesquisar(int indice);
}
