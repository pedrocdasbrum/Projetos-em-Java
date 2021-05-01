package salario;

public class Salario { // Início da classe - objeto
	
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
	
	// Método de cálculo - processamento
	public double calcularTotalSal() {
		return salario/salarioMinimo;
	}
	
	// Visualização - saída
	public String toString() {
		return "Salário mínimo: " +salarioMinimo+
				"Salário: " +salario+
				"\nTotal de salários mínimos: " +calcularTotalSal();
	}}
