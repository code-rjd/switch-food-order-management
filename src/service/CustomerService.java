package service;

import model.Customer;

import java.util.Scanner;

public class CustomerService {

    int customerIndex = 0;
    private Customer[] customers = new Customer[3];
    private Scanner scanner= new Scanner(System.in);

    void printCustomer(Customer customer){
        System.out.println(customer);
    }
    public Customer registerCustomer() {
        Customer customer = new Customer();

        System.out.println("Enter customer id ");
        customer.setCid(Integer.parseInt(scanner.nextLine()));

        System.out.println("enter Customer's first name");
        customer.setCfname(scanner.nextLine());

        System.out.println(" Enter Customer's last name");
        customer.setClname(scanner.nextLine());

        System.out.println("Enter Customer's address");
        customer.setCaddress(scanner.nextLine());

        System.out.println("Enter Customer's Mobile No");
        customer.setCmn(Integer.parseInt(scanner.nextLine()));

        customers[customerIndex] = customer;
        customerIndex++;
        return customer;
    }
        public void displayCustomers(){
            for (Customer customer : customers){
                System.out.println("Customer info: " + customer);
            }
        }
    }

// in registerCustomer method, the customer returns and data is saved
// but program run is directed towards options, and
// and if customer registration is chosen for more than 3 times, it shows error
// my recommendation is to provide while or do while loop, so it won't proceed and
// and display a message - customer registration is full