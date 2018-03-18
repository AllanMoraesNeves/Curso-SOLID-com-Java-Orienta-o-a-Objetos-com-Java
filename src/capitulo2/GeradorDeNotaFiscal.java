package capitulo2;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNota> acoes = new ArrayList<>();

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();
		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}
		return nf;
	}

	public double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}