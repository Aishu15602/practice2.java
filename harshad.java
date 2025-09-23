
import java.util.Scanner;
public class harshad {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt(), sum=0, digit, temp = n;
		while(n>0) {
			digit = n %10;
			sum += digit;
			n /= 10;
		}
		if (temp % sum == 0) {
            System.out.println(temp + " is a Harshad number");
        } else {
            System.out.println(temp + " is NOT a Harshad number");
        }
	}
}