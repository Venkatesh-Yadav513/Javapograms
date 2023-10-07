import java.util.Scanner;

public class DigitFinder {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer between 1 To 1000 :");
        num = scan.nextInt();
        int sum = 0;

        while(num !=0){
            sum +=num%10;
            num /= 10;
        }
        System.out.print("The sum of digits is : " + sum);
        scan.close();
    }
}
