import java.util.Scanner;

class binaryTodecimal{
    public static void main(String[] args) {
        int dec_num;
        int quot,i=1,j;
        int bin_num[] = new int[100];

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        dec_num = s1.nextInt();
        quot = dec_num;
        s1.close();
        while(quot != 0){
            bin_num[i++] =quot%2;
            quot =quot/2;
        }
        System.out.println("The binary number is: ");
        for(j=i-1;j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.println();
    }
}