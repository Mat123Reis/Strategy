package aplicativo;

import frete.Frete;
import frete.TpFrete;

public class Main {

	public static void main(String[] args) {

		int dist = 120;
		int opcFrete = 2;
		TpFrete tipoFrete = TpFrete.values()[opcFrete - 1];

		Frete frete = tipoFrete.obterFrete();
		double preco = frete.calcularPreco(dist);

		System.out.printf("Valor total: R$%.2f", preco);

	}
}
