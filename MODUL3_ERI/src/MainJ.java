import java.util.Scanner;
import java.util.InputMismatchException;

public class MainJ {
    public static void main(String[] args) {
        Calculation kalku = new Calculation();
        Thread thread = new Thread(kalku);
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        do {
            System.out.println("\n==Menu Program==");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            try {
                System.out.print("Select menu : ");
                int menu = input.nextInt();
                System.out.println();
                switch (menu) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = input.nextDouble();

                        kalku.setSquare(side);
                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + kalku.getSquare());
                        break;

                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double radius = input.nextDouble();
                        kalku.setCircle(radius);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + kalku.getCircle());
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double a = input.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double b = input.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double t = input.nextDouble();
                        kalku.setTrapezoid(a, b, t);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + kalku.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("The program is finished");
                    default:
                        System.out.println("\nOptions not available\n");
                        continue;
                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====\n");
                input.next();
            } catch (IllegalArgumentException e) {
                // System.out.println();
                System.out.println(e);
                // System.out.println();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
        input.close();
    }
}
