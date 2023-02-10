import java.util.Scanner;


public class PowerOf2 {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		if (n<0) {
			System.out.println("Number too small");
//			System.exit(0);
			
		}
		else if (n>32767) {
			System.out.println("Number too large");
//			System.exit(0);
		}
		else {
			if (n==0) {
				System.out.println("yes");
//				System.exit(0);
			}
			while (n!=1) {
				if((n%2) != 0) {
					System.out.println("no");
//					System.exit(0);
				}
				n=n/2;
			}
			System.out.println("yes");
//			System.exit(0);
		}
		
		in.close();
		
	}

}
