import java.util.Scanner;

public class WORK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        double cubeRoot = Math.cbrt(number);

        System.out.println("The cube root of the number is: " + cubeRoot);
    }
}
