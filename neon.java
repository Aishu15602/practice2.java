import java.util.Scanner;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n =input.nextInt(), sum=0, temp=n, digit, sq;
		sq = n*n;
		while(sq >0) {
			digit = sq % 10;
			sum += digit;
			sq /=10;
		}
		if(temp == sum) System.out.println("Neon Number");
		else System.out.println("Not Neon Number");
		
	}
}