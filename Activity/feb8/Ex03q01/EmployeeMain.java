package Ex03q01;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter name");
        emp1.setName(in.nextLine());
        System.out.println("Enter Address");
        emp1.setAddress(in.nextLine());
        System.out.println("Enter Mobile");
        emp1.setMobile(in.nextLine());

        
        System.out.println("\n Entered Employee Details");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Address: " + emp1.getAddress());
        System.out.println("Mobile: " + emp1.getMobile());

        in.close();
    }

}
