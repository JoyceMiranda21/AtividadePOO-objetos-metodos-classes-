import java.util.Scanner;

public class ProdutoPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto pro = new Produto();
		
		System.out.println("Digite o nome do produto: ");
		pro.nome = sc.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		pro.preço = sc.nextFloat();
		
		System.out.println("Digite a quantidade no estoque: ");
		pro.quantidade = sc.nextInt();
		
		pro.mostrarDados();
		
		System.out.println("Digite a quantidade para adicionar: ");
		int entrada = sc.nextInt();
		pro.adicionarEstoque(entrada);
		pro.mostrarDados();
		
		System.out.println("Digite a quantidade para remover: ");
		int saida = sc.nextInt();
		pro.removerEstoque(saida);
		pro.mostrarDados();
		
		sc.close();
	}

}
