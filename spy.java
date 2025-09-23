import java.util.Scanner;
public class spy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), digit, sum=0, prod =1;;
		while(n>0) {
			digit = n %10;
			sum += digit;
			prod *= digit;
			n /=10;
		}
		if(sum == prod) System.out.println("Spy Number");
		else System.out.println("Not Spy Number");
}
}