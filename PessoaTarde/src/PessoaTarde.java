public class PessoaTarde {// início da classe
	// variáveis do sistema
	private double peso;
	private double altura;
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	} 
	public double calcularImc() {
		return (peso/(Math.pow(altura,2)));
	}
    public String visualizarDados () {
    	return "Peso: " +peso+
    		   "Altura: " +altura+
    		   "\nImc: " +calcularImc()+
    		   "\nImc: " +(peso/(Math.pow(altura,2)));
    }
    // ações do sistema GET - SET
}// fim da classe

