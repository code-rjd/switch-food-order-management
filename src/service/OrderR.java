package service;

import model.Order;

import java.util.Scanner;

public class OrderR {

    private void Order() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter order id ");
        int Oid = (Integer.parseInt(scanner.nextLine()));

        System.out.println("enter list of items");
        String Olist = (scanner.nextLine());

        System.out.println(" Enter delivery time");
        String DT = (scanner.nextLine());

        System.out.println("Enter total price of items in Rupees");
        double totalprice = scanner.nextDouble();
        Order f = new Order();
        f.Oid = Oid;
        f.DT = DT;
        f.Olist = Olist;
        f.totalprice = totalprice;

        System.out.println(" Food item Details are : " + f);
    }
}
