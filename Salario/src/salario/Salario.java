package salario;

public class Salario { // In�cio da classe - objeto
	
	// Atributos do sistema - entrada
	private double salarioMinimo;
	private double salario;
	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// M�todo de c�lculo - processamento
	public double calcularTotalSal() {
		return salario/salarioMinimo;
	}
	
	// Visualiza��o - sa�da
	public String toString() {
		return "Sal�rio m�nimo: " +salarioMinimo+
				"Sal�rio: " +salario+
				"\nTotal de sal�rios m�nimos: " +calcularTotalSal();
	}}
