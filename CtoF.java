import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input;
        System.out.println("Choose the Option :");
        System.out.println("1 Fahrenheit TO Celsius");
        System.out.println("2 Celsius To Fahrenheit");
        System.out.print("Enter the Option :");
        int chooseValue = sc.nextInt();
        if (chooseValue == 1){
        System.out.println("Enter the degree to convert F to C : ");
        input = sc.nextFloat();
        float celsius = (5*(input - 32))/9;
        System.out.println(input + " degree Fahrenheit is Equals to " + celsius + " celsius ");
        }
        else{
            System.out.print("Enter the degree to Convert C to F : ");

            input = sc.nextFloat();
            float fahrenheit = (9*input+(32*5))/5;
        System.out.println(input + " degree celsius is Equals to " + fahrenheit + " fahrenheit ");
        }
        sc.close();
    }
}
