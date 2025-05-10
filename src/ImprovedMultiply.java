import java.util.Random;

public class ImprovedMultiply {

    public static void main(String[] args) {
        int size =  1024;
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                A[i][j] = rand.nextInt(100);
                B[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                int tempA = A[i][k];
                for (int j = 0; j < size; j++) {
                    C[i][j] += tempA * B[k][j];
                }
            }
        }

        System.out.println("Multiplication complete.");
    }
}
