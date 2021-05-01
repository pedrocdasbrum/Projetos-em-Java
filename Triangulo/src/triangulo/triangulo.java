package triangulo;

public class triangulo {
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
		return altura*base;
	}
	
	public String toString() {
		return "Área do Triângulo: " +calcularArea();
	}
	
	import java.util.Scanner;

    import triangulo.triangulo;
	public class teste {
		public static void main(String[]args) {
			Scanner ler = new Scanner(System.in);
			triangulo f1 = new triangulo();
			System.out.println("Digite a altura: ");
			f1.setAltura(ler.nextDouble());
			System.out.println("Digite a base: ");
			f1.setBase(ler.nextDouble());
			System.out.println(f1);
			}
}
