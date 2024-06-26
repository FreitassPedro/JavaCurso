package application;
import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Dados do produto #" + i + ":");
            System.out.println("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.println("Data da fabricação (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.println("Taxa da importação: ");
                double costumsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, costumsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");

        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
sc.close();




    }
}