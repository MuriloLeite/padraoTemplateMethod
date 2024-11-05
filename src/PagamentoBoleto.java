public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String processarPagamento() {
        return "Pagamento de R$" + valor + " realizado com sucesso pelo boleto.";
    }

    @Override
    public String getMetodoPagamento() {
        return "Boleto";
    }
}
