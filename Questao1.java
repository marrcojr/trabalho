//  Questão 1  Números menores em ordem decrescente
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Números menores que " + numero + " em ordem decrescente:");
        for (int i = numero - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
