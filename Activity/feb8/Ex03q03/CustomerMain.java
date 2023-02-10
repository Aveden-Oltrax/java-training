package Ex03q03;

import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,address,mobile separated by commas");

        String details = sc.nextLine();
        String arr[] = details.split(",");
        
        String name = arr[0];
        String address = arr[1];
        String mobile = arr[2];

        Customer c = new Customer();

        c.setName(name);
        c.setAddress(address);
        c.setMobile(mobile);

        System.out.println("Name : " + c.getName());
        System.out.println("Address :" + c.getAddress());
        System.out.println("Mobile :" + c.getMobile());

        sc.close();
    }
}
