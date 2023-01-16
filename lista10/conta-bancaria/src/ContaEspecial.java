public class ContaEspecial extends ContaBancaria {
    private double limite;

    @Override
    public boolean sacar(double valor) {
        if (valor < 0) {
            throw new ContaException("Erro valor do saque nao pode ser negativo");
        }
        double saldo = super.consultarSaldo();
        if (valor <= saldo + this.limite) {
            saldo -= valor;
            if (saldo < 0) {
                this.limite += saldo;
                super.sacar(super.consultarSaldo());
            } else {
                super.sacar(valor);
            }
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
        double saldo = super.consultarSaldo();
        double valorTaxa = valor * taxa / 100;
        valor += valorTaxa;
        if (valor <= (saldo + this.limite)) {
            saldo -= valor;
            if (saldo < 0) {
                this.limite += saldo;
                super.sacar(super.consultarSaldo());
            } else {
                super.sacar(valor);
            }
            return true;
        }
        return false;

    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo() + this.limite;
    }

    public void setLimite(double limite) {
        if (limite < 0) {
            throw new ContaException("Erro o limite nao pode ser negativo");
        }
        this.limite = limite;
    }

}