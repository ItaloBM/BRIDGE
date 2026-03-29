package padroesestruturais.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MensalidadeTest {

    @BeforeEach
    void setUp() {
        // Zera o Singleton antes de cada teste para os valores não se somarem infinitamente
        SistemaContabil.getInstancia().zerarCaixa();
    }

    @Test
    void devePagarGraduacaoNoPixERegistrarNoContabil() {
        FormaPagamento pix = new PagamentoPix();
        Mensalidade mensalidade = new MensalidadeGraduacao(pix);

        assertEquals("Mensalidade de Graduação paga via PIX. Valor: R$ 900.0", mensalidade.emitir());
        assertEquals(900.0, SistemaContabil.getInstancia().getTotalArrecadado());
    }

    @Test
    void devePagarPosGraduacaoNoCartaoERegistrarNoContabil() {
        FormaPagamento cartao = new PagamentoCartao();
        Mensalidade mensalidade = new MensalidadePosGraduacao(cartao);

        // 2000 + 5% de taxa = 2100
        assertEquals("Mensalidade de Pós-Graduação paga via Cartão. Valor: R$ 2100.0", mensalidade.emitir());
        assertEquals(2100.0, SistemaContabil.getInstancia().getTotalArrecadado());
    }
}