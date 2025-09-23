import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	  int temp=n,rev=0,digit;
		while(n>0) {
			digit = n %10;
			rev = rev*10 + digit;
			n /= 10;
		}
		if(rev == temp) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}
