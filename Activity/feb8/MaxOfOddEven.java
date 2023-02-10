import java.util.Scanner;
import java.lang.Math;

/**
 * MaxOfOddEven
 */
public class MaxOfOddEven {

    public static void main(String[] args) {
        int n, sumOdd = 0, sumEven = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array");
        n = in.nextInt();
        if (n < 0) {
            System.out.println("Invalid array size");
            System.exit(0);
        } else {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] < 0) {
                    System.out.print("Invalid input");
                    System.exit(0);
                }
                for (i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0)
                        sumEven = sumEven + arr[i];
                    else 
                        sumOdd = sumOdd + arr[i];
                }
                System.out.println(Math.max(sumEven,sumOdd));
            }
        }
        in.close();
    }
}
