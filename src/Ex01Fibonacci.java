import java.util.Scanner;

/**
 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
 * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */

public class Ex01Fibonacci {
    public static boolean fibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int proximoNumero = a + b;

        while (proximoNumero <= numero) {
            if (proximoNumero == numero) {
                return true;
            }
            a = b;
            b = proximoNumero;
            proximoNumero = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int valor = sc.nextInt();

        if(fibonacci(valor)) {
            System.out.printf("o número %d pertence à sequência fibonacci.\n", valor);
        } else{
            System.out.printf("o número %d NÃO pertence à sequência fibonacci.\n", valor);
        }
    }
}
