package Array;

import java.util.Arrays;

/*
Given a 2D nxn matrix that represents an image. Rotate the matrix
90 degrees clockwise.
*/

public class rotateImage {
    private static void rotate(int[][] matrix) {
        int N = matrix.length;

        // Transposing matrix to turn rows into columns
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Flip the matrix horizontally
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N/2); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }

    }

    public static void main(String[] args){
        int[][] image1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] image2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println("Before rotation:");
        System.out.println(Arrays.deepToString(image2).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        rotate(image2);
        System.out.println("After rotation:");
        System.out.println(Arrays.deepToString(image2).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}
