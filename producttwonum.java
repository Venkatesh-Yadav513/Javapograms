import java.util.Scanner;

public class producttwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fnum, snum, result;
        System.out.print("Input First number: ");
        fnum = sc.nextInt();
        System.out.print("Input Second num: ");
        snum = sc.nextInt();
        result = fnum * snum;
        System.out.println(fnum + " x " + snum + " = " + result);
        sc.close();
    }
}
