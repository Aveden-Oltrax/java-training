package activity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the time of arrival (dd.MM.yyyy HH:mm:ss): ");
    String arrivalTime = sc.nextLine();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    LocalDateTime arrival = LocalDateTime.parse(arrivalTime, formatter);
    
    LocalDateTime now = LocalDateTime.now();
    long elapsedMinutes = ChronoUnit.MINUTES.between(arrival, now);
    long elapsedHours = elapsedMinutes / 60;
    long remainingMinutes = elapsedMinutes % 60;
    System.out.println(remainingMinutes);
    double cost =  (((double)elapsedHours * 25) +  (((double)remainingMinutes/60)*25));
    System.out.println("Elapsed time: " + elapsedHours + " hours " + remainingMinutes + " minutes");
    System.out.println("Total parking cost: " + String.format("%.2f",cost));
    
    sc.close();
  }
}
