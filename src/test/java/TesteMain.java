package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class TesteMain {
    static void main(String[] args) {
        Cliente cliente = new Cliente(1, "José", "12345678901");
        Conta conta = new Conta("0001", cliente);
        System.out.println(conta.getSaldo());   // esperado: 0

        try {
            new Transacao(TipoTransacao.DEPOSITO, new BigDecimal("-5"), LocalDateTime.now());
        } catch (IllegalArgumentException e) {
            System.out.println("Rejeitou: " + e.getMessage());
        }
    }
}
