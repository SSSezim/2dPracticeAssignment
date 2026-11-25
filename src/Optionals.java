public class Optionals {
    public static void main(String[] args) {
        int[][] array = {
                {5, 4, 5, 3},
                {3, 3, 4, 5},
                {5, 5, 4, 4}
        };

        int bestRow = 0;
        int bestSum = array[0][0] + array[0][1] + array[0][2] + array[0][3];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > bestSum) {
                bestSum = sum;
                bestRow = i;
            }
        }

        System.out.println("Row " + bestRow + " has the largest sum: " + bestSum);

//SECOND TASK
                int[][] arr = {
                        {1, 2, 3},
                        {4, 5, 6}
                };

                int[][] t = new int[3][2];

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        t[j][i] = arr[i][j];
                    }
                }

        System.out.println("\n");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(t[i][j] + " ");
                    }
                    System.out.println();
                }

    //THIRD TASK
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] b = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][] c = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
