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
            System.out.println("These coordinates result in a vertical line at x = " + stringX1);
        }
        // getting coordinate values
        int x1 = Integer.parseInt(stringX1);
        int y1 = Integer.parseInt(stringY1);
        int x2 = Integer.parseInt(stringX2);
        int y2 = Integer.parseInt(stringY2);

        // creating LinearEquation object
        LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2);

        System.out.println("The y-intercept of the line is: " + linearEquation.yIntercept());
        System.out.println("The slope of this line is: " + linearEquation.slope());
        System.out.println("The distance between the two points is: " + linearEquation.distance());

    }
}
