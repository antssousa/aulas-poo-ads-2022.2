public class ContaBancaria implements Conta {
    private double saldo;

    @Override
    public boolean sacar(double valor) {
        if (valor < 0) {
            throw new ContaException("Erro valor do saque nao pode ser negativo");
        }
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(double valor, double taxa) {
        if (valor < 0) {
            throw new ContaException("Erro valor do saque nao pode ser negativo");
        }
        if (taxa < 0) {
            throw new ContaException("Erro taxa do saque nao pode ser negativa");
        }
        double valorTaxa = valor * taxa / 100;
        if (saldo >= valor + valorTaxa) {
            this.saldo -= (valor + valorTaxa);
            return true;
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor < 0) {
            throw new ContaException("Erro valor do deposito nao pode ser negativo");
        }
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
