public class Aluno {
    String nome;
    String matricula;
    double prova1;
    double prova2;
    double trabalho;

    double media() {
        return (prova1 * 2.5 + prova2 * 2.5 + trabalho * 2) / 7;
    }

    double exameFinal() {
        double m = this.media();
        if (m >= 7) {
            return 0;
        } else {
            return 12 - m;
        }
    }

}
