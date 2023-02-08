package feb7set3;

import java.util.Scanner;

public class SumOfOddDigit {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		if (n<0) {
			System.out.println("Invalid Imput");
			System.exit(0);
			
		}
		else if (n>32767) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else {
			int sum = 0;
		      while (n > 0) {
		        int digit = n % 10;
		        if (digit % 2 != 0) {
		          sum += digit;
		        }
		        n /= 10;
		      }
		      System.out.println(sum);
		      
		}
		
		in.close();
		
	}

}
