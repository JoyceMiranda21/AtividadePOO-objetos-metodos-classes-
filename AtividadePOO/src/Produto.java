public class Produto {
	String nome;
	float preço;
	int quantidade;
	
	public float valorTotalEstoque(){
		return preço * quantidade;
	}
	
	public void adicionarEstoque(int AdicionarQuantidade) {
		quantidade += AdicionarQuantidade;
	}
	
	public void removerEstoque(int RemoverQuantidade) {
		if (RemoverQuantidade <= quantidade) {
			quantidade -= RemoverQuantidade;
		} else {
			System.out.println("Quantidade informada excede o estoque disponível.");
		}
	} 
	
	public void mostrarDados() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço do produto: " + preço);
		System.out.println("Quantidade Estoque: " + quantidade);
		System.out.println("Valor total Estoque: " + valorTotalEstoque());
	}
}
