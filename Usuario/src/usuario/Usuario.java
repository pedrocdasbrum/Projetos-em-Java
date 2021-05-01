package usuario;

public class Usuario {
	private double horaEntrada;
	private double minutoEntrada;
	private double horaSaida;
	private double minutoSaida;
	
	public double getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public double getMinutoEntrada() {
		return minutoEntrada;
	}
	public void setMinutoEntrada(double minutoEntrada) {
		this.minutoEntrada = minutoEntrada;
	}
	public double getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}
	public double getMinutoSaida() {
		return minutoSaida;
	}
	public void setMinutoSaida(double minutoSaida) {
		this.minutoSaida = minutoSaida;
	}
	public double calcularHora() {
		return horaEntrada - horaSaida;
	}
	public double calcularMinuto() {
		return minutoEntrada - minutoSaida;
	}
	public String toString() {
		return "Quantidade de horas: " +calcularHora()+
			   "\nQuantidade de minutos: " +calcularMinuto();
	}}
