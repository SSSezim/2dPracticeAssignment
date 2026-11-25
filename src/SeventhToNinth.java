import java.util.Scanner;
public class SeventhToNinth {
    void main() {

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);

        }

        Scanner scanner = new Scanner(System.in);

        int[][] array = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("\n");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > num) {
                    count++;
                }
            }
        }
        System.out.println("This many matrix values are greater than it: " + count);
        scanner.close();

        System.out.println("\n");

                int[][] a = {
                        {12, 45, 7},
                        {30, 45, 99}
                };
                int target = 45;

                boolean found = false;
                for (int i = 0; i < a.length && !found; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        if (a[i][j] == target) {
                            System.out.println("The matching element was found at row: " + i + ", column: " + j);
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    System.out.println("Not found");
                }
    }
}