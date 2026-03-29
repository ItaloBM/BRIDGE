package sempadrao.bridge;

public class EmissorDeMensalidade {


    public String emitir(String nivel, String metodoPagamento) {
        double valorBase = nivel.equals("Graduacao") ? 1000.0 : 2000.0;

        if (metodoPagamento.equals("Pix")) {
            double valorFinal = valorBase * 0.9;
            return "Mensalidade de " + nivel + " paga via PIX. Valor: R$ " + valorFinal;
        } else if (metodoPagamento.equals("Cartao")) {
            double valorFinal = valorBase * 1.05;
            return "Mensalidade de " + nivel + " paga via Cartão. Valor: R$ " + valorFinal;
        }
        return "Método inválido";
    }
}