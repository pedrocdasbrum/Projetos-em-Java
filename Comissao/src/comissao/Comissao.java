package comissao;

public class Comissao {
	private double salario;
	private double valorTotalDeVendas;
	private double percentualDeComissao;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getValorTotalDeVendas() {
		return valorTotalDeVendas;
	}
	public void setValorTotalDeVendas(double valorTotalDeVendas) {
		this.valorTotalDeVendas = valorTotalDeVendas;
	}
	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}
	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
	}
	public double calcularComissao() {
		return valorTotalDeVendas * percentualDeComissao/100;
	}
	public double calcularSalarioTotal() {
		return calcularComissao()+ salario;
	}
	public String visualizarDados() {
		return "Salário: " +salario+
			   "\nTotal de vendas: " +valorTotalDeVendas+
			   "\nPercentual de comissão: " +percentualDeComissao+
			   "\nComissão: " +calcularComissao()+
			   "\nSalário total: " +calcularSalarioTotal();
    }
}
