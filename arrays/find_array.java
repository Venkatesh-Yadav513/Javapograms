package arrays;

import java.util.Scanner;

public class find_array {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " Integers");
        for(int i=0; i <size; i++){
           numbers[i] = scan.nextInt();
        }
        System.out.print("Enter the number if you want to search: ");
        int searchNum =scan.nextInt();
        scan.close();
        boolean found = false;
        for(int num : numbers){
            if(num == searchNum){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(searchNum +" array is found");
        }
        else{
            System.out.println(searchNum+" array not found");
        }
    }
}
