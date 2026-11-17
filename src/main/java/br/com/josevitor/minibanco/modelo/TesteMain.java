package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TesteMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "José", "12345678901");

        // 1. Conta nasce com saldo zero
        Conta conta = new Conta("0001", cliente);
        System.out.println("Saldo inicial: " + conta.getSaldo());   // esperado: 0

        // 2. Transação com valor negativo deve ser rejeitada
        testar("valor negativo", () ->
                new Transacao(TipoTransacao.DEPOSITO, new BigDecimal("-5"), LocalDateTime.now()));

        // 3. Transação com valor zero deve ser rejeitada
        testar("valor zero", () ->
                new Transacao(TipoTransacao.DEPOSITO, BigDecimal.ZERO, LocalDateTime.now()));

        // 4. Transação com valor nulo deve ser rejeitada
        testar("valor nulo", () ->
                new Transacao(TipoTransacao.DEPOSITO, null, LocalDateTime.now()));

        // 5. Conta sem titular deve ser rejeitada
        testar("titular nulo", () -> new Conta("0002", null));

        // 6. Conta com número em branco deve ser rejeitada
        testar("número em branco", () -> new Conta("   ", cliente));
    }

    // Executa o código e mostra qual exceção saiu (ou avisa se nada foi lançado)
    private static void testar(String cenario, Runnable acao) {
        try {
            acao.run();
            System.out.println("[FALHA] " + cenario + ": nada foi rejeitado");
        } catch (RuntimeException e) {
            System.out.println("[OK] " + cenario + " -> "
                    + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}