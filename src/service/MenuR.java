package service;


import model.Menu;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Scanner;

public class MenuR {
    private void acceptMenuData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Menu id ");
        int Mid = (Integer.parseInt(scanner.nextLine()));

        System.out.println("enter food item name");
        String Mname = (scanner.nextLine());

        System.out.println(" Enter food item description");
        String Mdescription = (scanner.nextLine());

        System.out.println("Enter taste of food item");
        String Mtaste = (scanner.nextLine());

        System.out.println("Enter measurement unit of food item");
        String Mm = (scanner.nextLine());

        System.out.println("Enter number of units of food item");
        int Munit = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter price of food item");
        double Mprice = scanner.nextDouble();

        Menu m = new Menu();
        m.Mid = Mid;
        m.Mtaste = Mtaste;
        m.Mname = Mname;
        m.Mdescription = Mdescription;
        m.Munit = Munit;
        m.Mprice = Mprice;
        m.Mm = Mm;

        System.out.println(" Menu details are ");
    }
}
