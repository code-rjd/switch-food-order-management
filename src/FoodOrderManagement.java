import service.CustomerService;

import java.util.Scanner;

public class FoodOrderManagement {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            CustomerService customerService = new CustomerService();

            System.out.println("\n----------Welcome to Food Order Management----------\n");
            System.out.println("Please choose the option");
            System.out.println("1.Create customer");
            System.out.println("2.Create delivery agent");
            System.out.println("3.Create restaurant");
            System.out.println("4.Create order");
            System.out.println("5.Create menu");
            System.out.println("0. EXIT\n");
            System.out.println("10. Display all customers");
            int option = 0 ;

            do {
                System.out.println("please enter option");
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        //create customer
                      customerService.registerCustomer();
                        break;
                    case 2:

                        System.out.println("Create delivery agent");
                        break;
                    case 3:

                        System.out.println("Create restaurant");
                        break;
                    case 4:

                        System.out.println("Create order");
                        break;
                    case 5:
                        System.out.println("Create menu");
                        break;
                    case 10:
                        customerService.displayCustomers();
                        break;
                    default:
                        System.out.println("invalid option entered");
                        break;


                }
            } while (option != 0) ;
        }
}