import java.util.Scanner;

public class Mathop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which math operation would you like to perform?");
        System.out.println("1 : Radius");
        System.out.println("2 : Circumference");
        System.out.println("3 : Square Root");
        System.out.println("4 : Square");
        System.out.println("5 : Hypotenuse");
        System.out.println("6 : Area of Triangle");
        System.out.println("7 : Area of Rectangle");
        System.out.println("8 : Pi");
        System.out.println("9 : Euler's Number");
        System.out.println("10 : Cube");
        System.out.println("11 : Modulus");
        System.out.println("12 : Power");
        System.out.println("13 : Logarithm");
        System.out.println("14 : Factorial");
        System.out.println("15 : Average");


        String input = scanner.nextLine();

        switch (input) {
            case "1":
                System.out.print("Enter diameter: ");
                int diameter = scanner.nextInt();
                System.out.println("Radius: " + diameter / 2.0);
                break;

            case "2":
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                double circumference = 2 * Math.PI * radius;
                System.out.println("Circumference: " + circumference);
                break;

            case "3":
                System.out.print("Enter a number to find its square root: ");
                double number = scanner.nextDouble();
                System.out.println("Square Root: " + Math.sqrt(number));
                break;

            case "4":
                System.out.print("Enter a number to square: ");
                int numToSquare = scanner.nextInt();
                System.out.println("Square: " + (numToSquare * numToSquare));
                break;

            case "5":
                System.out.print("Enter side A: ");
                double a = scanner.nextDouble();
                System.out.print("Enter side B: ");
                double b = scanner.nextDouble();
                System.out.println("Hypotenuse: " + Math.sqrt(a * a + b * b));
                break;

            case "6":
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                System.out.println("Area of Triangle: " + 0.5 * base * height);
                break;

            case "7":
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + length * breadth);
                break;

            case "8":
                System.out.println("Pi: " + Math.PI);
                break;

            case "9":
                System.out.println("Euler's Number (approx.): " + Math.E);
                break;

            case "10":
                System.out.print("Enter a number to cube: ");
                double cubeInput = scanner.nextDouble();
                System.out.println("Cube: " + Math.pow(cubeInput, 3));
                break;

            case "11":
                System.out.print("Enter dividend: ");
                int dividend = scanner.nextInt();
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                System.out.println("Modulus: " + (dividend % divisor));
                break;

            case "12":
                System.out.print("Enter base: ");
                double baseNum = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(baseNum, exponent));
                break;

            case "13":
                System.out.print("Enter a number to find its natural log: ");
                double logInput = scanner.nextDouble();
                if (logInput <= 0) {
                    System.out.println("Logarithm undefined for zero or negative values.");
                } else {
                    System.out.println("Natural Log (ln): " + Math.log(logInput));
                }
                break;

            case "14":
                System.out.print("Enter a number for factorial: ");
                int factInput = scanner.nextInt();
                if (factInput < 0) {
                    System.out.println("Factorial is undefined for negative numbers.");
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= factInput; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                }
                break;

            case "15":
                System.out.print("Enter how many numbers: ");
                int count = scanner.nextInt();
                double sum = 0;
                for (int i = 1; i <= count; i++) {
                    System.out.print("Enter number " + i + ": ");
                    sum += scanner.nextDouble();
                }
                System.out.println("Average: " + (sum / count));
                break;

            default:
                System.out.println("Invalid selection. Please try again.");
        }

        scanner.close();
    }
}