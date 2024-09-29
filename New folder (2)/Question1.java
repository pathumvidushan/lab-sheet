import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

               if (word.length() % 2 == 0) {
            System.out.println("Please enter a word with an odd number of characters.");
        } else {
        
            int middleIndex = word.length() / 2;

            System.out.println("The middle character is: " + word.charAt(middleIndex));
        }

        scanner.close();
    }
}


