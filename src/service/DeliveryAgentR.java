package service;


import model.DeliveryAgent;

import java.util.Scanner;

public class DeliveryAgentR {
    private void DeliveryAgent() {
        DeliveryAgent da = new DeliveryAgent();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Delivery Agent id ");
        da.setDAid(Integer.parseInt(scanner.nextLine()));

        System.out.println("enter Delivery Agent's first name");
        da.setDAfname(scanner.nextLine());

        System.out.println(" Enter Delivery Agent's last name");
        da.setDAlname(scanner.nextLine());

        System.out.println("Enter Delivery Agent's address");
        da.setDAaddress(scanner.nextLine());

        System.out.println("Enter Delivery Agent's Mobile No");
        da.setDAmn(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Delivery Agent's Aadhar No");
        da.setDAaadhar(Integer.parseInt(scanner.nextLine()));

        System.out.println(" Delivery Agent Details are : " + da);
    }
}
