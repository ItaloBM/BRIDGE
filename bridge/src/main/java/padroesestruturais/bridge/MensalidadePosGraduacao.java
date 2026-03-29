package padroesestruturais.bridge;

public class MensalidadePosGraduacao extends Mensalidade {
    public MensalidadePosGraduacao(FormaPagamento formaPagamento) {
        super(formaPagamento);
        this.valorBase = 2000.0;
    }

    public String emitir() {
        return "Mensalidade de Pós-Graduação " + this.formaPagamento.processar(this.valorBase);
    }
}