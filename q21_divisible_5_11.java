import java.util.Scanner;

public class q21_divisible_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num % 5 == 0 && num % 11 == 0) {
            System.out.println("Number is divisible by both 5 and 11");
        } else {
            System.out.println("Number is NOT divisible by both 5 and 11");
        }
    }
}
