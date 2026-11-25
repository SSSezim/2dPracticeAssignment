import org.w3c.dom.ls.LSOutput;

void main(){
        int[][] a = {
                {1, 23, 56},
                {76, 19, 45},
                {0, 78, 11}

        };
        for(int i = 0; i < a.length; i++){
                System.out.print("{");
                for(int j = 0; j < a[i].length; j++){
                        System.out.print(" " + a[i][j] + " ");
                }
                System.out.print("}");
                System.out.println();
        }

        int [][] array = {
                {5, 10, 15},
                {20, 25, 30}
        };
        // {
                        System.out.println("\n" + array[1][2]);
               // }
       // }

        array[0][1] = 99;
        for(int i = 0; i < array.length; i++){
                System.out.print("{");
                for(int j = 0; j < array[i].length; j++){
                        System.out.print(" " + array[i][j] + " ");
                }
                System.out.print("}");
                System.out.println();
        }

        int[][] arr = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                        sum += arr[i][j];
                }
        }
        System.out.println("\n");
        for(int i = 0; i < arr.length; i++){
                System.out.print("{");
                for(int j = 0; j < arr[i].length; j++){
                        System.out.print(" " + arr[i][j] + " ");
                }
                System.out.print("}");
                System.out.println();
        }
        System.out.println("\nSum of an array: " + sum);


}


