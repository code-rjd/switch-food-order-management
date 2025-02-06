package service;

import model.Restaurant;

import java.util.Scanner;

public class RestaurantR {

    private void acceptRestaurantData() {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Restaurant id ");
        int Rid = (Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Restaurant name ");
        String Rname = (scanner.nextLine());

        System.out.println("enter Restaurant owner's first name");
        String Rofname = (scanner.nextLine());

        System.out.println(" Enter Restaurant owner's last name");
        String Rolname = (scanner.nextLine());

        System.out.println("Enter Restaurant's address");
        String Raddress = (scanner.nextLine());

        System.out.println("Enter Restaurant's Mobile No");
        int Rmn = (Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Restaurant's FSSAI no.");
        int Rfssai = (Integer.parseInt(scanner.nextLine()));

        Restaurant r = new Restaurant();
        r.Rid = Rid;
        r.Rname = Rname;
        r.Rofname = Rofname;
        r.Rolname = Rolname;
        r.Raddress = Raddress;
        r.Rmn = Rmn;
        r.Rfssai = Rfssai;

        System.out.println(" Delivery Agent Details are : " + r);
    }
}
