public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    double imc() {
        return peso / (altura * altura);
    }
    // < 18,5 Abaixo do peso
    // >=18,5 e < 25 Peso normal
    // >=25 e <30 Sobrepeso
    // >=30 e <35 Obesidade grau I
    // >=35 e <40 Obesidade grau II
    // >= 40 Obesidade grau III

    String classificar() {
        double i = this.imc();
        if (i < 18.5) {
            return "Abaixo do peso";
        } else if (i < 25) {
            return "Peso normal";
        } else if (i < 30) {
            return "Sobrepeso";
        } else if (i < 35) {
            return "Obesidade grau I";
        } else if (i < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
