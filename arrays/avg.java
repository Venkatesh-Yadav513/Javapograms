package arrays;

public class avg {
    public static void main(String[] args) {
        int [] num ={2,3,5,20,6};
        int sum=0;
        for(int number : num){
            sum += number;
        }
        int avargeNum = (int) sum/num.length;
        System.out.println("The average value is : " + avargeNum);
    }

}
