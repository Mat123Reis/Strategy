package entrega;

public class Rapida implements Frete{

	public double calcularPreco(int dist) {
		return dist * 1 + 10;
	}

}
