// Questão 2 Ler 5 valores e verificar se são menores que 10
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int valor = sc.nextInt();

            if (valor < 10) {
                System.out.println("Valor Menor que 10");
            }
        }
        sc.close();
    }
}