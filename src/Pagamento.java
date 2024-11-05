public abstract class Pagamento {
    protected float valor;

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract String processarPagamento();

    public abstract String getMetodoPagamento();
}
