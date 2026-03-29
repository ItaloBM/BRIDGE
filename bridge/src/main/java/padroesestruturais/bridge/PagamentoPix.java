package padroesestruturais.bridge;

public class PagamentoPix implements FormaPagamento {
    public String processar(double valor) {
        double valorComDesconto = valor * 0.9;
        // O Bridge chamando o Singleton!
        SistemaContabil.getInstancia().registrarRecebimento(valorComDesconto);
        return "paga via PIX. Valor: R$ " + valorComDesconto;
    }
}