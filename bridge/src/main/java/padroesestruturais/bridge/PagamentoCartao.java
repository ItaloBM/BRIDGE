package padroesestruturais.bridge;

public class PagamentoCartao implements FormaPagamento {
    public String processar(double valor) {
        double valorComTaxa = valor * 1.05;
        // O Bridge chamando o Singleton!
        SistemaContabil.getInstancia().registrarRecebimento(valorComTaxa);
        return "paga via Cartão. Valor: R$ " + valorComTaxa;
    }
}