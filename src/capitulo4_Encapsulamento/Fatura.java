package capitulo4_Encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private boolean pago;
	private int valor;
	private List<Pagamento> pagamentos = new ArrayList<>();

	public List<Pagamento> getPagamentos() {
		return null;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos .add(pagamento);
		if(valorTotalDosPagamentos() > this.valor) {
			this.pago = true;
		}else {
			this.pago = false;
		}
	}

	private double valorTotalDosPagamentos() {

		double total = 0;
		for(Pagamento p : pagamentos) {
			total += p.getValor();
		}
		
		return total;
	}

}
