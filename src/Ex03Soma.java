/**
 * 3) Observe o trecho de código abaixo:
 * int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?
 */

public class Ex03Soma {
    public static void main(String[] args) {

        int indice = 12, soma = 0, k = 1;

        while(k < indice){
            k++;
            soma += k;
        }

        System.out.printf("a resposta é %d.\n" ,soma);
    }
}
