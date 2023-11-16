package exceptions;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Informe o nome: ");
			String nome = sc.nextLine();
			System.out.println("Informe o número: ");
			int num = sc.nextInt();
			char result = nome.charAt(num);
			System.out.println(result);
		}
		catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
}
