import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void deveConfirmarPagamentoBoleto() {
        PagamentoBoleto pagamento = new PagamentoBoleto();
        pagamento.setValor(200.0f);
        pagamento.setCodigoBarras("001234567890");
        assertEquals("Pagamento de R$200.0 realizado com sucesso pelo boleto.", pagamento.processarPagamento());
    }

    @Test
    void deveRetornarMetodoPagamentoBoleto() {
        PagamentoBoleto pagamento = new PagamentoBoleto();
        assertEquals("Boleto", pagamento.getMetodoPagamento());
    }

    @Test
    void deveConfirmarPagamentoCartao() {
        PagamentoCartao pagamento = new PagamentoCartao();
        pagamento.setValor(100.0f);
        pagamento.setNumeroCartao("1234-5678-9012-3456");
        pagamento.setNomeTitular("João Silva");
        assertEquals("Pagamento de R$100.0 realizado com sucesso no cartão.", pagamento.processarPagamento());
    }

    @Test
    void deveRetornarMetodoPagamentoCartao() {
        PagamentoCartao pagamento = new PagamentoCartao();
        assertEquals("Cartão", pagamento.getMetodoPagamento());
    }
}
