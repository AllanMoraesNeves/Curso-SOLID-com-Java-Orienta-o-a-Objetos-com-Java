package capitulo1;

public class testaCalculo {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setCargo(Cargo.DESENVOLVEDOR);
		f.setSalarioBase(2500);
		CalculadoraDeSalario c = new CalculadoraDeSalario();
		System.out.println(c.calcula(f));
	}

}
