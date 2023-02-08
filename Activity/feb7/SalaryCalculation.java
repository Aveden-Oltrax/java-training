import java.util.Scanner;
public class SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 0;
		int shifts = 0;
		double savings = 0;
		
		Scanner in = new Scanner(System.in);
		
		salary = in.nextInt();
		shifts = in.nextInt();
		
		if(salary>8000){
			System.out.println("Salary too large");
		}
		else if (shifts<0) {
			System.out.println("shifts too small");
		}
		else if (salary<0) {
			System.out.println("salary too small");
		}
		else {
			savings = (salary * 0.5) + (salary * 0.02 * shifts);
			System.out.println(savings);
		}
		
		in.close();
	}

}
