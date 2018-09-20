import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("The area of the cirle of radius " + radius + " is " + area);
    }
}
