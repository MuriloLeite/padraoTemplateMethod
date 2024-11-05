public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private String nomeTitular;

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String processarPagamento() {
        return "Pagamento de R$" + valor + " realizado com sucesso no cartão.";
    }

    @Override
    public String getMetodoPagamento() {
        return "Cartão";
    }
}
