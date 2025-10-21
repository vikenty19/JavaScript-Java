import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InterviewEx1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        int i = 1;
        System.out.println("Fibanocci series:");
        while (i < 9) {
            sum = a + b;
            System.out.print(sum + "\t");
            a = b;
            b = sum;
            i++;
        }
        int c = 5;
        int d = 9;
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println();
        //    System.out.println("Swap the variables c = " + c + " d =" + d);

        //     isNumberPrime(31);
        //     System.out.println(isNumberPrimeBoolean(31));
        int[][] qqq = {{7, 4, 31}, {-2, 0}, {12, 3}};
        //     findMinAndMaxValueInArray(qqq);
        //      System.out.println(isPalindrom("Madam"));
        int[] abs = {1, 1, 2,2, 3, 5, 7, 7};
   //     uniqueNumberInArray(abs);
   //     uniqueNumberArray(abs);
        findTheOnlyNumber(abs);
    }

    public static void isNumberPrime(int q) {
        boolean flag = false;
        if (q <= 2) {
            System.out.println("It is not a Prime number");
        }
        if (q > 2) {
            for (int i = 3; i <= q / 2; i++) {
                if (q % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("It is not a Prime number");
            } else {
                System.out.println("It is  a Prime number");
            }
        }
    }

    public static boolean isNumberPrimeBoolean(int q) {
        boolean flag = true;
        if (q <= 2) {
            flag = false;

        }
        if (q > 2) {
            for (int i = 3; i <= q / 2; i++) {
                if (q % i == 0) {
                    flag = false;
                    break;
                }
            }

        }
        return flag;
    }

    public static void findMinAndMaxValueInArray(int[][] abc) {
        int min = abc[0][0];
        int max = abc[0][0];
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                }
            }
        }
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                if (abc[i][j] > max) {
                    max = abc[i][j];
                }
            }
        }
        System.out.println("Min value is  " + min + "  Max value is  " + max);
    }

    public static boolean isPalindrom(String example) {
        boolean flag = true;
        String reverse = "";
        for (int e = example.length() - 1; e >= 0; e--) {
            reverse = reverse + example.charAt(e);
        }
        if (reverse.equalsIgnoreCase(example)) {
            System.out.println(reverse);

        } else {
            flag = false;
        }
        return flag;
    }

    public static void uniqueNumberInArray(int[] abs) {

        HashSet<Integer> unique = new HashSet<>();
        for (int temp : abs) {
            unique.add(temp);
        }
        System.out.println(unique);
    }

    public static void uniqueNumberArray(int[] abs) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i < abs.length; i++) {
            if (!unique.contains(abs[i])) {
                unique.add(abs[i]);
            }
        }
        //back in array
        int[] result = new int[unique.size()];
        for (int j = 0; j < unique.size(); j++) {
            result[j] = unique.get(j);
        }
        for (int n : result) {
            System.out.print(n + " ");
        }

    }

    public static void findTheOnlyNumber(int[] abc) {

        ArrayList<Integer> only = new ArrayList<>();
        for (int i = 0; i < abc.length; i++) {
            int count = 0;//count number of repetition of numbers
            if (!only.contains(abc[i])) {
                only.add(abc[i]);
                count++;//first time
                for (int j = i+1; j < abc.length; j++) {

                    if (abc[i] == abc[j]) {
                        count++;//repeated number
                    }
                }

            }//pick up the only number
            if (count == 1) {
                System.out.println(abc[i]);
            }
        }

    }
}
