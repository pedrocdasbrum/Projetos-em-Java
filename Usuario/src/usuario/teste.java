package usuario;
import java.util.Scanner;
public class teste {
	public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	Usuario u1 = new Usuario();
	System.out.println("Digite a hora de entrada: ");
	u1.setHoraEntrada(ler.nextDouble());
	System.out.println("Digite a hora de sa�da: ");
	u1.setHoraSaida(ler.nextDouble());
	System.out.println("Digite o minuto de entrada: ");
	u1.setMinutoEntrada(ler.nextDouble());
	System.out.println("Digite o minuto de sa�da: ");
	u1.setMinutoSaida(ler.nextDouble());
	System.out.println(u1.toString());
	}}
