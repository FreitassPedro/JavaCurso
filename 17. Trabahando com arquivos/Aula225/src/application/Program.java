package application;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel ");
        System.out.println("Modelo do carro ");
        String carModel = sc.nextLine();
        System.out.println("Retirda (dd/MM/yyy hh:mm) ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyy hh:mm) ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("FATURA----------------------" );
        System.out.println("Pagamento Básico: " + cr.getInvoice().getBasicPayments());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento Total: " + cr.getInvoice().getTotalPayment());
        sc.close();
    }
}