import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    TipoTransacao tipo;
    private BigDecimal valor;
    LocalDateTime DataHora =  LocalDateTime.now();

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
