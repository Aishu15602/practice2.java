import java.util.Scanner;
public class product {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int prod =1, digit;
		while(n>0) {
			digit = n % 10;
			prod *= digit;
			n /= 10;					
		}
		System.out.println(prod);
		
	}
}