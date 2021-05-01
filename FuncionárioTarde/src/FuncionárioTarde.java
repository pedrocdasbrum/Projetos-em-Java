public class FuncionárioTarde { // início da classe
	// variáveis do sistema
	private double valorHora;
	private double totalHora;
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getTotalHora() {
		return totalHora;
	}
	public void setTotalHora(double totalHora) {
		this.totalHora = totalHora;
	}
	public double calcularSalário() {
		return valorHora*totalHora;
	}
	public String visualizarDados () {
		return "ValorHora: " +valorHora+
				"TotalHora: " +totalHora+
				"\nSalário: " +calcularSalário()+
				"\nSalário: " +valorHora*totalHora ;
	}
	// ações do sistema GET- SET
	

}//fim da classe

