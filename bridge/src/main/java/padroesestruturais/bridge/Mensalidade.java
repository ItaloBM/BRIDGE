package padroesestruturais.bridge;

public abstract class Mensalidade {
    // A "Ponte" (Bridge) que liga a Mensalidade à Forma de Pagamento
    protected FormaPagamento formaPagamento;
    protected double valorBase;

    public Mensalidade(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public abstract String emitir();
}