import java.util.Scanner;

public class Homework3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        exercise39();
    }
    public static void exercise25(){
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
        int mark5 = scanner.nextInt();
        if (mark1 >= 60){
            System.out.println("mark1 --> First division" );
        } else if (mark1 < 60 && mark1 >= 50){
            System.out.println("mark1 --> Second division" );
        } else if (mark1 < 50 && mark1 >= 40){
            System.out.println("mark1 --> Third division" );
        } else {
            System.out.println("mark1 --> Fail");
        }
        if (mark2 >= 60){
            System.out.println("mark2 --> First division" );
        } else if (mark2 < 60 && mark2 >= 50){
            System.out.println("mark2 --> Second division" );
        } else if (mark2 < 50 && mark2 >= 40){
            System.out.println("mark2 --> Third division" );
        } else {
            System.out.println("mark2 --> Fail");
        }
        if (mark3 >= 60){
            System.out.println("mark3 --> First division" );
        } else if (mark3 < 60 && mark3 >= 50){
            System.out.println("mark3 --> Second division" );
        } else if (mark3 < 50 && mark3 >= 40){
            System.out.println("mark3 --> Third division" );
        } else {
            System.out.println("mark3 --> Fail");
        }
        if (mark4 >= 60){
            System.out.println("mark4 --> First division" );
        } else if (mark4 < 60 && mark4 >= 50){
            System.out.println("mark4 --> Second division" );
        } else if (mark4 < 50 && mark4 >= 40){
            System.out.println("mark4 --> Third division" );
        } else {
            System.out.println("mark4 --> Fail");
        }
        if (mark5 >= 60){
            System.out.println("mark5 --> First division" );
        } else if (mark5 < 60 && mark5 >= 50){
            System.out.println("mark5 --> Second division" );
        } else if (mark5 < 50 && mark5 >= 40){
            System.out.println("mark5 --> Third division" );
        } else {
            System.out.println("mark5 --> Fail");
        }
    }

    public static void exercise26(){
        System.out.println("driver is married (true/false)");
        boolean x = scanner.nextBoolean();
        if (x == true) {
            System.out.println("driver is insured");}
        else {
            System.out.println("driver is male (true/false)");
            boolean isMale = scanner.nextBoolean();
            System.out.println("enter age");
            int age = scanner.nextInt();
            if (isMale == true){
                if (age >= 30) {
                    System.out.println("driver is insured");
                }else{
                    System.out.println("driver is not insured");
                }
            } else {
                if (age >= 25){
                    System.out.println("driver is insured");
                }else{
                    System.out.println("driver is not insured");
                }
            }
        }
    }
    public static void exercise27() {
        System.out.println("enter gender (male/female):");
        String gender = scanner.nextLine();
        System.out.println("enter Qualifications");
        String qual = scanner.nextLine();
        System.out.println("enter years");
        int years = scanner.nextInt();
        int salary;
        switch (gender) {
            case "male":
                switch (qual) {
                    case "Post - Graduate":
                        if (years >= 10) {
                            salary = 15000;
                        } else {
                            salary = 10000;
                        }
                        System.out.println("salary = " + salary);
                        break;
                    case "Graduate":
                        if (years >= 10) {
                            salary = 10000;
                        } else {
                            salary = 7000;
                        }
                        System.out.println("salary = " + salary);
                        break;
                    default:
                        System.out.println("incorrect qualifications");
                }
                break;
            case "female":
                switch (qual) {
                    case "Post - Graduate":
                        if (years >= 10) {
                            salary = 12000;
                        } else {
                            salary = 10000;
                        }
                        System.out.println("salary = " + salary);
                        break;
                    case "Graduate":
                        if (years >= 10) {
                            salary = 9000;
                        } else {
                            salary = 6000;
                        }
                        System.out.println("salary = " + salary);
                        break;
                    default:
                        System.out.println("incorrect qualifications");
                }
                break;
            default:
                System.out.println("incorrect gender");
        }
    }
        public static void exercise28(){
            int abcdf = scanner.nextInt();
            int a = abcdf / 10000;
            int b = (abcdf / 1000) % 10;
            int c = (abcdf / 100) % 10;
            int d = (abcdf / 10) % 10;
            int f = abcdf % 10;
            int fdcba = f * 10000 + d * 1000 + c * 100 + b * 10 + a;
            System.out.println(fdcba);
            if (abcdf == fdcba){
                System.out.println("числа равны");
            } else{}

        }
        public static void exercise29(){
            System.out.println("age of Ram");
            int ageR = scanner.nextInt();
            System.out.println("age of Shyam ");
            int ageS = scanner.nextInt();
            System.out.println("age of Ajay ");
            int ageAj = scanner.nextInt();
            if (ageR < ageS && ageR < ageAj){
                System.out.println("Ram is youngest");
            } else if (ageS < ageR && ageS < ageAj){
                System.out.println("Shyam is youngest");
            } else if (ageAj < ageR && ageAj < ageS){
                System.out.println("Ajay is youngest");
            } else {}
        }
        public static void exercise30(){
            System.out.println("enter angles:");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int n = x + y + z;
            if (n == 180){
                System.out.println("triangle is valid");
            } else {
                System.out.println("triangle is not valid");
            }
        }
        public static void exercise31(){
        double n = scanner.nextDouble();
        double abs = Math.abs(n);
            System.out.println("|n| = " + abs);
        }
        public static void exercise32(){
            System.out.println("Введите длину: ");
        double l = scanner.nextDouble();
            System.out.println("Введите ширину:");
        double d = scanner.nextDouble();
        double P = (l + d) * 2;
        double S = l * d;
        if (S > P){
            System.out.println("Площадь треугольника больше его периметра");
        } else {
            System.out.println("Площадь треугольника не больше его периметра");
        }
        }
        public static void exercise33(){
            System.out.println("enter values of hardness");
            double h = scanner.nextDouble();
            System.out.println("enter values of carbon content");
            double c = scanner.nextDouble();
            System.out.println("enter values of tensile strength");
            double t = scanner.nextDouble();
            if (h > 50 && c < 0.7 && t > 5600){
                System.out.println("grade is 10");
            } else if (h > 50 && c < 0.7 && t <= 5600){
                System.out.println("grade is 9");
            }else if (c < 0.7 && t > 5600 && h<= 50){
                System.out.println("grade is 8");
            }else if (h > 50 && t > 5600 && c >= 0.7){
                System.out.println("grade is 7");
            } else if (h > 50 || t > 5600 || c < 0.7)
            {
                System.out.println("grade is 6");
            } else {
                System.out.println("grade is 5");
            }
        }
        public static void exercise34(){
            System.out.println("enter days:");
        int days = scanner.nextInt();
        if (days <= 5){
            System.out.println("fine is 50 paise");
        } else if (days <= 10){
            System.out.println("fine is 1 rupee");
        } else if (days > 10) {
            System.out.println("fine is 5 rupees");
        }
        if (days >= 30){
            System.out.println("your membership has been cancelled");
        }
        }
        public static void exercise35(){
            System.out.println("enter hours:");
            int h = scanner.nextInt();
            if (h >= 2 && h <= 3){
                System.out.println("highly efficient");
            } else if (h > 3 && h <= 4){
                System.out.println("ordered to improve speed");
            } else if (h > 4 && h <= 5){
                System.out.println("training to improve speed");
            }else {
                System.out.println("leave the company");
            }
        }
        public static void exercise36(){
            System.out.println("enter numbers");
            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            double n3 = scanner.nextDouble();
            if (n1 == n2 && n2 == n3){
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal");
            }
        }
        public static void exercise37(){
        String n = scanner.next();
        int x = n.length();
            System.out.println("count of digits: " + x);
        }
        public static void exercise38(){
            System.out.println("enter numbers: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        if (n1 < n2 && n2 < n3){
            System.out.println("numbers are in \"increasing\" order");
        } else if (n1 > n2 && n2 > n3) {
            System.out.println("numbers are in \"decreasing\" order");
        } else {
            System.out.println("numbers are not in order");
        }
    }

            public static void exercise39(){
                System.out.println("enter number: ");
            int n = scanner.nextInt();
            int x = n % 5;
            if (x == 0){
                System.out.println("the given integer is a multiple of 5");
            } else {
                System.out.println(" the given integer is not a multiple of 5");
            }
            }



}