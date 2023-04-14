
import java.util.Random;

public class Q6_EduardoAugusto {

    public static void main(String[] args) {
        int[][] matriz1 = generateRandomMatriz(3, 4);
        int[][] matriz2 = generateRandomMatriz(4, 5);

        int[][] resultado = multiplicaMatrizes(matriz1, matriz2);

        System.out.println("Matriz 1:");
        printMatrix(matriz1);

        System.out.println("Matriz 2:");
        printMatrix(matriz2);

        System.out.println("Resultado:");
        printMatrix(resultado);
    }

    public static int[][] multiplicaMatrizes(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("As matrizes não podem ser multiplicadas");
        }

        int[][] resultado = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultado;
    }

    public static int[][] generateRandomMatriz(int rows, int cols) {
        int[][] matriz = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        return matriz;
    }

    public static void printMatrix(int[][] matriz) {
        int rows = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}