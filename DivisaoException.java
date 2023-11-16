import java.util.Scanner;
import java.util.InputMismatchException;
public class DivisaoException {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double num = 0, num2 = 0, divisao = 0;

        try {
            System.out.println("Informe o número 1: ");
            num = sc.nextDouble();
            System.out.println("Informe o número 2: ");
            num2 = sc.nextDouble();
        }
        catch (InputMismatchException e1) {
            System.out.println("Valor informado não é númerico");
        }

        try {
            divisao = num / num2;
            System.out.println(divisao);
        }
        catch (ArithmeticException e2) {
            System.out.println("Não pode dividir por 0");
        }
        sc.close();
    }
}
