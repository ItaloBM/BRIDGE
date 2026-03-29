package sempadrao.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmissorDeMensalidadeTest {

    @Test
    void deveEmitirMensalidadeGraduacaoPix() {
        EmissorDeMensalidade emissor = new EmissorDeMensalidade();
        assertEquals("Mensalidade de Graduacao paga via PIX. Valor: R$ 900.0", emissor.emitir("Graduacao", "Pix"));
    }
}