package Exception;
import java.util.Scanner;
public class ContaCorrente {
    private int numConta;
    private Double saldo;
    
    public ContaCorrente(int numConta, Double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double sacarDinheiro (double valor) throws SaldoInsuficienteException {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return this.saldo;
        }
        else {
            throw new SaldoInsuficienteException("Valor superior ao saldo da conta");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Informe o saldo: ");
        double saldo = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(numConta, saldo);
        
        int cont = 0;
        while (cont < 10) {
            System.out.println("Informe o valor a ser sacado: ");
            double valor = sc.nextDouble();
            System.out.println(conta.sacarDinheiro(valor));
            cont++;
        }
        sc.close();
    }
}
