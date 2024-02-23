import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        int numberOne=0;
        int numberTwo=0;
        int numberThree=0;
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
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter numbers only");
            }
        } while (!done);
        if (numberOne==numberTwo) {
            if (numberTwo==numberThree) {
                if (numberOne==numberThree) {

                    System.out.println("the numbers you entered are all the same");
                }
            }
        }
        if (numberOne != numberTwo) {
            if (numberTwo!=numberThree) {
                if (numberOne!=numberThree) {

                    System.out.println("the numbers you entered are all different");
                }
            }
        }
        else
            System.out.println("None of these numbers are fully different or fully equal.");
    }
}
