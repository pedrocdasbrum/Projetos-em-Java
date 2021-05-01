package algoritmo;
import java.util.Scanner;
public class teste {
	public static void main(String[]args) {// linha - principal
		Scanner ler = new Scanner(System.in);
		Algoritmo a1 = new Algoritmo();
		System.out.println("Digite o valor 1: ");
		a1.setValor1(ler.nextDouble());
		System.out.println("Digite o valor 2: ");
		a1.setValor2(ler.nextDouble());
		System.out.println(a1.toString());
		}}
