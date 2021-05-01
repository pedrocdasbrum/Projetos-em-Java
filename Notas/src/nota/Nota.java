package nota;

public class Nota {
	public double nota1;
	public double nota2;
	public double nota3;
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
	public double calcularMedia() {
		return (nota1+nota2+nota3)/3;
	}
	public String verificarAprovacao() {
		if (this.calcularMedia() >= 7) {
			return "Aprovado.";
		} else {
			return "Reprovado.";
		}}
	public String toString() {
		return "Nota 1: " +nota1+
				"Nota2: " +nota2+
				"Nota3: " +nota3+
				"\nM�dia: " +calcularMedia()+
				"\nResultado: " +verificarAprovacao();
	}}
