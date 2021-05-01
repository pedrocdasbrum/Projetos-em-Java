package idade;

public class Idade {
	private double idade;

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}
	public double converterEmDias() {
		return idade * 365;
	}
	public double converterEmSemanas() {
		return idade * 52;
	}
	public double converterEmMeses() {
		return idade * 12;
	}
	public double converterEmAnos() {
		return idade * 1;
	}
	public String toString() {
		return "Idade: " +idade+
			   "\nDias: " +converterEmDias()+
			   "\nSemanas: " +converterEmSemanas()+
			   "\nMeses: " +converterEmMeses()+
			   "\nAnos: " +converterEmAnos();
	}
}
