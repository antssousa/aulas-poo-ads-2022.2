public class ColecaoVetor implements Colecao {

    private Pessoa[] pessoas;
    private int totalDePessoas;

    public ColecaoVetor() {
        pessoas = new Pessoa[10];
    }

    public ColecaoVetor(int quantidade) {
        pessoas = new Pessoa[quantidade];
    }

    @Override
    public boolean inserir(Pessoa p) {
        if (totalDePessoas < pessoas.length) {
            pessoas[totalDePessoas] = p;
            totalDePessoas++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remover(Pessoa p) {
        int indice = pesquisarIndice(p);
        if (indice >= 0) {
            for (int i = indice; i < totalDePessoas - 1; i++) {
                pessoas[i] = pessoas[i + 1];
            }
            totalDePessoas--;
            return true;
        }
        return false;
    }

    @Override
    public boolean atualizar(Pessoa p) {
        int indice = pesquisarIndice(p);
        if (indice >= 0) {
            pessoas[indice] = p;
            return true;
        }
        return false;
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        return pesquisarIndice(p) != -1;
    }

    public int pesquisarIndice(Pessoa p) {
        for (int i = 0; i < totalDePessoas; i++) {
            if (p.equals(pessoas[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Pessoa pesquisar(int indice) {
        if (indice >= 0 && indice < totalDePessoas) {
            return pessoas[indice];
        }
        return null;
    }

}
