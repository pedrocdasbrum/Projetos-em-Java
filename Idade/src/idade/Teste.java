package idade;
import java.util.Scanner;
public class Teste {
	public static void main(String[]arg) {
		Scanner ler = new Scanner(System.in);
		Idade i1 = new Idade();
		System.out.println("Digite a idade: ");
		i1.setIdade(ler.nextDouble());
		System.out.println(i1.toString());
		}}
