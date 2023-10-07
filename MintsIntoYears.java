import java.util.Scanner;

public class MintsIntoYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mintsInYears = 60 * 24 * 365 ;
        System.out.print("Enter the minutes : ");
        double mints = scan.nextDouble();

        long years = (long) (mints / mintsInYears);
        long days = (long) (mints/60/24) % 365;

        System.out.println((int) mints + " minutes is approximately " + years + " Years and " + days + " Days ");
    }
}
