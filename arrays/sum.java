package arrays;
public class sum {
    //sum of integer array
    public static void main(String[] args) {
        int[] numbers ={2,3,4,5,6,7,8,9};

        int sum=0;
        for(int num : numbers){
            sum+=num;
        }
        System.out.println("the sum of the integer array is : " + sum);
    }
}
