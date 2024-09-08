import java.util.Scanner;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Digite o nome do funcionario:");
		func.nome = sc.nextLine();
		
		System.out.println("Digite o salario do funcionario: ");
		func.salario = sc.nextFloat();
		
		float salarioAntigo = func.salario;
		
		func.aumento();
		
		func.mostrarSalarios(salarioAntigo);
		
		sc.close();
	}
}
