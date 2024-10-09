import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.print("x = " + x);
        }
        else {
            if (b==c){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.println("No solution");

            }
        }
    }
}
