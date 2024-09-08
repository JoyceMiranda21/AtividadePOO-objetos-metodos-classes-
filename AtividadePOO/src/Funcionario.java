
public class Funcionario {
	String nome;
	float salario;
	
	public void aumento() {
		if (salario >= 1 && salario <= 1000) {
			salario += salario * 0.15;
		} else if (salario >= 1001 && salario <= 1500) {
			salario += salario * 0.10;
		}else if(salario >= 1501 && salario <= 2000) {
			salario += salario * 0.05;
		}
	}
	
	public void mostrarSalarios(float salarioAntigo) {
		System.out.println("Salario antigo: " + salarioAntigo);
		System.out.println("Salario atual: " + salario);
	}
}
