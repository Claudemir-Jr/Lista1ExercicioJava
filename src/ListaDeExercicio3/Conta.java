package ListaDeExercicio3;

public class Conta {
	
	String numero;
	double saldo;
	
	void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	void debitar (double valor) {
		saldo = saldo - valor;
	}
	
	String getNumero(){
		return numero;
	}
	
	double getSaldo() {
		return saldo;
	}
}


//TREINAMENTO DE METODOS.