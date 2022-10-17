import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String co1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String co2 = scan.nextLine();

        // checking for vertical line
        if (co1.substring(1, 3).equals(co2.substring(1,3))) {
            if (co1.substring(1,2).equals("-")) {
                System.out.println("These coordinates result in a vertical line at x = " + co1.substring(1, 3));
            } else {
                System.out.println("These coordinates result in a vertical line at x = " + co1.substring(1, 2));
            }
        }

        // coordinate values
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        // getting x1 value
        if (co1.substring(1,2).equals("-")) {
            x1 = Integer.parseInt(co1.substring(1,3));
        } else {
            x1 = Integer.parseInt(co1.substring(1, 2));
        }

        // getting x2 value
        if (co2.substring(1,2).equals("-")) {
            x2 = Integer.parseInt(co2.substring(1,3));
        } else {
            x2 = Integer.parseInt(co2.substring(1, 2));
        }

        // getting y1 value
        if (co1.substring(5,6).equals("-")) {
            y1 = Integer.parseInt(co1.substring(5, 7));
        } else if (co1.substring(4, 5).equals("-")){
            y1 = Integer.parseInt(co1.substring(4, 6));
        } else if (co1.substring(3, 4).equals(",")) {
            y1 = Integer.parseInt(co1.substring(5, 6));
        } else {
            y1 = Integer.parseInt(co1.substring(5, 6));
        }

        // getting y2 value
        if (co2.substring(5,6).equals("-")) {
            y2 = Integer.parseInt(co2.substring(5, 7));
        } else if (co2.substring(4, 5).equals("-")){
            y2 = Integer.parseInt(co2.substring(4, 6));
        } else if (co2.substring(3, 4).equals(",")) {
            y2 = Integer.parseInt(co2.substring(5, 6));
        } else {
            y2 = Integer.parseInt(co2.substring(4, 5));
        }

    }
}
