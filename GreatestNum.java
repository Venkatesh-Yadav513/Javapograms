import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number : ");
        num1 = scan.nextInt();
        System.out.print("enter the Second Number : ");
        num2 = scan.nextInt();
        System.out.print("Enter the Third Number : ");
        num3 = scan.nextInt();
        scan.close();
        if (num1 >= num2 && num1 >= num3) {
            System.out.print("The Greatest Number is : " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print("The Greatest Number is : " + num2);
        } else {
            System.out.print("The Greatest Number is : " + num3);
        }
    }
}
