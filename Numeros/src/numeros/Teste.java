package numeros;
import java.util.Scanner;
public class Teste {
	public static void main(Scanner[]args) {
		Scanner ler = new Scanner(System.in);
		Numeros n1 = new Numeros();
		System.out.println("Digite o número 1: ");
		n1.setNumero1(ler.nextDouble());
		System.out.println("Digite o número 2: ");
		n1.setNumero2(ler.nextDouble());
		System.out.println("Digite o número 3: ");
		n1.setNumero3(ler.nextDouble());
		System.out.println(n1.verificarMaior());
		System.out.println(n1.verificarMenor());
		}}
