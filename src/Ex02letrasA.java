import java.util.Scanner;

/**
 * 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
 * além de informar a quantidade de vezes em que ela ocorre.
 */

public class Ex02letrasA {

    public static int qtdeLetrasA(String texto){
        int qtde = 0;
        texto = texto.toLowerCase();

        for(int i = 0; i < texto.length(); i++){

            if(texto.charAt(i) == 'a'){
                qtde++;
            }
        }
        return qtde;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o texto: ");
        String texto = sc.nextLine();

        if(qtdeLetrasA(texto) == 0){
            System.out.println("não possuem letras A no texto.");
        } else {
            System.out.printf("possuem %d letras A no texto\n", qtdeLetrasA(texto));
        }
    }
}
