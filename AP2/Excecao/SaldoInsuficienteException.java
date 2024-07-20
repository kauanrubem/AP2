package Pratica04.Excecao;

public class SaldoInsuficienteException extends Exception {
    private double saldo;
    private String numero;

    public SaldoInsuficienteException(double saldo, String numero) {
        super("Saldo Insuficiente");
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}

