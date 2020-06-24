package entrega;

import entrega.frete.Frete;

public class Normal implements Frete{

	public double calcularPreco(int distancia) {
		return distancia * 0.5 + 5;
	}

}
