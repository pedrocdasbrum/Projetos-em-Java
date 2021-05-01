package aluno;

public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double p1;
	private double p2;
	private double p3;
	public double getP1() {
		return p1;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public double getP2() {
		return p2;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}
	public double getP3() {
		return p3;
	}
	public void setP3(double p3) {
		this.p3 = p3;
	}
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
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double calcularMédiaPonderada() {
		return  (nota1*p2 + nota2*p2 + nota3*p1 + nota4*p3) /p2+p2+p1+p3; 
	}
	public String visualizarDados() {
		return "Nota 1: " +nota1+
			   "Nota 2: " +nota2+
			   "Nota 3: " +nota3+
			   "Nota 4: " +nota4+
			   "Peso 1: " +p1+
			   "Peso 2: " +p2+
			   "Peso 3: " +p3+
			   "\nMédia Ponderada: " +calcularMédiaPonderada();
	}
}
