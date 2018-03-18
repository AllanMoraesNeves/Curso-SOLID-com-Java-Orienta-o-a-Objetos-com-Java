package capitulo2;

import java.util.ArrayList;
import java.util.List;

public class Testa {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> lista = new ArrayList<>();
		lista.add(new EnviadorDeEmail());
		lista.add(new NotaFiscalDao());
		GeradorDeNotaFiscal g = new GeradorDeNotaFiscal(lista);
		g.gera(new Fatura());
	}

}
