package Patterns;

public class Third {
    public static void main(String[] args) {
        char currentChar ='A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i-1; j++) {
                System.out.print(currentChar);
                currentChar++;
            }
            System.out.println();
        }
    }
}
