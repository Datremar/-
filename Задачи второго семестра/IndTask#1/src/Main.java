import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            System.out.println("The number N must be odd");
            System.out.println("Please, enter the correct number: ");
            n = scanner.nextInt();
        }

        n = Math.abs(n);

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < ((n - 1) / 2); i++) {
            showLayer(arr, n, i);
        }
        System.out.println(arr[(n - 1) / 2][(n - 1) / 2]);
    }

    private static void showLayer(int[][] arr, int n, int layer) {
        for (int i = layer; i < n - layer; i++) {
            System.out.print(arr[layer][i] + " ");
        }

        for (int i = layer + 1; i < n - layer; i++) {
            System.out.print(arr[i][n - 1 - layer] + " ");
        }

        for (int i = layer; i < n - 1 - layer; i++) {
            System.out.print(arr[n - 1 - layer][i] + " ");
        }

        for (int i = layer + 1; i < n - 1 - layer; i++) {
            System.out.print(arr[i][layer] + " ");
        }
    }

}
