import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class somaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media = 0;
        System.out.print("Insira a quantia de numeros: ");
                n = sc.nextInt();

        double soma = 0;
        double[] vetor = new double[n];

        for(int i = 0; i<n; i++) {
        System.out.println("Digite um numero");
        vetor[i] = sc.nextDouble();
    }
        System.out.println("Valores = ");
        for(int i=0; i<n; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }
        for(int i=0; i<n; i++) {
            soma = soma + vetor[i];
        }

        media = soma / n;
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);
        sc.close();
    }
}