package valores;

public class Valores {
	private double E;
	private double F;
	private double G;
	public double getE() {
		return E;
	}
	public void setE(double e) {
		E = e;
	}
	public double getF() {
		return F;
	}
	public void setF(double f) {
		F = f;
	}
	public double getG() {
		return G;
	}
	public void setG(double g) {
		G = g;
	}
	public double calcularM�dia() {
		return (E + F + G) /3;
	}
	public String visualizarDados() {
		return "E : " +E+
			   "F : " +F+
			   "G : " +G+
			   "\nM�dia: " +calcularM�dia();
	}
}
