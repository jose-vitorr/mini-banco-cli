package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public record Transacao(TipoTransacao tipo, BigDecimal valor, LocalDateTime dataHora) {
    public Transacao {
        Objects.requireNonNull(valor.compareTo(BigDecimal.ZERO), "Valor não pode ser nulo");
        Objects.requireNonNull(tipo, "Tipo não pode ser nulo");
        Objects.requireNonNull(dataHora, "Data/hora pode ser nulo");
    }
}

