package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;

public class Conta {
    private final String numero;
    Cliente titular;
    private BigDecimal saldo;

    //Construtor
    public Conta(String numero, Cliente titular, BigDecimal saldo) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
