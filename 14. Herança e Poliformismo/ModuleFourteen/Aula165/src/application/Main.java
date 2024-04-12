package application;

import entitites.Fisica;
import entitites.Juridica;
import entitites.Tax;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<Tax> list = new ArrayList<>();

      System.out.print("Enter the number of tax payers: ");
      int n = sc.nextInt();

      for (int i=1; i<=n; i++) {
         System.out.println("Tax payer #" + i + " data:");
         System.out.print("Indivual or company? (i/c)");
         char type = sc.next().charAt(0);
         System.out.print("Name: ");
         sc.nextLine();
         String name = sc.nextLine();
         System.out.print("Anual Income: ");
         double anualIncome = sc.nextDouble();
         if (type == 'i') {
            System.out.print("Health expenditures: ");
            Double healthExpenditures = sc.nextDouble();
            list.add(new Fisica(name, anualIncome, healthExpenditures));
         } else {
            System.out.println("Number of emplooyees: ");
            int numberOfEmployees = sc.nextInt();
            list.add(new Juridica(name, anualIncome, numberOfEmployees));
         }
      }
         double sum = 0;
         System.out.println();
         System.out.println("TAXES PAID");
         for (Tax tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
         }

         System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
         System.out.print(sum);

      }

   }

