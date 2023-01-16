public interface Conta {
    boolean sacar(double valor);

    boolean sacar(double valor, double taxa);

    boolean depositar(double valor);

    double consultarSaldo();
}
