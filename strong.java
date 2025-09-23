import java.util.Scanner;
public class strong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count=0, temp1=n, temp2=n, fact=1, digit, sum =0;
		while(n >0) {
			count++;
			n/=10;
		}
		for(int i=0; i<count; i++) {
			digit = temp1 % 10;
			for(int j=digit; j>0; j--) {
				fact *= j;
			}
temp1 /=10;
			sum += fact;
			fact =1;
		}
		if(sum == temp2) System.out.println("Strong Number");
		else System.out.println("Not Strong Number");
		
	}
}