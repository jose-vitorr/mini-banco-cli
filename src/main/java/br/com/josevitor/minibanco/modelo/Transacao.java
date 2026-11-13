package br.com.josevitor.minibanco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transacao(TipoTransacao tipo, BigDecimal valor, LocalDateTime dataHora) {}

