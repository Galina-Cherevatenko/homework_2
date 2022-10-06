package homework_2.task_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, m, b;

        System.out.println("Введите n:");
        n = in.nextInt();
        System.out.println("Введите m:");
        m = in.nextInt();
        int f = n*m;

        int[][] arr = new int[n][m];
        int[] temp = new int[f];

        //ввод двумерного массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        //перевод из двумерного массива в одномерный
        int p=0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                temp [p]=arr [i][j];
                p++;
            }}

        in.close();
        //сортировка элементов массива по возрастанию
        for (int i = 0; i < f; i++) {
                for (int j = i + 1; j < f; j++) {

                    if (temp[i] > temp[j]) {
                        b = temp[i];
                        temp[i] = temp[j];
                        temp[j] = b;
                    }
                }

        }
        //перевод из одномерного массива в двумерный в обратном порядке
        int k=f-1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr [i][j]= temp [k--];}}

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        }

}