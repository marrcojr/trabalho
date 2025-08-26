//  Questão  – Somar apenas números pares (6 valores)
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números pares digitados é: " + soma);
        sc.close();
    }
}