public class Ex04Logica {
    public static void main(String[] args) {

        //números ímpares
        System.out.println("a)");

        int nA = 1;

        for(int i = 0; i < 5; i++){
            System.out.print(nA+" ");
            nA += 2;
        }

        //o próximo é o anterior * 2
        System.out.println("\nb)");

        int nB = 2;

        for(int i = 0; i < 7; i++){
            System.out.print(nB+" ");
            nB *= 2;
        }

        //o quadrado dos números
        System.out.println("\nc)");

        for(int i = 0; i < 8; i++){
            int numero = i * i;
            System.out.print(numero+" ");
        }

        //números pares elevado ao quadrado
        System.out.println("\nd)");

        int nD = 2;
        for(int i = 0; i < 5; i++){
            int numero = nD * nD;
            System.out.print(numero+" ");
            nD += 2;
        }

        //Fibonacci
        System.out.println("\ne)");
        int a = 1;
        System.out.print(a+" ");
        int b = 1;
        System.out.print(b+" ");
        int proximoNumero;

        for(int i = 0; i < 5; i++){
            proximoNumero = a + b;
            System.out.print(proximoNumero+" ");
            a = b;
            b = proximoNumero;
        }

        //numeros que começam com a letra D
        System.out.println("\nf)");
        System.out.println("2, 10, 12, 16, 17, 18, 19, 200");
    }
}
