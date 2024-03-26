class MatrixOperation {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        
        //Matrix Addition
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        //Matrix Substraction
        int[][] diff = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix after Substraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
        
        //Matrix Multiplicaion
        int[][] mul = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mul[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
