package br.com.projeto_banco;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario jessica = new Funcionario();
		
		jessica.setNome("Jessica pinheiro");
		jessica.setCpf("07123073541");
		jessica.setSalario(5665.00);
		jessica.setTipo(2);
		
		System.out.println(jessica.getNome());
		System.out.println(jessica.getTipo());
		System.out.println(jessica.getBonicacao());
		
		FuncionarioTeste joana = new FuncionarioTeste();
		
		joana.setNome("Jessica pinheiro");
		joana.setCpf("07123073541");
		joana.setSalario(5665.00);
		
		
		//System.out.println(joana.getNome());
		//System.out.println(joana.getBonicacao());
	}

}
