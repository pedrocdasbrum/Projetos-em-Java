package funcionario;
import java.util.Scanner;
public class Teste {
	public static void main(String[]args) { 
		Scanner ler = new Scanner(System.in);
	    Funcionario f1 = new Funcionario();
	    System.out.println("Digite o seu salário fixo: ");
	    f1.setSalarioFixo(ler.nextDouble());
	    System.out.println("Digite o seu valor total de vendas: ");
	    f1.setValorVendas(ler.nextDouble());
	    System.out.println(f1.toString());

}}
