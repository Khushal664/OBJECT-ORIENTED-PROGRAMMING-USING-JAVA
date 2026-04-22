import java.util.Scanner;

public class q20_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of values: ");
        int n = sc.nextInt();
        
        double sum = 0;
        
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            sum = sum + num;
        }
        
        double average = sum / n;
        
        System.out.println("Average: " + average);
    }
}
