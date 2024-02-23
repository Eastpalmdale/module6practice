import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        int userMonth = 0;
        String trash="";
        boolean done = true;
        // loop
        do {
            System.out.println("Please enter a number as one of the months.");

            if (in.hasNextInt()) {

                userMonth = in.nextInt();

                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }
        } while (!done);
        switch (userMonth) {
            case 2:
                System.out.println("28/29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
        }
    }
}
