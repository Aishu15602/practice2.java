import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            count++;          
            number /= 10;          
        }
        System.out.print("Total Count :" + count);
    }
}
