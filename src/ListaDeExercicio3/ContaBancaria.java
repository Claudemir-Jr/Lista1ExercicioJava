package ListaDeExercicio3;

public class ContaBancaria {
	
		String numero;
		double saldo;
		
		String getNumero() {
			return numero;
		}
		void creditar(double valor) {
			saldo = saldo + valor;
		}
		
		void debitar(double valor) {
			saldo = saldo - valor;
		}

}


// EXEMPLOS SLIDE.