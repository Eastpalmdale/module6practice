import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        boolean done = false;
        String trash;
        //loop

        do {
            System.out.println("Please enter your first number.");
            if (in.hasNextInt()) {
                numberOne = in.nextInt();
                System.out.println("Please enter your second number.");

                if (in.hasNextInt()) {
                    numberTwo = in.nextInt();
                    System.out.println("Please enter your Third number.");

                    if (in.hasNextInt()) {
                        numberThree = in.nextInt();
                        done = true;
                    }
                }
            } else {
                trash = in.nextLine();
                System.out.println("Enter numbers only");
            }
        } while (!done);
        if (numberOne > numberTwo && (numberOne > numberThree)) {
            System.out.println("The first number you entered is greatest.");
        }
        else if (numberTwo > numberOne && (numberTwo > numberThree)) {
            System.out.println("The second number you entered is greatest.");
        }
        else if (numberThree > numberTwo && (numberThree > numberOne)) {
            System.out.println("The three number you entered is greatest.");
        }
    }
}

