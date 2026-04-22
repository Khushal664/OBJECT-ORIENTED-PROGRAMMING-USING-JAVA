import java.util.Scanner;

public class q16_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal (P): ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Rate (R): ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Time (T): ");
        double t = sc.nextDouble();
        
        double si = (p * r * t) / 100;
        
        System.out.println("Simple Interest is: " + si);
    }
}
