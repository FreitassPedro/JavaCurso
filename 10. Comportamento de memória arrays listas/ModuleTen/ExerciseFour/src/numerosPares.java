import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Digite quantos números deseja: ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Numeros pares: ");

        int qtdpares = 0;
        for(int i=0; i<n; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                qtdpares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);


        sc.close();
    }
}