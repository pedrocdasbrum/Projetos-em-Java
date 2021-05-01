package valores;
import java.util.Scanner;
public class Teste {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Valores v1 = new Valores();
		System.out.println("Valor1: ");
		v1.setE(ler.nextDouble());
		System.out.println("Valor2: ");
		v1.setF(ler.nextDouble());
		System.out.println("Valor3: ");
		v1.setG(ler.nextDouble());
		System.out.println(v1.toString());
	}}
