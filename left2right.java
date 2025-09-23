import java.util.Scanner;
public class left2right{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); 
    }
}
}