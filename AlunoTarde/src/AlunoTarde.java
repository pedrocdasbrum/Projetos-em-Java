public class AlunoTarde {// início da classe
    //variáveis do sistema
	private double nota1;
	private double nota2;
	private double nota3;
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double calcularMédia() {
		return (nota1 + nota2 + nota3) /3;
	}
	public String visualizarDados() {
		return "Nota1: " +nota1+ 
				"Nota2: " +nota2+
				"Nota3: " +nota3+
		        "\nMédia: " +calcularMédia()+ 
		        "\nMédia: " +(nota1 + nota2 + nota3); 
    }
	// ações do sistema GET - SET
}// fim da classe
