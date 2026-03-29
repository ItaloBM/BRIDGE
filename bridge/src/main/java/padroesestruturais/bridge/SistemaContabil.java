package padroesestruturais.bridge;

public class SistemaContabil {
    // Aplicação do Singleton: Instância única
    private static SistemaContabil instancia = new SistemaContabil();
    private double totalArrecadado = 0;

    private SistemaContabil() {}

    public static SistemaContabil getInstancia() {
        return instancia;
    }

    public void registrarRecebimento(double valor) {
        this.totalArrecadado += valor;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void zerarCaixa() { // Útil para os testes
        this.totalArrecadado = 0;
    }
}