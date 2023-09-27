package ListaDeExercicio3;

public class Produto {
	
	String nome;
	int quantidade;
	double valor;
	
	void nomeProdutos(String nomeProd) {
		nome = nomeProd;
	}
	
	void quantidadeProdutos(int qtdProd) {
		quantidade = qtdProd;
	}
	
	void valorProduto(double valorProd) {
		valor = valorProd;
	}
	
	String getNome() {
		return nome;
	}
	
	int getQuantidadeProdutos() {
		return quantidade;
	}
	
	double getValorProduto() {
		return valor;
	}
	
	String setNome() {
		return nome;
	}
	
	int setQuantidadeProdutos() {
		return quantidade;
	}
	
	double setValorProduto() {
		return valor;
	}
}
