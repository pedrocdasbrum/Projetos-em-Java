package nota;
import java.util.Scanner;
public class Teste {
	public static void main(String[]args) { 
		Scanner ler = new Scanner(System.in);
		Nota n1 = new Nota();
		System.out.println("Nota1: ");
		n1.setNota1(ler.nextDouble());
		System.out.println("Nota2: ");
		n1.setNota2(ler.nextDouble());
		System.out.println("Nota3: ");
		n1.setNota3(ler.nextDouble());
		System.out.println(n1.toString());
	}}
