package capitulo2;

public class NotaFiscalDao implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("salvou no banco");
	}

}
