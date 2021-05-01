package abc;

public class ABC { 
	private double A;
	private double B;
	private double C;
	public double getA() {
		return A;
	}
	public void setA(double a) {
		A = a;
	}
	public double getB() {
		return B;
	}
	public void setB(double b) {
		B = b;
	}
	public double getC() {
		return C;
	}
	public void setC(double c) {
		C = c;
	}
	public double calcularProduto() {
		return A * B;
	}
	public double calcularResultado() {
		return (A*B)*C; 
	}
}
