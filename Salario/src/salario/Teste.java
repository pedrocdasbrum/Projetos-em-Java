package salario;
import java.util.Scanner;
public class Teste {
	public static void main(String[]args) {// linha - principal
		Scanner ler = new Scanner(System.in);
		Salario s1 = new Salario();
		System.out.println("Sal�rio m�nimo: ");
		s1.setSalarioMinimo(ler.nextDouble());
		System.out.println("Sal�rio: ");
		s1.setSalario(ler.nextDouble());
		System.out.println(s1.toString());
		}}
