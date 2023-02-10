package Ex03q04;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name");
        String company = sc.nextLine();
        System.out.println("Enter name of employees separated by commas");
        String employees = sc.nextLine();

        String arr_emp[] = employees.split(",");

        System.out.println("Enter Team lead name");
        String team_lead = sc.nextLine();
        
        Company c = new Company();

        c.setName(company);
        c.setEmployees(employees);
        c.setTeamlead(team_lead);

        boolean result = new CompanyMain().check(arr_emp, c.getTeamlead());

        if (!(result)) {
            System.out.println("Invalid");
        } else {
            System.out.println("Company : " + c.getName());
            System.out.println("Employees : " + c.getEmployees());
            System.out.println("Team Lead : " + c.getTeamlead());
        }

        sc.close();
    }

    public boolean check(String arr[], String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
