package Test01;

import java.util.Scanner;

public class Baitaptest1_6 {
    public static void main(String[] args) {
        int n, A, B;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int C[] = new int[n];
        int ch[] = new int[n];  // mảng chứa các phần tử là số chẵn
        int Ch[] = new int[n];  // mảng chứa các phần tử là số chẵn

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            C[i] = scanner.nextInt();
        }

        // c: số phần tử của mảng ch
        // d: số phần tử của mảng le.
        A = B = 0;

        for (int i = 0; i < n; i++) {
            // nếu phần tử tại vị trí i chia hết cho 2
            // thì gán phần tử đó cho phần tử tại vị trí c của mảng ch
            // ngược lại thì gán phần tử đó
            // cho phần tử tại vị trí d của mảng le
            if (C[i] % 2 == 0) {
                ch[A] = C[i];
                A++;
            } else {
                ch[B] = C[i];
                B++;
            }
        }

        System.out.println("Các phần tử của mảng chẵn là: ");
        for (int j = 0; j < A; j++) {
            System.out.print(ch[j] + "\t");
        }

        System.out.println("\nCác phần tử của mảng chẵn là: ");
        for (int i = 0; i < A; i++) {
        for (int j = 0; j < B; j++) {
                System.out.print(ch[i] + "\t");
            }
        }
    }
}