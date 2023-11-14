import java.util.Scanner;

public class Homework2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exercise24();
    }

    public static void exercise1() {
        System.out.println("Введите n1 = ");
        double n1 = scanner.nextDouble();
        System.out.println("Введите n2 = ");
        double n2 = scanner.nextDouble();
        double n3 = Math.max(n1, n2);
        System.out.println("max between n1 and n2 = " + n3);
    }

    public static void exercise2() {
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double maximum;
        if (x > y && x > z) {
            maximum = x;
            System.out.println("max = " + maximum);

        } else if (y > x && y > z) {
            maximum = y;
            System.out.println("max = " + maximum);

        } else if (z > x && z > y) {
            maximum = z;
            System.out.println("max = " + maximum);
        } else {
            System.out.println("Все числа равны");
        }
    }

    public static void exercise3() {
        // 3. Write a  program to check whether a number is negative, positive or zero
        double x = scanner.nextDouble();
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is negative");
        }
    }

    public static void exercise4() {
        //***4. Write a  program to check whether a number is divisible by 5 and 11 or not**
        double n = scanner.nextDouble();
        double n5 = n % 5;
        double n11 = n % 11;
        if (n5 == 0 && n11 == 0) {
            System.out.println("number is divisible by 5 and 11");
        } else {
            System.out.println("number is not divisible by 5 and 11");
        }
    }

    public static void exercise5() {
        //Write a  program to check whether a number is even or odd
        int x = scanner.nextInt();
        double y = x % 2;
        if (y == 0) {
            System.out.println("number is even ");
        } else {
            System.out.println("number is odd ");
        }
    }

    public static void exercise6() {
        //6. Write a  program to check whether a year is leap year or not
        int year = scanner.nextInt();
        int x = year & 4;
        if (x == 0) {
            System.out.println("year is leap");
        } else {
            System.out.println("year is not leap");
        }
    }

    public static void exercise7() {
        //7. Write a program to check whether a character is alphabet or not
        char c = scanner.next().charAt(0);
        boolean isLowerCase = (c >= 'a' && c <= 'z');
        boolean isUpperCase = (c >= 'A' && c <= 'Z');
        if (isLowerCase || isUpperCase) {
            System.out.println(c + " is alphabetic");
        } else {
            System.out.println(c + " is not alphabetic");
        }
    }

    public static void exercise8() {
        //8. Write a  program to input any alphabet and check whether it is vowel or consonant
        char x = scanner.next().charAt(0);
        char y = Character.toLowerCase(x);
        boolean vowel = (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'y');
        if (vowel) {
            System.out.println("is vowel");
        } else {
            System.out.println("is consonant");
        }
    }

    public static void exercise9() {
        //9. Write a  program to input any character and check whether it is alphabet, digit or special character
        char c = scanner.next().charAt(0);
        boolean isABC = Character.isAlphabetic(c);
        boolean isDigit = Character.isDigit(c);
        if (isABC) {
            System.out.println("is alphabet");
        } else if (isDigit) {
            System.out.println("is digit");
        } else {
            System.out.println("is char");
        }
    }

    public static void exercise10() {
        char c = scanner.next().charAt(0);
        boolean isUpperCase = (c >= 'A' && c <= 'Z');
        boolean isLowerCase = (c >= 'a' && c <= 'z');
        if (isUpperCase) {
            System.out.println("is uppercase alphabet");
        } else if (isLowerCase) {
            System.out.println("is lowercase alphabet");
        } else {
            System.out.println("is not alphabet");
        }
    }

    public static void exercise11() {
        int n = scanner.nextInt();
        if (n > 0 && n < 8) {
            if (n == 1) {
                System.out.println("Monday");
            } else if (n == 2) {
                System.out.println("Tuesday");
            } else if (n == 3) {
                System.out.println("Wensday");
            } else if (n == 4) {
                System.out.println("Thursday");
            } else if (n == 5) {
                System.out.println("Friday");
            } else if (n == 6) {
                System.out.println("Saturday");
            } else if (n == 7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("is not a week day");
        }
    }

    public static void exercise12() {
        int n = scanner.nextInt();
        if (n > 0 && n < 13) {
            if (n == 1) {
                System.out.println("January");
            } else if (n == 2) {
                System.out.println("Febrary");
            } else if (n == 3) {
                System.out.println("March");
            } else if (n == 4) {
                System.out.println("April");
            } else if (n == 5) {
                System.out.println("May");
            } else if (n == 6) {
                System.out.println("June");
            } else if (n == 7) {
                System.out.println("July");
            } else if (n == 8) {
                System.out.println("August");
            } else if (n == 9) {
                System.out.println("September");
            } else if (n == 10) {
                System.out.println("October");
            } else if (n == 11) {
                System.out.println("November");
            } else {
                System.out.println("December");
            }
        } else {
            System.out.println("is not a month");
        }
    }

    public static void exercise13() {
        int n = scanner.nextInt();
        // сколько банкнот разными номиналами в введенной сумме
        int tg2000 = n / 2000;
        int tg1000 = n / 1000;
        int tg500 = n / 500;
        int tg200 = n / 200;
        int tg100 = n / 100;
        int tg50 = n / 50;
        int tg20 = n / 20;
        int tg5 = n / 5;
        /*System.out.println("2000tg = " + tg2000);
        System.out.println("1000tg = " + tg1000);
        System.out.println("500tg = " + tg500);
        System.out.println("100tg = " + tg100);
        System.out.println("50tg = " + tg50);
        System.out.println("20tg = " + tg20);
        System.out.println("5tg = " + tg5);*/
        //как выдать заданную сумму минимальным количеством банкнот
        int tg2000_ = n / 2000;
        if (tg2000_ > 0) {
            System.out.println("2000tg = " + tg2000_);
        }
        int tg1000_ = (n - tg2000_ * 2000) / 1000;
        if (tg1000_ > 0) {
            System.out.println("1000tg = " + tg1000_);
        }
        int tg500_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000)) / 500;
        if (tg500_ > 0) {
            System.out.println("500tg = " + tg500_);
        }
        int tg200_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500)) / 200;
        if (tg200_ > 0) {
            System.out.println("200tg = " + tg200_);
        }
        int tg100_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500) - (tg200_ * 200)) / 100;
        if (tg100_ > 0) {
            System.out.println("100tg = " + tg100_);
        }
        int tg50_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500) - (tg200_ * 200) - (tg100_ * 100)) / 50;
        if (tg50_ > 0) {
            System.out.println("50tg = " + tg50_);
        }
        int tg20_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500) - (tg200_ * 200) - (tg100_ * 100) - (tg50_ * 50)) / 20;
        if (tg20_ > 0) {
            System.out.println("20tg = " + tg20_);
        }
        int tg10_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500) - (tg200_ * 200) - (tg100_ * 100) - (tg50_ * 50) - (tg20_ * 20)) / 10;
        if (tg10_ > 0) {
            System.out.println("10tg = " + tg10_);
        }
        int tg5_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500) - (tg200_ * 200) - (tg100_ * 100) - (tg50_ * 50) - (tg20_ * 20) - (tg10_ * 10)) / 5;
        if (tg5_ > 0) {
            System.out.println("5tg = " + tg5_);
        }
        int tg1_ = (n - (tg2000_ * 2000) - (tg1000_ * 1000) - (tg500_ * 500) - (tg200_ * 200) - (tg100_ * 100) - (tg50_ * 50) - (tg20_ * 20) - (tg10_ * 10) - (tg5_ * 5));
        if (tg1_ > 0) {
            System.out.println("1tg = " + tg1_);
        }
    }

    public static void exercise14() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x + y + z == 180) {
            System.out.println("triangle is valid");
        } else {
            System.out.println("triangle is not valid");
        }
    }

    public static void exercise15() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("triangle is valid");
        } else {
            System.out.println("triangle is not valid");
        }
    }

    public static void exercise16() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("triangle is equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("triangle is isosceles");
        } else {
            System.out.println("triangle is scalene");
        }
    }

    public static void exercise17() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("no roots of a quadratic equation");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void exercise18() {
        System.out.println("selling price = ");
        double sellingPrice = scanner.nextDouble();
        System.out.println("cost price = ");
        double costPrice = scanner.nextDouble();
        double profit = sellingPrice - costPrice;
        double loss = costPrice - sellingPrice;
        if (profit > loss) {
            System.out.println("Profit = " + profit);
        } else {
            System.out.println("Loss = " + loss);
        }
    }

    public static void exercise19() {
        System.out.println("Physics mark = ");
        int markP = scanner.nextInt();
        System.out.println("Chemistry mark = ");
        int markCh = scanner.nextInt();
        System.out.println("Biology mark = ");
        int markB = scanner.nextInt();
        System.out.println("Mathematics mark = ");
        int markM = scanner.nextInt();
        System.out.println("Computer mark = ");
        int markC = scanner.nextInt();
        {
            System.out.println("Physics:");
            if (markP >= 90) {
                System.out.println("Grade A");
            } else if (markP >= 80) {
                System.out.println("Grade B");
            } else if (markP >= 70) {
                System.out.println("Grade C");
            } else if (markP >= 60) {
                System.out.println("Grade D");
            } else if (markP >= 40) {
                System.out.println("Grade E");
            } else if (markP < 40) {
                System.out.println("Grade F");
            }
        }

        {
            System.out.println("Chemistry:");
            if (markCh >= 90) {
                System.out.println("Grade A");
            } else if (markCh >= 80) {
                System.out.println("Grade B");
            } else if (markCh >= 70) {
                System.out.println("Grade C");
            } else if (markCh >= 60) {
                System.out.println("Grade D");
            } else if (markCh >= 40) {
                System.out.println("Grade E");
            } else if (markCh < 40) {
                System.out.println("Grade F");
            }
        }
        {
            System.out.println("Biology:");
            if (markB >= 90) {
                System.out.println("Grade A");
            } else if (markB >= 80) {
                System.out.println("Grade B");
            } else if (markB >= 70) {
                System.out.println("Grade C");
            } else if (markB >= 60) {
                System.out.println("Grade D");
            } else if (markB >= 40) {
                System.out.println("Grade E");
            } else if (markB < 40) {
                System.out.println("Grade F");
            }
        }
        {
            System.out.println("Mathematics:");
            if (markM >= 90) {
                System.out.println("Grade A");
            } else if (markM >= 80) {
                System.out.println("Grade B");
            } else if (markM >= 70) {
                System.out.println("Grade C");
            } else if (markM >= 60) {
                System.out.println("Grade D");
            } else if (markM >= 40) {
                System.out.println("Grade E");
            } else if (markM < 40) {
                System.out.println("Grade F");
            }
        }
        {
            System.out.println("Computer:");
            if (markC >= 90) {
                System.out.println("Grade A");
            } else if (markC >= 80) {
                System.out.println("Grade B");
            } else if (markC >= 70) {
                System.out.println("Grade C");
            } else if (markC >= 60) {
                System.out.println("Grade D");
            } else if (markC >= 40) {
                System.out.println("Grade E");
            } else if (markC < 40) {
                System.out.println("Grade F");
            }
        }
    }

    public static void exercise20() {
        double salary = scanner.nextDouble();
        double grossSalary;
        if (salary <= 10000) {
            double hra = salary * 0.20;
            double da = salary * 0.80;
            grossSalary = salary + hra + da;
            System.out.println("gross salary  =" + grossSalary);
        } else if (salary <= 20000) {
            double hra = salary * 0.25;
            double da = salary * 0.90;
            grossSalary = salary + hra + da;
            System.out.println("gross salary  =" + grossSalary);
        } else {
            double hra = salary * 0.30;
            double da = salary * 0.95;
            grossSalary = salary + hra + da;
            System.out.println("gross salary  =" + grossSalary);
        }
    }

    public static void exercise21() {
        int unit = scanner.nextInt();
        double bill;
        double total_bill;
        if (unit <= 50) {
            bill = unit * 0.5;
            total_bill = bill + bill * 0.20;
            System.out.println("total bill = " + total_bill);
        } else if (unit > 50 && unit <= 200) {
            bill = (50 * 0.5) + (unit - 50) * 0.75;
            total_bill = bill + bill * 0.20;
            System.out.println("total bill = " + total_bill);
        } else if (unit > 200 && unit <= 450) {
            bill = (50 * 0.5) + (150 * 0.75) + ((unit - 200) * 1.2);
            total_bill = bill + bill * 0.20;
            System.out.println("total bill = " + total_bill);
        } else if (unit > 450) {
            bill = (50 * 0.5) + (150 * 0.75) + (250 * 1.2) + ((unit - 450) * 1.5);
            total_bill = bill + bill * 0.20;
            System.out.println("total bill = " + total_bill);
        }
    }
        public static void exercise22() {
            System.out.println("count = ");
            int count = scanner.nextInt();
            System.out.println("price = ");
            double price = scanner.nextDouble();
            double total;
            if (count >= 100) {
                total = (count * price) - (count * price) * 0.10;
                System.out.println("total = " + total);
            } else {
                total = count * price;
                System.out.println("total = " + total);
            }
        }

        public static void exercise23() {
            System.out.println("current year ");
            int cur_year = scanner.nextInt();
            System.out.println("joined year ");
            int j_year = scanner.nextInt();
            int n = cur_year - j_year;
            if (n > 3) {
                int bonus = 2500;
                System.out.println("bonus = " + bonus);
            } else {
            }
            ;
        }

        public static void exercise24() {
            double salary = scanner.nextDouble();
            double hra;
            double da;
            double gross_salary;
            if (salary < 1500) {
                hra = salary * 0.10;
                da = salary * 0.90;
                gross_salary = salary + hra + da;
                System.out.println("gross_salary = " + gross_salary);
            } else {
                hra = 500;
                da = salary * 0.98;
                gross_salary = salary + hra + da;
                System.out.println("gross_salary = " + gross_salary);
            }
        }
    }



