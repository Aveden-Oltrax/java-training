/**
 * 
 */
package ex02;

import java.util.Scanner;

/**
 * @author 158417
 *
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("1. Deluxe Room :");
        System.out.println("2. Deluxe AC Room:  ");
        System.out.println("3. Suite AC Room: ");
        System.out.println("Select Room Type: ");
        int type = sc.nextInt();
        System.out.println("Hotel Name: ");
        String hotelName = sc.next();
        System.out.println("Room Square Feet Area: ");
        int numberOfSqFeet = sc.nextInt();
        System.out.println("Room has TV (yes/no): ");
        boolean hasTV = sc.next().toLowerCase().equals("yes") ? true : false;
        System.out.println("Room has Wifi (yes/no):");
        boolean hasWifi = sc.next().toLowerCase().equals("yes") ? true : false;

        int terrif = 0;
        System.out.print("Room Tariff per day is: ");
        switch (type) {
            case 1:
                DeluxeRoom deluxRoom = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
                terrif = deluxRoom.calculateTariff(deluxRoom.getRatePerSqFeet());
                break;
            case 2:
                SuiteACRoom deluxACRoom = new SuiteACRoom(hotelName, numberOfSqFeet,  hasTV, hasWifi);
                terrif = deluxACRoom.calculateTariff(deluxACRoom.getRatePerSqFeet());
                break;
            case 3: 
                SuiteACRoom suitACRoom = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
                terrif = suitACRoom.calculateTariff(suitACRoom.getRatePerSqFeet());
                break;
        }

        System.out.println(terrif);
	}

}
