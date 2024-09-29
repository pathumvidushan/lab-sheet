import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length in centimeters: ");
        double centimeters = scanner.nextDouble();

        
        double totalInches = centimeters / 2.54;

        
        int feet = (int) (totalInches / 12);  
        double remainingInches = totalInches % 12;  

        
        System.out.println(centimeters + " cm is equal to " + feet + " feet and " + String.format("%.2f", remainingInches) + " inches.");

    
        scanner.close();
    }
}
