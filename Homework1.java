import java.util.Scanner;

public class Homework1 {

        public static void main(String[] args) {

            exercise10();
        }
    private static void exercise1(){
        System.out.println("Hello");
        System.out.println("Yevgeniya Antonova");
    }
    private static void exercise2(){
        System.out.println(74+36);
    }

    private static void exercise3(){
            int a = 50, b = 3, c = a/b;
        System.out.println(c);

    }
    private static void exercise4(){
            int a, b, c, d;
            a = -5 + 8 * 6;
            b = (55 + 9) % 9;
            c = 20 + (-3) * 5 / 8;
            d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    private static void exercise5(){
            int n1 = 25, n2 = 5;
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
    }
    private static void exercise6(){
            int n1 = 125, n2 = 24, sum, subs, mult, div,mod;
            sum = n1 + n2;
            subs = n1 - n2;
            mult = n1 * n2;
            div = n1 / n2;
            mod = n1 % n2;
        System.out.println( n1 + " + " + n2 + " = " + sum);
        System.out.println( n1 + " - " + n2 + " = " + subs);
        System.out.println( n1 + " * " + n2 + " = " + mult);
        System.out.println( n1 + " / " + n2 + " = " + div);
        System.out.println( n1 + " mod " + n2 + " = " + mod);
    }

    private static void exercise7(){
            int t = 8, n;
            for (int i = 1; i <=10; i++){
                n = t * i;
                System.out.println(t + " * " + i + " = " + n);}
    }

    private static void exercise8(){
            String J = "J", a = "a", v = "v", V = "V";
         System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    private static void exercise9(){
            //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        double n = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(n);
    }

    private static void exercise10(){
            //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        double m;
         m = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(m);
    }





}
