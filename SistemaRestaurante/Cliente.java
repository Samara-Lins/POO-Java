package SistemaRestaurante;

import javax.lang.model.type.NullType;

public class Cliente {
    private String nome;
    public long numeroConta;
    private double credito;

    Cliente(String nome, long numero, double credito) {
        this.nome = nome;
        this.numeroConta = numero;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getCredito() {
        return credito;
    }

    public void depositoInicial(double valor) {
        this.credito = valor;
        System.out.println("O valor de R$" + this.credito + " foi depositado na sua conta");
    }

    public void comprar(double valor) {
        if (valor < credito) {
            this.credito = this.credito - valor;
            System.out.println("Transação aprovada");
        } else {
            System.out.println("Crédito insuficiente");
        }
    }

    public void novoDeposito(double valor) {
        if (this.credito < 20) {
            this.credito = this.credito + valor;
            System.out.println("Depósito efetuado!");
        } else {
            System.out.println("Você ainda possui pelo menos R$20,00 de crédito");
        }
    }

    public void encerrarConta() {
        if (this.credito < 20) {
            this.nome = null;
            System.out.println("Conta ENCERRADA");
        } else {
            System.out.println("Você ainda possui pelo menos R$20,00 de crédito");
        }
    }

    public double consulta() {
        System.out.println("Seu cŕedito atual: R$"+this.getCredito());
        return this.getCredito();
    }
}
