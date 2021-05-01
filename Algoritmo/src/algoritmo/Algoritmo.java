package algoritmo;

public class Algoritmo {//nome da classe - Objeto
	//atributos do sistema - entrada
	private double valor1;
	private double valor2;
	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	//m�todos de c�lculo - processamento
	public double calcularRaizQuadrada() {
		return Math.sqrt(valor1);
	}
	public double calcularRaizCubica() {
		return Math.cbrt(valor2);
	}
	public double calcularPotencia() {
		return Math.pow(valor1, 3);
	}
	public double calcularValorMaximo() {
		return Math.max(valor1, valor2);
	}
	public double calcularValorMinimo() {
		return Math.min(valor1, valor2);
	}
	//visualiza��o - sa�da
	public String toString() {
		return "Valor 1: " +valor1+
			   "Valor 2: " +valor2+
			   "\nRaiz quadrada do valor 1: " +calcularRaizQuadrada()+
			   "\nRaiz c�bica do valor 2: " +calcularRaizCubica()+
			   "\nValor 1 elevado ao cubo: " +calcularPotencia()+
			   "\nValor m�ximo: " +calcularValorMaximo()+
			   "\nValor m�nimo: " +calcularValorMinimo();
	}}
