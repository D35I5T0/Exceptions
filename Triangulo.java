package Exception;
import java.util.Scanner;
public class Triangulo {
    private Double lado1;
    private Double lado2;
    private Double lado3;
    
    public Triangulo(Double lado1, Double lado2, Double lado3) throws DimensoesInvalidasException {
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
        else {
            throw new DimensoesInvalidasException("O lado não pode ser maior que a soma dos outros lados.");
        }
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) throws DimensoesInvalidasException {
        if (lado1 < this.lado2 + this.lado3 && lado1 > Math.abs(this.lado2 - this.lado3)) {
            this.lado1 = lado1;
        }
        else {
            throw new DimensoesInvalidasException("O lado não pode ser maior que a soma dos outros lados. E nem menor que a diferença deles.");
        }
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) throws DimensoesInvalidasException {
        if (lado2 < this.lado1 + this.lado3 && lado2 > Math.abs(this.lado1 - this.lado3)) {
            this.lado2 = lado2;
        }
        else {
            throw new DimensoesInvalidasException("O lado não pode ser maior que a soma dos outros lados. E nem menor que a diferença deles.");
        }
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) throws DimensoesInvalidasException {
        if (lado3 < this.lado2 + this.lado1 && lado3 > Math.abs(this.lado2 - this.lado1)) {
            this.lado3 = lado3;
        }
        else {
            throw new DimensoesInvalidasException("O lado não pode ser maior que a soma dos outros lados. E nem menor que a diferença deles.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Triangulo tri = new Triangulo(3.0, 4.0, 5.0);
        tri.setLado1(10.0);

        System.out.println("Informe 3 números");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        Triangulo tri2 = new Triangulo(lado1, lado2, lado3);
        sc.close();
    }
}
