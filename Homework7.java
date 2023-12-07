import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Homework7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise27();
    }

    public static void exercise1() {
        int[] arr = {5, 11, 22, 33, 44};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void exercise2() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double aver;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        aver = sum / 5;
        System.out.println("Sum of Array Value: " + sum);
        System.out.println("Average of Array Value : " + aver);
    }

    public static void exercise3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("Sum Values of Array = " + sum);
    }

    public static void exercise4() {
        int[] arr = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void exercise5() {
        int[] arr = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void exercise6() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 3);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void exercise7() {
        int[] arr = {23, 32, 5, 5, 64, 32};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("min = %d, max = %d", min, max);
    }

    public static void exercise8() {
        int[] arr = {23, 45, 67, 34, 78};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void exercise9() {
        int arr[] = {23, 45, 89, 34, 12};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void exercise10() {
        int arr[] = {12, 34, 59, 45, 22};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void exercise11() {
        int[] arr = {56, 78, 45, 79, 34};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void exercise12() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 3);
        }
        System.out.println(sum);
    }

    public static void exercise13() {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void exercise14() {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};
        int n = arr1.length + arr2.length;
        int arrM[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arrM[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < n; i++, j++) {
            arrM[i] = arr2[j];
        }
        System.out.println(Arrays.toString(arrM));
    }

    public static void exercise15() {
        int[] arr = {67, -4, 3, -5, 44};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void exercise16() {
        int[] arr = {-45, 32, -7, 3, -6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void exercise17() {
        int[] arr = {1, -2, 3, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void exercise18() {
        int[] arr = {10, -23, 45, -10, 30};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void exercise19() {
        int[] arr = {10, 20, 30, 40, 50};
        int element = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element is Found in the Position = " + (i + 1));
                System.out.println("Element is Found in the Index = " + i);
                return;
            }
        }
    }

    public static void exercise20() {
        int[] arr = {10, 10, 20, 20, 30};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                if (arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void exercise21() {
        int[] arr = {10, 20, 40, 20, 10};
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                if (arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void exercise22() {
        int[] arr = {10, 20, 5, 2, 30};
        int n = arr.length;
        int min2 = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[i + 1]) {
                min2 = arr[i + 1];
                System.out.println(min2);
                break;
            }
        }
    }

    public static void exercise23() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int n = 0;
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                n++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                k++;
            }
        }
        int[] arr3 = new int[n + k];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr3[j] = arr1[i];
                j++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                arr3[j] = arr2[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void exercise24() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int n = 0;
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                n++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 != 0) {
                k++;
            }
        }
        int[] arr3 = new int[n + k];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr3[j] = arr1[i];
                j++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 != 0) {
                arr3[j] = arr2[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void exercise25() {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 30, 60, 50, 70};
        int n = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (arr1[j] == arr2[i]) {
                    System.out.println(arr1[j]);
                }
        }
    }

    public static void exercise26() {
        int[] arr = {10, 20, 45, 30, 40, 40, 50, 50};
        int l2 = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != arr[i - 1]) {
                l2 = arr[i - 1];
                break;
            }
        }
        System.out.println(l2);
    }

    public static void exercise27() {
        int[] arr = {1, 2, 4, 5, 6, 7};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                arr[i] = arr[i - 1] + 1;
                System.out.printf("Missing Array Number = %d", arr[i]);
                break;
            }
        }
    }
}





