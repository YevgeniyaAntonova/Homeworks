import java.util.Scanner;

public class Homework4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        exercise8();
    }
    public static void exercise1(){
        System.out.println("введите номер месяца (1-12)");
        int n = scanner.nextInt();
        switch (n){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }}
    public static void exercise2(){
        System.out.println("gender:");
        String g = scanner.next();
        switch(g){
            case "m":
                System.out.println("Мужчина");
                break;
            case "f":
                System.out.println("Женщина");
                break;
            default:
                System.out.println("gender is incorrect");
        }
    }
    public static void exercise3(){
        System.out.println("enter month (1-12):");
        int m = scanner.nextInt();
        int n;
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                n =31;
                System.out.println("count of days " + n);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                n = 30;
                System.out.println("count of days " + n);
                break;
            case 2:
                n = 28;
                System.out.println("count of days " + n);
                break;
            default:
                System.out.println("incorrect month");
        }
    }
    public static void exercise4(){
        System.out.println("введите номер действия (1-4):");
        int n = scanner.nextInt();
        System.out.println("введите числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double z;
        if (b != 0){
            switch(n){
                case 1:
                    z = a + b;
                    System.out.println(z);
                    break;
                case 2:
                    z = a - b;
                    System.out.println(z);
                    break;
                case 3:
                    z = a * b;
                    System.out.println(z);
                    break;
                case 4:
                    z = a / b;
                    System.out.println(z);
                    break;
                default:
                    System.out.println("действие не определено");
            }
        } else {
            System.out.println("b не должно быть равно 0!");
        }
    }
    public static void exercise5(){
        System.out.println("введите единицу длины (1-5): 1 — дециметр,\n" +  "2 — километр,\n" + "3 — метр,\n" + "4 — миллиметр,\n" + "5 — сантиметр:\n");
        int n = scanner.nextInt();
        System.out.println("введите длину отрезка:");
        double d = scanner.nextInt();
        double m;
        switch (n){
            case 1:
                m = d * 10;
                System.out.println(m + "м");
                break;
            case 2:
                m = d * 1000;
                System.out.println(m + "м");
                break;
            case 3:
                m = d;
                System.out.println(m + "м");
                break;
            case 4:
                m = d / 1000;
                System.out.println(m + "м");
                break;
            case 5:
                m = d / 100;
                System.out.println(m + "м");
                break;
            default:
                System.out.println("не определена единица длины");
        }
    }
    public static void exercise6(){
        System.out.println("введите единицу массы: 1 — килограмм, 2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер: ");
        int n = scanner.nextInt();
        System.out.println("введите массу в выбранной единице измерения: ");
        double m = scanner.nextDouble();
        double kg;
        switch (n){
            case 1:
                kg = m;
                System.out.println(kg + "кг");
                break;
            case 2:
                kg = m / 1000000;
                System.out.println(kg + "кг");
                break;
            case 3:
                kg = m / 1000;
                System.out.println(kg + "кг");
                break;
            case 4:
                kg = m *1000;
                System.out.println(kg + "кг");
                break;
            case 5:
                kg = m * 100;
                System.out.println(kg + "кг");
                break;
            default:
                System.out.println("не определена единица массы");
        }
    }
    public static void exercise7(){
        System.out.println("введите элемент окружности: 1 — радиус R; 2 — диаметр D ; 3 — длина L ; 4 — площадь круга S ");
        int n = scanner.nextInt();
        double r;
        double d;
        double l;
        double s;
        switch (n){
            case 1:
                System.out.println("введите R =");
                r = scanner.nextDouble();
                d = 2 * r;
                l = 2 * r * Math.PI;
                s = Math.PI * Math.pow(r,2);
                System.out.println("R = " + r);
                System.out.println("D = " + d);
                System.out.println("L = " + l);
                System.out.println("S = " + s);
                break;
            case 2:
                System.out.println("введите D = ");
                d = scanner.nextDouble();
                r = d / 2;
                l = d * Math.PI;
                s = Math.PI * Math.pow(r,2);
                System.out.println("R = " + r);
                System.out.println("D = " + d);
                System.out.println("L = " + l);
                System.out.println("S = " + s);
                break;
            case 3:
                System.out.println("введите L = ");
                l =scanner.nextDouble();
                r = l / (2 * Math.PI);
                d = 2 * r;
                s = Math.PI * Math.pow(r,2);
                System.out.println("R = " + r);
                System.out.println("D = " + d);
                System.out.println("L = " + l);
                System.out.println("S = " + s);
                break;
            case 4:
                System.out.println("введите S = ");
                s =scanner.nextDouble();
                r = Math.sqrt(s / Math.PI);
                d = 2 * r;
                l = d * Math.PI;
                System.out.println("R = " + r);
                System.out.println("D = " + d);
                System.out.println("L = " + l);
                System.out.println("S = " + s);
                break;
            default:
                System.out.println("элемент не определен");
        }
    }
    public static void exercise8(){
        System.out.println("выберите элемент: 1 — катет a, 2 — гипотенуза c, 3 — высота h, опущенная на гипотенузу, 4 — площадь S");
        int n = scanner.nextInt();
        double a;
        double c;
        double h;
        double s;
        switch(n){
            case 1:
                System.out.println("введите катет а = ");
                a = scanner.nextDouble();
                c = a * Math.sqrt(a);
                h = c / 2;
                s = c * h / 2;
                System.out.println("a = " + a);
                System.out.println("c = " +c);
                System.out.println("h = " + h);
                System.out.println("s = " + s);
                break;
            case 2:
                System.out.println("введите гипотенузу с = ");
                c = scanner.nextDouble();
                a = c / Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                System.out.println("a = " + a);
                System.out.println("c = " +c);
                System.out.println("h = " + h);
                System.out.println("s = " + s);
                break;
            case 3:
                System.out.println("введите высоту h = ");
                h = scanner.nextDouble();
                c = h * 2;
                a = c / Math.sqrt(2);
                s = c * h / 2;
                System.out.println("a = " + a);
                System.out.println("c = " +c);
                System.out.println("h = " + h);
                System.out.println("s = " + s);
                break;
            case 4:
                System.out.println("введите площадь S= ");
                s = scanner.nextDouble();
                c = 2 * Math.sqrt(s);
                h  = c / 2;
                a = c / Math.sqrt(2);
                System.out.println("a = " + a);
                System.out.println("c = " +c);
                System.out.println("h = " + h);
                System.out.println("s = " + s);
                break;
            default:
                System.out.println("не определен элемент");







        }
    }

}