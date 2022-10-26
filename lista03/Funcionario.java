public class Funcionario {
    String nome;
    int horasTrabalhadas;
    double valorHora;

    // Sobrecarga ou overloading
    Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    Funcionario() {

    }

    double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

}
