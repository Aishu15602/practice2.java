import java.util.Scanner;
public class sumofeven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum =0, digit;
		while(n >0) {
			digit = n % 10;
			if(digit %2 ==0) sum+= digit;
			n /= 10;
		}
		System.out.println(sum);
		
	}
}