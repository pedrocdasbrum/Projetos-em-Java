package numeros;

public class Numeros {
	private double numero1;
	private double numero2;
	private double numero3;
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	public double getNumero3() {
		return numero3;
	}
	public void setNumero3(double numero3) {
		this.numero3 = numero3;
	}

	public String verificarMaior() {
		if (numero1 > numero2 && numero1 > numero3) {
			return "Número 1 é o maior." +numero1;
		} else 
		if (numero2 > numero1 && numero2 > numero3) {
			return "Número 2 é o maior." +numero2;
		} else {
			return "Número 3 é o maior." +numero3;}
		}
	public String verificarMenor() {
			if (numero1 < numero2 && numero1 < numero3) {
			return "Número 1 é o menor: " +numero1;
		} else 
			if (numero2 < numero1 && numero2 < numero3) {
			return "Número 2 é o menor: " +numero2;
		} else { 
			return "Número 3 é o menor: " +numero3;
		}}}