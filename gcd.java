import java.util.Scanner;
public class gcd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt(), n2 = sc.nextInt();
		int dividend = (n1 > n2) ? n1 : n2;
		int divisor = (n1 < n2) ? n1 : n2;
		int rem = dividend % divisor;
		if( rem == 0)System.out.println(divisor);
		else {
			dividend = divisor;
			divisor = rem;
			rem = dividend % divisor;
		}
		System.out.println(divisor);
  }
}