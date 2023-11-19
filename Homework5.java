import java.util.Scanner;

public class Homework5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exercise8();

    }

    public static void exercise1() {
        String t = scanner.nextLine();
        String s = message(t);
        System.out.println(s);

    }

    static String message(String text) {
        return "Message: " + text;
    }

    public static void exercise2() {
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int min = smallestOfThree(n1, n2, n3);
        System.out.println(min);
    }

    public static int smallestOfThree(int n1, int n2, int n3) {
        int min;
        int min1 = Math.min(n1, n2);
        int min2 = Math.min(min1, n3);
        if (min1 < min2) {
            min = min1;
        } else {
            min = min2;
        }
        return min;
    }

    public static void exercise3() {
        System.out.println("enter number");
        double n = scanner.nextDouble();
        String x = isNegative(n);
        System.out.println(x);
    }

    public static String isNegative(double n) {
        if (n < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    public static void exercise4() {
        double x = scanner.nextDouble();
        double x2 = square(x);
        System.out.println(x2);

    }

    public static double square(double n) {
        return Math.pow(n, 2);
    }

    public static void exercise5() {
        System.out.println("enter the number1: ");
        double n1 = scanner.nextDouble();
        System.out.println("enter the number2: ");
        double n2 = scanner.nextDouble();
        System.out.println("enter the operation(+, -, *, /): ");
        char x = scanner.next().charAt(0);
        System.out.println(myCalculator(n1, n2, x));
    }

    public static String myCalculator(double n1, double n2, char x) {
        double res;
        String total;
        switch (x) {
            case '+':
                res = n1 + n2;
                total = "Total: " + " " + n1 + " " + x + " " + n2 + " = " + res;
                break;
            case '-':
                res = n1 - n2;
                total = "Total: " + " " + n1 + " " + x + " " + n2 + " = " + res;
                break;
            case '*':
                res = n1 * n2;
                total = "Total: " + " " + n1 + " " + x + " " + n2 + " = " + res;
                break;
            case '/':
                res = n1 / n2;
                total = "Total: " + " " + n1 + " " + x + " " + n2 + " = " + res;
                break;
            default:
                total = "invalid operation";
        }
        return total;
    }

    public static void exercise6() {
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double a = averageOfThree(n1, n2, n3);
        System.out.println(a);
    }

    public static double averageOfThree(double n1, double n2, double n3) {
        double a = (n1 + n2 + n3) / 3;
        return a;
    }

    public static void exercise7() {
        String string = scanner.nextLine();
        System.out.println(middle(string));
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

    public static void exercise8() {
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int sum;
        for(sum = 0 ; n!=0 ; n/=10) {
            sum += n%10;
        }
        return sum;
    }


}
