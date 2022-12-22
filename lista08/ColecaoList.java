import java.util.ArrayList;

public class ColecaoList implements Colecao {

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoas>();

    @Override
    public boolean inserir(Pessoa p) {
        return pessoas.add(p);
    }

    @Override
    public boolean remover(Pessoa p) {
        return pessoas.remove(p);
    }

    @Override
    public boolean atualizar(Pessoa p) {
        int index = pessoas.indexOf(p);
        if (index >= 0) {
            return pessoas.set(index, p) != null;

        }
        return false;
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        return pessoas.contains(p);
    }

    @Override
    public Pessoa pesquisar(int indice) {
        if (indice >= 0 && indice < pessoas.size()) {
            Pessoa p = pessoas.get(indice);
            return p;

        }
        return null;
    }

}
