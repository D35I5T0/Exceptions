package exceptions;
import java.util.Scanner;
import java.util.ArrayList;
public class ExercicioArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList <Integer> lista = new ArrayList <Integer> ();
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Informe a idade da pessoa de n° " + (i + 1));
				int idade = sc.nextInt();
				lista.add(idade);
			}
			System.out.println("Informe o número: ");
			int num = sc.nextInt();
			lista.remove(num);
			System.out.println(lista);
		}
		catch (Exception e) {
			System.out.println("Posição inválida");
		}
		sc.close();
	}
}
