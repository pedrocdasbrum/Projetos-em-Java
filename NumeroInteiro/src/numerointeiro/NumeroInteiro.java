package numerointeiro;

public class NumeroInteiro {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double calcularAoQuadrado() {
		return Math.pow(numero, 2);
	}
	public String toString() {
		return "Número inteiro: " +numero+
				"\nElevado ao quadrado: " +calcularAoQuadrado();
	}}
