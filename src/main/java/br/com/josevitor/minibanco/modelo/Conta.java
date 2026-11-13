package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;

public class Conta {
    private int numero;
    Cliente titular;
    private BigDecimal saldo;



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
