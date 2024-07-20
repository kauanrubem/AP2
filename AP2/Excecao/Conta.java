package Pratica04.Excecao;

import Pratica03.Cliente.Cliente;

public class Conta {
    private Cliente cliente;
    private String numero;
    private double saldo;

    public Conta(Cliente cliente, String numero, double saldoInicial) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new SaldoInsuficienteException(saldo, numero);
        }
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}

