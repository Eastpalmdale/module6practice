import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        int userNumber=0;
        String trash;
        double expoNumber=0;
        boolean done = false;
        //loop start
        do {
            System.out.println("Please enter a number.");

            if (in.hasNextInt()) {

                userNumber = in.nextInt();

                done = true;
            }
                else {
                    trash = in.nextLine();
                    System.out.println("Please enter numbers only");
                }
        } while (!done);
        // if block from hell
        if (userNumber < 0) {

            userNumber = userNumber * -1;

        }
            if (userNumber >= 1000000) {
                System.out.println("Your number is 7 or more digits");
            }
            else if (userNumber >= 100000) {
                System.out.println("Your number is 6 digits");
            }
            else if  (userNumber >= 10000) {
                System.out.println("Your number is 5 digits");
            }
            else if (userNumber >= 1000) {
                System.out.println("Your number is 4 digits");
            }
            else if (userNumber >= 100) {
                System.out.println("Your number is 3 digits");
            }
            else if (userNumber >= 10) {
                System.out.println("Your number is 2 digits");
            }
            else if (userNumber <= 9) {
                System.out.println("Your number is 1 digits");
        }
    }
}
