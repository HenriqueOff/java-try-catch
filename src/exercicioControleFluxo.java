import java.util.Scanner;
public class exercicioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        try {
            // chamando o método com a lógica de contagem
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número não pode ser maior que o segundo!!");
        }

        sc.close();
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("Parâmetros inválidos: o primeiro número é maior que o segundo.");
        }

        for (int i = num1; i <= num2; i++) {
            System.out.println("Número: " + i);
        }
    }
}