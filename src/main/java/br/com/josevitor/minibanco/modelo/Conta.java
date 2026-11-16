package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private final String numero;
    private final Cliente titular;
    private BigDecimal saldo;

    public Conta(String numero, Cliente titular) {
        this.numero = Objects.requireNonNull(numero, "Número da conta não pode ser nulo");
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Número da conta não pode ser vazio");
        }
        this.titular = Objects.requireNonNull(titular, "Titular não pode ser nulo");
        this.saldo = BigDecimal.ZERO;
    }

    public String getNumero() { return numero; }
    public Cliente getTitular() { return titular; }
    public BigDecimal getSaldo() { return saldo; }
}
