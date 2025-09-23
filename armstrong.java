import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        while(temp!=0){
            int digit = temp%10;
            sum = sum +digit*digit*digit;
            temp = temp/10;
        }
        if(sum == number){
            System.out.print("It is a amstrong number");
        }
else{
    System.out.print("It is not a amstorng number");
}
    }
}
