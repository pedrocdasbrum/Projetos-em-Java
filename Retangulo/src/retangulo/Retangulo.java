package retangulo;

public class Retangulo {
	private double altura;
	private double base;
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double calcularArea() {
		return altura * base;
	}
	public String toString() {
		return "Altura: " +altura+
				"Base: " +base+
				"\nÁrea: " +calcularArea();
	}
}
