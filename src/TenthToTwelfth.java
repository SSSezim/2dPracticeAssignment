import java.util.Scanner;
public class TenthToTwelfth {
    void main() {
        int[][] a = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        System.out.println("\nSum of diagonal numbers: " + sum);

        int[][] arr = {
                {-21, 34, -99},
                {-111, 0, 67},
                {50, -1, 88}
        };

        System.out.println("\nOriginal array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("{");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < 0) arr[i][j] = 0;
            }
        }
        System.out.println("\nChanged to 0: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("{");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][4];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\narray[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int max = array[0][0];
        int totalSum = 0;


        for (int i = 0; i < array.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum1 += array[i][j];
                totalSum += array[i][j];
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            double average = (double) sum1 / array[i].length;
            System.out.println("Student " + (i + 1) + " average: " + average);
        }

        double overallAver = (double) totalSum / (array.length * array[0].length);

        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overallAver);


    }
}
