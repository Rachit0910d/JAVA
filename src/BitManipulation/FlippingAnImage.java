package BitManipulation;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
        for (int[] row : image){
            for (int i = 0; i < image.length; i++) {
                System.out.print(row[i]+" ");
            }
            System.out.println();
        }
    }

    public static void flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[0].length + 1) / 2; j++) {
                // swap
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[0].length - j - 1] ^ 1;
                image[i][image[0].length - j - 1] = temp;
            }
        }
    }
}
