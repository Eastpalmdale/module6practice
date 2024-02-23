import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        String userInput = "";
        String trash;
        boolean done = false;
        // loop
        do {
            System.out.println("Please enter a letter.");
            if (in.hasNextDouble()) {
                trash = in.nextLine();
                System.out.println("Please enter a letter, not a number");
            } else {
                userInput = in.nextLine();

            }
            if (userInput.length() ==1) {
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter one letter.");
            }
        } while (!done);
        userInput = userInput.toLowerCase();
        switch (userInput) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(userInput + " is a vowel");
                break;
            default:
                System.out.println(userInput + " is a consonant");
        }
    }
}
