package funcionario;

public class Funcionario {
	private double salarioFixo;
	private double valorVendas;
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double calcularComissao( ) {
		return salarioFixo+valorVendas/0.04;
	}
	public String toString() {
		return "Salário fixo: " +salarioFixo+
				"Valor total das vendas: " +valorVendas+
				"Salário final: " +calcularComissao();
	}}
