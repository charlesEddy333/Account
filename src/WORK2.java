import java.util.Scanner;

public class WORK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }

}