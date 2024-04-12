package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //Maria,maria@gmail.com,3200.00
    //Alex,alex@gmail.com,1900.00
    //Marco,marco@gmail.com,1700.00
    //Bob,bob@gmail.com,3500.00
    //Anna,anna@gmail.com,2800.00
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o caminho");
        String path = sc.next();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.println("Salário máximo: ");
            double salarioMaximo = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salarioMaximo)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email de pessoas que salário maior que " + String.format("%.2f", salarioMaximo));
            emails.forEach(System.out::println);

            double soma = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Soma dos salários de pessoas que começam com 'M': " + soma );


        }catch(IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        sc.close();
    }
}