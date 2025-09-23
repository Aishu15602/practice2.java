import java.util.Scanner;
public class magic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int digit, sum;
		while(n > 9) {
			sum = 0;
			while(n > 0) {
				digit = n %10;
				sum += digit;
				n /= 10;
			}
	n= sum;
		}
		if(n == 1) System.out.println("Magic Number");
		else System.out.println("Not Magic Number");
	}
}