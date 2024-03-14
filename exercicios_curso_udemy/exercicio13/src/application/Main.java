package application;

import models.entities.Contract;
import models.entities.Installment;
import models.services.ContractService;
import models.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = Installment.fmt;

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
            int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
            double contractValue = sc.nextDouble();

        Contract contract = new Contract(number, date, contractValue);

        System.out.print("Digite o número de parcelas: ");
            int contInstallment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, contInstallment);

        System.out.println("Parcelas: ");

        for (Installment installment : contract.getInstallmentList()){
            System.out.println(installment.toString());
        }
    }
}