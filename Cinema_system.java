import java.util.Arrays;
import java.util.Scanner;

public class Cinema_system {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cinema();

    }

    public static void cinema() {
        System.out.println("Enter rows number:");
        int rows = scanner.nextInt();
        System.out.println("Enter seats number");
        int seats = scanner.nextInt();
        char[][] arr = new char[rows][seats];
        int price = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                arr[i][j] = 'S';
            }
        }
        int bookedSeats=0;
        seating_scheme(rows, seats, arr);
        System.out.println();
        menu(rows, seats, arr, bookedSeats, price);



    }

    public static void seating_scheme(int rows, int seats, char[][] arr) {
        System.out.println("Cinema:");
        for (int k = 0; k < seats; k++) {
            if (k == 0) {
                System.out.print("    ");
            }
            System.out.printf("%5d", k + 1);
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.printf("%4d", i + 1);
            for (int j = 0; j < seats; j++) {
                System.out.printf(" %4s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int tickets(int rows, int seats, char[][] arr, int bookedSeats, int price) {
        int isSuccess = 0;
        do{
        System.out.println("Enter row:");
        int r = scanner.nextInt();
        System.out.println("Enter seat:");
        int s = scanner.nextInt();
        if (r < 1 || r > rows || s < 1 || s > seats) {
            System.out.println("Such seat doesn't exist");
            isSuccess = 0;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < seats; j++) {
                    if (i == r - 1 && j == s - 1) {
                        if (arr[i][j] == 'B') {
                            System.out.println("This seat is already booked");
                            isSuccess = 0;
                        } else {
                            arr[i][j] = 'B';
                            System.out.println("Price: " + price + "$");
                            bookedSeats++;
                            isSuccess = 1;
                        }
                    }
                }
            }
        }} while(isSuccess != 1);
        return bookedSeats;

    }
    public static boolean hasFreeSeats(int rows, int seats, int bookedSeats){
        return bookedSeats < rows * seats;
    }

    public static void printMenu() {
        System.out.println("1. Print seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Show statistics");
        System.out.println("0. Exit");
    }

    public static void menu(int rows, int seats, char[][] arr, int bookedSeats, int price) {
        int menuNum;
        do {
            printMenu();
             menuNum = scanner.nextInt();
            int n = switch (menuNum) {
                case 1:
                    seating_scheme(rows, seats, arr);
                    yield 1;
                case 2:

                    if (hasFreeSeats(rows, seats, bookedSeats)){
                    bookedSeats = tickets(rows, seats, arr,bookedSeats, price);

                    } else{
                        System.out.println("All seats are booked!");
                        yield 0;
                  }
                    yield 2;
                case 3:
                    showStatistics(rows, seats, bookedSeats, price);
                    yield 3;
                case 0:
                    yield 0;
                 default:
                     System.out.println("Wrong input!");
                     yield 0;
            };
        } while (menuNum != 0);
    }
    public static void showStatistics(int rows, int seats, int bookedSeats, int price){
        int totalSeats = rows * seats;
        int freeSeats = rows * seats - bookedSeats;
        int currentIncome = bookedSeats * price;
        int totalIncome = totalSeats * price;
        System.out.printf("Current income: %d$%n", currentIncome);
        System.out.printf("Total income: %d$%n", totalIncome);
        System.out.printf("Number of free seats: %d%n", freeSeats);
        System.out.printf("Total number of seats: %d%n", totalSeats);






    }


}