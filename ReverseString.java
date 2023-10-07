import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        char[] arrayString = scan.nextLine().toCharArray();
        System.out.print("REVERSE STRING is : ");
        for(int r = arrayString.length -1 ; r >=0; r--){
            System.out.print(arrayString[r]);
        }
        System.out.println();
        scan.close();
    }
}
