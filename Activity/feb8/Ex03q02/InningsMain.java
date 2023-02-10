package Ex03q02;

import java.util.Scanner;

public class InningsMain {
    public static void main(String[] args) {
        Innings inn1 = new Innings();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Innings Name: ");
        inn1.setInningsname(in.nextLine());
        System.out.println("Enter Team Name: ");
        inn1.setTeamname(in.nextLine());
        System.out.println("Enter Runs: ");
        inn1.setRuns(in.nextInt());

        inn1.displayInningsDetails();


        in.close();
    }
    
}
