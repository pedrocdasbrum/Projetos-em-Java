package retangulo;
import java.util.Scanner;
public class teste {
	public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);	
	Retangulo r1 = new Retangulo();
	System.out.println("Digite a altura: ");
	r1.setAltura(ler.nextDouble());
	System.out.println("Digite a base: ");
	r1.setBase(ler.nextDouble());
	System.out.println(r1.toString());
	}}
