import java.util.Scanner;
public class right2left{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
         while (num > 0) {
            int digit = num % 10;
            System.out.print(digit+" ");
            num = num / 10; 
        }
    }
}