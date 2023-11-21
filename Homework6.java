import java.util.Scanner;

public class Homework6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise6();

    }

    public static void exercise1() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Please, enter  number " + i + ": ");
            int n = scanner.nextInt();
            sum += n;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static void exercise2() {
        System.out.println("enter amount of numbers N = ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Please, enter  number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static void exercise3() {
        System.out.println("Please enter number: ");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        String text = "1";
        for (int j = 2; j <= n; j++) {
            text = text + " * " + j;
        }
        System.out.println("Factorial " + n + "! = " + text + " = " + factorial);
    }

    public static void exercise4_1(){
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello World");
        }
    }

    public static void exercise4_2()

    {
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }
    }

    public static void exercise4_3()

    {
        for (int j = 1; j <= 10; j++) {
            System.out.println("a*");
        }
    }
    public static void exercise4_4(){
        int l = 5;
        while ( l >= -5){
            System.out.println(l);
            l--;
        }
    }
    public static void exercise4_5(){
        int n = 5;
        while(n <= 30){
            System.out.println(n);
            n+=3;
        }
    }
    public static void exercise5(){
        int n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("I am now printing for the " + i + "th time");
        }
    }
    public static void exercise6(){
        int n = scanner.nextInt();
        double amount = 0;
        int i = 1;
        while (i <= n){
            amount = amount +  (1* 0.1)/i ;
            i++;
        }
        System.out.println(amount);
    }
}