import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10; 
        }

        input.close();palindrome
}
}