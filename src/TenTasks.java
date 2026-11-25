import java.util.Scanner;
public class TenTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print numbers at even indices
        int[] a1 = {4, 7, 9, 2, 5, 8, 1, 6};
        System.out.print("Task 1: ");
        for (int i = 0; i < a1.length; i += 2) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();

        // 2. Sum of positive numbers
        int[] a2 = {3, -2, 0, 7, -4, 5, 1, -8, 6, 2};
        int sum2 = 0;
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] > 0) {
                sum2 += a2[i];
            }
        }
        System.out.println("Task 2: Sum: " + sum2);

        // 3. Count values in a range
        int[] a3 = new int[8];
        System.out.println("Task 3: enter 8 integers:");
        for (int i = 0; i < a3.length; i++) {
            a3[i] = sc.nextInt();
        }
        int count3 = 0;
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] >= 10 && a3[i] <= 20) {
                count3++;
            }
        }
        System.out.println("Count: " + count3);

        // 4. Find minimum and its index
        int[] a4 = {8, 3, 5, 3, 9, 2, 6};
        int min = a4[0];
        int minIndex = 0;
        for (int i = 1; i < a4.length; i++) {
            if (a4[i] < min) {
                min = a4[i];
                minIndex = i;
            }
        }
        System.out.println("Task 4: Min: " + min + ", index: " + minIndex);

        // 5. Add 5 to every element
        int[] a5 = {1, 4, -2, 0, 8, 3};
        for (int i = 0; i < a5.length; i++) {
            a5[i] += 5;
        }
        System.out.print("Task 5: ");
        for (int i = 0; i < a5.length; i++) {
            System.out.print(a5[i] + " ");
        }
        System.out.println();

        // 6. Compare with the first element
        int[] a6 = {6, 9, 3, 8, 6, 10, 2, 7};
        int count6 = 0;
        for (int i = 1; i < a6.length; i++) {
            if (a6[i] > a6[0]) {
                count6++;
            }
        }
        System.out.println("Task 6: Count: " + count6);

        // 7. Copy only even numbers
        int[] a7 = {3, 8, 5, 2, 7, 4, 9, 6};
        int[] evens = new int[a7.length];
        int n = 0;
        for (int i = 0; i < a7.length; i++) {
            if (a7[i] % 2 == 0) {
                evens[n] = a7[i];
                n++;
            }
        }
        System.out.print("Task 7: ");
        for (int i = 0; i < n; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();

        // 8. Weekly temperatures
        int[] t = {18, 20, 22, 19, 21, 24, 16};
        int sum8 = 0;
        for (int i = 0; i < t.length; i++) {
            sum8 += t[i];
        }
        double average = (double) sum8 / t.length;
        int above = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > average) {
                above++;
            }
        }
        System.out.println("Task 8: Average: " + average + "; above: " + above);

        // 9. Print a 2D timetable
        int[][] m9 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Task 9:");
        for (int i = 0; i < m9.length; i++) {
            for (int j = 0; j < m9[i].length; j++) {
                System.out.print(m9[i][j] + " ");
            }
            System.out.println();
        }

        // 10. Count zeros in a matrix
        int[][] m10 = {
                {0, 2, 3},
                {4, 0, 6},
                {0, 8, 0}
        };
        int zeros = 0;
        for (int i = 0; i < m10.length; i++) {
            for (int j = 0; j < m10[i].length; j++) {
                if (m10[i][j] == 0) {
                    zeros++;
                }
            }
        }
        System.out.println("Task 10: Zeros: " + zeros);

        sc.close();
    }
}
