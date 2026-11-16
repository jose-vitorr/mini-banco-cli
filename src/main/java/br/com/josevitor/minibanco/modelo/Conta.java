package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private final String numero;
    Cliente titular;
    private BigDecimal saldo;

    public Conta(String numero, Cliente titular) {
        this.numero = Objects.requireNonNull(numero, "Número da Conta não pode ser nulo");
        this.titular = Objects.requireNonNull(titular, "Dados do titular não podem ser nulos");
//        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
