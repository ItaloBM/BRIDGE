package padroesestruturais.bridge;

public class MensalidadeGraduacao extends Mensalidade {
    public MensalidadeGraduacao(FormaPagamento formaPagamento) {
        super(formaPagamento);
        this.valorBase = 1000.0;
    }

    public String emitir() {
        return "Mensalidade de Graduação " + this.formaPagamento.processar(this.valorBase);
    }
}