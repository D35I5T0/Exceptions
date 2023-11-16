import java.util.InputMismatchException;
import java.util.Scanner;
public class Vetor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int vetor[] = new int[10];
        int op = 1, cont = 0;

        while (op != 0) {
            try {
                System.out.println("Informe o número: ");
                op = sc.nextInt();
            }
            catch (InputMismatchException e1) {
                System.out.println("Valor não-numerico");
                break;
            }
            try {
                vetor[cont] = op;
                cont++;
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Mais que 10 valores");
                break;
            }
        }

        for (int i = 0; i < cont; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
