package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public record Transacao(TipoTransacao tipo, BigDecimal valor, LocalDateTime dataHora) {
    public Transacao {
        Objects.requireNonNull(valor, "Valor não pode ser nulo");
        Objects.requireNonNull(tipo, "Tipo não pode ser nulo");
        Objects.requireNonNull(dataHora, "Data/hora não pode ser nulo");

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
}

