import java.util.Scanner;

public class FourthToSixth {
    void main() {
        int odd = 0;
        int even = 0;

        int[][] a = {
                {24, 31, 99},
                {12, 83, 57}
        };

        for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    if(a[i][j] % 2 == 0) even++;
                    else odd++;
                }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


        int[][] arr = {
                {54, 76, 21},
                {73, 92, 18},
                {39, 82, 88}
        };
        int max = arr[0][0];
        int min = arr[0][0];

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
                if(min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("\nMax: " + max + ". Min: " + min);

        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to fill a matrix: ");

        int[][] array = new int [2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }




}
