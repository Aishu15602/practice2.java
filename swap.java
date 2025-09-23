import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count=0, temp=n;
		while(n>0) {
			count++;
			n /= 10;
		}
		int arr[] = new int[count];
		String name = Integer.toString(temp);
		for(int i=0; i<count; i++) {
			arr[i] = name.charAt(i);
		}
		int temp2 = arr[0];
		arr[0] = arr[count-1];
		arr[count-1] = temp2;
		for(int a:arr) System.out.print((char)a);
		input.nextInt();
	}
}