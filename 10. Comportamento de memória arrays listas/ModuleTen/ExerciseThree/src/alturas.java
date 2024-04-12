import java.util.Locale;
import java.util.Scanner;

public class alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double nmenores;
        System.out.print("Quantia de pessoas desejada: ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double alturamedia, alturatotal;
        double percentualMenores;
        for(int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        nmenores = 0;
        alturatotal = 0;
        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            alturatotal = alturatotal + alturas[i];
        }
        alturamedia = alturatotal / n;
        percentualMenores = ((double)nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", nmenores);

        for(int i=0; i<n; i++) {
            if (idades[i] < 16)
                System.out.printf("%s\n", nomes[i]);

        }

        sc.close();
    }
}