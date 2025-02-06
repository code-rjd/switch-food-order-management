package service;

import model.Billing;

import java.util.Scanner;

public class BillingR {

    private void Billing() {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Bill order id ");
        int Bid = (Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter total tax on bill ");
        double totaltax = scanner.nextDouble();

        System.out.println("Enter total price of the final bill");
        double finalbill = scanner.nextDouble();

        Billing b = new Billing();
        b.Bid = Bid;
        b.finalbill = finalbill;
        b.totaltax = totaltax;
        System.out.println(" Bill details are : " + b);
    }
}
