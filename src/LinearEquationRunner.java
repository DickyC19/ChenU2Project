import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String co1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String co2 = scan.nextLine();

        // coordinate value strings
        String stringX1 = co1.substring(1, co1.indexOf(","));
        String stringY1 = co1.substring(co1.indexOf(" ") + 1, co1.indexOf(")"));
        String stringX2 = co2.substring(1, co2.indexOf(","));
        String stringY2 = co2.substring(co2.indexOf(" ") + 1, co2.indexOf(")"));

        // checking for vertical line
        if (stringX1.equals(stringX2)) {
            System.out.println("\n These points are on a vertical line: x = " + stringX1);
            return;
        }
        // getting coordinate values
        int x1 = Integer.parseInt(stringX1);
        int y1 = Integer.parseInt(stringY1);
        int x2 = Integer.parseInt(stringX2);
        int y2 = Integer.parseInt(stringY2);

        // creating LinearEquation object
        LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2);

        // empty line
        System.out.println();
        // calling LinearEquations object's information
        System.out.println(linearEquation.lineInfo());
        // empty line
        System.out.println();

        // user enters value for x
        System.out.print("Enter a value for x: ");
        double xValue = scan.nextDouble();
        scan.nextLine();
        // empty line
        System.out.println();

        // user receives point on the line
        System.out.print("The point on the line is " + linearEquation.coordinateForX(xValue));
    }
}
