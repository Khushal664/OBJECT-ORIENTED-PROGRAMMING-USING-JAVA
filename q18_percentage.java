import java.util.Scanner;

public class q18_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks of 5 subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double m4 = sc.nextDouble();
        double m5 = sc.nextDouble();
        
        double total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500) * 100;
        
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
