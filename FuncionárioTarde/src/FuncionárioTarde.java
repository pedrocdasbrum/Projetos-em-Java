public class Funcion�rioTarde { // in�cio da classe
	// vari�veis do sistema
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
	public double calcularSal�rio() {
		return valorHora*totalHora;
	}
	public String visualizarDados () {
		return "ValorHora: " +valorHora+
				"TotalHora: " +totalHora+
				"\nSal�rio: " +calcularSal�rio()+
				"\nSal�rio: " +valorHora*totalHora ;
	}
	// a��es do sistema GET- SET
	

}//fim da classe

