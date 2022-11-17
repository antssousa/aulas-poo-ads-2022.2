import java.util.Random;

public class AlgoritmoGenetico {
    String pai, mae, filho1, filho2;

    public void recombinacao() {
        Random random = new Random();
        int corte = random.nextInt(pai.length() - 1);
        filho1 = pai.substring(0, corte) + mae.substring(corte);
        filho2 = mae.substring(0, corte) + pai.substring(corte);
    }

    public String mutacao(String gene) {
        Random random = new Random();
        String base = "ATGC";
        int troca = random.nextInt(gene.length());
        int baseTroca = random.nextInt(base.length());
        String mut = gene.substring(0, troca) + base.charAt(baseTroca) + gene.substring(troca + 1);
        return mut;
    }

    public static void main(String[] args) {
        AlgoritmoGenetico ag = new AlgoritmoGenetico();
        ag.pai = "ABCDEFGHIJ";
        ag.mae = "1234567890";

        ag.recombinacao();
        System.out.printf("pai = %s, mae = %s, filho1 = %s e filho2 =%s\n", ag.pai, ag.mae, ag.filho1, ag.filho2);

        String gene = "1234567890";
        System.out.printf("Mutacao = %s\n", ag.mutacao(gene));

    }
}
