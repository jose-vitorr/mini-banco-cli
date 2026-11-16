package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;

import static br.com.josevitor.minibanco.modelo.TipoTransacao.DEPOSITO;


public class teste {
    static void main(String[] args) {
        new Conta(null, null);
        new Transacao(DEPOSITO, new BigDecimal("-5"));

    }
}
